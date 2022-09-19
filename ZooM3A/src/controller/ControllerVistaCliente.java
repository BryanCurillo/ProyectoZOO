/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import view.viewVistaCliente;
import model.ModelCliente;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import view.viewPantallaPrincipal;
import view.viewRegistrarCliente;

/**
 *
 * @author ALEJO
 */
public class ControllerVistaCliente {

    private viewPantallaPrincipal vistaP;
    private viewVistaCliente vistaCli;
    private controllerPantallaprincipal controllerpp;
    private ModelCliente modeloCli;
    
    int i = 0;

    DefaultTableModel estructuraTabla;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerVistaCliente() {
    }

    public ControllerVistaCliente(viewVistaCliente vistaCli, ModelCliente modeloCli) {
        this.vistaCli = vistaCli;
        this.modeloCli = modeloCli;
    }

    public ControllerVistaCliente(viewPantallaPrincipal vistaP, viewVistaCliente vistaCli, ModelCliente modeloCli) {
        this.vistaP = vistaP;
        this.vistaCli = vistaCli;
        this.modeloCli = modeloCli;
        cargarDatos(1);
        vistaCli.setVisible(true);
    }

    public void inicialControl() {
        vistaCli.getBtnAgregarCliente().addActionListener(l -> abrirRegistro(1));
        vistaCli.getBtnModificarCliente().addActionListener(l -> abrirRegistro(2));
        vistaCli.getBtnEliminarCliente().addActionListener(l -> eliminarCliente());
        vistaCli.getTxtbuscar().addKeyListener(busquedaIncren);
    }

    public void abrirRegistro(int op) {
        ModelCliente modeloCli = new ModelCliente();
        viewRegistrarCliente vistaRegistroCli = new viewRegistrarCliente();

        if (op == 1) {

            //Agragar vista al desktop pane
            vistaP.getjDPprincipal().add(vistaRegistroCli);

            ControllerRegistrarCliente controladorCli = new ControllerRegistrarCliente(vistaRegistroCli, vistaCli, modeloCli);
            controladorCli.abrirRegistro(1);

        } else {
            ControllerRegistrarCliente controladorCli = new ControllerRegistrarCliente(vistaRegistroCli, vistaCli, modeloCli);
            int fila = vistaCli.getjTblCliente().getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione la persona a modificar");
            } else {
                vistaP.getjDPprincipal().add(vistaRegistroCli);
                controladorCli.abrirRegistro(2);
            }
            cargarDatos(1);
        }
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
            cargarDatos(2);
        }
    };

    public void cargarDatos(int opc) {
//        vistaCli.getjTblCliente().setDefaultRenderer(Object.class, new imageTable());
        vistaCli.getjTblCliente().setRowHeight(50);
        estructuraTabla = (DefaultTableModel) vistaCli.getjTblCliente().getModel();
        estructuraTabla.setRowCount(0);

        List<Cliente> listaCli;
        if (opc == 1) {
            listaCli = modeloCli.getClientes();
        } else {
            String busqueda = vistaCli.getTxtbuscar().getText().toLowerCase().trim();
            listaCli = modeloCli.busquedaincremental(busqueda);
        }

//        Holder<Integer> i = new Holder<>(0);
        i = 0;
        listaCli.stream().sorted((x, y)
                -> x.getCli_cedula().compareToIgnoreCase(y.getCli_cedula())).forEach(emp -> {
            estructuraTabla.addRow(new Object[4]);
            vistaCli.getjTblCliente().setValueAt(emp.getCli_id(), i, 0);
            vistaCli.getjTblCliente().setValueAt(emp.getCedula(), i, 1);
            vistaCli.getjTblCliente().setValueAt(emp.getNombre(), i, 2);
            vistaCli.getjTblCliente().setValueAt(emp.getApellido(), i, 3);
            vistaCli.getjTblCliente().setValueAt(emp.getCorreo(), i, 4);
            vistaCli.getjTblCliente().setValueAt(emp.getCli_direccion(), i, 5);
            vistaCli.getjTblCliente().setValueAt(emp.getTelefono(), i, 6);
            i++;
        });

    }

    public void eliminarCliente() {
        ModelCliente cliente = new ModelCliente();
        int fila = vistaCli.getjTblCliente().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el cliente a eliminar");
        } else {
            int response = JOptionPane.showConfirmDialog(vistaCli, "¿Esta seguro de eliminar al cliente?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                String cedula = vistaCli.getjTblCliente().getValueAt(fila, 1).toString();

                if (cliente.deleteCliente(cedula)) {//Grabamos
                    JOptionPane.showMessageDialog(vistaCli, "Proveedor eliminado correctamente");
                    cargarDatos(1);
                } else {
                    JOptionPane.showMessageDialog(vistaCli, "No se pudo eliminar al Proveedor");
                }
            }
        }
    }
}
