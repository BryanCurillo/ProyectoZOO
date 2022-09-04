/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public int obtenerDatosRol(int codigo) {
        int DatoRol = 0;
        String sql = "select sec_experiencia from secretaria where sec_idempleado=" + codigo;
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                DatoRol = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DatoRol;
    }

}
