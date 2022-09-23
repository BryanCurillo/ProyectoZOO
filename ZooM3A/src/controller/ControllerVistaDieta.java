/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelAlimento;
import javax.swing.table.DefaultTableModel;
import model.Dieta;
import model.ModelDieta;
import view.viewPantallaPrincipal;
import view.viewRegistroDieta;
import view.viewVistaDieta;

/**
 *
 * @author ALEJO
 */
public class ControllerVistaDieta {

    private viewPantallaPrincipal vistaP;
    private viewVistaDieta vistaDie;
    private controllerPantallaprincipal controllerpp;
    private ModelAlimento modeloAli;
    private ModelDieta modeloDie;
    int i = 0;

    DefaultTableModel estructuraTabla;
//    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerVistaDieta() {
    }

    public ControllerVistaDieta(viewVistaDieta vistaDie, ModelDieta modeloDie) {
        this.vistaDie = vistaDie;
        this.modeloDie = modeloDie;
    }

    public ControllerVistaDieta(viewPantallaPrincipal vistaP, viewVistaDieta vistaDie, ModelDieta modeloDie) {
        this.vistaP = vistaP;
        this.vistaDie = vistaDie;
        this.modeloDie = modeloDie;
        cargarDatos(1);
        vistaDie.toFront();
        vistaDie.setVisible(true);
    }

    public void inicialControl() {
        vistaDie.getBtnAgregar().addActionListener(l -> abrirRegistro(1));
        vistaDie.getBtnModificar().addActionListener(l -> abrirRegistro(2));
        vistaDie.getBtnEliminar().addActionListener(l -> eliminarAlimento());
        vistaDie.getTxtbuscar().addKeyListener(busquedaIncren);
    }

    public void abrirRegistro(int op) {
        ModelDieta modeloDie = new ModelDieta();
        viewRegistroDieta vistaRegistroDie = new viewRegistroDieta();
        ModelAlimento modelAli = new ModelAlimento();
        if (op == 1) {

            //Agragar vista al desktop pane
            vistaP.getjDPprincipal().add(vistaRegistroDie);
            ControllerRegistrarDieta controladorDie = new ControllerRegistrarDieta(vistaRegistroDie, vistaDie, modeloDie, modelAli);
//            ControllerRegistrarAlimento controladorAli = new ControllerRegistrarAlimento(vistaRegistroHab, modeloHab, modeloProv, vistaHab);
            controladorDie.abrirRegistro(1);

        } else {
            ControllerRegistrarDieta controladorDie = new ControllerRegistrarDieta(vistaRegistroDie, vistaDie, modeloDie, modelAli);
            int fila = vistaDie.getjTblDieta().getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione la dieta a modificar");
            } else {
                vistaP.getjDPprincipal().add(vistaRegistroDie);
                controladorDie.abrirRegistro(2);
            }
            cargarDatos(1);
        }
    }

    KeyListener busquedaIncren = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            cargarDatos(2);
        }
    };

    public void cargarDatos(int opc) {
        System.out.println("actualizado");
        vistaDie.getjTblDieta().setRowHeight(50);
        estructuraTabla = (DefaultTableModel) vistaDie.getjTblDieta().getModel();
        estructuraTabla.setRowCount(0);

        List<Dieta> listaHab;
        if (opc == 1) {
            listaHab = modeloDie.getDieta();
        } else {
            String busqueda = vistaDie.getTxtbuscar().getText().toLowerCase().trim();
            listaHab = modeloDie.busquedaIncrementalDieta(busqueda);
        }

//        Holder<Integer> i = new Holder<>(0);
        i = 0;
        listaHab.stream().sorted((x, y)
                -> x.getDie_horario().compareToIgnoreCase(y.getDie_horario())).forEach(emp -> {
            estructuraTabla.addRow(new Object[7]);
            vistaDie.getjTblDieta().setValueAt(emp.getDie_id(), i, 0);
            vistaDie.getjTblDieta().setValueAt(emp.getNombreAli(), i, 1);
            vistaDie.getjTblDieta().setValueAt(emp.getDie_horario(), i, 2);
            vistaDie.getjTblDieta().setValueAt(emp.getDie_porcion(), i, 3);
            vistaDie.getjTblDieta().setValueAt(emp.getDescripcionAli(), i, 4);
            i++;
        });

    }

    public void eliminarAlimento() {
        ModelDieta dieta = new ModelDieta();
        int fila = vistaDie.getjTblDieta().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione la dieta a eliminar");
        } else {
            int response = JOptionPane.showConfirmDialog(vistaDie, "¿Esta seguro de eliminar la dieta?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(vistaDie.getjTblDieta().getValueAt(fila, 0).toString());

                if (dieta.deleteDieta(id)) {//Grabamos
                    JOptionPane.showMessageDialog(vistaDie, "Alimento eliminado correctamente");
                    cargarDatos(1);
                } else {
                    JOptionPane.showMessageDialog(vistaDie, "No se pudo eliminar el alimento");
                }
            }
        }
    }
}
