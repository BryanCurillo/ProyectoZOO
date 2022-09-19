/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Toolkit;
import javax.swing.JFrame;
import model.modelEmpleado;
import model.modelProveedor;
import model.ModelCliente;
import model.ModelAlimento;
import model.ModelDieta;
import model.ModelTickets;
import view.viewActualizarTicket;
import view.viewPantallaPrincipal;
import view.viewRegistrarEmpleado;
import view.viewRegistrarCliente;
import view.viewRegistroAlimento;
import view.viewVistaEmpleados;
import view.viewVistaCliente;
import view.viewVistaProveedor;
import view.viewVistaAlimento;
import view.viewVentaTicket;
import view.viewRegistrarProveedor;
import view.viewRegistroDieta;

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
//        vista.getBtnLimpiarDSK().addActionListener();
        vista.getjMIagregarPersona().addActionListener(l -> registroEmpleado());
        vista.getjMIvistaEmpleado().addActionListener(l -> vistaEmpleado());
        vista.getjMIagregarProveedor().addActionListener(l -> registroProveedor());
        vista.getJMIvistaProveedor().addActionListener(l -> vistaProveedor());
        vista.getjMIagregarCliente().addActionListener(l -> registroCliente());
        vista.getJMIvistaCliente().addActionListener(l -> vistaCliente());
        vista.getjMIagregarAlimento().addActionListener(l -> registroAlimento());
        vista.getjMIcrudAlimento().addActionListener(l -> vistaAlimento());
        vista.getMIActualizarPrecio().addActionListener(l -> vistaActualizarTicket());
        vista.getjMIAgregarDieta().addActionListener(l->vistaRegistrarDieta());
    }

    //////////////////////////////////////////////////////////////////////////////////////
    //EMPLEADOS
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

    //PROVEEDORES
    public void registroProveedor() {
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

        ControllerVistaProveedor controllerVistaProv = new ControllerVistaProveedor(vista, vistaProv, modeloProv);
        controllerVistaProv.inicialControl();
    }

    //CLIENTES
    public void registroCliente() {
        //Instancio las clases del modelo y la vista        
        ModelCliente mc = new ModelCliente();
        viewRegistrarCliente vRc = new viewRegistrarCliente();

        //Agragar vista al desktop pane
        vRc.setName("Registro");
        vista.getjDPprincipal().add(vRc);
        ControllerRegistrarCliente ccli = new ControllerRegistrarCliente(vRc, mc);
        ccli.iniciarControl();
    }

    public void vistaCliente() {
        ModelCliente modeloCli = new ModelCliente();
        viewVistaCliente vistaCli = new viewVistaCliente();
//        viewVentaTicket vt = new viewVentaTicket();

        //Agragar vista al desktop pane                
        vista.getjDPprincipal().add(vistaCli);
        ControllerVistaCliente controllerVCli = new ControllerVistaCliente(vista, vistaCli, modeloCli);
        controllerVCli.inicialControl();
    }

    //ALIMENTO
    public void registroAlimento() {
        //Instancio las clases del modelo y la vista        
        ModelAlimento modelAli = new ModelAlimento();
        viewRegistroAlimento vistaRegAli = new viewRegistroAlimento();
        modelProveedor modeloProv = new modelProveedor();

        //Agragar vista al desktop pane
        vistaRegAli.setName("Registro");
        vista.getjDPprincipal().add(vistaRegAli);
        ControllerRegistrarAlimento controReglAli = new ControllerRegistrarAlimento(vistaRegAli, modelAli, modeloProv);
        controReglAli.iniciarControl();
    }

    public void vistaAlimento() {
        ModelAlimento modeloAli = new ModelAlimento();
        viewVistaAlimento vistaAli = new viewVistaAlimento();

        //Agragar vista al desktop pane                
        vista.getjDPprincipal().add(vistaAli);
        ControllerVistaAlimento controllerVali = new ControllerVistaAlimento(vista, vistaAli, modeloAli);
        controllerVali.inicialControl();
    }

    public void vistaActualizarTicket() {
        ModelTickets mt = new ModelTickets();
        viewActualizarTicket vat = new viewActualizarTicket();

        vista.getjDPprincipal().add(vat);
        ControllerTickets ct = new ControllerTickets(vat, mt);
        ct.iniciarControl();

    }

    public void vistaRegistrarDieta() {
        ModelDieta md = new ModelDieta();
        viewRegistroDieta vrd = new viewRegistroDieta();

        vista.getjDPprincipal().add(vrd);
        ControllerDieta cd = new ControllerDieta(vrd, md);

    }
}
