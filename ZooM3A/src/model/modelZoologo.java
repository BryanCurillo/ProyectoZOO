/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author Bryan
 */
public class modelZoologo extends Zoologo {

    modelPGconexion mpgc = new modelPGconexion();
    modelEmpleado me = new modelEmpleado();

    public modelZoologo() {
    }

    public modelZoologo(int idZoo, String rama, int idEmpleadoZoo, boolean estadoZol) {
        super(idZoo, rama, idEmpleadoZoo, estadoZol);
    }

    public boolean setZoologo() {
        String sql = "INSERT INTO zoologo (zol_rama, zol_idempleado,zol_estado)"
                + "values('" + getRama() + "'," + getIdEmpleadoZoo() + "," + isEstadoEmp() + ")";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean deleteZoologo(int codigo) {
        String sql = "UPDATE zoologo SET zol_estado=false where zol_idempleado=" + codigo;
        return mpgc.accion(sql);
    }

    public boolean updateZoologo(String cedula) {
        String sql;
        sql = "UPDATE zoologo SET zol_rama='" + getRama() + "'"
                + "WHERE zol_idempleado=" + me.obtenerIdEmp(cedula);
        return mpgc.accion(sql);
    }

    public String obtenerDatosRol(int codigo) {
        String DatoRol = "";
        String sql = "select zol_rama from zoologo where zol_idempleado=" + codigo;
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
