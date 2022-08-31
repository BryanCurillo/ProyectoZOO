/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.SimpleDateFormat;
import view.PantallaPrincipal;
import view.RegistrarPersona;
import model.modelPersona;

/**
 *
 * @author ALEJO
 */
public class ControllerPersona {

    PantallaPrincipal pp = new PantallaPrincipal();
    private modelPersona modelo;
    private RegistrarPersona vista;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerPersona(modelPersona modelo, RegistrarPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }



    public void inicialControl() {
//        pp.getMeItAgregarPersona().addActionListener(l -> abrirregistropersona());
    }

    public void abrirregistropersona() {
        RegistrarPersona rp = new RegistrarPersona();
        rp.setVisible(true);
    }

}
