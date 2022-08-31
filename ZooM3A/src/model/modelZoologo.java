/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bryan
 */
public class modelZoologo extends Zoologo {

    modelPGconexion mpgc = new modelPGconexion();

    public modelZoologo() {
    }

    public modelZoologo(int id, String rama, int idEmpleado) {
        super(id, rama, idEmpleado);
    }

    public boolean setZoologo() {
        System.out.println(getRama()+"---"+getIdEmpleadoZoo());
        String sql = "INSERT INTO zoologo (zol_rama, zol_idempleado)"
                + "values('" + getRama() + "','" +getIdEmpleadoZoo()+ "');";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }
}
