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
import view.viewRegistrarEmpleado;
import model.modelPersona;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Empleado;
import model.modelCuidador;
import model.modelGerente;
import model.modelSecretaria;
import model.modelZoologo;
import model.rol;
import view.viewPantallaPrincipal;

/**
 *
 * @author ALEJO
 */
public class ControllerEmpleado {

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

    public ControllerEmpleado(modelEmpleado modelo, viewRegistrarEmpleado vista) {
        this.modeloE = modelo;
        this.vista = vista;
//        System.out.println(vista.getComborol().getItemCount());
        cargarComboRol();
//        System.out.println(vista.getComborol().getItemCount());

        desactivarDatosRol();
        vista.setVisible(true);
    }

    public ControllerEmpleado(modelEmpleado modeloE, viewRegistrarEmpleado vista, viewVistaEmpleados vistaE) {
        this.modeloE = modeloE;
        this.vista = vista;
        this.vistaE = vistaE;
//        desactivarDatosRol();
        cargarDatos(1);
        vistaE.setVisible(true);
    }

    public void inicialControl() {
        vista.getComborol().addActionListener(l -> activarDatosRol());
        vista.getBtagregarfoto().addActionListener(l -> examinarFoto());
        vista.getBtregistrar().addActionListener(l -> crearEditarPersona());
        vista.getBtcancelar().addActionListener(l -> vista.dispose());
    }

