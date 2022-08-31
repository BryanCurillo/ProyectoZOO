/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.io.FileInputStream;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Bryan
 */
public class modelEmpleado extends Empleado {

    modelPGconexion mpgc = new modelPGconexion();

    public modelEmpleado() {
    }

    public modelEmpleado(int id, String telefono, Date fechanacimiento, int rol, String usuario, String contraseña, String cedula, String genero, Image foto, FileInputStream imageFile, int tamano) {
        super(id, telefono, fechanacimiento, rol, usuario, contraseña, cedula, genero, foto, imageFile, tamano);
    }

    public boolean setPersona() {
        String sql = "INSERT INTO persona (per_cedula, per_nombre, per_apellido, per_fecha_registro)"
                + "values('" + getCedula() + "','" + getNombre() + "','" + getApellido() + "','" + getFechaRegistro() + "');";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean setFotoEmpleado() {
        String sql;
        sql = "INSERT INTO empleado(emp_telefono, emp_foto, emp_fechanacimiento, emp_rol, emp_genero, emp_usuario, emp_contraseña, emp_cedula)";
        sql += "VALUES(?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = mpgc.con.prepareStatement(sql);
            ps.setString(1, getTelefono());
            ps.setBinaryStream(2, getImageFile(), getTamano());
            ps.setDate(3, (java.sql.Date) getFechanacimiento());
            ps.setInt(4, getRol());
            ps.setString(5, getGenero());
            ps.setString(6, getUsuario());
            ps.setString(7, getContraseña());
            ps.setString(8, getCedula());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<rol> getroles() {
        List<rol> listaRoles = new ArrayList<>();
        String sql = "select rol_id, rol_nombre from rol";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                rol mirol = new rol();
                mirol.setIdRol(rs.getInt(1));
                mirol.setNombre(rs.getString(2));
                listaRoles.add(mirol);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRoles;
    }
}
