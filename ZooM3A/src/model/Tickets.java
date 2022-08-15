/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ALEJO
 */
public class Tickets extends Cliente {

    private int N_ticket;
    private double precio;
    private Date fecha_compra;
    private boolean generacion;

    public Tickets() {
    }

    public Tickets(int N_ticket, double precio, Date fecha_compra, boolean generacion) {
        this.N_ticket = N_ticket;
        this.precio = precio;
        this.fecha_compra = fecha_compra;
        this.generacion = generacion;
    }

    public Tickets(int N_ticket, double precio, Date fecha_compra, boolean generacion, int id_cli) {
        super(id_cli);
        this.N_ticket = N_ticket;
        this.precio = precio;
        this.fecha_compra = fecha_compra;
        this.generacion = generacion;
    }

    public Tickets(int N_ticket, double precio, Date fecha_compra, boolean generacion, int id_cli, String cedula, String nombre, String apellido, String telefono, String correo, String genero) {
        super(id_cli, cedula, nombre, apellido, telefono, correo, genero);
        this.N_ticket = N_ticket;
        this.precio = precio;
        this.fecha_compra = fecha_compra;
        this.generacion = generacion;
    }

    public int getN_ticket() {
        return N_ticket;
    }

    public void setN_ticket(int N_ticket) {
        this.N_ticket = N_ticket;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public boolean isGeneracion() {
        return generacion;
    }

    public void setGeneracion(boolean generacion) {
        this.generacion = generacion;
    }

}
