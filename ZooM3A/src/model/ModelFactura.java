/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
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
public class ModelFactura extends factura {

    modelPGconexion mpgc = new modelPGconexion();

    public boolean setEncabezado() {
        String sql = "INSERT INTO fac_encabezado(enca_fecha, enca_idcliente)  "
                + "  VALUES ('" + getEnca_fecha() + "', " + getEnca_idCliente()+ ")";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean setDetalle() {
        String sql = "INSERT INTO fac_detalle(det_cantidad, det_total, det_idenca, det_idticket)  "
                + "  VALUES (" + getDet_cantidad() + ", " + getDet_total() + ", " + getDet_idenca() + ", " + getDet_idticket() + ")";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean setPie() {
        String sql = "INSERT INTO fac_pie(pie_subtotal, pie_descuento, pie_total, pie_idenca)"
                + "VALUES (" + getPie_subTotal() + ", " + getPie_descuento() + ", " + getPie_TOTAL() + ", " + getPie_idEnca() + ")";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public int obtenerIdEncabezado() {
        int idEnca = 0;
        String sql = "select max(enca_id) from fac_encabezado";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                idEnca = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idEnca;
    }

//    public List<factura> getempleado() {
//        List<factura> listaEmpleado = new ArrayList<>();
//
//        String sql = "Select *  "
//                + "  from fac_encabezado enca join fac_detalle det on (enca.enca_id = det.det_idenca)  "
//                + "  join fac_pie pie on (enca.enca_id = pie.pie_idenca)";
//        ResultSet rs = mpgc.consulta(sql);
//        try {
//            while (rs.next()) {
//                factura fac = new factura();
//                fac.setCedula(rs.getString(1));
//                fac.setNombre(rs.getString(2));
//                fac.setApellido(rs.getString(3));
//                fac.setFechaRegistro(rs.getDate(4));
//                fac.setCorreo(rs.getString(5));
//                fac.setTelefono(rs.getString(6));
//                fac.setEstadoEmp(rs.getBoolean(7));
//                fac.setIdEmp(rs.getInt(8));
//                fac.setFechanacimiento(rs.getDate(10));
//                fac.setRol(rs.getInt(11));
//                fac.setGenero(rs.getString(12));
//                fac.setUsuario(rs.getString(13));
//                fac.setContraseña(rs.getString(14));
//                fac.setCedulaEmp(rs.getString(15));
//
//                listaEmpleado.add(fac);
//
//            }
//        } catch (SQLException e) {
//            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, e);
//        }
//
//        try {
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return listaEmpleado;
//    }

}
