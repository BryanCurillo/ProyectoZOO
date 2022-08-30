/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALEJO
 */
public class Habitat {

    private int id_habitat;
    private int capacidad;
    private String tipo;
    private int idZoologo;

    public Habitat() {
    }

    public Habitat(int id_habitat, int capacidad, String tipo, int idZoologo) {
        this.id_habitat = id_habitat;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.idZoologo = idZoologo;
    }

    public int getId_habitat() {
        return id_habitat;
    }

    public void setId_habitat(int id_habitat) {
        this.id_habitat = id_habitat;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdZoologo() {
        return idZoologo;
    }

    public void setIdZoologo(int idZoologo) {
        this.idZoologo = idZoologo;
    }


}
