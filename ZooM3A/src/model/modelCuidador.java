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
public class modelCuidador extends Cuidador {

    modelPGconexion mpgc = new modelPGconexion();
    modelEmpleado me = new modelEmpleado();

    public modelCuidador() {
    }

    public modelCuidador(int idSecretaria, String tipoSangre, int idEmpleado, boolean estadoCui) {
        super(idSecretaria, tipoSangre, idEmpleado, estadoCui);
    }

    public boolean setCuidador() {
        String sql = "INSERT INTO cuidador (cui_tiposangre, cui_idempleado,cui_estado)"
                + "values('" + getTipoSangre() + "'," + getIdEmpleado() + "," + isEstadoCui() + ")";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean deleteCuidador(int codigo) {
        String sql = "UPDATE cuidador SET cui_estado=false where cui_idempleado=" + codigo;
        return mpgc.accion(sql);
    }

    public boolean updateCuidador(String cedula) {
        String sql;
        sql = "UPDATE cuidador SET cui_tiposangre='" + getTipoSangre() + "'"
                + "WHERE cui_idempleado=" + me.obtenerIdEmp(cedula);
        return mpgc.accion(sql);
    }

    public String obtenerDatosRol(int codigo) {
        String DatoRol = "";
        String sql = "select cui_tiposangre from cuidador where cui_idempleado=" + codigo;
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
