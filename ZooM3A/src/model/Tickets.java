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

    private int tic_id;
    private double tic_precio;
    private String tic_categoria;

    public Tickets() {
    }

    public Tickets(int tic_id, double tic_precio, String tic_categoria) {
        this.tic_id = tic_id;
        this.tic_precio = tic_precio;
        this.tic_categoria = tic_categoria;
    }

    public Tickets(int tic_id, double tic_precio, String tic_categoria, int cli_id, String cli_direccion, String cli_telefono, String cli_cedula) {
        super(cli_id, cli_direccion, cli_telefono, cli_cedula);
        this.tic_id = tic_id;
        this.tic_precio = tic_precio;
        this.tic_categoria = tic_categoria;
    }

    public Tickets(int tic_id, double tic_precio, String tic_categoria, int cli_id, String cli_direccion, String cli_telefono, String cli_cedula, String cedula, String nombre, String apellido, String correo, Date fechaRegistro, boolean estadoPer) {
        super(cli_id, cli_direccion, cli_telefono, cli_cedula, cedula, nombre, apellido, correo, fechaRegistro, estadoPer);
        this.tic_id = tic_id;
        this.tic_precio = tic_precio;
        this.tic_categoria = tic_categoria;
    }

    public int getTic_id() {
        return tic_id;
    }

    public void setTic_id(int tic_id) {
        this.tic_id = tic_id;
    }

    public double getTic_precio() {
        return tic_precio;
    }

    public void setTic_precio(double tic_precio) {
        this.tic_precio = tic_precio;
    }

    public String getTic_categoria() {
        return tic_categoria;
    }

    public void setTic_categoria(String tic_categoria) {
        this.tic_categoria = tic_categoria;
    }

}
