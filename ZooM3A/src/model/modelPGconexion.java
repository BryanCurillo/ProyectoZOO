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

    String cadenaConexion = "jdbc:postgresql://localhost:5432/ZOO";
    String pgUsuario = "postgres";
    String pgContra = "Bryan.2002";
    Connection con;

    public modelPGconexion() {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(cadenaConexion, pgUsuario, pgContra);
        } catch (SQLException ex) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//final de constructor

    public ResultSet consulta(String sql) {

        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }//final de resultset

    public boolean accion(String sql) {

        boolean correcto;
        try {

            Statement st = con.createStatement();
            st.execute(sql);
            st.close();//Cierro conexion.
            correcto = true;
        } catch (SQLException ex) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, ex);
            correcto = false;
        }
        return correcto;
    }//final de accion

    public String getCadenaConexion() {
        return cadenaConexion;
    }

    public void setCadenaConexion(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
    }

    public String getPgUsuario() {
        return pgUsuario;
    }

    public void setPgUsuario(String pgUsuario) {
        this.pgUsuario = pgUsuario;
    }

    public String getPgContra() {
        return pgContra;
    }

    public void setPgContra(String pgContra) {
        this.pgContra = pgContra;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

}//final de clase

