/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Alimento;
import model.Dieta;
import model.ModelDieta;
import view.viewRegistroDieta;

/**
 *
 * @author ALEJO
 */
public class ControllerDieta extends Dieta {

    private viewRegistroDieta vrd;
    private ModelDieta md;

    public ControllerDieta(viewRegistroDieta vrd, ModelDieta md) {
        this.vrd = vrd;
        this.md = md;
        vrd.toFront();
        vrd.setVisible(true);
    }

    public ControllerDieta(viewRegistroDieta vrd, ModelDieta md, int die_id, String die_horario, String die_porcion, int die_idAlimento) {
        super(die_id, die_horario, die_porcion, die_idAlimento);
        this.vrd = vrd;
        this.md = md;
    }

    public void iniciarControles() {
        vrd.getBtnagregardieta().addActionListener(l -> registrarDieta());
        vrd.getBtncancelardieta().addActionListener(l -> vrd.dispose());

    }

    public void abrirRegistro(int op) {
        vrd.toFront();
        if (op == 1) {
            limpiarCampos();
            vrd.setName("Registro");
            vrd.getBtnagregardieta().setText("REGISTRAR");
            vrd.setVisible(true);
            this.iniciarControles();
        } else {
            if (llenarDatos()) {
                vrd.setName("Editar");
                vrd.getBtnagregardieta().setText("REGISTRAR");
                vrd.setVisible(true);
                this.iniciarControles();
            }
        }
    }

    public void registrarDieta() {
        if (validar()) {

            vrd.getNoborrarIDALIMENTO().setVisible(false);
            String horario = vrd.getCombohoradieta().getSelectedItem().toString(),
                    porcion = vrd.getTxtporcion().getText();
            int fila = vrd.getTabladlg().getSelectedRow();

            vrd.getNoborrarIDALIMENTO().setText(vrd.getTabladlg().getValueAt(fila, 0).toString());
            vrd.getTxtnombrealiemento().setText(vrd.getTabladlg().getValueAt(fila, 1).toString());
            vrd.getTxtprecioalimento().setText(vrd.getTabladlg().getValueAt(fila, 2).toString());
            vrd.getTxtdescripalimento().setText(vrd.getTabladlg().getValueAt(fila, 3).toString());

            int idali = Integer.parseInt(vrd.getNoborrarIDALIMENTO().getText());

            ModelDieta dieta = new ModelDieta();
            dieta.setDie_horario(horario);
            dieta.setDie_porcion(porcion);
            dieta.setDie_idAlimento(idali);

            if (vrd.getName().equals("Registro")) {
                int response = JOptionPane.showConfirmDialog(vrd, "¿Agregar Dieta?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    if (dieta.setDieta()) {
                        JOptionPane.showMessageDialog(vrd, "Dieta agregada correctamente");
                        vrd.dispose();
                    } else {
                        JOptionPane.showMessageDialog(vrd, "No se pudo agregar la dieta");
                    }
                }
            }
        }
    }

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();

        if (vrd.getCombohoradieta().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(vrd, "SELECCIONE UNA HORA");
            ban = false;
        }

        if (!vrd.getTxtporcion().getText().isEmpty()) {
            if (mivalidacion.validarDouble(vrd.getTxtporcion().getText()) == 0) {
                JOptionPane.showMessageDialog(vrd, "Porcion invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vrd, "Ingrese una porcion");
            ban = false;
        }

        if (vrd.getTxtnombrealiemento().getText().isEmpty() && vrd.getTxtdescripalimento().getText().isEmpty() && vrd.getTxtprecioalimento().getText().isEmpty()) {
            JOptionPane.showMessageDialog(vrd, "ELIJA UN ALIMENTO");
            ban = false;
        }
        return ban;
    }

    public boolean llenarDatos() {
        int fila = vrd.getTabladlg().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vrd, "Seleccione una dieta a modificar");
            return false;
        } else {
            int id = Integer.parseInt(vrd.getTabladlg().getValueAt(fila, 0).toString());
            List<Dieta> listaDieta = md.getDieta();
            listaDieta.stream().forEach(die -> {
                if (id == die.getDie_id()) {
                    vrd.getCombohoradieta().setSelectedItem(die.getDie_horario());
                    vrd.getTxtporcion().setText(die.getDie_porcion());
                    vrd.getTxtnombrealiemento().setText(die.getNombreAli());
                    vrd.getTxtprecioalimento().setText(String.valueOf(die.getPrecioAli()));
                    vrd.getTxtdescripalimento().setText(die.getDescripcionAli());

                }
            });
            return true;
        }
    }

    public void limpiarCampos() {
        vrd.getTxtdescripalimento().setText("");
        vrd.getTxtnombrealiemento().setText("");
        vrd.getTxtporcion().setText("");
        vrd.getTxtprecioalimento().setText("");
        vrd.getCombohoradieta().setSelectedIndex(0);

    }

}
