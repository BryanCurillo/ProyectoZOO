/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bryan
 */
public class modelCuidador extends Cuidador {

    modelPGconexion mpgc = new modelPGconexion();

    public modelCuidador() {
    }

    public modelCuidador(int idSecretaria, String experiencia, int idEmpleado) {
        super(idSecretaria, experiencia, idEmpleado);
    }

    public boolean seCuidador() {
        String sql = "INSERT INTO cuidador (cui_tiposangre, cui_idempleado)"
                + "values(" + getTipoSangre() + ",'" + getIdEmpleado() + "');";
        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
    }

}
