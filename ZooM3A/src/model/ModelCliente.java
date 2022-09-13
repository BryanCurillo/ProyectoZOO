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
public class ModelCliente extends Cliente {

    modelPGconexion mpgc = new modelPGconexion();

    public List<Cliente> getClientes() {
        List<Cliente> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente c, persona p where c.cli_cedula = p.per_cedula;";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCli_id(rs.getInt(1));
                c.setCli_direccion(rs.getString(2));
                c.setCli_telefono(rs.getString(3));
                c.setCli_cedula(rs.getString(4));
                c.setCedula(rs.getString(5));
                c.setNombre(rs.getString(6));
                c.setApellido(rs.getString(7));
                c.setFechaRegistro(rs.getDate(8));
                c.setCorreo(rs.getString(9));

                listaClientes.add(c);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaClientes;
    }

    public boolean updateCliente() {
        String sql;
        sql = "UPDATE cliente\n"
                + "	SET cli_id=?, cli_direccion=?, cli_telefono=?, cli_cedula=?\n"
                + "	WHERE cli_cedula = " + getCli_cedula() + ";";
        return mpgc.accion(sql);
    }

    public boolean deleteCliente(String cedula) {

        String sql = "DELETE FROM public.cliente\n"
                + "	WHERE cli_cedula = " + cedula + ";";
        return mpgc.accion(sql);//EJECUTAMOS EN DELETE
    }

}
