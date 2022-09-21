/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Alimento;
import model.ModelHabitad;
import model.Zoologo;
import model.modelZoologo;
import view.viewLogin;
import view.viewRegistroHabitad;
import view.viewVistaHabitats;

/**
 *
 * @author ALEJO
 */
public class ControllerRegistrarHabitad {

    private viewRegistroHabitad vistaRegHabitat;
    private viewVistaHabitats vistaHab;
    private ModelHabitad modelHabitat;
    private modelZoologo modeloZool;
    boolean banvista = false;
    int i = 0;
    DefaultTableModel estructuraTabla;

    public ControllerRegistrarHabitad() {
    }

    public ControllerRegistrarHabitad(viewRegistroHabitad vistaRegHabitad, viewVistaHabitats vistaHab, ModelHabitad modelHabitad, modelZoologo modeloZool) {
        this.vistaRegHabitat = vistaRegHabitad;
        this.vistaHab = vistaHab;
        this.modelHabitat = modelHabitad;
        this.modeloZool = modeloZool;
        vistaRegHabitat.getTxtOtrobloque().setEditable(false);
        vistaRegHabitat.getTxtOtrotipo().setEditable(false);
        vistaRegHabitad.toFront();
        vistaRegHabitad.setVisible(true);
        banvista = true;
    }

    public ControllerRegistrarHabitad(viewRegistroHabitad vistaRegHabitad, ModelHabitad modelHabitad, modelZoologo modeloZool) {
        this.vistaRegHabitat = vistaRegHabitad;
        this.modelHabitat = modelHabitad;
        this.modeloZool = modeloZool;
        vistaRegHabitat.getTxtOtrobloque().setEditable(false);
        vistaRegHabitat.getTxtOtrotipo().setEditable(false);
        vistaRegHabitad.toFront();
        vistaRegHabitad.setVisible(true);
        banvista = false;
    }

    public void iniciarControl() {
        vistaRegHabitat.getBtregistrar().addActionListener(l -> registrarActualizar());
        vistaRegHabitat.getBtcancelar().addActionListener(l -> vistaRegHabitat.dispose());
        vistaRegHabitat.getJbtnSelecZoologo().addActionListener(l -> abrirDlg());
        vistaRegHabitat.getBtnseleccionardlg().addActionListener(l -> llenarDatosZoologo());
        vistaRegHabitat.getTxtbuscardlg().addKeyListener(busquedaIncren);
        vistaRegHabitat.getComboTipoHab().addActionListener(l -> activarTxtTipo());
        vistaRegHabitat.getComboUbicacion().addActionListener(l -> activarTxtBloque());
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
        vistaRegHabitat.toFront();
        if (op == 1) {
            limpiarCampos();
            vistaRegHabitat.setName("Registro");
            vistaRegHabitat.getBtregistrar().setText("REGISTRAR");
            vistaRegHabitat.setVisible(true);
            this.iniciarControl();
        } else {
//            if (llenarDatos()) {
//                vistaRegHabitad.setName("Editar");
////                vistaRegAlimento.getTxtcedula().setEditable(false);
//                vistaRegHabitad.getBtregistrar().setText("ACTUALIZAR");
//                vistaRegHabitad.setVisible(true);
//                this.iniciarControl();
//            }
        }
    }

    public void activarTxtBloque() {
        if (vistaRegHabitat.getComboUbicacion().getSelectedIndex() != vistaRegHabitat.getComboUbicacion().getItemCount() - 1) {
            vistaRegHabitat.getTxtOtrobloque().setText("");
            vistaRegHabitat.getTxtOtrobloque().setEditable(false);
        } else {
            vistaRegHabitat.getTxtOtrobloque().setEditable(true);
        }
    }

    public void activarTxtTipo() {
        if (vistaRegHabitat.getComboTipoHab().getSelectedIndex() != vistaRegHabitat.getComboTipoHab().getItemCount() - 1) {
            vistaRegHabitat.getTxtOtrotipo().setText("");
            vistaRegHabitat.getTxtOtrotipo().setEditable(false);
        } else {
            vistaRegHabitat.getTxtOtrotipo().setEditable(true);
        }
    }

