/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.ModelTickets;
import model.Tickets;
import view.viewActualizarTicket;

/**
 *
 * @author ALEJO
 */
public class ControllerTickets extends Tickets {

    private viewActualizarTicket vrt;
    private ModelTickets mt;

    public ControllerTickets() {
    }

    public ControllerTickets(viewActualizarTicket vrt, ModelTickets mt) {
        this.vrt = vrt;
        this.mt = mt;
        vrt.toFront();
        vrt.setVisible(true);
    }

    public void iniciarControl() {
        vrt.getBtncancelarticket().addActionListener(l -> vrt.dispose());
        vrt.getBtnactualizarticket().addActionListener(l -> ActualizarTicket());
    }

    public void abrirActualizarTicket(int op) {
        String titulo;
//        cargarComboRol();
        if (op == 1) {
            limpiarCampos();
            vrt.setName("ACTUALIZACIÓN DE TICKET");

            vrt.setVisible(true);
            this.iniciarControl();
        }
    }

    public void limpiarCampos() {
        vrt.getCombocategoria().setSelectedItem(1);
        vrt.getTxtprecio().setText("");
    }

    ;
    
        public void cargarComboCategoria() {
//        vista.getComborol().removeAllItems();
        List<Tickets> listaTickets = mt.getTickets();
        listaTickets.stream().forEach(r -> {
            vrt.getCombocategoria().addItem(r.getTic_categoria());
        });
    }

    public void ActualizarTicket() {

        String txtprecio = vrt.getTxtprecio().getText();
        String txtcategoria = (String) vrt.getCombocategoria().getSelectedItem();
        double precio = Double.parseDouble(txtprecio);
        mt.setTic_precio(precio);
        mt.setTic_categoria(txtcategoria);

        int response = JOptionPane.showConfirmDialog(vrt, "¿Seguro que desea actualizar el ticket?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION && mt.updateTicket()) {
            JOptionPane.showMessageDialog(vrt, "ACTUALIZADO CORRECTAMENTE");
        } else {
            JOptionPane.showMessageDialog(vrt, "NO SE PUDO ACTUALIZAR CORRECTAMENTE");
        }
    }

}
