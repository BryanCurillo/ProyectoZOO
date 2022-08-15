/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALEJO
 */
public class Habitat extends Zoologo {

    private int id_habitat;
    private int capacidad_especies;
    private String tipo;
    private int bloque;

    public Habitat() {
    }

    public Habitat(int id_habitat, int capacidad_especies, String tipo, int bloque) {
        this.id_habitat = id_habitat;
        this.capacidad_especies = capacidad_especies;
        this.tipo = tipo;
        this.bloque = bloque;
    }

    public Habitat(int id_habitat, int capacidad_especies, String tipo, int bloque, String espacioacargo) {
        super(espacioacargo);
        this.id_habitat = id_habitat;
        this.capacidad_especies = capacidad_especies;
        this.tipo = tipo;
        this.bloque = bloque;
    }

    public Habitat(int id_habitat, int capacidad_especies, String tipo, int bloque, String espacioacargo, String usuario, String contraseña) {
        super(espacioacargo, usuario, contraseña);
        this.id_habitat = id_habitat;
        this.capacidad_especies = capacidad_especies;
        this.tipo = tipo;
        this.bloque = bloque;
    }

    public Habitat(int id_habitat, int capacidad_especies, String tipo, int bloque, String espacioacargo, String usuario, String contraseña, String cedula, String nombre, String apellido, String telefono, String correo, String genero) {
        super(espacioacargo, usuario, contraseña, cedula, nombre, apellido, telefono, correo, genero);
        this.id_habitat = id_habitat;
        this.capacidad_especies = capacidad_especies;
        this.tipo = tipo;
        this.bloque = bloque;
    }

    public int getId_habitat() {
        return id_habitat;
    }

    public void setId_habitat(int id_habitat) {
        this.id_habitat = id_habitat;
    }

    public int getCapacidad_especies() {
        return capacidad_especies;
    }

    public void setCapacidad_especies(int capacidad_especies) {
        this.capacidad_especies = capacidad_especies;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

}
