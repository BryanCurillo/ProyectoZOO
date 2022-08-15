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

    private String nombre;
    private String tipo;
    private String descripcion;
    private int N_comida_diaria;

    public Alimento() {
    }

    public Alimento(String nombre, String tipo, String descripcion, int N_comida_diaria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.N_comida_diaria = N_comida_diaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getN_comida_diaria() {
        return N_comida_diaria;
    }

    public void setN_comida_diaria(int N_comida_diaria) {
        this.N_comida_diaria = N_comida_diaria;
    }

}
