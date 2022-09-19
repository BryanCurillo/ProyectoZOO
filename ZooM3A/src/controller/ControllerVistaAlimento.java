/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import view.viewVistaAlimento;
import model.ModelAlimento;
import javax.swing.table.DefaultTableModel;
import model.Alimento;
import model.modelProveedor;
import view.viewPantallaPrincipal;
import view.viewRegistroAlimento;

/**
 *
 * @author ALEJO
 */
public class ControllerVistaAlimento {

    private viewPantallaPrincipal vistaP;
    private viewVistaAlimento vistaAli;
    private controllerPantallaprincipal controllerpp;
    private ModelAlimento modeloAli;
    private modelProveedor modeloProv;
    int i = 0;

    DefaultTableModel estructuraTabla;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerVistaAlimento() {
    }

    public ControllerVistaAlimento(viewVistaAlimento vistaAli, ModelAlimento modeloAli) {
        this.vistaAli = vistaAli;
        this.modeloAli = modeloAli;
    }

    public ControllerVistaAlimento(viewPantallaPrincipal vistaP, viewVistaAlimento vistaAli, ModelAlimento modeloAli) {
        this.vistaP = vistaP;
        this.vistaAli = vistaAli;
        this.modeloAli = modeloAli;
        cargarDatos(1);
        vistaAli.setVisible(true);
    }

    public void inicialControl() {
        vistaAli.getBtnAgregar().addActionListener(l -> abrirRegistro(1));
        vistaAli.getBtnModificar().addActionListener(l -> abrirRegistro(2));
        vistaAli.getBtnEliminar().addActionListener(l -> eliminarCliente());
        vistaAli.getTxtbuscar().addKeyListener(busquedaIncren);
    }

    public void abrirRegistro(int op) {
        ModelAlimento modeloAli = new ModelAlimento();
        viewRegistroAlimento vistaRegistroAli = new viewRegistroAlimento();
        modelProveedor modeloProv = new modelProveedor();
        if (op == 1) {

            //Agragar vista al desktop pane
            vistaP.getjDPprincipal().add(vistaRegistroAli);
            ControllerRegistrarAlimento controladorAli = new ControllerRegistrarAlimento(vistaRegistroAli, modeloAli, modeloProv, vistaAli);
            controladorAli.abrirRegistro(1);

        } else {
            ControllerRegistrarAlimento controladorAli = new ControllerRegistrarAlimento(vistaRegistroAli, modeloAli, modeloProv, vistaAli);
            int fila = vistaAli.getjTblAlimento().getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione el alimento a modificar");
            } else {
                vistaP.getjDPprincipal().add(vistaRegistroAli);
                controladorAli.abrirRegistro(2);
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
        vistaAli.getjTblAlimento().setRowHeight(50);
        estructuraTabla = (DefaultTableModel) vistaAli.getjTblAlimento().getModel();
        estructuraTabla.setRowCount(0);

        List<Alimento> listaAli;
        if (opc == 1) {
            listaAli = modeloAli.getAlimento();
        } else {
            String busqueda = vistaAli.getTxtbuscar().getText().toLowerCase().trim();
            listaAli = modeloAli.busquedaincremental(busqueda);
        }

//        Holder<Integer> i = new Holder<>(0);
        i = 0;
        listaAli.stream().sorted((x, y)
                -> x.getNombreAli().compareToIgnoreCase(y.getNombreAli())).forEach(emp -> {
            estructuraTabla.addRow(new Object[7]);
            vistaAli.getjTblAlimento().setValueAt(emp.getIdalimento(), i, 0);
            vistaAli.getjTblAlimento().setValueAt(emp.getNombreAli(), i, 1);
            vistaAli.getjTblAlimento().setValueAt(emp.getPrecioAli(), i, 2);
            vistaAli.getjTblAlimento().setValueAt(emp.getNombre_pro(), i, 3);
            vistaAli.getjTblAlimento().setValueAt(emp.getCiudad_pro(), i, 4);
            vistaAli.getjTblAlimento().setValueAt(emp.getTelefono(), i, 5);
            vistaAli.getjTblAlimento().setValueAt(emp.getDescripcionAli(), i, 6);
            i++;
        });

    }

    public void eliminarCliente() {
        ModelAlimento cliente = new ModelAlimento();
        int fila = vistaAli.getjTblAlimento().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el cliente a eliminar");
        } else {
            int response = JOptionPane.showConfirmDialog(vistaAli, "¿Esta seguro de eliminar al cliente?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(vistaAli.getjTblAlimento().getValueAt(fila, 0).toString());

                if (cliente.deleteAlimento(id)) {//Grabamos
                    JOptionPane.showMessageDialog(vistaAli, "Proveedor eliminado correctamente");
                    cargarDatos(1);
                } else {
                    JOptionPane.showMessageDialog(vistaAli, "No se pudo eliminar al Proveedor");
                }
            }
        }
    }
}
