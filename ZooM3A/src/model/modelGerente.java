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
public class modelGerente extends Gerente {

    modelPGconexion mpgc = new modelPGconexion();

    public modelGerente() {
    }

    public modelGerente(int idGerente, String titulo, int idEmpleado) {
        super(idGerente, titulo, idEmpleado);
    }

    public boolean setGerente() {
        String sql = "INSERT INTO gerente (ger_titulo, ger_idempleado)"
                + "values('" + getTitulo() + "','" + getIdEmpleado() + "');";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public String obtenerDatosRol(int codigo) {
        String DatoRol = "";
        String sql = "select ger_titulo from gerente where ger_idempleado=" + codigo;
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                DatoRol = rs.getString(1);
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
