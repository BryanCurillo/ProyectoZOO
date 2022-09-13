/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.ModelCliente;
import view.viewRegistrarCliente;
import view.viewVistaCliente;

/**
 *
 * @author ALEJO
 */
public class ControllerCliente {

    private viewRegistrarCliente vrc;
    private viewVistaCliente vvc;
    private ModelCliente mc;

    public ControllerCliente() {
    }

    public ControllerCliente(viewRegistrarCliente vrc, viewVistaCliente vvc) {
        this.vrc = vrc;
        this.vvc = vvc;
    }

    public void iniciarControl() {
        vrc.getBtregistrar().addActionListener(l -> registrarCliente());
        vrc.getBtcancelar().addActionListener(l -> vrc.dispose());
    }

    public void abrirRegistro(int op) {
        String titulo;
        if (op == 1) {
            limpiarCampos();
            titulo = "Crear";
            vrc.setName("Registro");
            vrc.getBtregistrar().setText("REGISTRAR");
            vrc.setVisible(true);
            this.iniciarControl();
        } else {
            titulo = "Editar";
            if (llenarDatos()) {
                vrc.setName("Editar");
                vrc.getTxtcedula().setEditable(false);
                vrc.getBtregistrar().setText("ACTUALIZAR");
                vrc.setVisible(true);
                this.iniciarControl();
            }
        }
    }

    public void registrarCliente() {

        if (validar()) {
            String cedula = vrc.getTxtcedula().getText(),
                    nombre = vrc.getTxtnombre().getText(),
                    apellido = vrc.getTxtapellido().getText(),
                    correo = vrc.getTxtcorreo().getText(),
                    telefono = vrc.getTxttelefono().getText(),
                    direccion = vrc.getTxtdireccion().getText();
            Date fechaRegistro = java.sql.Date.valueOf(LocalDate.now());
            ModelCliente cli = new ModelCliente();
            cli.setEstadoPer(true);
            cli.setApellido(apellido);
            cli.setCli_cedula(cedula);
            cli.setCli_direccion(direccion);
            cli.setCli_telefono(telefono);
            cli.setNombre(nombre);
            cli.setCorreo(correo);
            cli.setFechaRegistro(fechaRegistro);

            if (vrc.getName().equals("Registro")) {
                int response = JOptionPane.showConfirmDialog(vrc, "¿Agregar cliente?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(vrc, "Cliente agregado/a correctamente");
                    vrc.dispose();
                } else {
                    JOptionPane.showMessageDialog(vrc, "No se pudo agregar al empleado");
                }
            }

        }
    }

    public void limpiarCampos() {
        vrc.getTxtcedula().setText("");
        vrc.getTxtnombre().setText("");
        vrc.getTxtapellido().setText("");
        vrc.getTxtdireccion().setText("");
        vrc.getTxtcorreo().setText("");
        vrc.getTxttelefono().setText("");
    }

    public boolean llenarDatos() {
        int fila = vvc.getjTblCliente().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vvc, "Seleccione un cliente a modificar");
            return false;
        } else {
            int id = Integer.parseInt(vvc.getjTblCliente().getValueAt(fila, 0).toString());
            List<Cliente> listap = mc.getClientes();
            listap.stream().forEach(cli -> {
                if (id == cli.getCli_id()) {
                    vrc.getTxtcedula().setText(cli.getCli_cedula());
                    vrc.getTxtnombre().setText(cli.getNombre());
                    vrc.getTxtapellido().setText(cli.getApellido());
                    vrc.getTxtcorreo().setText(cli.getCorreo());
                    vrc.getTxttelefono().setText(cli.getCli_telefono());
                    vrc.getTxtdireccion().setText(cli.getCli_direccion());
                }
            });
            return true;
        }
    }

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();
        //DNI
        if (!vrc.getTxtcedula().getText().isEmpty()) {
            if (!mivalidacion.validarCedula(vrc.getTxtcedula().getText())) {
                JOptionPane.showMessageDialog(vrc, "Cedula invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vrc, "Ingrese la cedula");
            ban = false;
        }
        //NOMBRE
        if (!vrc.getTxtnombre().getText().isEmpty()) {
            if (!mivalidacion.validarNombApeEspacios(vrc.getTxtnombre().getText())) {
                JOptionPane.showMessageDialog(vrc, "Nombre invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vrc, "Ingrese el nombre");
            ban = false;
        }
        //APELLIDO
        if (!vrc.getTxtapellido().getText().isEmpty()) {
            if (!mivalidacion.validarNombApeEspacios(vrc.getTxtapellido().getText())) {
                JOptionPane.showMessageDialog(vrc, "Apellido invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vrc, "Ingrese el Apellido");
            ban = false;
        }
        //TELEFONO
        if (!vrc.getTxttelefono().getText().isEmpty()) {
            if (!mivalidacion.validarTelefono(vrc.getTxttelefono().getText())) {
                JOptionPane.showMessageDialog(vrc, "Telefono invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vrc, "Ingrese el numero de telefono");
            ban = false;
        }
        //CORREO
        if (!vrc.getTxtcorreo().getText().isEmpty()) {
            if (!mivalidacion.validarCorreo(vrc.getTxtcorreo().getText())) {
                JOptionPane.showMessageDialog(vrc, "Correo invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vrc, "Ingrese un correo electronico");
            ban = false;
        }
        //DIRECCION
        if (!vrc.getTxtdireccion().getText().isEmpty()) {
            if (!mivalidacion.validarDireccion(vrc.getTxtcorreo().getText())) {
                JOptionPane.showMessageDialog(vrc, "Direccion invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vrc, "Ingrese una direccion valida");
            ban = false;
        }

        return ban;
    }
;
}
