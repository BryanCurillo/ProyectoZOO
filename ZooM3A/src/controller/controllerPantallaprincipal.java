/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.modelEmpleado;
import model.modelPersona;
import view.viewPantallaPrincipal;
import view.viewRegistrarEmpleado;
import view.viewVistaEmpleados;

/**
 *
 * @author Bryan
 */
public class controllerPantallaprincipal {

    private viewPantallaPrincipal vista;

    public controllerPantallaprincipal() {
    }

    public controllerPantallaprincipal(viewPantallaPrincipal vista) {
        this.vista = vista;
        vista.setLocationRelativeTo(null);
//        System.out.println("iniciado");
        vista.setVisible(true);

    }

    public void iniciaControl() {
        vista.getjMIagregarPersona().addActionListener(l -> registroEmpleado());
        vista.getjMIvistaEmpleado().addActionListener(l -> vistaEmpleado());
    }

    public void registroEmpleado() {
        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
        modelEmpleado modeloEmpleado = new modelEmpleado();
        viewRegistrarEmpleado vistaRegistroEmpleado = new viewRegistrarEmpleado();

        //Agragar vista al desktop pane
        vistaRegistroEmpleado.setName("Registro");
        vista.getjDPprincipal().add(vistaRegistroEmpleado);
        vista.setSize(vistaRegistroEmpleado.getSize());
        ControllerEmpleado controladorEmpleado = new ControllerEmpleado(modeloEmpleado, vistaRegistroEmpleado);
        controladorEmpleado.inicialControl();
    }

    public void vistaEmpleado() {
        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
        viewRegistrarEmpleado vistaRegistroEmpleado = new viewRegistrarEmpleado();
        vistaRegistroEmpleado.setName("Registro");
        vista.getjDPprincipal().add(vistaRegistroEmpleado);
        modelEmpleado modeloEmpleado = new modelEmpleado();
        viewVistaEmpleados vistaEmpleado = new viewVistaEmpleados();

        //Agragar vista al desktop pane        
        vista.getjDPprincipal().add(vistaEmpleado);
        vista.getjDPprincipal().setPreferredSize(vistaEmpleado.getPreferredSize());
        //redimencionar
        vista.setSize(vistaEmpleado.getSize());
        ControllerEmpleado controladorEmpleado = new ControllerEmpleado(modeloEmpleado, vistaRegistroEmpleado, vistaEmpleado);
        controladorEmpleado.inicialControl2();
    }

    public void limpiarJD(){
        vista.getjDPprincipal().removeAll();
    }
}
