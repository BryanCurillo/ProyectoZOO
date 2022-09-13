/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import model.modelEmpleado;
import view.viewRegistrarProveedor;
import view.viewVistaProveedor;
import javax.swing.table.DefaultTableModel;
import model.modelProveedor;
import model.Proveedor;
import model.modelProveedor;

/**
 *
 * @author ALEJO
 */
public class ControllerRegistroProveedor {

//    private viewPantallaPrincipal vistaP;
//    private controllerPantallaprincipal controllerpp;
    private modelProveedor modeloProv;
    private viewRegistrarProveedor vistaProv;
    private viewVistaProveedor vistaProvTbl;
    int i = 0;

    DefaultTableModel estructuraTabla;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerRegistroProveedor() {
    }

    public ControllerRegistroProveedor(modelProveedor modeloProv, viewRegistrarProveedor vistaProv) {
        this.modeloProv = modeloProv;
        this.vistaProv = vistaProv;
        vistaProv.toFront();
        vistaProv.getTxtOtraCiudad().setEditable(false);
        vistaProv.setVisible(true);
    }

    public ControllerRegistroProveedor(modelProveedor modeloProv, viewRegistrarProveedor vistaProv, viewVistaProveedor vistaProvTbl) {
        this.modeloProv = modeloProv;
        this.vistaProv = vistaProv;
        this.vistaProvTbl = vistaProvTbl;
        vistaProv.toFront();
        vistaProv.getTxtOtraCiudad().setEditable(false);
        vistaProv.setVisible(true);
    }

    public void inicialControl() {
        vistaProv.getComboCiudad().addActionListener(l -> activarTxtCiudad());
        vistaProv.getBtregistrar().addActionListener(l -> crearEditarPersona());
        vistaProv.getBtcancelar().addActionListener(l -> vistaProv.dispose());
        vistaProv.getComboCiudad().addActionListener(l -> activarTxtCiudad());
    }

    public void abrirRegistro(int op) {
        vistaProv.getTxtOtraCiudad().setEditable(false);
        vistaProv.toFront();
        String titulo;
//        cargarComboRol();
        if (op == 1) {
            limpiarCampos();
            titulo = "Crear";
            vistaProv.setName("Registro");
            vistaProv.getBtregistrar().setText("REGISTRAR");
            vistaProv.setVisible(true);
            this.inicialControl();
        } else {
            titulo = "Editar";
            if (llenarDatos()) {
                vistaProv.setName("Editar");
                vistaProv.getBtregistrar().setText("ACTUALIZAR");
                vistaProv.setVisible(true);
                this.inicialControl();
            }
        }
    }

    public void activarTxtCiudad() {
        if (vistaProv.getComboCiudad().getSelectedIndex() != vistaProv.getComboCiudad().getItemCount() - 1) {
            vistaProv.getTxtOtraCiudad().setText("");
            vistaProv.getTxtOtraCiudad().setEditable(false);
        } else {
            vistaProv.getTxtOtraCiudad().setEditable(true);
        }
    }

    private void crearEditarPersona() {
        if (validar()) {
            //Datos proveedor
            int id= Integer.parseInt(vistaProv.getTxtid_prov().getText());
            String nombre = vistaProv.getTxtnombre().getText(),
                    telefono = vistaProv.getTxttelefono().getText(),
                    ciudad = "";
            if (vistaProv.getComboCiudad().getSelectedItem().toString().isEmpty()) {
                ciudad = vistaProv.getComboCiudad().getSelectedItem().toString();
            } else {
                ciudad = vistaProv.getTxtOtraCiudad().getText();

            }
            
            modelProveedor prov = new modelProveedor();
            prov.setId_proveedor(id);
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
                //UPDATE
                int response = JOptionPane.showConfirmDialog(vistaProv, "¿Seguro que desea actualizar al proveedor?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    if (prov.updateProveedor()) {//Grabamos
                        System.out.println("ciudad" + prov.getCiudad_pro());
                        JOptionPane.showMessageDialog(vistaProv, "Proovedor actualizado correctamente");
                        vistaProv.dispose();
                    } else {
                        JOptionPane.showMessageDialog(vistaProv, "No se pudo actualizar a la proveedor");
                    }
                }
            }
        }
    }

    public boolean llenarDatos() {
        vistaProv.getTxtid_prov().setVisible(false);
        int fila = vistaProvTbl.getjTblProveedor().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el proveedor a modificar");
            return false;
        } else {

            int id = Integer.parseInt(vistaProvTbl.getjTblProveedor().getValueAt(fila, 0).toString());
            List<Proveedor> listap = modeloProv.getProveedor();
            listap.stream().forEach(prov -> {
                if (id == prov.getId_proveedor()) {
                    vistaProv.getTxtid_prov().setText(String.valueOf(prov.getId_proveedor()));
                    vistaProv.getTxtnombre().setText(prov.getNombre_pro());
                    vistaProv.getTxtOtraCiudad().setText(prov.getCiudad_pro());
                    vistaProv.getTxttelefono().setText(prov.getTelefono());
                    vistaProv.getTxttelefono().setText(prov.getTelefono());

                }

            });
//            vistaE.dispose();

            return true;
        }

    }

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

    public void limpiarCampos() {
        vistaProv.getTxtnombre().setText("");
        vistaProv.getTxttelefono().setText("");
        vistaProv.getTxtOtraCiudad().setText("");
        vistaProv.getComboCiudad().setSelectedIndex(0);
    }

}