    public void inicialControl2() {
        vistaE.getjBtnElimina().addActionListener(l -> eliminarEmpleado());
        vistaE.getjBtnActualizar().addActionListener(l -> cargarDatos(1));
//        vistaE.getjBtnModificar().addActionListener(l -> llenarDatos());
        vistaE.getJbtnAgregar().addActionListener(l -> abrirDialoogo(1));
        vistaE.getjBtnModificar().addActionListener(l -> abrirDialoogo(2));
    }

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
                Logger.getLogger(ControllerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cargarComboRol() {
//        vista.getComborol().removeAllItems();
        List<rol> listaRol = modeloE.getroles();
        listaRol.stream().forEach(r -> {
            vista.getComborol().addItem(r.getNombre());
        });
    }

    public void cargarDatos(int opc) {
        vistaE.getjTblEmpleado().setDefaultRenderer(Object.class, new imageTable());
        vistaE.getjTblEmpleado().setRowHeight(60);
        estructuraTabla = (DefaultTableModel) vistaE.getjTblEmpleado().getModel();
        estructuraTabla.setRowCount(0);
        List<Empleado> listaE;
//        if (opc == 1) {
        listaE = modeloE.getempleado();
//        } 
//        else {
////            String busqueda = vista.getTxt_buscar().getText().toLowerCase().trim();
////            listaE = modelo.busquedaIncrementalPersona(busqueda);
//        }

//        Holder<Integer> i = new Holder<>(0);
        i = 0;
        listaE.stream().sorted((x, y)
                -> x.getCedula().compareToIgnoreCase(y.getCedula())).forEach(emp -> {
            estructuraTabla.addRow(new Object[8]);
            vistaE.getjTblEmpleado().setValueAt(emp.getIdEmp(), i, 0);
            vistaE.getjTblEmpleado().setValueAt(emp.getCedula(), i, 1);
            vistaE.getjTblEmpleado().setValueAt(emp.getNombre(), i, 2);
            vistaE.getjTblEmpleado().setValueAt(emp.getApellido(), i, 3);
            vistaE.getjTblEmpleado().setValueAt(emp.getTelefono(), i, 4);
            vistaE.getjTblEmpleado().setValueAt(emp.getFechanacimiento().toString(), i, 5);
            vistaE.getjTblEmpleado().setValueAt(emp.getCorreo(), i, 6);
            vistaE.getjTblEmpleado().setValueAt(emp.getGenero(), i, 7);
            vistaE.getjTblEmpleado().setValueAt(modeloE.obtenerRol(emp.getRol()), i, 8);
            vistaE.getjTblEmpleado().setValueAt(emp.getUsuario(), i, 9);
            vistaE.getjTblEmpleado().setValueAt(emp.getContraseña(), i, 10);
            vistaE.getjTblEmpleado().setValueAt(emp.getFechaRegistro().toString(), i, 11);

            Image foto = emp.getFoto();
            if (foto != null) {
                foto = foto.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(foto);

                DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
                dtcr.setIcon(icono);
                vistaE.getjTblEmpleado().setValueAt(new JLabel(icono), i, 12);
            } else {
                vistaE.getjTblEmpleado().setValueAt(null, i, 12);
            }
            i++;
        });
    }

    public void abrirDialoogo(int op) {
        controllerPantallaprincipal pp = new controllerPantallaprincipal();
        vista.getLblfoto().setIcon(null);
//        pp.getjDPprincipal().removeAll();
        String titulo;
        cargarComboRol();
        vistaE.dispose();
        if (op == 1) {
            titulo = "Crear";
            vista.setName("Registro");
            desactivarDatosRol();
            vista.setVisible(true);
            this.inicialControl();
        } else {
            titulo = "Editar";
            if (llenarDatos()) {
                vista.setName("Editar");
                desactivarDatosRol();
                vista.setVisible(true);
                this.inicialControl();
            }
        }
        activarDatosRol();
    }

    private void crearEditarPersona() {
        if (vista.getName().equals("Registro")) {

            //INSERT
            if (validar()) {
                int response = JOptionPane.showConfirmDialog(vista, "¿Agregar persona?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    //DatosPersona
                    String cedula = vista.getTxtcedula().getText(),
                            nombre = vista.getTxtnombre().getText(),
                            apellido = vista.getTxtapellido().getText(),
                            correo = vista.getTxtcorreo().getText();
                    Date fechaRegistro = java.sql.Date.valueOf(LocalDate.now());

                    modelPersona persona = new modelPersona();
                    persona.setCedula(cedula);
                    persona.setNombre(nombre);
                    persona.setApellido(apellido);
                    persona.setCorreo(correo);
                    persona.setFechaRegistro(fechaRegistro);

                    //Empleado
                    String telefono = vista.getTxttelefono().getText(),
                            usuario = vista.getTxtusuario().getText(),
                            contrasena = vista.getTxtcontra().getText(),
                            cedulaemp = vista.getTxtcedula().getText(),
                            genero = null;
                    int rol = vista.getComborol().getSelectedIndex();
                    Date date = vista.getCalendarFechanacimiento().getDate(); //vista es la interfaz, jDate el JDatechooser
                    long d = date.getTime(); //guardamos en un long el tiempo
                    java.sql.Date fechanacimiento = new java.sql.Date(d);// parseamos al formato del sql  

                    if (vista.getBtmasculino().isSelected()) {
                        genero = "Masculino";
                    } else {
                        if (vista.getBtfemenino().isSelected()) {
                            genero = "Femenino";
                        } else {
                            JOptionPane.showMessageDialog(vista, "Elija un sexo");
                        }
                    }
                    modelEmpleado empleado = new modelEmpleado();
                    empleado.setTelefono(telefono);
                    empleado.setFechanacimiento(fechanacimiento);
                    empleado.setGenero(genero);
                    empleado.setUsuario(usuario);
                    empleado.setContraseña(contrasena);
                    empleado.setCedula(cedulaemp);
                    empleado.setRol(rol);

                    try {
                        FileInputStream img = new FileInputStream(jfc.getSelectedFile());
                        int largo = (int) jfc.getSelectedFile().length();
                        empleado.setImageFile(img);
                        empleado.setTamano(largo);

                    } catch (IOException ex) {
                        Logger.getLogger(ControllerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //...........
//                if (persona.setPersona()) {//Grabamos
                    if (persona.setPersona() && empleado.setFotoEmpleado()) {//Grabamos
                        int opc = vista.getComborol().getSelectedIndex();
                        switch (opc) {
                            case 1:
                                //Gerente
                                String titulo = vista.getTxtTitulo().getText();
                                modelGerente gerente = new modelGerente();
                                gerente.setIdEmpleado(empleado.obtenerCodigo(cedulaemp));
                                gerente.setTitulo(titulo);
                                gerente.setGerente();
                                JOptionPane.showMessageDialog(vista, "Gerente agregado/a correctamente");
                                break;
                            case 2:
                                int experiencia = (int) vista.getjSexperiencia().getValue();
                                modelSecretaria secretaria = new modelSecretaria();
                                secretaria.setIdEmpleado(empleado.obtenerCodigo(cedulaemp));
                                secretaria.setExperiencia(experiencia);
                                secretaria.setSecretaria();
                                JOptionPane.showMessageDialog(vista, "Secretaria agregado/a correctamente");
                                break;
                            case 3:
                                //Zoologo
                                String rama = vista.getComborama().getSelectedItem().toString();
                                modelZoologo zoologo = new modelZoologo();
                                zoologo.setIdEmpleadoZoo(empleado.obtenerCodigo(cedulaemp));
                                zoologo.setRama(rama);
                                zoologo.setZoologo();
                                JOptionPane.showMessageDialog(vista, "Zoologo agregado/a correctamente");
                                break;
                            case 4:
                                String tipoSangre = vista.getCombosangre().getSelectedItem().toString();
                                modelCuidador cuidador = new modelCuidador();
                                cuidador.setIdEmpleado(empleado.obtenerCodigo(cedulaemp));
                                cuidador.setTipoSangre(tipoSangre);
                                cuidador.seCuidador();
                                JOptionPane.showMessageDialog(vista, "Cuidador agregado/a correctamente");
                                break;
                        }
                        limpiarCampos();
                        vista.dispose();
                    } else {
                        JOptionPane.showMessageDialog(vista, "No se pudo agregar a la persona");
                    }
                }
            }
        } else {
            //UPDATE
//            limpiarCampos();
//            vista.dispose();
        }
    }

    public void eliminarEmpleado() {
        modelEmpleado empleado = new modelEmpleado();
        int fila = vistaE.getjTblEmpleado().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el empleado a eliminar");
        } else {
            int response = JOptionPane.showConfirmDialog(vista, "¿Esta seguro de eliminar al empleado?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                String cedula = vistaE.getjTblEmpleado().getValueAt(fila, 1).toString();
                int codigo = Integer.parseInt(vistaE.getjTblEmpleado().getValueAt(fila, 0).toString());
                String opc = vistaE.getjTblEmpleado().getValueAt(fila, 7).toString();
                switch (opc) {
                    case "Gerente":
                        //Gerente
                        if (empleado.deleteGerente(codigo, cedula)) {//Grabamos
                            JOptionPane.showMessageDialog(vista, "Empleado eliminado correctamente");
                            cargarDatos(1);
                        } else {
                            JOptionPane.showMessageDialog(vista, "No se pudo eliminar al empleado");
                        }
                        break;
                    case "Secretaria":
                        //Secretaria
                        if (empleado.deletesecretaria(codigo, cedula)) {//Grabamos
                            JOptionPane.showMessageDialog(vista, "Empleado eliminado correctamente");
                            cargarDatos(1);
                        } else {
                            JOptionPane.showMessageDialog(vista, "No se pudo eliminar al empleado");
                        }
                        break;
                    case "Zoologo":
                        //Zoologo
                        if (empleado.deleteZoologo(codigo, cedula)) {//Grabamos
                            JOptionPane.showMessageDialog(vista, "Empleado eliminado correctamente");
                            cargarDatos(1);
                        } else {
                            JOptionPane.showMessageDialog(vista, "No se pudo eliminar al empleado");
                        }
                        break;
                    case "Cuidador":
                        //Cuidador
                        if (empleado.deletecuidador(codigo, cedula)) {//Grabamos
                            JOptionPane.showMessageDialog(vista, "Empleado eliminado correctamente");
                            cargarDatos(1);
                        } else {
                            JOptionPane.showMessageDialog(vista, "No se pudo eliminar al empleado");
                        }
                        break;
                }
            }
        }
    }

    public boolean llenarDatos() {
        int fila = vistaE.getjTblEmpleado().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione la persona a modificar");
            return false;
        } else {

            int id = Integer.parseInt(vistaE.getjTblEmpleado().getValueAt(fila, 0).toString());
            List<Empleado> listap = modeloE.getempleado();
            listap.stream().forEach(emp -> {
                if (id == emp.getIdEmp()) {
                    vista.getTxtcedula().setText(emp.getCedula());
                    vista.getTxtnombre().setText(emp.getNombre());
                    vista.getTxtapellido().setText(emp.getApellido());
                    vista.getTxttelefono().setText(emp.getTelefono());
                    vista.getTxtcorreo().setText(emp.getCorreo());
                    if (emp.getGenero().equalsIgnoreCase("Masculino")) {
                        vista.getBtmasculino().setSelected(true);
                    }
                    if (emp.getGenero().equalsIgnoreCase("Femenino")) {
                        vista.getBtfemenino().setSelected(true);
                    }
                    vista.getCalendarFechanacimiento().setDate(emp.getFechanacimiento());
                    vista.getTxtusuario().setText(emp.getUsuario());
                    vista.getTxtcontra().setText(emp.getContraseña());
                    vista.getTxtconfirmacontra().setText(emp.getContraseña());
                    Image foto = emp.getFoto();
                    if (foto != null) {
                        foto = foto.getScaledInstance(94, 101, Image.SCALE_SMOOTH);
                        ImageIcon icono = new ImageIcon(foto);
                        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
                        dtcr.setIcon(icono);
                        vista.getLblfoto().setIcon(icono);
                    } else {
                        vista.getLblfoto().setIcon(null);
                    }

                    String opc = vistaE.getjTblEmpleado().getValueAt(fila, 8).toString();
//                    System.out.println(opc + "lllllll");
                    switch (opc) {
                        case "Gerente":
                            //Gerente
                            modelGerente me = new modelGerente();
                            vista.getComborol().setSelectedIndex(1);
                            vista.getTxtTitulo().setText(me.obtenerDatosRol(id));
                            break;
                        case "Secretaria":
                            //Secretaria
                            vista.getComborol().setSelectedIndex(2);
                            modelSecretaria ms = new modelSecretaria();
                            vista.getjSexperiencia().setValue(ms.obtenerDatosRol(id));
                            break;
                        case "Zoologo":
                            //Zoologo
                            System.out.println("soy zoologo");
                            vista.getComborol().setSelectedIndex(3);
                            
                            System.out.println("q="+vista.getComborol().getItemAt(3));
                            modelZoologo mz = new modelZoologo();
                            for (int j = 0; j < vista.getComborama().getItemCount(); j++) {
                                if (vista.getComborama().getItemAt(j).equalsIgnoreCase(mz.obtenerDatosRol(id))) {
                                    vista.getComborama().setSelectedIndex(j);
                                }
                            }
                            break;
                        case "Cuidador":
                            //Cuidador
                            vista.getComborol().setSelectedIndex(4);
                            modelCuidador mc = new modelCuidador();
                            for (int j = 0; j < vista.getCombosangre().getItemCount(); j++) {
                                if (vista.getCombosangre().getItemAt(j).equalsIgnoreCase(mc.obtenerDatosRol(id))) {
                                    vista.getCombosangre().setSelectedIndex(j);
//                                    vista.getCombosangre().setSelectedItem(mc.obtenerDatosRol(id));
                                }
                            }
                            break;
                    }
                }

            });
            return true;
        }
        
    }

    public void desactivarDatosRol() {
        vista.getjPcuidador().setVisible(false);
        vista.getjPgerente().setVisible(false);
        vista.getjPzoologo().setVisible(false);
        vista.getjPzsecretaria().setVisible(false);
    }

    public void activarDatosRol() {
        desactivarDatosRol();
        int opc = vista.getComborol().getSelectedIndex();
        switch (opc) {
            case 1 ->
                vista.getjPgerente().setVisible(true);
            case 2 ->
                vista.getjPzsecretaria().setVisible(true);
            case 3 ->
                vista.getjPzoologo().setVisible(true);
            case 4 ->
                vista.getjPcuidador().setVisible(true);
        }
    }

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();
        //DNI
        if (!vista.getTxtcedula().getText().isEmpty()) {
            if (!mivalidacion.validarCedula(vista.getTxtcedula().getText())) {
                JOptionPane.showMessageDialog(vista, "Cedula invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese la cedula");
            ban = false;
        }
        //NOMBRE
        if (!vista.getTxtnombre().getText().isEmpty()) {
            if (!mivalidacion.validarNombApeEspacios(vista.getTxtnombre().getText())) {
                JOptionPane.showMessageDialog(vista, "Nombre invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese el nombre");
            ban = false;
        }
        //APELLIDO
        if (!vista.getTxtapellido().getText().isEmpty()) {
            if (!mivalidacion.validarNombApeEspacios(vista.getTxtapellido().getText())) {
                JOptionPane.showMessageDialog(vista, "Apellido invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese el Apellido");
            ban = false;
        }
        //TELEFONO
        if (!vista.getTxttelefono().getText().isEmpty()) {
            if (!mivalidacion.validarTelefono(vista.getTxttelefono().getText())) {
                JOptionPane.showMessageDialog(vista, "Telefono invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese el numero de telefono");
            ban = false;
        }
        //CORREO
        if (!vista.getTxtcorreo().getText().isEmpty()) {
            if (!mivalidacion.validarCorreo(vista.getTxtcorreo().getText())) {
                JOptionPane.showMessageDialog(vista, "Correo invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese un correo electronico");
            ban = false;
        }
        //GENERO
        if (!vista.getBtmasculino().isSelected() && !vista.getBtfemenino().isSelected()) {
            ban = false;
            JOptionPane.showMessageDialog(vista, "Seleccione un genero");
        }
        //FECHANACIMIENTO
        if (vista.getCalendarFechanacimiento().getDate() == null) {
            ban = false;
            JOptionPane.showMessageDialog(vista, "Ingrese la fecha de nacimiento");
        }
        //ROL
        if (vista.getComborol().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(vista, "Seleccione el rol");
            ban = false;
        }
        //USUARIO
        if (!vista.getTxtusuario().getText().isEmpty()) {
            if (!mivalidacion.validarUsuario(vista.getTxtusuario().getText())) {
                JOptionPane.showMessageDialog(vista, "Usuario invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese un usuario");
            ban = false;
        }
        //CONTRASEÑA
        if (!vista.getTxtcontra().getText().isEmpty()) {
            if (mivalidacion.validarContrasena(vista.getTxtcontra().getText())) {
                if (!vista.getTxtconfirmacontra().getText().isEmpty()) {
                    if (!vista.getTxtcontra().getText().equals(vista.getTxtconfirmacontra().getText())) {
                        JOptionPane.showMessageDialog(vista, "La contraseña de confirmacion no coincide");
                        ban = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Confirmar contraseña");
                    ban = false;
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Contraseñá invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese su contraseña");
            ban = false;
        }
        //DATOS ROL
        int opc = vista.getComborol().getSelectedIndex();
        switch (opc) {
            case 1:
                //TITULO
                if (!vista.getTxtTitulo().getText().isEmpty()) {
                    if (!mivalidacion.validarNombApeEspacios(vista.getTxtTitulo().getText())) {
                        JOptionPane.showMessageDialog(vista, "titulo invalida");
                        ban = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Ingrese el titulo");
                    ban = false;
                }
                break;
            case 2:
                //EXPERIENCIA
                if ((Integer) vista.getjSexperiencia().getValue() == 0) {
                    JOptionPane.showMessageDialog(vista, "Ingrese los años de experiencia");
                    ban = false;
                }
                break;
            case 3:
                //RAMA
                if (vista.getComborama().getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(vista, "Seleccione la rama");
                    ban = false;
                }
                break;
            case 4:
                //TIPOSANGRE
                if (vista.getCombosangre().getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(vista, "Seleccione la rama");
                    ban = false;
                }
                break;
        }
        return ban;
    }

    public void limpiarCampos() {
        vista.getTxtcedula().setText("");
        vista.getTxtnombre().setText("");
        vista.getTxtapellido().setText("");
        vista.getTxttelefono().setText("");
        vista.getTxtcorreo().setText("");
        vista.getBtmasculino().setSelected(false);
        vista.getBtfemenino().setSelected(false);
        vista.getCalendarFechanacimiento().setDate(null);

        vista.getTxtusuario().setText("");
        vista.getTxtcontra().setText("");
        vista.getTxtconfirmacontra().setText("");
        vista.getTxtTitulo().setText("");

        vista.getLblfoto().setIcon(null);
        vista.getComborol().setSelectedIndex(0);
        vista.getComborama().setSelectedIndex(0);
        vista.getCombosangre().setSelectedIndex(0);
        vista.getjSexperiencia().setValue(0);

    }

}
