/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.modelEmpleado;
import view.viewVistaEmpleados;
import view.viewRegistrarEmpleado;
import model.modelPersona;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Empleado;
import model.modelCuidador;
import model.modelGerente;
import model.modelSecretaria;
import model.modelZoologo;
import model.rol;
import view.viewPantallaPrincipal;

/**
 *
 * @author ALEJO
 */
public class ControllerVistaEmpleado {

    private viewPantallaPrincipal vistaP;
    private controllerPantallaprincipal controllerpp;
    private modelEmpleado modeloE;
    private modelPersona modeloP;
    private viewRegistrarEmpleado vista;
    private viewVistaEmpleados vistaE;
    int i = 0;
    DefaultTableModel estructuraTabla;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerVistaEmpleado(modelEmpleado modeloE, viewVistaEmpleados vistaE, viewPantallaPrincipal vistaP) {
        this.modeloE = modeloE;
        this.vistaE = vistaE;
        this.vistaP = vistaP;
//        desactivarDatosRol();        
        cargarDatos(1);
//        ((javax.swing.plaf.basic.BasicInternalFrameUI) vistaE.getUI()).setNorthPane(null);
        vistaE.setVisible(true);
    }

    public void inicialControl() {
        vistaE.getjBtnElimina().addActionListener(l -> eliminarEmpleado());
        vistaE.getjBtnActualizar().addActionListener(l -> cargarDatos(1));
        vistaE.getJbtnAgregar().addActionListener(l -> abrirRegistro(1));
        vistaE.getjBtnModificar().addActionListener(l -> abrirRegistro(2));
    }

    public void abrirRegistro(int op) {

        if (op == 1) {
            modelEmpleado modeloEmpleado = new modelEmpleado();
            viewRegistrarEmpleado vistaRegistroEmpleado = new viewRegistrarEmpleado();

            //Agragar vista al desktop pane
            vistaRegistroEmpleado.setName("Registro");
            vistaP.getjDPprincipal().add(vistaRegistroEmpleado);

            ControllerRegistroEmpleado controladorEmpleado = new ControllerRegistroEmpleado(modeloEmpleado, vistaRegistroEmpleado);
            controladorEmpleado.abrirRegistro(1);

        } else {
            modelEmpleado modeloEmpleado = new modelEmpleado();
            viewRegistrarEmpleado vistaRegistroEmpleado = new viewRegistrarEmpleado();

            //Agragar vista al desktop pane
//            vistaRegistroEmpleado.setName("Registro");
//            vistaP.getjDPprincipal().add(vistaRegistroEmpleado);
            ControllerRegistroEmpleado controladorEmpleado = new ControllerRegistroEmpleado(modeloEmpleado, vistaRegistroEmpleado, vistaE);
            int fila = vistaE.getjTblEmpleado().getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione la persona a modificar");
            } else {
                vistaRegistroEmpleado.setName("Registro");
                vistaP.getjDPprincipal().add(vistaRegistroEmpleado);
                controladorEmpleado.abrirRegistro(2);
            }
            System.out.println("datos cargador");
            cargarDatos(1);
        }
    }

    public void cargarDatos(int opc) {
        vistaE.getjTblEmpleado().setDefaultRenderer(Object.class, new imageTable());
        vistaE.getjTblEmpleado().setRowHeight(60);
        estructuraTabla = (DefaultTableModel) vistaE.getjTblEmpleado().getModel();
        estructuraTabla.setRowCount(0);
        List<Empleado> listaE;
//        if (opc == 1) {
        listaE = modeloE.getempleado();
//        } 
//        else {
////            String busqueda = vista.getTxt_buscar().getText().toLowerCase().trim();
////            listaE = modelo.busquedaIncrementalPersona(busqueda);
//        }

//        Holder<Integer> i = new Holder<>(0);
        i = 0;
        listaE.stream().sorted((x, y)
                -> x.getCedula().compareToIgnoreCase(y.getCedula())).forEach(emp -> {
            estructuraTabla.addRow(new Object[8]);
            vistaE.getjTblEmpleado().setValueAt(emp.getIdEmp(), i, 0);
            vistaE.getjTblEmpleado().setValueAt(emp.getCedula(), i, 1);
            vistaE.getjTblEmpleado().setValueAt(emp.getNombre(), i, 2);
            vistaE.getjTblEmpleado().setValueAt(emp.getApellido(), i, 3);
            vistaE.getjTblEmpleado().setValueAt(emp.getTelefono(), i, 4);
            vistaE.getjTblEmpleado().setValueAt(emp.getFechanacimiento().toString(), i, 5);
            vistaE.getjTblEmpleado().setValueAt(emp.getCorreo(), i, 6);
            vistaE.getjTblEmpleado().setValueAt(emp.getGenero(), i, 7);
            vistaE.getjTblEmpleado().setValueAt(modeloE.obtenerRol(emp.getRol()), i, 8);
            vistaE.getjTblEmpleado().setValueAt(emp.getUsuario(), i, 9);
            vistaE.getjTblEmpleado().setValueAt(emp.getContraseña(), i, 10);
            vistaE.getjTblEmpleado().setValueAt(emp.getFechaRegistro().toString(), i, 11);

            Image foto = emp.getFoto();
            if (foto != null) {
                foto = foto.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(foto);

                DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
                dtcr.setIcon(icono);
                vistaE.getjTblEmpleado().setValueAt(new JLabel(icono), i, 12);
            } else {
                vistaE.getjTblEmpleado().setValueAt(null, i, 12);
            }
            i++;
        });
    }

    public void eliminarEmpleado() {
        modelEmpleado empleado = new modelEmpleado();
        int fila = vistaE.getjTblEmpleado().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el empleado a eliminar");
        } else {
            int response = JOptionPane.showConfirmDialog(vista, "¿Esta seguro de eliminar al empleado?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                String cedula = vistaE.getjTblEmpleado().getValueAt(fila, 1).toString();
                int codigo = Integer.parseInt(vistaE.getjTblEmpleado().getValueAt(fila, 0).toString());
                String opc = vistaE.getjTblEmpleado().getValueAt(fila, 8).toString();
                switch (opc) {
                    case "Gerente":
                        //Gerente
                        if (empleado.deleteGerente(codigo, cedula)) {//Grabamos
                            JOptionPane.showMessageDialog(vista, "Empleado eliminado correctamente");
                            cargarDatos(1);
                        } else {
                            JOptionPane.showMessageDialog(vista, "No se pudo eliminar al empleado");
                        }
                        break;
                    case "Secretaria":
                        //Secretaria
                        if (empleado.deletesecretaria(codigo, cedula)) {//Grabamos
                            JOptionPane.showMessageDialog(vista, "Empleado eliminado correctamente");
                            cargarDatos(1);
                        } else {
                            JOptionPane.showMessageDialog(vista, "No se pudo eliminar al empleado");
                        }
                        break;
                    case "Zoologo":
                        //Zoologo
                        if (empleado.deleteZoologo(codigo, cedula)) {//Grabamos
                            JOptionPane.showMessageDialog(vista, "Empleado eliminado correctamente");
                            cargarDatos(1);
                        } else {
                            JOptionPane.showMessageDialog(vista, "No se pudo eliminar al empleado");
                        }
                        break;
                    case "Cuidador":
                        //Cuidador
                        if (empleado.deletecuidador(codigo, cedula)) {//Grabamos
                            JOptionPane.showMessageDialog(vista, "Empleado eliminado correctamente");
                            cargarDatos(1);
                        } else {
                            JOptionPane.showMessageDialog(vista, "No se pudo eliminar al empleado");
                        }
                        break;
                }
            }
        }
    }
}
