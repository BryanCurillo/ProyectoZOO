/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.io.FileInputStream;

/**
 *
 * @author ALEJO
 */
public class Empleado extends Persona {

    private int id;
    private String telefono;
    private int edad;
    private int rol;
    private String usuario;
    private String contraseña;
    private String cedula;
    //foto
    private Image foto;
    //guardar foto
    private FileInputStream imageFile;
    private int tamano;

    public Empleado() {
    }

    public Empleado(int id, String telefono, int edad, int rol, String usuario, String contraseña, String cedula, Image foto, FileInputStream imageFile, int tamano) {
        this.id = id;
        this.telefono = telefono;
        this.edad = edad;
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cedula = cedula;
        this.foto = foto;
        this.imageFile = imageFile;
        this.tamano = tamano;
    }



}
