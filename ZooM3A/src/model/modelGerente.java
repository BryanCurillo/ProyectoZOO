/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bryan
 */
public class modelGerente extends Gerente {

    modelPGconexion mpgc = new modelPGconexion();

    public modelGerente() {
    }

    public modelGerente(int idGerente, String titulo, int idEmpleado) {
        super(idGerente, titulo, idEmpleado);
    }

    public boolean setGerente() {
        String sql = "INSERT INTO gerente (ger_titulo, ger_idempleado)"
                + "values('" + getTitulo() + "','" + getIdEmpleado() + "');";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

}
