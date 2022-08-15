/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALEJO
 */
public class Zoologo extends Personal {

    private String espacioacargo;

    public Zoologo() {
    }

    public Zoologo(String espacioacargo) {
        this.espacioacargo = espacioacargo;
    }

    public Zoologo(String espacioacargo, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.espacioacargo = espacioacargo;
    }

    public Zoologo(String espacioacargo, String usuario, String contraseña, String cedula, String nombre, String apellido, String telefono, String correo, String genero) {
        super(usuario, contraseña, cedula, nombre, apellido, telefono, correo, genero);
        this.espacioacargo = espacioacargo;
    }

    public String getEspacioacargo() {
        return espacioacargo;
    }

    public void setEspacioacargo(String espacioacargo) {
        this.espacioacargo = espacioacargo;
    }

}
