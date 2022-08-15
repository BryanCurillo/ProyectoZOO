/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALEJO
 */
public class Cliente extends Persona {

    private int id_cli;

    public Cliente() {
    }

    public Cliente(int id_cli) {
        this.id_cli = id_cli;
    }

    public Cliente(int id_cli, String cedula, String nombre, String apellido, String telefono, String correo, String genero) {
        super(cedula, nombre, apellido, telefono, correo, genero);
        this.id_cli = id_cli;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

}
