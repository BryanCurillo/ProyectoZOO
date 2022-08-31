/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.modelEmpleado;
import model.modelLogin;
import validaciones.validaciones;
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
    private PantallaPrincipal vistaP;
    validaciones mivalidacion = new validaciones();

    public controllerLogin(modelLogin modeloL, viewLogin vista) {
        this.modeloL = modeloL;
        this.vista = vista;
        vista.setVisible(true);
    }



    public void inicialControl() {
        vista.getBtiniciarsesion().addActionListener(l->abrirPrincipal());
    }

    public void abrirPrincipal() {
//        System.out.println(vista.getTxtusuarioingreso().getText());
        if (mivalidacion.validarLogin(vista.getTxtusuarioingreso().getText(), vista.getTxtcontraingreso().getText())) {
            vistaP.setVisible(true);
            vista.dispose();
        }
    }

}
