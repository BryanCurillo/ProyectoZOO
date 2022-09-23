/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Dieta;
import model.ModelDieta;
import model.ModelAlimento;
import model.Alimento;
import view.viewRegistroDieta;
import view.viewVistaDieta;

/**
 *
 * @author ALEJO
 */
public class ControllerRegistrarDieta {

    private viewRegistroDieta vrd;
    private viewVistaDieta vvd;
    private ModelDieta md;
    private ModelAlimento ma;
    int i = 0;
    boolean banvista = false;
    DefaultTableModel estructuraTabla;

    public ControllerRegistrarDieta() {
    }

    public ControllerRegistrarDieta(viewRegistroDieta vrd, viewVistaDieta vvd, ModelDieta md, ModelAlimento ma) {
        this.vrd = vrd;
        this.vvd = vvd;
        this.md = md;
        this.ma = ma;
        vrd.toFront();
        vrd.setVisible(true);
        banvista = true;
    }

    public ControllerRegistrarDieta(viewRegistroDieta vrd, ModelDieta md, ModelAlimento ma) {
        this.vrd = vrd;
        this.md = md;
        this.ma = ma;
        vrd.toFront();
        vrd.setVisible(true);
        banvista = false;
    }

    public void iniciarControles() {
        vrd.getBtncancelardieta().addActionListener(l -> vrd.dispose());

        vrd.getBtnagregardieta().addActionListener(l -> registrarDieta());
        vrd.getBtncancelardieta().addActionListener(l -> vrd.dispose());
        vrd.getBtnSeleccionarAliemento().addActionListener(l -> abrirDlg());
        vrd.getBtnseleccionardlg().addActionListener(l -> llenarDatosAlimento());
        vrd.getTxtbuscardlg().addKeyListener(busquedaIncren);
    }
    KeyListener busquedaIncren = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            cargarDatosDlg(2);
        }
    };

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
//            int fila = vrd.getTabladlg().getSelectedRow();

//            vrd.getNoborrarIDALIMENTO().setText(vrd.getTabladlg().getValueAt(fila, 0).toString());
//            vrd.getTxtnombrealiemento().setText(vrd.getTabladlg().getValueAt(fila, 1).toString());
//            vrd.getTxtprecioalimento().setText(vrd.getTabladlg().getValueAt(fila, 2).toString());
//            vrd.getTxtdescripalimento().setText(vrd.getTabladlg().getValueAt(fila, 3).toString());
            int idali = Integer.parseInt(vrd.getNoborrarIDALIMENTO().getText());
            ModelDieta dieta = new ModelDieta();
            dieta.setDie_horario(horario);
            dieta.setDie_porcion(porcion);
            dieta.setDie_idAlimento(idali);
            dieta.setDie_estado(true);

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

    public void llenarDatosAlimento() {
        vrd.getNoborrarIDALIMENTO().setVisible(false);
        vrd.getNoborrarIDDIETA().setVisible(false);

        int fila = vrd.getTabladlg().getSelectedRow();
//        int idProv = Integer.parseInt(vistaRegAlimento.getTabladlg().getValueAt(fila, 0).toString());
        System.out.println(vrd.getTabladlg().getValueAt(fila, 0).toString());
        vrd.getNoborrarIDALIMENTO().setText(vrd.getTabladlg().getValueAt(fila, 0).toString());
        vrd.getTxtnombrealiemento().setText(vrd.getTabladlg().getValueAt(fila, 1).toString());
        vrd.getTxtprecioalimento().setText(vrd.getTabladlg().getValueAt(fila, 2).toString());
        vrd.getTxtdescripalimento().setText(vrd.getTabladlg().getValueAt(fila, 3).toString());

        vrd.getDlgAlimento().dispose();
        vrd.getTxtbuscardlg().setText("");
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

        List<Alimento> listaAlimento;

        String busqueda = vrd.getTxtbuscardlg().getText().toLowerCase().trim();
        listaAlimento = ma.busquedaincrementalDlg(busqueda);

        i = 0;
        listaAlimento.stream().sorted((x, y)
                -> x.getNombreAli().compareToIgnoreCase(y.getNombreAli())).forEach(ali -> {
            estructuraTabla.addRow(new Object[listaAlimento.size()]);
            vrd.getTabladlg().setValueAt(ali.getIdalimento(), i, 0);
            vrd.getTabladlg().setValueAt(ali.getNombreAli(), i, 1);
            vrd.getTabladlg().setValueAt(ali.getPrecioAli(), i, 2);
            vrd.getTabladlg().setValueAt(ali.getNombre_pro(), i, 3);
            vrd.getTabladlg().setValueAt(ali.getDescripcionAli(), i, 4);
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

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();

        if (vrd.getCombohoradieta().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(vrd, "SELECCIONE UN HORARIO");
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
}
