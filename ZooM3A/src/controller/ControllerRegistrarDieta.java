/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Alimento;
import model.Dieta;
import model.ModelDieta;
import model.Proveedor;
import view.viewRegistroDieta;

/**
 *
 * @author ALEJO
 */
public class ControllerRegistrarDieta extends Dieta {

    private viewRegistroDieta vrd;
    private ModelDieta md;
    int i = 0;
    DefaultTableModel estructuraTabla;

    public ControllerRegistrarDieta() {
    }

    public ControllerRegistrarDieta(viewRegistroDieta vrd, ModelDieta md, DefaultTableModel estructuraTabla) {
        this.vrd = vrd;
        this.md = md;
        this.estructuraTabla = estructuraTabla;
    }

    public ControllerRegistrarDieta(viewRegistroDieta vrd, ModelDieta md, DefaultTableModel estructuraTabla, int die_id, String die_horario, String die_porcion, int die_idAlimento, boolean die_estado) {
        super(die_id, die_horario, die_porcion, die_idAlimento, die_estado);
        this.vrd = vrd;
        this.md = md;
        this.estructuraTabla = estructuraTabla;
    }

    public ControllerRegistrarDieta(viewRegistroDieta vrd, ModelDieta md, DefaultTableModel estructuraTabla, int die_id, String die_horario, String die_porcion, int die_idAlimento, boolean die_estado, int idalimento, double precioAli, String nombreAli, String descripcionAli, int idproveedor, boolean estadoAli) {
        super(die_id, die_horario, die_porcion, die_idAlimento, die_estado, idalimento, precioAli, nombreAli, descripcionAli, idproveedor, estadoAli);
        this.vrd = vrd;
        this.md = md;
        this.estructuraTabla = estructuraTabla;
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

    public void abrirDlg() {
        vrd.getDlgAlimento().setLocationRelativeTo(vrd);
        vrd.getDlgAlimento().setVisible(true);
        cargarDatosDlg(1);
    }

    public void cargarDatosDlg(int opc) {

        vrd.getTabladlg().setRowHeight(25);
        estructuraTabla = (DefaultTableModel) vrd.getTabladlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Dieta> listaDieta;

        String busqueda = vrd.getTxtbuscardlg().getText().toLowerCase().trim();
        listaDieta = md.busquedaIncrementalDieta(busqueda);

        i = 0;
        listaDieta.stream().sorted((x, y)
                -> x.getCiudad_pro().compareToIgnoreCase(y.getCiudad_pro())).forEach(emp -> {
            estructuraTabla.addRow(new Object[listaDieta.size()]);
            vrd.getTabladlg().setValueAt(emp.getId_proveedor(), i, 0);
            vrd.getTabladlg().setValueAt(emp.getNombre_pro(), i, 1);
            vrd.getTabladlg().setValueAt(emp.getCiudad_pro(), i, 2);
            vrd.getTabladlg().setValueAt(emp.getTelefono(), i, 3);
            i++;
        });

    }

    public void limpiarCampos() {
        vrd.getTxtdescripalimento().setText("");
        vrd.getTxtnombrealiemento().setText("");
        vrd.getTxtporcion().setText("");
        vrd.getTxtprecioalimento().setText("");
        vrd.getCombohoradieta().setSelectedIndex(0);

    }

}
