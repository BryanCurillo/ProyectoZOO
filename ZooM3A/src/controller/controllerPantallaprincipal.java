/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.modelEmpleado;
import model.modelPersona;
import view.viewPantallaPrincipal;
import view.viewRegistrarEmpleado;

/**
 *
 * @author Bryan
 */
public class controllerPantallaprincipal {

    private viewPantallaPrincipal vista;

    public controllerPantallaprincipal(viewPantallaPrincipal vista) {
        this.vista = vista;
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
//        System.out.println("iniciado");
    }

    public void iniciaControl() {
        vista.getjMIagregarPersona().addActionListener(l -> registroEmpleado());
    }

//    public void registroEmpleado() {
//        //Instancio las clases del modelo y la vista
//        model.modelEmpleado modeloEmpleado = new modelEmpleado();
//        viewRegistrarEmpleado vistaRegistroPersona = new viewRegistrarEmpleado();
//        //Agragar vista personas al desktop pane
//        vista.setSize(vistaRegistroPersona.getSize().width + 5, vistaRegistroPersona.getSize().height + 5);
//        vista.getjDPprincipal().setSize(vistaRegistroPersona.getSize().width, vistaRegistroPersona.getSize().height);
//        vista.getjDPprincipal().add(vistaRegistroPersona);
//        ControllerEmpleado controladorCrudPersonas = new ControllerEmpleado(modeloEmpleado, vistaRegistroPersona);
//        controladorCrudPersonas.inicialControl();
//    }

    public void registroEmpleado() {
        //Instancio las clases del modelo y la vista
        modelEmpleado modeloEmpleado = new modelEmpleado();
        viewRegistrarEmpleado vistaRegistroEmpleado = new viewRegistrarEmpleado();

        //Agragar vista personas al desktop pane
//        vista.setSize(vistaRegistroEmpleado.getSize().width+15, vistaRegistroEmpleado.getSize().height+60);
//        vista.getjDPprincipal().setSize(vistaRegistroEmpleado.getSize().width, vistaRegistroEmpleado.getSize().height);
        vistaRegistroEmpleado.setName("Registro");
        vista.getjDPprincipal().add(vistaRegistroEmpleado);

        ControllerEmpleado controladorEmpleado = new ControllerEmpleado(modeloEmpleado, vistaRegistroEmpleado);
        controladorEmpleado.inicialControl();

    }
}
