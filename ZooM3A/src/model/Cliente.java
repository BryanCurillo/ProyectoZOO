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
public class Cliente extends Persona {

    private int cli_id;
    private String cli_direccion;
    private String cli_telefono;
    private String cli_cedula;

    public Cliente() {
    }

    public Cliente(int cli_id, String cli_direccion, String cli_telefono, String cli_cedula) {
        this.cli_id = cli_id;
        this.cli_direccion = cli_direccion;
        this.cli_telefono = cli_telefono;
        this.cli_cedula = cli_cedula;
    }

    public Cliente(int cli_id, String cli_direccion, String cli_telefono, String cli_cedula, String cedula, String nombre, String apellido, String correo, Date fechaRegistro, boolean estadoPer) {
        super(cedula, nombre, apellido, correo, fechaRegistro, estadoPer);
        this.cli_id = cli_id;
        this.cli_direccion = cli_direccion;
        this.cli_telefono = cli_telefono;
        this.cli_cedula = cli_cedula;
    }

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getCli_direccion() {
        return cli_direccion;
    }

    public void setCli_direccion(String cli_direccion) {
        this.cli_direccion = cli_direccion;
    }

    public String getCli_telefono() {
        return cli_telefono;
    }

    public void setCli_telefono(String cli_telefono) {
        this.cli_telefono = cli_telefono;
    }

    public String getCli_cedula() {
        return cli_cedula;
    }

    public void setCli_cedula(String cli_cedula) {
        this.cli_cedula = cli_cedula;
    }

}
