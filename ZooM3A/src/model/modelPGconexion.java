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

    String cadenaConexion = "jdbc:postgresql://ec2-34-231-42-166.compute-1.amazonaws.com:5432/daomovp8q1k5om";
    String pgUsuario = "mtiwgvcsnodxdy";
    String pgPassword = "dc59e138ce1b6f9853d05ce1c3a7a08bd9c0decdcbd55e9c835fe303130f508d";
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

