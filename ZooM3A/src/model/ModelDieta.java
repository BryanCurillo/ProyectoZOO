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
 * @author ASUS ROG
 */
public class ModelDieta extends Dieta {

    modelPGconexion mpgc = new modelPGconexion();

    public List<Dieta> getDieta() {
        List<Dieta> listaDieta = new ArrayList<>();
        String sql = "select * from dieta d join alimento a on (d.idalimento=a.ali_id)"
                + "  where die_estado=true";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                Dieta dieta = new Dieta();

                dieta.setDie_id(rs.getInt(0));
                dieta.setDie_horario(rs.getString(1));
                dieta.setDie_porcion(rs.getString(2));
                dieta.setDie_idAlimento(rs.getInt(3));

                listaDieta.add(dieta);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDieta;
    }

    public boolean setDieta() {
        String sql = "INSERT INTO dieta(die_horario, die_porcion, die_idalimento,die_estado)"
                + "VALUES ('" + getDie_horario() + "', " + getDie_porcion() + ", " + getDie_idAlimento() + ","+isDie_estado()+")";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean updateDieta() {
        String sql;
        sql = "UPDATE dietae "
                + "	SET die_horario='" + getDie_horario() + "', die_porcion='" + getDie_porcion() + "',die_idalimento=" + getDie_idAlimento() + ","
                + "	WHERE die_id = " + getDie_id();
        return mpgc.accion(sql);
    }

    public boolean deleteDieta(int id) {
        String sql;
        sql = "UPDATE SET die_estado=false "
                + "WHERE die_id=" + id;
        System.out.println(sql);
        return mpgc.accion(sql);
    }

//    public List<Dieta> busquedaIncrementalDieta(String busqueda) {
//        List<Dieta> listaDieta = new ArrayList<>();
//        String sql = "select * from alimento "
//                + "where ali_estado=true "
//                + "and lower(die_horario) like '%" + busqueda + "%' "
//                + "or lower(die_horario) like '%" + busqueda + "%' ";
////                + "or die_id like '%" + busqueda + "%' ";
//        ResultSet rs = mpgc.consulta(sql);
//        try {
//            while (rs.next()) {
//                Dieta dieta = new Dieta();
//                dieta.setPrecioAli(rs.getDouble(rs.getString(7)));
//                dieta.setNombreAli(rs.getString(8));
//                dieta.setDescripcionAli(rs.getString(9));
//
//                listaDieta.add(dieta);
//            }
//        } catch (SQLException e) {
//            Logger.getLogger(modelProveedor.class.getName()).log(Level.SEVERE, null, e);
//        }
//        try {
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(modelProveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listaDieta;
    }
//}
