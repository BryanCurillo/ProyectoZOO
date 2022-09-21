/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALEJO
 */
public class ModelHabitad extends Habitat {

    modelPGconexion mpgc = new modelPGconexion();

    public List<Habitat> getHabitad() {
        List<Habitat> listaHabitad = new ArrayList<>();
        String sql = "SELECT * FROM habitad h join zoologo z on(h.hab_idzoologo=z.zol_id)"
                + "  where hab_estado=true";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                Habitat habitad = new Habitat();
                
                habitad.setId_habitat(rs.getInt(1));
                habitad.setTipohab(rs.getString(2));
                habitad.setCapacidadhap(rs.getInt(3));
                habitad.setIdZoologohab(rs.getInt(4));
                habitad.setUbicacionhab(rs.getString(5));
                habitad.setEstadohab(rs.getBoolean(6));
                
                habitad.setIdZoo(rs.getInt(7));
                habitad.setRama(rs.getString(8));
                habitad.setIdEmpleadoZoo(rs.getInt(9));
                habitad.setEstadoZol(rs.getBoolean(10));
                
                listaHabitad.add(habitad);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaHabitad;
    }

    public boolean setHabitad() {
        String sql = "INSERT INTO habitad(hab_tipo, hab_capacidad, hab_idzoologo, hab_ubicacion, hab_estado)"
                + "VALUES ('" + getTipohab()+ "', " + getCapacidadhap()+ ", " + getIdZoologohab()+ ", '" + getUbicacionhab()+ "'," + isEstadohab()+ ")";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean updateHabitad() {
        String sql;
        sql = "UPDATE habitad "
                + "	SET hab_tipo='" + getTipohab()+ "', hab_capacidad=" + getCapacidadhap()+ ",hab_idzoologo=" + getIdZoologohab()+ ", hab_ubicacion='" + getUbicacionhab()+ "', hab_estado=" + isEstadohab()
                + "	WHERE hab_id = " + getId_habitat();
        return mpgc.accion(sql);
    }

    public boolean deleteHabitad(int id) {
        String sql;
        sql = "UPDATE habitad SET hab_estado=false "
                + "WHERE hab_id=" + id;
//        System.out.println(sql);
        return mpgc.accion(sql);
    }

    public List<Alimento> busquedaincremental(String busqueda) {
        List<Alimento> listaAlimento = new ArrayList<>();
        String sql = "SELECT * FROM habitad h join zoologo z on(h.hab_idzoologo=z.zol_id)"
                + "  where hab_estado=true "
                + "  and lower(h.hab_tipo) like '%" + busqueda + "%' "
                + "  or lower(h.hab_ubicacion) like '%" + busqueda + "%' "
                + "  or lower(z.zol_rama) like '%" + busqueda + "%' ";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                Alimento alimento = new Alimento();
                alimento.setIdalimento(rs.getInt(1));
                alimento.setPrecioAli(rs.getDouble(2));
                alimento.setNombreAli(rs.getString(3));
                alimento.setDescripcionAli(rs.getString(4));
                alimento.setEstadoAli(rs.getBoolean(5));
                alimento.setIdproveedor(rs.getInt(6));
                
                alimento.setId_proveedor(7);
                alimento.setCiudad_pro(rs.getString(8));
                alimento.setNombre_pro(rs.getString(9));
                alimento.setTelefono(rs.getString(10));
                alimento.setEstadoProv(rs.getBoolean(11));

                listaAlimento.add(alimento);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaAlimento;
    }
}
