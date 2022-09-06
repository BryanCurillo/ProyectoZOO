/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALEJO
 */
public class Alimento {

    private int idalimento;
    private double precio;
    private String nombre;
    private int idgerente;
    private int idproveedor;

    public Alimento() {
    }

    public Alimento(int idalimento, double precio, String nombre, int idgerente, int idproveedor) {
        this.idalimento = idalimento;
        this.precio = precio;
        this.nombre = nombre;
        this.idgerente = idgerente;
        this.idproveedor = idproveedor;
    }

    public int getIdalimento() {
        return idalimento;
    }

    public void setIdalimento(int idalimento) {
        this.idalimento = idalimento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdgerente() {
        return idgerente;
    }

    public void setIdgerente(int idgerente) {
        this.idgerente = idgerente;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

}
