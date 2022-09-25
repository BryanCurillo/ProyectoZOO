/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.DecimalFormat;
import java.util.List;
import model.ModelTickets;
import model.Tickets;
import view.viewVentaTicket;

/**
 *
 * @author Bryan
 */
public class controllerVentaTicket {

    private viewVentaTicket vistaVenta;
    private ModelTickets modelTicket;
    private double precioIniNino;
    private double precioIniAdulto;
    private double precioIniAdultoMayor;

    private double totalIniNino;
    private double totalIniAdulto;
    private double totalIniAdultoMayor;
    private double subTOTAL;
    private double DESCUENTO;
    private double TOTAL;
    private double TOTALDESC;

    public controllerVentaTicket(viewVentaTicket vistaVenta) {
        this.vistaVenta = vistaVenta;
        vistaVenta.toFront();
        cantidadInicial();
        cargarPrecios();
        vistaVenta.setVisible(true);
    }

    public void iniciarControl() {
        //MAS
        vistaVenta.getBtnMasNiño().addActionListener(l -> masNiño());
        vistaVenta.getBtnMasAdulto().addActionListener(l -> masAdulto());
        vistaVenta.getBtnMasAdultoMayor().addActionListener(l -> masAdultoMayor());

        //MENOS
        vistaVenta.getBtnMenosNiño().addActionListener(l -> menosNiño());
        vistaVenta.getBtnMenosAdulto().addActionListener(l -> menosAdulto());
        vistaVenta.getBtnMenosAdultoMayor().addActionListener(l -> menosAdultoMayor());
    }
////////////////////////////////////////////////////////////

    public void cantidadInicial() {
        vistaVenta.getTxtCantidadNiño().setText("0");
        vistaVenta.getTxtCantidadAdulto().setText("0");
        vistaVenta.getTxtCantidadAdultoMayor().setText("0");
        vistaVenta.getTxtTotalAdulto().setText("0.00");
        vistaVenta.getTxtTotalNiño().setText("0.00");
        vistaVenta.getTxtTotalAdultoMayor().setText("0.00");
        vistaVenta.getTxtTOTAL().setText("0.00");
        vistaVenta.getTxtDESCUENTO().setText("0");
        vistaVenta.getTxtSUBTOTAL().setText("0.00");
    }

    //MAS
    public void masNiño() {
        int cant = Integer.parseInt(vistaVenta.getTxtCantidadNiño().getText());
        cant = cant + 1;
        vistaVenta.getTxtCantidadNiño().setText(String.valueOf(cant));
        totalNino();
        calcularSubTOTAL();
//        decuentos();
    }

    public void masAdulto() {
        int cant = Integer.parseInt(vistaVenta.getTxtCantidadAdulto().getText());
        cant = cant + 1;
        vistaVenta.getTxtCantidadAdulto().setText(String.valueOf(cant));
        totalAdulto();
        calcularSubTOTAL();
//        decuentos();
    }

    public void masAdultoMayor() {
        int cant = Integer.parseInt(vistaVenta.getTxtCantidadAdultoMayor().getText());
        cant = cant + 1;
        vistaVenta.getTxtCantidadAdultoMayor().setText(String.valueOf(cant));
        totalAdultoMayor();
        calcularSubTOTAL();
//        decuentos();
    }

    //MENOS
    public void menosNiño() {
        int cant = Integer.parseInt(vistaVenta.getTxtCantidadNiño().getText());
        cant = cant - 1;
        if (cant < 0) {
            cant = 0;
        }
        vistaVenta.getTxtCantidadNiño().setText(String.valueOf(cant));
        totalNino();
        calcularSubTOTAL();
//        decuentos();
    }

    public void menosAdulto() {
        int cant = Integer.parseInt(vistaVenta.getTxtCantidadAdulto().getText());
        cant = cant - 1;
        if (cant < 0) {
            cant = 0;
        }
        vistaVenta.getTxtCantidadAdulto().setText(String.valueOf(cant));
        totalAdulto();
        calcularSubTOTAL();
//        decuentos();
    }

