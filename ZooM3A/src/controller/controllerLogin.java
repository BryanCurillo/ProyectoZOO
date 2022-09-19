/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.modelEmpleado;
import model.modelLogin;
import view.viewPantallaPrincipal;
import view.viewLogin;

/**
 *
 * @author Bryan
 */
public class controllerLogin {

    viewPantallaPrincipal pp = new viewPantallaPrincipal();
    private modelEmpleado modeloE;
    private modelLogin modeloL;
    private viewLogin vista;
//    private viewPantallaPrincipal vistaP;
    validaciones mivalidacion = new validaciones();

    public controllerLogin(modelLogin modeloL, viewLogin vista) {
        this.modeloL = modeloL;
        this.vista = vista;
        vista.setVisible(true);
    }

    public void inicialControl() {
        vista.getBtiniciarsesion().addActionListener(l -> abrirPrincipal());
        vista.getJbtnClose().addActionListener(l->System.exit(0));
    }

    public void abrirPrincipal() {
//        viewPantallaPrincipal vistaP = new viewPantallaPrincipal();
        if (mivalidacion.validarLogin(vista.getTxtusuarioingreso().getText(), vista.getTxtcontraingreso().getText())) {
            viewPantallaPrincipal vistap = new viewPantallaPrincipal();
            controllerPantallaprincipal controller = new controllerPantallaprincipal(vistap,vista.getTxtusuarioingreso().getText(), vista.getTxtcontraingreso().getText());
            controller.iniciaControl();
            vista.dispose();
        }
    }

}
