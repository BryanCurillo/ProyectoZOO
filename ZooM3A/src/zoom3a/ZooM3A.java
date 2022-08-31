/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoom3a;

import controller.controllerPantallaprincipal;
import controller.controllerLogin;
import model.modelLogin;
import view.PantallaPrincipal;
import view.viewLogin;

/**
 *
 * @author ALEJO
 */
public class ZooM3A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PantallaPrincipal vista = new PantallaPrincipal();
//        controllerPantallaprincipal controller = new controllerPantallaprincipal(vista);
        modelLogin modeloL = new modelLogin();
//        controller.iniciaControl();

        viewLogin vistaL = new viewLogin();
        controllerLogin controllerL = new controllerLogin(modeloL, vistaL);
        controllerL.inicialControl();           

    }

}
