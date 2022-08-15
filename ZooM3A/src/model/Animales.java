/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALEJO
 */
public class Animales extends Alimento {

    private String nombrealimento;
    private String genero;
    private String especie;
    private double peso;
    private String dieta;
    private int edad;

    public Animales() {
    }

    public Animales(String nombrealimento, String genero, String especie, double peso, String dieta, int edad) {
        this.nombrealimento = nombrealimento;
        this.genero = genero;
        this.especie = especie;
        this.peso = peso;
        this.dieta = dieta;
        this.edad = edad;
    }

    public Animales(String nombrealimento, String genero, String especie, double peso, String dieta, int edad, String nombre, String tipo, String descripcion, int N_comida_diaria) {
        super(nombre, tipo, descripcion, N_comida_diaria);
        this.nombrealimento = nombrealimento;
        this.genero = genero;
        this.especie = especie;
        this.peso = peso;
        this.dieta = dieta;
        this.edad = edad;
    }

    public String getNombrealimento() {
        return nombrealimento;
    }

    public void setNombrealimento(String nombrealimento) {
        this.nombrealimento = nombrealimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
