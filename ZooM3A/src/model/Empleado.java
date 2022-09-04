/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.io.FileInputStream;
import java.util.Date;

/**
 *
 * @author ALEJO
 */
public class Empleado extends Persona {

    private int idEmp;
    private String telefono;
    private Date fechanacimiento;
    private int rol;
    private String usuario;
    private String contraseña;
    private String cedulaEmp;
    private String genero;
    //foto
    private Image foto;
    //guardar foto
    private FileInputStream imageFile;
    private int tamano;

    public Empleado() {
    }

    public Empleado(int id, String telefono, Date fechanacimiento, int rol, String usuario, String contraseña, String cedula, String genero, Image foto, FileInputStream imageFile, int tamano) {
        this.idEmp = id;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cedulaEmp = cedula;
        this.genero = genero;
        this.foto = foto;
        this.imageFile = imageFile;
        this.tamano = tamano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCedulaEmp() {
        return cedulaEmp;
    }

    public void setCedulaEmp(String cedulaEmp) {
        this.cedulaEmp = cedulaEmp;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public FileInputStream getImageFile() {
        return imageFile;
    }

    public void setImageFile(FileInputStream imageFile) {
        this.imageFile = imageFile;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

}
