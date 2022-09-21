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
import model.Cliente;
import model.ModelHabitad;
import model.Proveedor;
import model.modelZoologo;
import view.viewLogin;
import view.viewRegistroHabitad;
import view.viewVistaHabitats;

/**
 *
 * @author ALEJO
 */
public class ControllerRegistrarHabitad {

    private viewRegistroHabitad vistaRegHabitad;
    private viewVistaHabitats vistaHab;
    private ModelHabitad modelHabitad;
    private modelZoologo modeloZool;
    boolean banvista = false;
    int i = 0;
    DefaultTableModel estructuraTabla;

    public ControllerRegistrarHabitad() {
    }

    public ControllerRegistrarHabitad(viewRegistroHabitad vistaRegHabitad, viewVistaHabitats vistaHab, ModelHabitad modelHabitad, modelZoologo modeloZool) {
        this.vistaRegHabitad = vistaRegHabitad;
        this.vistaHab = vistaHab;
        this.modelHabitad = modelHabitad;
        this.modeloZool = modeloZool;
        vistaRegHabitad.toFront();
        vistaRegHabitad.setVisible(true);
        banvista = true;
    }

    public ControllerRegistrarHabitad(viewRegistroHabitad vistaRegHabitad, ModelHabitad modelHabitad, modelZoologo modeloZool) {
        this.vistaRegHabitad = vistaRegHabitad;
        this.modelHabitad = modelHabitad;
        this.modeloZool = modeloZool;
        vistaRegHabitad.toFront();
        vistaRegHabitad.setVisible(true);
        banvista = false;
    }

    public void iniciarControl() {
//        vistaRegHabitad.getJbtnAgregar().addActionListener(l -> registrarActualizar());
//        vistaRegHabitad.getJbtnCancelar().addActionListener(l -> vistaRegHabitad.dispose());
//        vistaRegHabitad.getBtnSeleccionarProv().addActionListener(l -> abrirDlg());
//        vistaRegHabitad.getBtnseleccionardlg().addActionListener(l -> llenarDatosProv());
//        vistaRegHabitad.getTxtbuscardlg().addKeyListener(busquedaIncren);
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
        vistaRegHabitad.toFront();
        if (op == 1) {
            limpiarCampos();
            vistaRegHabitad.setName("Registro");
            vistaRegHabitad.get().setText("REGISTRAR");
            vistaRegHabitad.setVisible(true);
            this.iniciarControl();
        } else {
            if (llenarDatos()) {
                vistaRegHabitad.setName("Editar");
//                vistaRegAlimento.getTxtcedula().setEditable(false);
                vistaRegHabitad.getJbtnAgregar().setText("ACTUALIZAR");
                vistaRegHabitad.setVisible(true);
                this.iniciarControl();
            }
        }
    }

