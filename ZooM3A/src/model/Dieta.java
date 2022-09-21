/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALEJO
 */
public class Dieta extends Alimento {

    private int die_id;
    private String die_horario;
    private String die_porcion;
    private int die_idAlimento;
    private boolean die_estado;

    public Dieta(int die_id, String die_horario, String die_porcion, int die_idAlimento, boolean die_estado) {
        this.die_id = die_id;
        this.die_horario = die_horario;
        this.die_porcion = die_porcion;
        this.die_idAlimento = die_idAlimento;
        this.die_estado = die_estado;
    }

    public Dieta(int die_id, String die_horario, String die_porcion, int die_idAlimento, boolean die_estado, int idalimento, double precioAli, String nombreAli, String descripcionAli, int idproveedor, boolean estadoAli) {
        super(idalimento, precioAli, nombreAli, descripcionAli, idproveedor, estadoAli);
        this.die_id = die_id;
        this.die_horario = die_horario;
        this.die_porcion = die_porcion;
        this.die_idAlimento = die_idAlimento;
        this.die_estado = die_estado;
    }

}
