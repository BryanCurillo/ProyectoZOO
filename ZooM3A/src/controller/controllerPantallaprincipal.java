/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.modelPersona;
import view.PantallaPrincipal;
import view.RegistrarPersona;
/**
 *
 * @author Bryan
 */
public class controllerPantallaprincipal {
    private view.PantallaPrincipal vista;

    public controllerPantallaprincipal(PantallaPrincipal vista) {
        this.vista = vista;
        vista.setVisible(true);
    }
    
    public void iniciaControl() {
        vista.setLocationRelativeTo(null);
        vista.getjMIagregarPersona().addActionListener(l->registroPersona());
    }
        public void registroPersona() {
        //Instancio las clases del modelo y la vista
        model.modelPersona modeloAgregarPersona = new modelPersona();
        RegistrarPersona vistaRegistroPersona = new RegistrarPersona();
        //Agragar vista personas al desktop pane
        vista.setSize(vistaRegistroPersona.getSize().width+5, vistaRegistroPersona.getSize().height+5);
        vista.getjDPprincipal().setSize(vistaRegistroPersona.getSize().width, vistaRegistroPersona.getSize().height);
        vista.getjDPprincipal().add(vistaRegistroPersona);
        ControllerPersona controladorCrudPersonas = new ControllerPersona(modeloAgregarPersona, vistaRegistroPersona);
        controladorCrudPersonas.inicialControl();
    }
}
