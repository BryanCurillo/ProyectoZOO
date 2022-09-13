/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author Bryan
 */
public class modelProveedor extends Proveedor {

    modelPGconexion mpgc = new modelPGconexion();

    public modelProveedor() {
    }

    public modelProveedor(int id_proveedor, String ciudad_pro, String nombre_pro, String telefono, boolean estadoPer) {
        super(id_proveedor, ciudad_pro, nombre_pro, telefono, estadoPer);
    }

    public boolean setProveedor() {
        String sql = "INSERT INTO proveedor(pro_ciudad, pro_nombre, pro_telefono)"
                + "VALUES ('" + getCiudad_pro() + "','" + getNombre_pro() + "', '" + getTelefono() + "')";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean updateProveedor() {
        String sql;
        sql = "UPDATE proveedor SET pro_ciudad='" + getCiudad_pro() + "', pro_nombre='" + getNombre_pro() + "', "
                + "pro_telefono='" + getTelefono() + "', pro_estado=" + isEstadoProv()
                + "WHERE pro_id=" + getId_proveedor();
        return mpgc.accion(sql);
    }

    public List<Proveedor> getProveedor() {
        List<Proveedor> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM proveedor where pro_estado=true";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                Proveedor miprov = new Proveedor();
                miprov.setId_proveedor(rs.getInt(1));
                miprov.setCiudad_pro(rs.getString(2));
                miprov.setNombre_pro(rs.getString(3));
                miprov.setTelefono(rs.getString(4));
                miprov.setEstadoProv(rs.getBoolean(5));
                listaProveedores.add(miprov);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelProveedor.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProveedores;
    }

    public List<Proveedor> busquedaIncrementalProveedor(String busqueda) {
        List<Proveedor> listaProveedores = new ArrayList<>();

        String sql = "select * from proveedor"
                + "where pro_estado=true "
                + "and lower(pro_ciudad) like '%" + busqueda + "%' "
                + "or lower(pro_nombre) like '%" + busqueda + "%' "
                + "or lower(pro_telefono) like '%" + busqueda + "%' ";

        ResultSet rs = mpgc.consulta(sql);
        byte[] bytea;
        try {
            while (rs.next()) {
                Proveedor miprov = new Proveedor();
                miprov.setId_proveedor(rs.getInt(1));
                miprov.setCiudad_pro(rs.getString(2));
                miprov.setNombre_pro(rs.getString(3));
                miprov.setTelefono(rs.getString(4));
                miprov.setEstadoProv(rs.getBoolean(5));
                listaProveedores.add(miprov);

            }
        } catch (SQLException e) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProveedores;
    }

    public boolean comprobarDuplicado(String nombre, String ciudad ) {
        int cant = 0;
        boolean ban = true;

        String sql = "	select count(*) from proveedor where pro_nombre='"+nombre+"' and pro_ciudad='"+ciudad+"'";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            if (cant != 0) {
                ban = false;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ban;
    }
}
