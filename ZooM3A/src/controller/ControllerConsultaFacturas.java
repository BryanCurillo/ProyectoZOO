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
import model.modelEmpleado;
import view.viewConsultarFacturas;
import view.viewRegistrarEmpleado;
import model.modelPersona;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Empleado;
import model.ModelCliente;
import model.ModelFactura;
import model.factura;
import view.viewPantallaPrincipal;
import view.viewVentaTicket;

/**
 *
 * @author ALEJO
 */
public class ControllerConsultaFacturas {

    private controllerPantallaprincipal controllerpp;
    private viewConsultarFacturas vistaConsultaF;
    private viewPantallaPrincipal vistaP;
    private viewVentaTicket vistaVenta;
    private ModelFactura modelFactura;
    private ModelCliente modelCliente;

    int i = 0;
    DefaultTableModel estructuraTabla;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerConsultaFacturas(viewConsultarFacturas vistaConsultaF, viewPantallaPrincipal vistaP, ModelFactura modelFactura) {
        this.vistaConsultaF = vistaConsultaF;
        this.vistaP = vistaP;
        this.modelFactura = modelFactura;
        vistaConsultaF.toFront();
        cargarDatos(1);
        vistaConsultaF.setVisible(true);
    }

    public ControllerConsultaFacturas(viewConsultarFacturas vistaConsultaF, ModelFactura modelFactura) {
        this.vistaConsultaF = vistaConsultaF;
        this.modelFactura = modelFactura;
    }

    public void inicialControl() {
        vistaConsultaF.getjBtnActualizar().addActionListener(l -> cargarDatos(1));
        vistaConsultaF.getTxtBuscar().addKeyListener(busquedaIncren);
    }

//    public void abrirRegistro(int op) {
//        modelEmpleado modeloEmpleado = new modelEmpleado();
//        viewRegistrarEmpleado vistaRegistroEmpleado = new viewRegistrarEmpleado();
//        ControllerRegistroEmpleado controladorEmpleado = new ControllerRegistroEmpleado(modeloEmpleado, vistaRegistroEmpleado, vistaConsultaF);
//
//        if (op == 1) {
//
//            //Agragar vista al desktop pane
//            vistaP.getjDPprincipal().add(vistaRegistroEmpleado);
//
////            ControllerRegistroEmpleado controladorEmpleado = new ControllerRegistroEmpleado(modeloEmpleado, vistaRegistroEmpleado, vistaE);
//            controladorEmpleado.abrirRegistro(1);
//
//        } else {
//            //Agragar vista al desktop pane
////            ControllerRegistroEmpleado controladorEmpleado = new ControllerRegistroEmpleado(modeloEmpleado, vistaRegistroEmpleado, vistaE);
//            int fila = vistaConsultaF.getjTblEmpleado().getSelectedRow();
//            if (fila == -1) {
//                JOptionPane.showMessageDialog(null, "Seleccione la persona a modificar");
//            } else {
//                vistaP.getjDPprincipal().add(vistaRegistroEmpleado);
//                controladorEmpleado.abrirRegistro(2);
//            }
//            cargarDatos(1);
//        }
//    }

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
//        vistaConsultaF.getjTblFactura().setDefaultRenderer(Object.class, new imageTable());
        vistaConsultaF.getjTblFactura().setRowHeight(30);
        estructuraTabla = (DefaultTableModel) vistaConsultaF.getjTblFactura().getModel();
        estructuraTabla.setRowCount(0);
        List<factura> listaFac;
        if (opc == 1) {
            listaFac = modelFactura.getFacturas();
        } else {
            String busqueda = vistaConsultaF.getTxtBuscar().getText().toLowerCase().trim();
            listaFac = modelFactura.getFacturasBuscar(busqueda);
        }

//        Holder<Integer> i = new Holder<>(0);
        i = 0;
        listaFac.stream().sorted((x, y)
                -> x.getEnca_fecha().compareTo(y.getEnca_fecha())).forEach(emp -> {
            estructuraTabla.addRow(new Object[13]);
            //ENCABEZADO
            vistaConsultaF.getjTblFactura().setValueAt(emp.getEnca_id(), i, 0);
            vistaConsultaF.getjTblFactura().setValueAt(emp.getEnca_fecha(), i, 1);
            //CLIENTE
            vistaConsultaF.getjTblFactura().setValueAt(emp.getCli_cedula(), i, 2);
            vistaConsultaF.getjTblFactura().setValueAt(emp.getNombre(), i, 3);
            vistaConsultaF.getjTblFactura().setValueAt(emp.getTelefono(), i, 4);
            vistaConsultaF.getjTblFactura().setValueAt(emp.getCorreo(), i, 5);
            vistaConsultaF.getjTblFactura().setValueAt(emp.getCli_direccion(), i, 6);
            //DETALLE
            vistaConsultaF.getjTblFactura().setValueAt(emp.getItems(), i, 7);
            vistaConsultaF.getjTblFactura().setValueAt(emp.getCantTotal(), i, 8);
            //PIE
            vistaConsultaF.getjTblFactura().setValueAt(("$ "+emp.getPie_subTotal()), i, 9);
            vistaConsultaF.getjTblFactura().setValueAt((emp.getPie_descuento()+" %"), i, 10);
            vistaConsultaF.getjTblFactura().setValueAt(("$ "+emp.getPie_TOTAL()), i, 11);
            i++;
        });

    }
}
