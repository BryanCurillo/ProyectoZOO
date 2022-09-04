/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bryan
 */
public class modelSecretaria extends Secretaria {

    modelPGconexion mpgc = new modelPGconexion();

    public modelSecretaria() {
    }

    public modelSecretaria(int idSecretaria, int experiencia, int idEmpleado) {
        super(idSecretaria, experiencia, idEmpleado);
    }    

    public boolean setSecretaria() {
        String sql = "INSERT INTO secretaria (sec_experiencia, sec_idempleado)"
                + "values(" + getExperiencia() + ",'" + getIdEmpleado() + "');";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

}
