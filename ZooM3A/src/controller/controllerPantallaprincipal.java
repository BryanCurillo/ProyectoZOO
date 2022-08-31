/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import model.modelEmpleado;
import model.modelPersona;
import view.PantallaPrincipal;
import view.RegistrarEmpleado;
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
        vista.getjMIagregarPersona().addActionListener(l->registroEmpleado());
    }
        public void registroEmpleado() {
        //Instancio las clases del modelo y la vista
        model.modelEmpleado modeloAgregarEmpleado = new modelEmpleado();
        RegistrarEmpleado vistaRegistroPersona = new RegistrarEmpleado();
        //Agragar vista personas al desktop pane
//        System.out.println( vista.getSize().width+"  "+ vista.getSize().height);
        vista.setSize(vistaRegistroPersona.getSize().width+15, vistaRegistroPersona.getSize().height+60);
        
        vista.getjDPprincipal().setSize(vistaRegistroPersona.getSize().width, vistaRegistroPersona.getSize().height);
        vistaRegistroPersona.setName("Registro");
        vista.getjDPprincipal().add(vistaRegistroPersona);
        
        ControllerEmpleado controladorEmpleado = new ControllerEmpleado(modeloAgregarEmpleado, vistaRegistroPersona);
        controladorEmpleado.inicialControl();
    }

}
