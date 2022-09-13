/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.modelEmpleado;
import view.viewVistaEmpleados;
import view.viewRegistrarProveedor;
import model.modelPersona;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Proveedor;
import model.modelCuidador;
import model.modelGerente;
import model.modelProveedor;
import model.modelSecretaria;
import model.modelZoologo;
import view.viewPantallaPrincipal;

/**
 *
 * @author ALEJO
 */
public class ControllerRegistroProveedor {

//    private viewPantallaPrincipal vistaP;
//    private controllerPantallaprincipal controllerpp;
    private modelProveedor modeloProv;
    private viewRegistrarProveedor vistaProv;
    int i = 0;

    DefaultTableModel estructuraTabla;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerRegistroProveedor() {
    }

    public ControllerRegistroProveedor(modelProveedor modeloProv, viewRegistrarProveedor vistaProv) {
        this.modeloProv = modeloProv;
        this.vistaProv = vistaProv;
        vistaProv.toFront();
        vistaProv.setVisible(true);
    }

    public void inicialControl() {
        vistaProv.getComboCiudad().addActionListener(l -> activarTxtCiudad());
        vistaProv.getBtregistrar().addActionListener(l -> crearEditarPersona());
        vistaProv.getBtcancelar().addActionListener(l -> vistaProv.dispose());
    }

    public void abrirRegistro(int op) {
        String titulo;
//        cargarComboRol();
        if (op == 1) {
            limpiarCampos();
            titulo = "Crear";
            vistaProv.setName("Registro");
            vistaProv.getBtregistrar().setText("REGISTRAR");
            vistaProv.setVisible(true);
            this.inicialControl();
//            abrirRegistroEmpleado();
        } else {
//            titulo = "Editar";
//            if (llenarDatos()) {
//                vista.setName("Editar");
//                vista.getTxtcedula().setEditable(false);
//                vista.getBtregistrar().setText("ACTUALIZAR");
//                desactivarDatosRol();
//                vista.setVisible(true);
//                this.inicialControl();
////                abrirRegistroEmpleado();
//            }
        }
    }

    public void activarTxtCiudad() {
        if (vistaProv.getComboCiudad().getSelectedIndex() != vistaProv.getComboCiudad().getMaximumRowCount()) {
            vistaProv.getTxtOtraCiudad().setEditable(false);
        } else {
            vistaProv.getTxtOtraCiudad().setEditable(true);
        }
    }