    public void registrarActualizar() {
        validaciones mivalidacion = new validaciones();

        if (validar()) {
            //ALIMENTO
            String nombre = vistaRegHabitad.getTxtnombrealimento().getText(),
                    precio = vistaRegHabitad.getTxtPrecio().getText(),
                    descripcion = vistaRegHabitad.getTxtAdescripcion().getText();
            //PROVEEDOR
            int fila = vistaRegHabitad.getTabladlg().getSelectedRow();
            int idProv = Integer.parseInt(vistaRegHabitad.getTxtidPorv().getText());

            ModelAlimento alimento = new ModelAlimento();
            alimento.setNombreAli(nombre);
            alimento.setPrecioAli(mivalidacion.validarDouble(precio));
            alimento.setDescripcionAli(descripcion);
            alimento.setIdproveedor(idProv);
            alimento.setEstadoAli(true);

            if (vistaRegHabitad.getName().equals("Registro")) {
                int response = JOptionPane.showConfirmDialog(vistaRegHabitad, "¿Agregar Alimento?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
//                    if (alimento.comprobarDuplicado(cedula)) {
                    if (alimento.setAlimento()) {
                        JOptionPane.showMessageDialog(vistaRegHabitad, "Alimento agregado/a correctamente");
                        vistaRegHabitad.dispose();
                    } else {
                        JOptionPane.showMessageDialog(vistaRegHabitad, "No se pudo agregar el alimento");
                    }
//                    } else {
//                        JOptionPane.showMessageDialog(vistaRegAlimento, "El cliente ya se encuentra registrado");
//                    }

                }
            } else {
                //UPDATE
                int id = Integer.parseInt(vistaRegHabitad.getTxtidAli().getText());
                alimento.setIdalimento(id);
                int response = JOptionPane.showConfirmDialog(vistaRegHabitad, "¿Seguro que desea actualizar los datos del cliente?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    if (alimento.updateAlimento()) {//Grabamos
                        JOptionPane.showMessageDialog(vistaRegHabitad, "Alimento actualizado correctamente");
                        vistaRegHabitad.dispose();
                    } else {
                        JOptionPane.showMessageDialog(vistaRegHabitad, "No se pudo actualizar a los datos del alimento");
                    }
                }
            }
            if (banvista) {
                ControllerVistaAlimento controlAli = new ControllerVistaAlimento(vistaHab, modelHabitad);
                controlAli.cargarDatos(1);
            }
        }
    }

    public void limpiarCampos() {
        vistaRegHabitad.getTxtAdescripcion().setText("");
        vistaRegHabitad.getTxtPrecio().setText("");
        vistaRegHabitad.getTxtbuscardlg().setText("");
        vistaRegHabitad.getTxtciudadProv().setText("");
        vistaRegHabitad.getTxtnombreProv().setText("");
        vistaRegHabitad.getTxtnombrealimento().setText("");
        vistaRegHabitad.getTxtnombreProv().setText("");
    }

    public boolean llenarDatos() {
        int fila = vistaHab.getjTblAlimento().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaHab, "Seleccione un cliente a modificar");
            return false;
        } else {
            int id = Integer.parseInt(vistaHab.getjTblAlimento().getValueAt(fila, 0).toString());
            List<Alimento> listap = modelHabitad.getAlimento();
            listap.stream().forEach(ali -> {
                if (id == ali.getIdalimento()) {
                    vistaRegHabitad.getTxtidAli().setText(String.valueOf(ali.getIdalimento()));
                    vistaRegHabitad.getTxtnombrealimento().setText(ali.getNombreAli());
                    vistaRegHabitad.getTxtPrecio().setText(String.valueOf(ali.getPrecioAli()));
                    vistaRegHabitad.getTxtAdescripcion().setText(ali.getDescripcionAli());
                    vistaRegHabitad.getTxtidPorv().setText(String.valueOf(ali.getIdproveedor()));
                    vistaRegHabitad.getTxtnombreProv().setText(ali.getNombre_pro());
                    vistaRegHabitad.getTxtciudadProv().setText(ali.getCiudad_pro());
                    vistaRegHabitad.getTxttelefonoProv().setText(ali.getTelefono());

                }
            });
            return true;
        }
    }

    public void llenarDatosProv() {
        vistaRegHabitad.getTxtidAli().setVisible(false);
        vistaRegHabitad.getTxtidPorv().setVisible(false);

        int fila = vistaRegHabitad.getTabladlg().getSelectedRow();
//        int idProv = Integer.parseInt(vistaRegAlimento.getTabladlg().getValueAt(fila, 0).toString());
        String nombre = vistaRegHabitad.getTabladlg().getValueAt(fila, 1).toString(),
                ciudad = vistaRegHabitad.getTabladlg().getValueAt(fila, 2).toString(),
                telefono = vistaRegHabitad.getTabladlg().getValueAt(fila, 3).toString(),
                id = vistaRegHabitad.getTabladlg().getValueAt(fila, 0).toString();

        vistaRegHabitad.getTxtidPorv().setText(id);
        vistaRegHabitad.getTxtnombreProv().setText(nombre);
        vistaRegHabitad.getTxtciudadProv().setText(ciudad);
        vistaRegHabitad.getTxttelefonoProv().setText(telefono);
        vistaRegHabitad.getjDlgProveedor().dispose();
        vistaRegHabitad.getTxtbuscardlg().setText("");
    }

    public void abrirDlg() {
        vistaRegHabitad.getjDlgProveedor().setLocationRelativeTo(vistaRegHabitad);
        vistaRegHabitad.getjDlgProveedor().setVisible(true);
        cargarDatosDlg(1);
    }

    public void cargarDatosDlg(int opc) {

        vistaRegHabitad.getTabladlg().setRowHeight(25);
        estructuraTabla = (DefaultTableModel) vistaRegHabitad.getTabladlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Proveedor> listaProv;
//        if (opc == 1) {
//            listaProv = modeloProv.getProveedor();
//        } else {
        String busqueda = vistaRegHabitad.getTxtbuscardlg().getText().toLowerCase().trim();
        listaProv = modeloZool.busquedaIncrementalProveedor(busqueda);
//        }

        i = 0;
        listaProv.stream().sorted((x, y)
                -> x.getCiudad_pro().compareToIgnoreCase(y.getCiudad_pro())).forEach(emp -> {
            estructuraTabla.addRow(new Object[listaProv.size()]);
            vistaRegHabitad.getTabladlg().setValueAt(emp.getId_proveedor(), i, 0);
            vistaRegHabitad.getTabladlg().setValueAt(emp.getNombre_pro(), i, 1);
            vistaRegHabitad.getTabladlg().setValueAt(emp.getCiudad_pro(), i, 2);
            vistaRegHabitad.getTabladlg().setValueAt(emp.getTelefono(), i, 3);
            i++;
        });

    }

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();

        if (!vistaRegHabitad.getTxtnombrealimento().getText().isEmpty()) {
            if (!mivalidacion.validarNombApeEspacios(vistaRegHabitad.getTxtnombrealimento().getText())) {
                JOptionPane.showMessageDialog(vistaRegHabitad, "Nombre invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vistaRegHabitad, "Ingrese el nombre");
            ban = false;
        }

        if (!vistaRegHabitad.getTxtPrecio().getText().isEmpty()) {
            if (mivalidacion.validarDouble(vistaRegHabitad.getTxtPrecio().getText()) == 0) {
                JOptionPane.showMessageDialog(vistaRegHabitad, "Precio invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vistaRegHabitad, "Ingrese el precio");
            ban = false;
        }

        if (vistaRegHabitad.getTxtAdescripcion().getText().isEmpty()) {
            JOptionPane.showMessageDialog(vistaRegHabitad, "Ingrese la descripcion");
            ban = false;
        }
        if (vistaRegHabitad.getTxtnombreProv().getText().isEmpty()) {
            JOptionPane.showMessageDialog(vistaRegHabitad, "Seleccione el Proveedor");
            ban = false;
        }
        return ban;
    }

}
//    public DefaultTableModel DatosTabla() {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("Id");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Ciudad");
//        modelo.addColumn("Telefono");
//        return modelo;
//    }
//

//        vistaRegAlimento.getTabladlg().setRowHeight(25);
//        vistaRegAlimento.getTabladlg().setModel(estructuraTabla);
//        List<Proveedor> listaProv;
////        if (opc == 1) {
////            listaProv = modeloProv.getProveedor();
////        } else {
//        String busqueda = vistaRegAlimento.getTxtbuscardlg().getText().toLowerCase().trim();
//        listaProv = modeloProv.busquedaIncrementalProveedor(busqueda);
////        }
//
////        Holder<Integer> i = new Holder<>(0);
//        i = 0;
//        listaProv.stream().sorted((x, y)
//                -> x.getCiudad_pro().compareToIgnoreCase(y.getCiudad_pro())).forEach(emp -> {
//            estructuraTabla.addRow(new Object[listaProv.size()]);
//            vistaRegAlimento.getTabladlg().setValueAt(emp.getId_proveedor(), i, 0);
//            vistaRegAlimento.getTabladlg().setValueAt(emp.getNombre_pro(), i, 1);
//            vistaRegAlimento.getTabladlg().setValueAt(emp.getCiudad_pro(), i, 2);
//            vistaRegAlimento.getTabladlg().setValueAt(emp.getTelefono(), i, 3);
//            i++;
//        });
