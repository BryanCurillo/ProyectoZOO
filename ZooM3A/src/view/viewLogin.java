/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;

/**
 *
 * @author ALEJO
 */
public class viewLogin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public viewLogin() {
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

        jLabel3 = new javax.swing.JLabel();
        txtusuarioingreso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcontraingreso = new javax.swing.JPasswordField();
        btiniciarsesion = new javax.swing.JButton();
        jbtnClose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fonfo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(762, 390, 390, 390));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Impact", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("  iNGRESA CON TU USUARIO ");
        jLabel3.setPreferredSize(new java.awt.Dimension(188, 17));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 140, 210, 30));

        txtusuarioingreso.setBackground(new java.awt.Color(255, 245, 228));
        txtusuarioingreso.setFont(new java.awt.Font("MS Gothic", 1, 20)); // NOI18N
        txtusuarioingreso.setForeground(new java.awt.Color(153, 153, 153));
        txtusuarioingreso.setText("Ingrese su nombre de usuario");
        txtusuarioingreso.setToolTipText("INGRESE LA CONTRASEÑA");
        txtusuarioingreso.setBorder(null);
        txtusuarioingreso.setOpaque(true);
        getContentPane().add(txtusuarioingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 360, 30));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Impact", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("iNGRESA TU CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 230, 180, 30));

        txtcontraingreso.setBackground(new java.awt.Color(255, 245, 228));
        txtcontraingreso.setFont(new java.awt.Font("MS Gothic", 1, 20)); // NOI18N
        txtcontraingreso.setForeground(new java.awt.Color(153, 153, 153));
        txtcontraingreso.setText("***************");
        txtcontraingreso.setToolTipText("INGRESA TU CONTRASEÑA");
        txtcontraingreso.setBorder(null);
        txtcontraingreso.setOpaque(true);
        getContentPane().add(txtcontraingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 360, 30));

        btiniciarsesion.setBackground(new java.awt.Color(255, 245, 228));
        btiniciarsesion.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btiniciarsesion.setText("INICIAR SESION");
        btiniciarsesion.setBorder(null);
        btiniciarsesion.setOpaque(true);
        getContentPane().add(btiniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 240, 40));

        jbtnClose.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jbtnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar (1).png"))); // NOI18N
        getContentPane().add(jbtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 9, 20, 20));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24)); // NOI18N
        jLabel7.setText("Necesitaba una mano, y ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 260, -1));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 2, 22)); // NOI18N
        jLabel8.setText("encontre una pata");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leon (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 310, 310));

        jLabel4.setBackground(new java.awt.Color(144, 183, 125));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 5, 370, 450));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 50)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pata (1).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 70, 80));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 50)); // NOI18N
        jLabel6.setText("Zoomania");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        Fonfo.setBackground(new java.awt.Color(210, 215, 159));
        Fonfo.setOpaque(true);
        getContentPane().add(Fonfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 5, 564, 450));

        jLabel9.setBackground(new java.awt.Color(72, 56, 56));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -7, 943, 467));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    public JButton getBtiniciarsesion() {
        return btiniciarsesion;
    }

    public void setBtiniciarsesion(JButton btiniciarsesion) {
        this.btiniciarsesion = btiniciarsesion;
    }


    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }



    public JButton getJbtnClose() {
        return jbtnClose;
    }

    public void setJbtnClose(JButton jbtnClose) {
        this.jbtnClose = jbtnClose;
    }

    public JPasswordField getTxtcontraingreso() {
        return txtcontraingreso;
    }

    public void setTxtcontraingreso(JPasswordField txtcontraingreso) {
        this.txtcontraingreso = txtcontraingreso;
    }

    public JTextField getTxtusuarioingreso() {
        return txtusuarioingreso;
    }

    /**
     * @param args the command line arguments
     */
    public void setTxtusuarioingreso(JTextField txtusuarioingreso) {
        this.txtusuarioingreso = txtusuarioingreso;
    }



    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fonfo;
    private javax.swing.JButton btiniciarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnClose;
    private javax.swing.JPasswordField txtcontraingreso;
    private javax.swing.JTextField txtusuarioingreso;
    // End of variables declaration//GEN-END:variables
}