    private void crearEditarPersona() {
        if (validar()) {
            //Datos proveedor
            String nombre = vistaProv.getTxtnombre().getText(),
                    telefono = vistaProv.getTxttelefono().getText(),
                    ciudad = vistaProv.getTxtOtraCiudad().getText();

            modelProveedor prov = new modelProveedor();
            prov.setNombre_pro(nombre);
            prov.setCiudad_pro(ciudad);
            prov.setTelefono(telefono);
            prov.setEstadoProv(true);

            if (vistaProv.getName().equals("Registro")) {
                if (modeloProv.comprobarDuplicado(nombre, ciudad)) {
                    //INSERT
                    int response = JOptionPane.showConfirmDialog(vistaProv, "¿Esta seguro que desea agregar un proveedor?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response == JOptionPane.YES_OPTION) {
                        if (prov.setProveedor()) {//Grabamos
                            JOptionPane.showMessageDialog(vistaProv, "Proovedor agregado correctamente");
                            vistaProv.dispose();
//                            cargarDatos(1);
                        } else {
                            JOptionPane.showMessageDialog(vistaProv, "No se pudo agregar a la proveedor");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(vistaProv, "El proveedor ya se encuentra registrado");
                }
            } else {
//                //UPDATE
//                int response = JOptionPane.showConfirmDialog(vista, "¿Seguro que desea actualizar a la persona?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//                if (response == JOptionPane.YES_OPTION) {
//
//                    if (colorAux != colorAux2) {
//                        System.out.println("registro1");
//                        if (empleado.updateFotoEmpleado() && persona.updatePersona()) {
//                            ban = true;
//                        }
//                    } else {
//                        System.out.println("registro2");
//                        if (empleado.updateEmpleado() && persona.updatePersona()) {
//                            ban = true;
//                        }
//                    }
//
//                    if (ban) {
//                        ban = false;
//                        int opc = vista.getComborol().getSelectedIndex();
//                        switch (opc) {
//                            case 1:
//                                //Gerente
//                                String titulo = vista.getTxtTitulo().getText();
//                                modelGerente gerente = new modelGerente();
//                                gerente.setIdEmpleado(empleado.obtenerIdEmp(cedulaemp));
//                                gerente.setTitulo(titulo);
//                                if (gerente.updateGerente(cedulaemp)) {
//                                    ban = true;
//                                }
//                                break;
//                            case 2:
//                                int experiencia = (int) vista.getjSexperiencia().getValue();
//                                modelSecretaria secretaria = new modelSecretaria();
//                                secretaria.setIdEmpleado(empleado.obtenerIdEmp(cedulaemp));
//                                secretaria.setExperiencia(experiencia);
//                                if (secretaria.updateSecretaria(cedulaemp)) {
//                                    ban = true;
//                                }
//                                break;
//                            case 3:
//                                //Zoologo
//                                String rama = vista.getComborama().getSelectedItem().toString();
//                                modelZoologo zoologo = new modelZoologo();
//                                zoologo.setIdEmpleadoZoo(empleado.obtenerIdEmp(cedulaemp));
//                                zoologo.setRama(rama);
//                                if (zoologo.updateZoologo(cedulaemp)) {
//                                    ban = true;
//                                }
//                                break;
//                            case 4:
//                                String tipoSangre = vista.getCombosangre().getSelectedItem().toString();
//                                modelCuidador cuidador = new modelCuidador();
//                                cuidador.setIdEmpleado(empleado.obtenerIdEmp(cedulaemp));
//                                cuidador.setTipoSangre(tipoSangre);
//                                if (cuidador.updateCuidador(cedulaemp)) {
//                                    ban = true;
//                                }
//                                break;
//                        }
//                        if (ban) {
//                            eliminarRoles(cedulaemp);
//                            registrarRoles(cedulaemp);
//                        }
//                    }
//                    if (ban) {
//                        JOptionPane.showMessageDialog(vista, "Empleado actualizado/a correctamente");
//                        limpiarCampos();
//                        vista.dispose();
//                    } else {
//                        JOptionPane.showMessageDialog(vista, "No se pudo actualizar al empleado");
//                    }
            }
        }
    }
//    public boolean llenarDatos() {
//        int fila = vistaE.getjTblEmpleado().getSelectedRow();
//        if (fila == -1) {
//            JOptionPane.showMessageDialog(null, "Seleccione la persona a modificar");
//            return false;
//        } else {
//
//            int id = Integer.parseInt(vistaE.getjTblEmpleado().getValueAt(fila, 0).toString());
//            List<Empleado> listap = modeloE.getempleado();
//            listap.stream().forEach(emp -> {
//                if (id == emp.getIdEmp()) {
//                    vista.getTxtcedula().setText(emp.getCedula());
//                    vista.getTxtnombre().setText(emp.getNombre());
//                    vista.getTxtapellido().setText(emp.getApellido());
//                    vista.getTxttelefono().setText(emp.getTelefono());
//                    vista.getTxtcorreo().setText(emp.getCorreo());
//                    if (emp.getGenero().equalsIgnoreCase("Masculino")) {
//                        vista.getBtmasculino().setSelected(true);
//                    }
//                    if (emp.getGenero().equalsIgnoreCase("Femenino")) {
//                        vista.getBtfemenino().setSelected(true);
//                    }
//                    vista.getCalendarFechanacimiento().setDate(emp.getFechanacimiento());
//                    vista.getTxtusuario().setText(emp.getUsuario());
//                    vista.getTxtcontra().setText(emp.getContraseña());
//                    vista.getTxtconfirmacontra().setText(emp.getContraseña());
//                    Image foto = emp.getFoto();
//                    if (foto != null) {
//                        foto = foto.getScaledInstance(94, 101, Image.SCALE_SMOOTH);
//                        ImageIcon icono = new ImageIcon(foto);
//                        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
//                        dtcr.setIcon(icono);
//                        vista.getLblfoto().setIcon(icono);
//                    } else {
//                        vista.getLblfoto().setIcon(null);
//                    }
//
//                    String opc = vistaE.getjTblEmpleado().getValueAt(fila, 8).toString();
////                    System.out.println(opc + "lllllll");
//                    switch (opc) {
//                        case "Gerente":
//                            //Gerente
//                            modelGerente me = new modelGerente();
//                            vista.getComborol().setSelectedIndex(1);
//                            vista.getTxtTitulo().setText(me.obtenerDatosRol(id));
//                            break;
//                        case "Secretaria":
//                            //Secretaria
//                            vista.getComborol().setSelectedIndex(2);
//                            modelSecretaria ms = new modelSecretaria();
//                            vista.getjSexperiencia().setValue(ms.obtenerDatosRol(id));
//                            break;
//                        case "Zoologo":
//                            //Zoologo
//                            vista.getComborol().setSelectedIndex(3);
//
//                            modelZoologo mz = new modelZoologo();
//                            for (int j = 0; j < vista.getComborama().getItemCount(); j++) {
//                                if (vista.getComborama().getItemAt(j).equalsIgnoreCase(mz.obtenerDatosRol(id))) {
//                                    vista.getComborama().setSelectedIndex(j);
//                                }
//                            }
//                            break;
//                        case "Cuidador":
//                            //Cuidador
//                            vista.getComborol().setSelectedIndex(4);
//                            modelCuidador mc = new modelCuidador();
//                            for (int j = 0; j < vista.getCombosangre().getItemCount(); j++) {
//                                if (vista.getCombosangre().getItemAt(j).equalsIgnoreCase(mc.obtenerDatosRol(id))) {
//                                    vista.getCombosangre().setSelectedIndex(j);
////                                    vista.getCombosangre().setSelectedItem(mc.obtenerDatosRol(id));
//                                }
//                            }
//                            break;
//                    }
//                }
//
//            });
////            vistaE.dispose();
//
//            return true;
//        }
//
//    }

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();
        //NOMBRE
        if (!vistaProv.getTxtnombre().getText().isEmpty()) {
            if (!mivalidacion.validarNombApeEspacios(vistaProv.getTxtnombre().getText())) {
                JOptionPane.showMessageDialog(vistaProv, "Nombre invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vistaProv, "Ingrese el nombre");
            ban = false;
        }
        //TELEFONO
        if (!vistaProv.getTxttelefono().getText().isEmpty()) {
            if (!mivalidacion.validarTelefono(vistaProv.getTxttelefono().getText())) {
                JOptionPane.showMessageDialog(vistaProv, "Telefono invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vistaProv, "Ingrese el numero de telefono");
            ban = false;
        }
        //COMBO
        if (vistaProv.getComboCiudad().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(vistaProv, "Seleccione una ciudad");
            ban = false;
        }

        return ban;
    }

    public boolean eliminarRoles(String cedulaemp) {
        modelEmpleado empleado = new modelEmpleado();

        boolean ban = false;
//        int opc = vista.getComborol().getSelectedIndex();
        for (int j = 0; j <= 4; j++) {
            switch (j) {
                case 1:
                    //Gerente
                    modelGerente gerente = new modelGerente();
                    gerente.deleteGerente(empleado.obtenerIdEmp(cedulaemp));
                    break;
                case 2:
                    //SECRETARIA
                    modelSecretaria secretaria = new modelSecretaria();
                    secretaria.deleteSecretaria(empleado.obtenerIdEmp(cedulaemp));
                    break;
                case 3:
                    //Zoologo
                    modelZoologo zoologo = new modelZoologo();
                    zoologo.deleteZoologo(empleado.obtenerIdEmp(cedulaemp));
                    break;
                case 4:
                    modelCuidador cuidador = new modelCuidador();
                    cuidador.deleteCuidador(empleado.obtenerIdEmp(cedulaemp));
                    break;
            }
        }

        return ban;
    }

    public void limpiarCampos() {
        vistaProv.getTxtnombre().setText("");
        vistaProv.getTxttelefono().setText("");
        vistaProv.getTxtOtraCiudad().setText("");
        vistaProv.getComboCiudad().setSelectedIndex(0);
    }

}
