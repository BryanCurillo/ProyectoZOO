/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Bryan
 */
public class modelPersona extends Persona {

    modelPGconexion mpgc = new modelPGconexion();

    public modelPersona() {
    }

    public modelPersona(String cedula, String nombre, String apellido, String correo, Date fechaRegistro) {
        super(cedula, nombre, apellido, correo, fechaRegistro);
    }

    public boolean setPersona() {
        String sql = "INSERT INTO persona (per_cedula, per_nombre, per_apellido, per_fecha_registro, per_correo)"
                + "values('" + getCedula() + "','" + getNombre() + "','" + getApellido() + "','" + getFechaRegistro() + "','" + getCorreo() + "');";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }
}
