/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
        jPanel1 = new javax.swing.JPanel();
        btnLimpiarDSK = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        barramenus = new javax.swing.JMenuBar();
        agregarpersona = new javax.swing.JMenu();
        jMIagregarPersona = new javax.swing.JMenuItem();
        jMIvistaEmpleado = new javax.swing.JMenuItem();
        menualimento = new javax.swing.JMenu();
        jMIagregarAlimento = new javax.swing.JMenuItem();
        jMIcrudAlimento = new javax.swing.JMenuItem();
        menuanimales = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MIActualizarPrecio = new javax.swing.JMenuItem();
        jMProveedor = new javax.swing.JMenu();
        jMIagregarProveedor = new javax.swing.JMenuItem();
        JMIvistaProveedor = new javax.swing.JMenuItem();
        jMProveedor1 = new javax.swing.JMenu();
        jMIagregarCliente = new javax.swing.JMenuItem();
        JMIvistaCliente = new javax.swing.JMenuItem();

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

        jPanel3.add(jDPprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 970, 630));

        jPanel1.setBackground(new java.awt.Color(144, 183, 125));

        btnLimpiarDSK.setBackground(new java.awt.Color(66, 133, 91));
        btnLimpiarDSK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpieza-de-datos.png"))); // NOI18N
        btnLimpiarDSK.setToolTipText("Vaciar pantalla");

        jPanel2.setBackground(new java.awt.Color(72, 56, 56));
        jPanel2.setForeground(new java.awt.Color(210, 215, 159));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(210, 215, 159));
        jLabel3.setText("¡BIENVENIDO!");

        jLabel4.setFont(new java.awt.Font("MS Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(210, 215, 159));
        jLabel4.setText("Secretaria");

        jLabel6.setFont(new java.awt.Font("MS Gothic", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(210, 215, 159));
        jLabel6.setText("Nombre usuario");

        jLabel7.setFont(new java.awt.Font("MS Gothic", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(210, 215, 159));
        jLabel7.setText("Cedula");

        jLabel1.setBackground(new java.awt.Color(72, 56, 56));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnLimpiarDSK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                .addComponent(btnLimpiarDSK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 630));

        agregarpersona.setText("PERSONAL");

        jMIagregarPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIagregarPersona.setText("AGREGAR PERSONAL");
        agregarpersona.add(jMIagregarPersona);

        jMIvistaEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIvistaEmpleado.setText("VISUALIZAR REGISTRO DEL PERSONAL");
        agregarpersona.add(jMIvistaEmpleado);

        barramenus.add(agregarpersona);

        menualimento.setText("ALIMENTO");

        jMIagregarAlimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIagregarAlimento.setText("AGREGAR ALIMENTO");
        menualimento.add(jMIagregarAlimento);

        jMIcrudAlimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIcrudAlimento.setText("VISUALIZAR REGISTRO DE ALIMENTOS");
        menualimento.add(jMIcrudAlimento);

        barramenus.add(menualimento);

        menuanimales.setText("ANIMALES");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("AGREGAR ANIMAL");
        menuanimales.add(jMenuItem5);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem9.setText("VISUALIZAR REGISTRO DE ANIMALES");
        menuanimales.add(jMenuItem9);

        barramenus.add(menuanimales);

        jMenu1.setText("TICKETS");

        MIActualizarPrecio.setText("ACTUALIZAR PRECIO");
        jMenu1.add(MIActualizarPrecio);

        barramenus.add(jMenu1);

        jMProveedor.setText("PROVEEDOR");

        jMIagregarProveedor.setText("Agregar Proveedor");
        jMProveedor.add(jMIagregarProveedor);

        JMIvistaProveedor.setText("Visualizar registro de proveedores");
        jMProveedor.add(JMIvistaProveedor);

        barramenus.add(jMProveedor);

        jMProveedor1.setText("CLIENTE");

        jMIagregarCliente.setText("Agregar Cliente");
        jMIagregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIagregarClienteActionPerformed(evt);
            }
        });
        jMProveedor1.add(jMIagregarCliente);

        JMIvistaCliente.setText("Visualizar Clientes");
        jMProveedor1.add(JMIvistaCliente);

        barramenus.add(jMProveedor1);

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

    private void jMIagregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIagregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIagregarClienteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMIvistaCliente;
    private javax.swing.JMenuItem JMIvistaProveedor;
    private javax.swing.JMenuItem MIActualizarPrecio;
    private javax.swing.JMenu agregarpersona;
    private javax.swing.JMenuBar barramenus;
    private javax.swing.JButton btnLimpiarDSK;
    private javax.swing.JDesktopPane jDPprincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMIagregarAlimento;
    private javax.swing.JMenuItem jMIagregarCliente;
    private javax.swing.JMenuItem jMIagregarPersona;
    private javax.swing.JMenuItem jMIagregarProveedor;
    private javax.swing.JMenuItem jMIcrudAlimento;
    private javax.swing.JMenuItem jMIvistaEmpleado;
    private javax.swing.JMenu jMProveedor;
    private javax.swing.JMenu jMProveedor1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu menualimento;
    private javax.swing.JMenu menuanimales;
    // End of variables declaration//GEN-END:variables

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

    public JMenu getAgregarpersona() {
        return agregarpersona;
    }

    public void setAgregarpersona(JMenu agregarpersona) {
        this.agregarpersona = agregarpersona;
    }

    public JMenuBar getBarramenus() {
        return barramenus;
    }

    public void setBarramenus(JMenuBar barramenus) {
        this.barramenus = barramenus;
    }

    public JDesktopPane getjDPprincipal() {
        return jDPprincipal;
    }

    public void setjDPprincipal(JDesktopPane jDPprincipal) {
        this.jDPprincipal = jDPprincipal;
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

    public JMenuItem getjMIvistaEmpleado() {
        return jMIvistaEmpleado;
    }

    public void setjMIvistaEmpleado(JMenuItem jMIvistaEmpleado) {
        this.jMIvistaEmpleado = jMIvistaEmpleado;
    }

    public JMenu getjMProveedor() {
        return jMProveedor;
    }

    public void setjMProveedor(JMenu jMProveedor) {
        this.jMProveedor = jMProveedor;
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

    public JMenuItem getJMIvistaCliente() {
        return JMIvistaCliente;
    }

    public void setJMIvistaCliente(JMenuItem JMIvistaCliente) {
        this.JMIvistaCliente = JMIvistaCliente;
    }

    public JMenuItem getjMIagregarCliente() {
        return jMIagregarCliente;
    }

    public void setjMIagregarCliente(JMenuItem jMIagregarCliente) {
        this.jMIagregarCliente = jMIagregarCliente;
    }

    public JButton getBtnLimpiarDSK() {
        return btnLimpiarDSK;
    }

    public void setBtnLimpiarDSK(JButton btnLimpiarDSK) {
        this.btnLimpiarDSK = btnLimpiarDSK;
    }

    public JMenuItem getjMIagregarAlimento() {
        return jMIagregarAlimento;
    }

    public void setjMIagregarAlimento(JMenuItem jMIagregarAlimento) {
        this.jMIagregarAlimento = jMIagregarAlimento;
    }

    public JMenuItem getjMIcrudAlimento() {
        return jMIcrudAlimento;
    }

    public void setjMIcrudAlimento(JMenuItem jMIcrudAlimento) {
        this.jMIcrudAlimento = jMIcrudAlimento;
    }

}
