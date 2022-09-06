/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Image;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import model.modelEmpleado;
import model.modelPersona;
import view.viewPantallaPrincipal;
import view.viewRegistrarEmpleado;
import view.viewVistaEmpleados;

/**
 *
 * @author GRUPITO
 */
public class ControllerAnimal {

    public ControllerAnimal() {
    }

    private viewPantallaPrincipal vistaP;
    private controllerPantallaprincipal controllerpp;
    private modelEmpleado modeloE;
    private modelPersona modeloP;
    private viewRegistrarEmpleado vista;
    private viewVistaEmpleados vistaE;
    private JFileChooser jfc;
    int i = 0;
    DefaultTableModel estructuraTabla;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public void examinarFoto() {
        jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(vista);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image imagen = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        vista.getLblfoto().getWidth(),
                        vista.getLblfoto().getHeight(),
                        Image.SCALE_DEFAULT);
                Icon icono = new ImageIcon(imagen);
                vista.getLblfoto().setIcon(icono);
                vista.getLblfoto().updateUI();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ControllerAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }

}
