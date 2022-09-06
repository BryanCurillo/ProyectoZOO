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
public class Animales extends Alimento {

    private int idanimal;
    private String nombreanimal;
    private String genero;
    private String especie;
    private int iddieta;
    private int idhabitad;
    private int idcuidador;
    private String dieta;
    private int edad;
    //foto
    private Image foto;
    //guardar foto
    private FileInputStream imageFile;
    private int tamano;

    public Animales() {
    }

    public Animales(int idanimal, String nombreanimal, String genero, String especie, int iddieta, int idhabitad, int idcuidador, String dieta, int edad, Image foto, FileInputStream imageFile, int tamano) {
        this.idanimal = idanimal;
        this.nombreanimal = nombreanimal;
        this.genero = genero;
        this.especie = especie;
        this.iddieta = iddieta;
        this.idhabitad = idhabitad;
        this.idcuidador = idcuidador;
        this.dieta = dieta;
        this.edad = edad;
        this.foto = foto;
        this.imageFile = imageFile;
        this.tamano = tamano;
    }

    public Animales(int idanimal, String nombreanimal, String genero, String especie, int iddieta, int idhabitad, int idcuidador, String dieta, int edad, Image foto, FileInputStream imageFile, int tamano, String nombre, String tipo, String descripcion, int N_comida_diaria) {
        super(nombre, tipo, descripcion, N_comida_diaria);
        this.idanimal = idanimal;
        this.nombreanimal = nombreanimal;
        this.genero = genero;
        this.especie = especie;
        this.iddieta = iddieta;
        this.idhabitad = idhabitad;
        this.idcuidador = idcuidador;
        this.dieta = dieta;
        this.edad = edad;
        this.foto = foto;
        this.imageFile = imageFile;
        this.tamano = tamano;
    }

    public int getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(int idanimal) {
        this.idanimal = idanimal;
    }

    public String getNombreanimal() {
        return nombreanimal;
    }

    public void setNombreanimal(String nombreanimal) {
        this.nombreanimal = nombreanimal;
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

    public int getIddieta() {
        return iddieta;
    }

    public void setIddieta(int iddieta) {
        this.iddieta = iddieta;
    }

    public int getIdhabitad() {
        return idhabitad;
    }

    public void setIdhabitad(int idhabitad) {
        this.idhabitad = idhabitad;
    }

    public int getIdcuidador() {
        return idcuidador;
    }

    public void setIdcuidador(int idcuidador) {
        this.idcuidador = idcuidador;
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