    public void registrarActualizar() {
        validaciones mivalidacion = new validaciones();

        if (validar()) {
            //Habitad
            String tipo = "",
                    ubicacion = "";
            int capacidad = (int) vistaRegHabitat.getjSpiCapacidad().getValue(),
                    idZoologo = Integer.parseInt(vistaRegHabitat.getTxtidZoologoNoborrar().getText());;

            if (vistaRegHabitat.getComboTipoHab().getSelectedIndex() == vistaRegHabitat.getComboTipoHab().getItemCount() - 1) {
                tipo = vistaRegHabitat.getTxtOtrotipo().getText();
            } else {
                tipo = vistaRegHabitat.getComboTipoHab().getSelectedItem().toString();
            }

            if (vistaRegHabitat.getComboUbicacion().getSelectedIndex() == vistaRegHabitat.getComboUbicacion().getItemCount() - 1) {
                ubicacion = vistaRegHabitat.getTxtOtrobloque().getText();
            } else {
                ubicacion = vistaRegHabitat.getComboUbicacion().getSelectedItem().toString();
            }
//            int fila = vistaRegHabitad.getTabladlg().getSelectedRow();

            ModelHabitad habitad = new ModelHabitad();
            habitad.setTipohab(tipo);
            habitad.setCapacidadhap(capacidad);
            habitad.setIdZoologohab(idZoologo);
            habitad.setUbicacionhab(ubicacion);
            habitad.setEstadohab(true);

            if (vistaRegHabitat.getName().equals("Registro")) {
                int response = JOptionPane.showConfirmDialog(vistaRegHabitat, "¿Agregar Habitat?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
//                    if (alimento.comprobarDuplicado(cedula)) {
                    if (habitad.setHabitad()) {
                        JOptionPane.showMessageDialog(vistaRegHabitat, "Habitat agregado/a correctamente");
                        vistaRegHabitat.dispose();
                    } else {
                        JOptionPane.showMessageDialog(vistaRegHabitat, "No se pudo agregar el Habitat");
                    }
//                    } else {
//                        JOptionPane.showMessageDialog(vistaRegAlimento, "El cliente ya se encuentra registrado");
//                    }

                }
            } else {
                //UPDATE
//                int id = Integer.parseInt(vistaRegHabitad.getTxtidAli().getText());
//                habitad.setIdalimento(id);
//                int response = JOptionPane.showConfirmDialog(vistaRegHabitad, "¿Seguro que desea actualizar los datos del cliente?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//                if (response == JOptionPane.YES_OPTION) {
//                    if (habitad.updateAlimento()) {//Grabamos
//                        JOptionPane.showMessageDialog(vistaRegHabitad, "Alimento actualizado correctamente");
//                        vistaRegHabitad.dispose();
//                    } else {
//                        JOptionPane.showMessageDialog(vistaRegHabitad, "No se pudo actualizar a los datos del alimento");
//                    }
//                }
//            }
//            if (banvista) {
//                ControllerVistaAlimento controlAli = new ControllerVistaAlimento(vistaHab, modelHabitad);
//                controlAli.cargarDatos(1);
            }
        }
    }

