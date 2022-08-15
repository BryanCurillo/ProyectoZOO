/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALEJO
 */
public class Gerente extends Personal {

    private String titulo;

    public Gerente() {
    }

    public Gerente(String titulo) {
        this.titulo = titulo;
    }

    public Gerente(String titulo, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.titulo = titulo;
    }

    public Gerente(String titulo, String usuario, String contraseña, String cedula, String nombre, String apellido, String telefono, String correo, String genero) {
        super(usuario, contraseña, cedula, nombre, apellido, telefono, correo, genero);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
