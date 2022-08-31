/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.modelEmpleado;
import model.modelLogin;
import view.PantallaPrincipal;
import view.viewLogin;

/**
 *
 * @author Bryan
 */
public class controllerLogin {

    PantallaPrincipal pp = new PantallaPrincipal();
    private modelEmpleado modeloE;
    private modelLogin modeloL;
    private viewLogin vista;

    public controllerLogin(modelEmpleado modeloE, viewLogin vista) {
        this.modeloE = modeloE;
        this.vista = vista;
        vista.setVisible(true);
    }

    public void inicialControl() {

    }
    
    
    


}