    public void limpiarCampos() {
        vistaRegHabitat.getComboTipoHab().setSelectedIndex(0);
        vistaRegHabitat.getTxtOtrotipo().setText("");
        vistaRegHabitat.getTxtbuscardlg().setText("");
        vistaRegHabitat.getComboUbicacion().setSelectedIndex(0);
        vistaRegHabitat.getTxtOtrobloque().setText("");
        vistaRegHabitat.getTxtnombreZol().setText("");
        vistaRegHabitat.getTxtramaZol().setText("");
        vistaRegHabitat.getTxtidHabitadNoborrar().setText("");
        vistaRegHabitat.getTxtidZoologoNoborrar().setText("");
    }

//    public boolean llenarDatos() {
//        int fila = vistaHab.getjTblAlimento().getSelectedRow();
//        if (fila == -1) {
//            JOptionPane.showMessageDialog(vistaHab, "Seleccione un cliente a modificar");
//            return false;
//        } else {
//            int id = Integer.parseInt(vistaHab.getjTblAlimento().getValueAt(fila, 0).toString());
//            List<Alimento> listap = modelHabitad.getAlimento();
//            listap.stream().forEach(ali -> {
//                if (id == ali.getIdalimento()) {
//                    vistaRegHabitad.getTxtidAli().setText(String.valueOf(ali.getIdalimento()));
//                    vistaRegHabitad.getTxtnombrealimento().setText(ali.getNombreAli());
//                    vistaRegHabitad.getTxtPrecio().setText(String.valueOf(ali.getPrecioAli()));
//                    vistaRegHabitad.getTxtAdescripcion().setText(ali.getDescripcionAli());
//                    vistaRegHabitad.getTxtidPorv().setText(String.valueOf(ali.getIdproveedor()));
//                    vistaRegHabitad.getTxtnombreProv().setText(ali.getNombre_pro());
//                    vistaRegHabitad.getTxtciudadProv().setText(ali.getCiudad_pro());
//                    vistaRegHabitad.getTxttelefonoProv().setText(ali.getTelefono());
//
//                }
//            });
//            return true;
//        }
//    }
    public void llenarDatosZoologo() {
        vistaRegHabitat.getTxtidHabitadNoborrar().setVisible(false);
        vistaRegHabitat.getTxtidZoologoNoborrar().setVisible(false);

        int fila = vistaRegHabitat.getTabladlg().getSelectedRow();
//        int idProv = Integer.parseInt(vistaRegAlimento.getTabladlg().getValueAt(fila, 0).toString());
        String nombre = vistaRegHabitat.getTabladlg().getValueAt(fila, 1).toString(),
                rama = vistaRegHabitat.getTabladlg().getValueAt(fila, 2).toString(),
                id = vistaRegHabitat.getTabladlg().getValueAt(fila, 0).toString();

        vistaRegHabitat.getTxtidZoologoNoborrar().setText(id);
        vistaRegHabitat.getTxtnombreZol().setText(nombre);
        vistaRegHabitat.getTxtramaZol().setText(rama);
        vistaRegHabitat.getjDlgZoologo().dispose();
        vistaRegHabitat.getTxtbuscardlg().setText("");
    }

    public void abrirDlg() {
        vistaRegHabitat.getjDlgZoologo().setLocationRelativeTo(vistaRegHabitat);
        vistaRegHabitat.getjDlgZoologo().setVisible(true);
        cargarDatosDlg(1);
    }

    public void cargarDatosDlg(int opc) {

        vistaRegHabitat.getTabladlg().setRowHeight(25);
        estructuraTabla = (DefaultTableModel) vistaRegHabitat.getTabladlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Zoologo> listaZol;
//        if (opc == 1) {
//            listaProv = modeloProv.getProveedor();
//        } else {
        String busqueda = vistaRegHabitat.getTxtbuscardlg().getText().toLowerCase().trim();
        listaZol = modeloZool.busquedaincremental(busqueda);
//        }

        i = 0;
        listaZol.stream().sorted((x, y)
                -> x.getNombre().compareToIgnoreCase(y.getNombre())).forEach(emp -> {
            estructuraTabla.addRow(new Object[listaZol.size()]);
            vistaRegHabitat.getTabladlg().setValueAt(emp.getIdZoo(), i, 0);
            vistaRegHabitat.getTabladlg().setValueAt(emp.getNombre(), i, 1);
            vistaRegHabitat.getTabladlg().setValueAt(emp.getRama(), i, 2);
            i++;
        });

    }

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();

        if (vistaRegHabitat.getComboTipoHab().getSelectedIndex() == 0 && vistaRegHabitat.getTxtOtrotipo().getText().isEmpty()) {
            JOptionPane.showMessageDialog(vistaRegHabitat, "Seleccione un tipo de habitat");
            ban = false;
        }
        if (vistaRegHabitat.getComboUbicacion().getSelectedIndex() == 0 && vistaRegHabitat.getTxtOtrobloque().getText().isEmpty()) {
            JOptionPane.showMessageDialog(vistaRegHabitat, "Seleccione el bloque donde se encuentra ubicado el habitat");
            ban = false;
        }
        if (vistaRegHabitat.getTxtnombreZol().getText().isEmpty()) {
            JOptionPane.showMessageDialog(vistaRegHabitat, "Seleccione el zoologo acargo");
            ban = false;
        }
        return ban;
    }

}
