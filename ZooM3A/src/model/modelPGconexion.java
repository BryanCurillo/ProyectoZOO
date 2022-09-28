/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALEJO
 */
public class modelPGconexion {

    String cadenaConexion = "jdbc:postgresql://ec2-18-209-78-11.compute-1.amazonaws.com:5432/d59c9ejt67vemi";
    String pgUsuario = "goxsogvkmbwbgo";
    String pgPassword = "4f071eb13ae15556790bbcc98fe147b0fcf2effcf06acc5d70dd57c88dab94c3";
    Connection con;

     public modelPGconexion() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(cadenaConexion, pgUsuario, pgPassword);
        } catch (SQLException ex) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet consulta(String sql) {
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }

    public boolean accion(String sql) {
        //INSERT-UPDATE-DELETE

        boolean correcto;

        try {
            Statement at = con.createStatement();
            at.execute(sql);
            at.close();//Cierro la conexion
            correcto = true;

        } catch (Exception e) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, e);
            correcto = false;
        }
        return correcto;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }


}//final de clase