    public void menosAdultoMayor() {
        int cant = Integer.parseInt(vistaVenta.getTxtCantidadAdultoMayor().getText());
        cant = cant - 1;
        if (cant < 0) {
            cant = 0;
        }
        vistaVenta.getTxtCantidadAdultoMayor().setText(String.valueOf(cant));
        totalAdultoMayor();
        calcularSubTOTAL();
//        decuentos();
    }

    //////PRECIOS
    public void cargarPrecios() {
        ModelTickets tic = new ModelTickets();

        List<Tickets> listaT = tic.getTickets();
        listaT.stream().forEach(ticket -> {
            switch (ticket.getTic_id()) {
                case 1:
                    vistaVenta.getTxtPrecioAdulto().setText(String.valueOf(ticket.getTic_precio()));
                    precioIniAdulto = ticket.getTic_precio();
                    break;
                case 2:
                    vistaVenta.getTxtPrecioNiño().setText(String.valueOf(ticket.getTic_precio()));
                    precioIniNino = ticket.getTic_precio();
                    break;
                case 3:
                    vistaVenta.getTxtPrecioAdultoMayor().setText(String.valueOf(ticket.getTic_precio()));
                    precioIniAdultoMayor = ticket.getTic_precio();
                    break;
            }
        });
    }

    ////TOTAL
    public void totalNino() {
        int cantidad = Integer.parseInt(vistaVenta.getTxtCantidadNiño().getText());
        totalIniNino = precioIniNino * cantidad;
        vistaVenta.getTxtTotalNiño().setText(String.valueOf(totalIniNino));
    }

    public void totalAdulto() {
        int cantidad = Integer.parseInt(vistaVenta.getTxtCantidadAdulto().getText());
        totalIniAdulto = precioIniAdulto * cantidad;
        vistaVenta.getTxtTotalAdulto().setText(String.valueOf(totalIniAdulto));
    }

    public void totalAdultoMayor() {
        int cantidad = Integer.parseInt(vistaVenta.getTxtCantidadAdultoMayor().getText());
        totalIniAdultoMayor = precioIniAdultoMayor * cantidad;
        vistaVenta.getTxtTotalAdultoMayor().setText(String.valueOf(totalIniAdultoMayor));
    }

    public void calcularSubTOTAL() {
        double subtotalnino = Double.parseDouble(vistaVenta.getTxtTotalNiño().getText()),
                subtotaladulto = Double.parseDouble(vistaVenta.getTxtTotalAdulto().getText()),
                subtotaladultomayor = Double.parseDouble(vistaVenta.getTxtTotalAdultoMayor().getText());

        double subtotal = subtotaladulto + subtotaladultomayor + subtotalnino;
        subTOTAL = subtotal;
        vistaVenta.getTxtSUBTOTAL().setText(String.valueOf(subTOTAL));
        decuentos();
    }

    public void decuentos() {
//        double subtotal = Double.parseDouble(vistaVenta.getTxtSUBTOTAL().getText());
        double descuento = 0;
        DESCUENTO = 0;
        if (subTOTAL >= 20 && subTOTAL < 30) {
            descuento = 0.05;
//            TOTAL = subTOTAL * descuento;
        } else {
            if (subTOTAL >= 30 && subTOTAL < 40) {
                descuento = 0.1;

            } else {
                if (subTOTAL >= 40 && subTOTAL < 50) {
                    descuento = 0.15;
//                    TOTAL = subTOTAL * descuento;
                } else {
                    if (subTOTAL >= 50) {
                        descuento = 0.2;
//                    TOTAL = subTOTAL * descuento;
                    }
                }
            }
        }

        DESCUENTO = subTOTAL * descuento;
        TOTALDESC = subTOTAL - DESCUENTO;
        vistaVenta.getTxtDESCUENTO().setText(String.valueOf(descuento*100));
        vistaVenta.getTxtTOTAL().setText(String.valueOf(TOTALDESC));
        }
}
