/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;

/**
 *
 * @author ALEJO
 */
public class viewPantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form pantallaprincipal
     */
    public viewPantallaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jDPprincipal = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlblrolPP = new javax.swing.JLabel();
        jlblCedulaPP = new javax.swing.JLabel();
        jlblNombrePP = new javax.swing.JLabel();
        jlblFotoPP = new javax.swing.JLabel();
        jlblCedulaPP1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        barramenus = new javax.swing.JMenuBar();
        MenuPersonal = new javax.swing.JMenu();
        jMIagregarPersona = new javax.swing.JMenuItem();
        jMIvistaEmpleado = new javax.swing.JMenuItem();
        menualimento = new javax.swing.JMenu();
        jMIagregarAlimento = new javax.swing.JMenuItem();
        jMIcrudAlimento = new javax.swing.JMenuItem();
        menuanimales = new javax.swing.JMenu();
        jMIagregarAnimal = new javax.swing.JMenuItem();
        jMIvisualizarAnimal = new javax.swing.JMenuItem();
        MenuTicket = new javax.swing.JMenu();
        MIActualizarPrecio = new javax.swing.JMenuItem();
        jMIvisualizarPrecios = new javax.swing.JMenuItem();
        MenuProveedor = new javax.swing.JMenu();
        jMIagregarProveedor = new javax.swing.JMenuItem();
        JMIvistaProveedor = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        jMIagregarCliente = new javax.swing.JMenuItem();
        JMIvistaCliente = new javax.swing.JMenuItem();
        MenuDieta = new javax.swing.JMenu();
        jMIAgregarDieta = new javax.swing.JMenuItem();
        jMIVisualizarDietas = new javax.swing.JMenuItem();
        MenuHabitad = new javax.swing.JMenu();
        jMIAgregarHabitat = new javax.swing.JMenuItem();
        jMIVisualizarHabitat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1150, 0));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDPprincipal.setBackground(new java.awt.Color(210, 215, 159));
        jDPprincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jDPprincipal.setForeground(new java.awt.Color(210, 215, 159));
        jDPprincipal.setEnabled(false);

        javax.swing.GroupLayout jDPprincipalLayout = new javax.swing.GroupLayout(jDPprincipal);
        jDPprincipal.setLayout(jDPprincipalLayout);
        jDPprincipalLayout.setHorizontalGroup(
            jDPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 966, Short.MAX_VALUE)
        );
        jDPprincipalLayout.setVerticalGroup(
            jDPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        jPanel3.add(jDPprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 970, 630));

        jPanel2.setBackground(new java.awt.Color(72, 56, 56));
        jPanel2.setForeground(new java.awt.Color(210, 215, 159));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(210, 215, 159));
        jLabel3.setText("¡ZOOMANIA!");

        jlblrolPP.setFont(new java.awt.Font("MS Gothic", 1, 21)); // NOI18N
        jlblrolPP.setForeground(new java.awt.Color(210, 215, 159));
        jlblrolPP.setText("SECRETARIA");

        jlblCedulaPP.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        jlblCedulaPP.setForeground(new java.awt.Color(210, 215, 159));
        jlblCedulaPP.setText("Cedula");

        jlblNombrePP.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        jlblNombrePP.setForeground(new java.awt.Color(210, 215, 159));
        jlblNombrePP.setText("Nombre usuario");

        jlblFotoPP.setBackground(new java.awt.Color(72, 56, 56));
        jlblFotoPP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblFotoPP.setOpaque(true);

        jlblCedulaPP1.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        jlblCedulaPP1.setForeground(new java.awt.Color(210, 215, 159));
        jlblCedulaPP1.setText("C.I.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jlblFotoPP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblrolPP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlblNombrePP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jlblCedulaPP1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jlblCedulaPP, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblrolPP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblNombrePP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblCedulaPP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblCedulaPP1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlblFotoPP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 180));

        jPanel1.setBackground(new java.awt.Color(144, 183, 125));

        btnCerrarSesion.setBackground(new java.awt.Color(117, 156, 98));
        btnCerrarSesion.setFont(new java.awt.Font("MS Gothic", 0, 24)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(204, 255, 204));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion (1).png"))); // NOI18N
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.setToolTipText("Vaciar pantalla");
        btnCerrarSesion.setBorder(null);

        jButton2.setBackground(new java.awt.Color(144, 183, 125));
        jButton2.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/datos-del-usuario (1).png"))); // NOI18N
        jButton2.setText("Personal");
        jButton2.setBorder(null);

        jButton3.setBackground(new java.awt.Color(144, 183, 125));
        jButton3.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos-para-mascotas (3).png"))); // NOI18N
        jButton3.setText("Alimento");
        jButton3.setBorder(null);

        jButton4.setBackground(new java.awt.Color(144, 183, 125));
        jButton4.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dieta (1).png"))); // NOI18N
        jButton4.setText("Dieta");
        jButton4.setBorder(null);

        jButton5.setBackground(new java.awt.Color(144, 183, 125));
        jButton5.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repartidor (1).png"))); // NOI18N
        jButton5.setText("Proveedor");
        jButton5.setBorder(null);

        jButton6.setBackground(new java.awt.Color(144, 183, 125));
        jButton6.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ticket (3).png"))); // NOI18N
        jButton6.setText("Tickets");
        jButton6.setBorder(null);

        jButton7.setBackground(new java.awt.Color(144, 183, 125));
        jButton7.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente (1).png"))); // NOI18N
        jButton7.setText("Clientes");
        jButton7.setBorder(null);

        jButton1.setBackground(new java.awt.Color(144, 183, 125));
        jButton1.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leon (3).png"))); // NOI18N
        jButton1.setText("Animales");
        jButton1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 460));

        MenuPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/datos-del-usuario.png"))); // NOI18N
        MenuPersonal.setText("Personal");

        jMIagregarPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIagregarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario (2).png"))); // NOI18N
        jMIagregarPersona.setText("Agregar personal");
        MenuPersonal.add(jMIagregarPersona);

        jMIvistaEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIvistaEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        jMIvistaEmpleado.setText("Visualizar registro");
        MenuPersonal.add(jMIvistaEmpleado);

        barramenus.add(MenuPersonal);

        menualimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plato.png"))); // NOI18N
        menualimento.setText("Alimento");

        jMIagregarAlimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIagregarAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadiendo.png"))); // NOI18N
        jMIagregarAlimento.setText("Agregar alimento");
        menualimento.add(jMIagregarAlimento);

        jMIcrudAlimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIcrudAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        jMIcrudAlimento.setText("Visualizar registro");
        menualimento.add(jMIcrudAlimento);

        barramenus.add(menualimento);

        menuanimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leon (2).png"))); // NOI18N
        menuanimales.setText("Animales");

        jMIagregarAnimal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIagregarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuidado-de-mascotas.png"))); // NOI18N
        jMIagregarAnimal.setText("Agregar animal");
        menuanimales.add(jMIagregarAnimal);

        jMIvisualizarAnimal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIvisualizarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        jMIvisualizarAnimal.setText("Visualizar registro");
        menuanimales.add(jMIvisualizarAnimal);

        barramenus.add(menuanimales);

        MenuTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ticket (2).png"))); // NOI18N
        MenuTicket.setText("Tickets");

        MIActualizarPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ticket.png"))); // NOI18N
        MIActualizarPrecio.setText("Actualizar Precio");
        MenuTicket.add(MIActualizarPrecio);

        jMIvisualizarPrecios.setText("Visualizar Precios");
        MenuTicket.add(jMIvisualizarPrecios);

        barramenus.add(MenuTicket);

        MenuProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repartidor.png"))); // NOI18N
        MenuProveedor.setText("Proveedor");

        jMIagregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario (2).png"))); // NOI18N
        jMIagregarProveedor.setText("Agregar proveedor");
        MenuProveedor.add(jMIagregarProveedor);

        JMIvistaProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        JMIvistaProveedor.setText("´Visualizar registro");
        MenuProveedor.add(JMIvistaProveedor);

        barramenus.add(MenuProveedor);

        MenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        MenuClientes.setText("Cliente");

        jMIagregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario (2).png"))); // NOI18N
        jMIagregarCliente.setText("Agregar cliente");
        MenuClientes.add(jMIagregarCliente);

        JMIvistaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        JMIvistaCliente.setText("Visualizar registro");
        MenuClientes.add(JMIvistaCliente);

        barramenus.add(MenuClientes);

        MenuDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dieta.png"))); // NOI18N
        MenuDieta.setText("Dieta");

        jMIAgregarDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dieta.png"))); // NOI18N
        jMIAgregarDieta.setText("Agregar dieta");
        MenuDieta.add(jMIAgregarDieta);

        jMIVisualizarDietas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        jMIVisualizarDietas.setText("Visualizar registro");
        MenuDieta.add(jMIVisualizarDietas);

        barramenus.add(MenuDieta);

        MenuHabitad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dieta.png"))); // NOI18N
        MenuHabitad.setText("Habitat");

        jMIAgregarHabitat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dieta.png"))); // NOI18N
        jMIAgregarHabitat.setText("Agregar habitat");
        MenuHabitad.add(jMIAgregarHabitat);

        jMIVisualizarHabitat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        jMIVisualizarHabitat.setText("Visualizar registro");
        MenuHabitad.add(jMIVisualizarHabitat);

        barramenus.add(MenuHabitad);

        setJMenuBar(barramenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMIvistaCliente;
    private javax.swing.JMenuItem JMIvistaProveedor;
    private javax.swing.JMenuItem MIActualizarPrecio;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuDieta;
    private javax.swing.JMenu MenuHabitad;
    private javax.swing.JMenu MenuPersonal;
    private javax.swing.JMenu MenuProveedor;
    private javax.swing.JMenu MenuTicket;
    private javax.swing.JMenuBar barramenus;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDPprincipal;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMIAgregarDieta;
    private javax.swing.JMenuItem jMIAgregarHabitat;
    private javax.swing.JMenuItem jMIVisualizarDietas;
    private javax.swing.JMenuItem jMIVisualizarHabitat;
    private javax.swing.JMenuItem jMIagregarAlimento;
    private javax.swing.JMenuItem jMIagregarAnimal;
    private javax.swing.JMenuItem jMIagregarCliente;
    private javax.swing.JMenuItem jMIagregarPersona;
    private javax.swing.JMenuItem jMIagregarProveedor;
    private javax.swing.JMenuItem jMIcrudAlimento;
    private javax.swing.JMenuItem jMIvistaEmpleado;
    private javax.swing.JMenuItem jMIvisualizarAnimal;
    private javax.swing.JMenuItem jMIvisualizarPrecios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlblCedulaPP;
    private javax.swing.JLabel jlblCedulaPP1;
    private javax.swing.JLabel jlblFotoPP;
    private javax.swing.JLabel jlblNombrePP;
    private javax.swing.JLabel jlblrolPP;
    private javax.swing.JMenu menualimento;
    private javax.swing.JMenu menuanimales;
    // End of variables declaration//GEN-END:variables

    public JMenuItem getJMIvistaCliente() {
        return JMIvistaCliente;
    }

    public void setJMIvistaCliente(JMenuItem JMIvistaCliente) {
        this.JMIvistaCliente = JMIvistaCliente;
    }

    public JMenuItem getJMIvistaProveedor() {
        return JMIvistaProveedor;
    }

    public void setJMIvistaProveedor(JMenuItem JMIvistaProveedor) {
        this.JMIvistaProveedor = JMIvistaProveedor;
    }

    public JMenuItem getMIActualizarPrecio() {
        return MIActualizarPrecio;
    }

    public void setMIActualizarPrecio(JMenuItem MIActualizarPrecio) {
        this.MIActualizarPrecio = MIActualizarPrecio;
    }

    public JMenu getMenuClientes() {
        return MenuClientes;
    }

    public void setMenuClientes(JMenu MenuClientes) {
        this.MenuClientes = MenuClientes;
    }

    public JMenu getMenuDieta() {
        return MenuDieta;
    }

    public void setMenuDieta(JMenu MenuDieta) {
        this.MenuDieta = MenuDieta;
    }

    public JMenu getMenuHabitad() {
        return MenuHabitad;
    }

    public void setMenuHabitad(JMenu MenuHabitad) {
        this.MenuHabitad = MenuHabitad;
    }

    public JMenu getMenuPersonal() {
        return MenuPersonal;
    }

    public void setMenuPersonal(JMenu MenuPersonal) {
        this.MenuPersonal = MenuPersonal;
    }

    public JMenu getMenuProveedor() {
        return MenuProveedor;
    }

    public void setMenuProveedor(JMenu MenuProveedor) {
        this.MenuProveedor = MenuProveedor;
    }

    public JMenu getMenuTicket() {
        return MenuTicket;
    }

    public void setMenuTicket(JMenu MenuTicket) {
        this.MenuTicket = MenuTicket;
    }

    public JMenuBar getBarramenus() {
        return barramenus;
    }

    public void setBarramenus(JMenuBar barramenus) {
        this.barramenus = barramenus;
    }

    public JButton getBtnCerrarSesion() {
        return btnCerrarSesion;
    }

    public void setBtnCerrarSesion(JButton btnCerrarSesion) {
        this.btnCerrarSesion = btnCerrarSesion;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    public JDesktopPane getjDPprincipal() {
        return jDPprincipal;
    }

    public void setjDPprincipal(JDesktopPane jDPprincipal) {
        this.jDPprincipal = jDPprincipal;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JMenuItem getjMIAgregarDieta() {
        return jMIAgregarDieta;
    }

    public void setjMIAgregarDieta(JMenuItem jMIAgregarDieta) {
        this.jMIAgregarDieta = jMIAgregarDieta;
    }

    public JMenuItem getjMIAgregarHabitat() {
        return jMIAgregarHabitat;
    }

    public void setjMIAgregarHabitat(JMenuItem jMIAgregarHabitat) {
        this.jMIAgregarHabitat = jMIAgregarHabitat;
    }

    public JMenuItem getjMIVisualizarDietas() {
        return jMIVisualizarDietas;
    }

    public void setjMIVisualizarDietas(JMenuItem jMIVisualizarDietas) {
        this.jMIVisualizarDietas = jMIVisualizarDietas;
    }

    public JMenuItem getjMIVisualizarHabitat() {
        return jMIVisualizarHabitat;
    }

    public void setjMIVisualizarHabitat(JMenuItem jMIVisualizarHabitat) {
        this.jMIVisualizarHabitat = jMIVisualizarHabitat;
    }

    public JMenuItem getjMIagregarAlimento() {
        return jMIagregarAlimento;
    }

    public void setjMIagregarAlimento(JMenuItem jMIagregarAlimento) {
        this.jMIagregarAlimento = jMIagregarAlimento;
    }

    public JMenuItem getjMIagregarAnimal() {
        return jMIagregarAnimal;
    }

    public void setjMIagregarAnimal(JMenuItem jMIagregarAnimal) {
        this.jMIagregarAnimal = jMIagregarAnimal;
    }

    public JMenuItem getjMIagregarCliente() {
        return jMIagregarCliente;
    }

    public void setjMIagregarCliente(JMenuItem jMIagregarCliente) {
        this.jMIagregarCliente = jMIagregarCliente;
    }

    public JMenuItem getjMIagregarPersona() {
        return jMIagregarPersona;
    }

    public void setjMIagregarPersona(JMenuItem jMIagregarPersona) {
        this.jMIagregarPersona = jMIagregarPersona;
    }

    public JMenuItem getjMIagregarProveedor() {
        return jMIagregarProveedor;
    }

    public void setjMIagregarProveedor(JMenuItem jMIagregarProveedor) {
        this.jMIagregarProveedor = jMIagregarProveedor;
    }

    public JMenuItem getjMIcrudAlimento() {
        return jMIcrudAlimento;
    }

    public void setjMIcrudAlimento(JMenuItem jMIcrudAlimento) {
        this.jMIcrudAlimento = jMIcrudAlimento;
    }

    public JMenuItem getjMIvistaEmpleado() {
        return jMIvistaEmpleado;
    }

    public void setjMIvistaEmpleado(JMenuItem jMIvistaEmpleado) {
        this.jMIvistaEmpleado = jMIvistaEmpleado;
    }

    public JMenuItem getjMIvisualizarAnimal() {
        return jMIvisualizarAnimal;
    }

    public void setjMIvisualizarAnimal(JMenuItem jMIvisualizarAnimal) {
        this.jMIvisualizarAnimal = jMIvisualizarAnimal;
    }

    public JMenuItem getjMIvisualizarPrecios() {
        return jMIvisualizarPrecios;
    }

    public void setjMIvisualizarPrecios(JMenuItem jMIvisualizarPrecios) {
        this.jMIvisualizarPrecios = jMIvisualizarPrecios;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JLabel getJlblCedulaPP() {
        return jlblCedulaPP;
    }

    public void setJlblCedulaPP(JLabel jlblCedulaPP) {
        this.jlblCedulaPP = jlblCedulaPP;
    }

    public JLabel getJlblCedulaPP1() {
        return jlblCedulaPP1;
    }

    public void setJlblCedulaPP1(JLabel jlblCedulaPP1) {
        this.jlblCedulaPP1 = jlblCedulaPP1;
    }

    public JLabel getJlblFotoPP() {
        return jlblFotoPP;
    }

    public void setJlblFotoPP(JLabel jlblFotoPP) {
        this.jlblFotoPP = jlblFotoPP;
    }

    public JLabel getJlblNombrePP() {
        return jlblNombrePP;
    }

    public void setJlblNombrePP(JLabel jlblNombrePP) {
        this.jlblNombrePP = jlblNombrePP;
    }

    public JLabel getJlblrolPP() {
        return jlblrolPP;
    }

    public void setJlblrolPP(JLabel jlblrolPP) {
        this.jlblrolPP = jlblrolPP;
    }

    public JMenu getMenualimento() {
        return menualimento;
    }

    public void setMenualimento(JMenu menualimento) {
        this.menualimento = menualimento;
    }

    public JMenu getMenuanimales() {
        return menuanimales;
    }

    public void setMenuanimales(JMenu menuanimales) {
        this.menuanimales = menuanimales;
    }

}
