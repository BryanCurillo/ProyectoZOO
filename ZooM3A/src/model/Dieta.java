/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALEJO
 */
public class Dieta {

    private int die_id;
    private String die_horario;
    private String die_porcion;
    private int die_idAlimento;

    public Dieta() {
    }

    public Dieta(int die_id, String die_horario, String die_porcion, int die_idAlimento) {
        this.die_id = die_id;
        this.die_horario = die_horario;
        this.die_porcion = die_porcion;
        this.die_idAlimento = die_idAlimento;
    }

    public int getDie_id() {
        return die_id;
    }

    public void setDie_id(int die_id) {
        this.die_id = die_id;
    }

    public String getDie_horario() {
        return die_horario;
    }

    public void setDie_horario(String die_horario) {
        this.die_horario = die_horario;
    }

    public String getDie_porcion() {
        return die_porcion;
    }

    public void setDie_porcion(String die_porcion) {
        this.die_porcion = die_porcion;
    }

    public int getDie_idAlimento() {
        return die_idAlimento;
    }

    public void setDie_idAlimento(int die_idAlimento) {
        this.die_idAlimento = die_idAlimento;
    }

}
