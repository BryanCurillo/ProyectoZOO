/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.PantallaPrincipal;
import view.RegistrarPersona;

/**
 *
 * @author ALEJO
 */
public class ControllerPersona {

    PantallaPrincipal pp = new PantallaPrincipal();

    public ControllerPersona() {

        pp.setVisible(true);
    }

    public void iniciarcontroles() {
        pp.getMeItAgregarPersona().addActionListener(l -> abrirregistropersona());
    }

    public void abrirregistropersona() {
        RegistrarPersona rp = new RegistrarPersona();
        rp.setVisible(true);
    }

}
