/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ModelTickets;
import model.Tickets;
import view.viewActualizarTicket;
import view.viewVistaTickets;

/**
 *
 * @author ALEJO
 */
public class ControllerVistaTickets {

    private viewVistaTickets vvt;
    private ModelTickets mt;
    DefaultTableModel estructuraTabla;
    int i = 0;
    private viewActualizarTicket vat;

    public ControllerVistaTickets() {
    }

    public ControllerVistaTickets(viewVistaTickets vvt, ModelTickets mt) {
        this.vvt = vvt;
        this.mt = mt;
        cargarDatos();
        vvt.setVisible(true);
    }

    public ControllerVistaTickets(viewVistaTickets vvt, ModelTickets mt, DefaultTableModel estructuraTabla) {
        this.vvt = vvt;
        this.mt = mt;
        this.estructuraTabla = estructuraTabla;
    }

    public void cargarDatos() {
//        vistaCli.getjTblCliente().setDefaultRenderer(Object.class, new imageTable());
        vvt.getjTblTickets().setRowHeight(50);
        estructuraTabla = (DefaultTableModel) vvt.getjTblTickets().getModel();
        estructuraTabla.setRowCount(0);

        List<Tickets> listaTickets;
        listaTickets = mt.getTickets();

//        Holder<Integer> i = new Holder<>(0);
        i = 0;
        listaTickets.stream().forEach(tic -> {
            estructuraTabla.addRow(new Object[3]);
            vvt.getjTblTickets().setValueAt(tic.getTic_id(), i, 0);
            vvt.getjTblTickets().setValueAt(tic.getTic_categoria(), i, 1);
            vvt.getjTblTickets().setValueAt(tic.getTic_precio(), i, 2);
            i++;
        });

    }
}
