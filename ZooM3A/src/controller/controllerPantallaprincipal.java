/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Toolkit;
import javax.swing.JFrame;
import model.modelEmpleado;
import model.modelProveedor;
import view.viewPantallaPrincipal;
import view.viewRegistrarEmpleado;
import view.viewVistaEmpleados;
import view.viewVistaProveedor;
import view.viewRegistrarProveedor;

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
        vista.setVisible(true);
    }

    public void iniciaControl() {
        vista.getjMIagregarPersona().addActionListener(l -> registroEmpleado());
        vista.getjMIvistaEmpleado().addActionListener(l -> vistaEmpleado());
        vista.getjMIagregarProveedor().addActionListener(l -> registroProveedor());
        vista.getJMIvistaProveedor().addActionListener(l->vistaProveedor());
    }

    public void registroEmpleado() {
//        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
        modelEmpleado modeloEmpleado = new modelEmpleado();
        viewRegistrarEmpleado vistaRegistroEmpleado = new viewRegistrarEmpleado();

        //Agragar vista al desktop pane
        vistaRegistroEmpleado.setName("Registro");
        vista.getjDPprincipal().add(vistaRegistroEmpleado);

        ControllerRegistroEmpleado controladorEmpleado = new ControllerRegistroEmpleado(modeloEmpleado, vistaRegistroEmpleado);
        controladorEmpleado.inicialControl();
    }

    public void vistaEmpleado() {
//        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
//        viewRegistrarEmpleado vistaRegistroEmpleado = new viewRegistrarEmpleado();
//        vistaRegistroEmpleado.setName("Registro");
//        vista.getjDPprincipal().add(vistaRegistroEmpleado);

        modelEmpleado modeloEmpleado = new modelEmpleado();
        viewVistaEmpleados vistaEmpleado = new viewVistaEmpleados();

        //Agragar vista al desktop pane        
        vista.getjDPprincipal().add(vistaEmpleado);

//        ControllerRegistroEmpleado controladorEmpleado = new ControllerRegistroEmpleado(modeloEmpleado,  vistaEmpleado,vista);
//        controladorEmpleado.inicialControl2();
        ControllerVistaEmpleado controllerVistaEmpleado = new ControllerVistaEmpleado(modeloEmpleado, vistaEmpleado, vista);
        controllerVistaEmpleado.inicialControl();
    }

    public void registroProveedor() {
//        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
        modelProveedor mp = new modelProveedor();
        viewRegistrarProveedor vre = new viewRegistrarProveedor();

        //Agragar vista al desktop pane
        vre.setName("Registro");
        vista.getjDPprincipal().add(vre);
        ControllerRegistroProveedor cemp = new ControllerRegistroProveedor(mp, vre);
        cemp.inicialControl();
    }

    public void vistaProveedor() {
        modelProveedor modeloProv = new modelProveedor();
        viewVistaProveedor vistaProv = new viewVistaProveedor();

        //Agragar vista al desktop pane        
        vista.getjDPprincipal().add(vistaProv);

//        ControllerRegistroEmpleado controladorEmpleado = new ControllerRegistroEmpleado(modeloEmpleado,  vistaEmpleado,vista);
//        controladorEmpleado.inicialControl2();
        ControllerVistaProveedor controllerVistaProv = new ControllerVistaProveedor(vista, vistaProv, modeloProv);
        controllerVistaProv.inicialControl();
    }
}
