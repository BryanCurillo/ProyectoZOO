/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ALEJO
 */
public class viewRegistroDieta extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewRegistroDieta
     */
    public viewRegistroDieta() {
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

        DlgAlimento = new javax.swing.JDialog();
        lbltitulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtbuscardlg = new javax.swing.JTextField();
        btnbuscardlg = new javax.swing.JButton();
        btnseleccionardlg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladlg = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtporcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtnombrealiemento = new javax.swing.JTextField();
        txtprecioalimento = new javax.swing.JTextField();
        txtdescripalimento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnagregardieta = new javax.swing.JButton();
        btncancelardieta = new javax.swing.JButton();
        combohoradieta = new javax.swing.JComboBox<>();

        DlgAlimento.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbltitulo.setText("SELECCIÓN DE ALIMENTO");
        DlgAlimento.getContentPane().add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("BUSCAR");
        DlgAlimento.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        DlgAlimento.getContentPane().add(txtbuscardlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 49, 293, -1));

        btnbuscardlg.setText("BUSCAR");
        DlgAlimento.getContentPane().add(btnbuscardlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 49, -1, -1));

        btnseleccionardlg.setText("SELECCIONAR");
        DlgAlimento.getContentPane().add(btnseleccionardlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 49, -1, -1));

        tabladlg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tabladlg);

        DlgAlimento.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, 586, 162));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("HORARIO");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("PORCIÓN");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("ALIMENTO");

        jButton15.setText("SELECCIONAR");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("NOMBRE");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("PRECIO");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("DESCRIPCION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdescripalimento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtprecioalimento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombrealiemento, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtnombrealiemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtprecioalimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtdescripalimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("REGISTRO DE DIETA");

        btnagregardieta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnagregardieta.setText("AGREGAR");

        btncancelardieta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncancelardieta.setText("CANCELAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(combohoradieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtporcion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(50, 50, 50)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnagregardieta)
                            .addGap(18, 18, 18)
                            .addComponent(btncancelardieta))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(combohoradieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtporcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregardieta)
                    .addComponent(btncancelardieta))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JDialog getDlgAlimento() {
        return DlgAlimento;
    }

    public void setDlgAlimento(JDialog DlgAlimento) {
        this.DlgAlimento = DlgAlimento;
    }

    public JButton getBtnagregardieta() {
        return btnagregardieta;
    }

    public void setBtnagregardieta(JButton btnagregardieta) {
        this.btnagregardieta = btnagregardieta;
    }

    public JButton getBtnbuscardlg() {
        return btnbuscardlg;
    }

    public void setBtnbuscardlg(JButton btnbuscardlg) {
        this.btnbuscardlg = btnbuscardlg;
    }

    public JButton getBtncancelardieta() {
        return btncancelardieta;
    }

    public void setBtncancelardieta(JButton btncancelardieta) {
        this.btncancelardieta = btncancelardieta;
    }

    public JButton getBtnseleccionardlg() {
        return btnseleccionardlg;
    }

    public void setBtnseleccionardlg(JButton btnseleccionardlg) {
        this.btnseleccionardlg = btnseleccionardlg;
    }

    public JComboBox<String> getCombohoradieta() {
        return combohoradieta;
    }

    public void setCombohoradieta(JComboBox<String> combohoradieta) {
        this.combohoradieta = combohoradieta;
    }

    public JButton getjButton15() {
        return jButton15;
    }

    public void setjButton15(JButton jButton15) {
        this.jButton15 = jButton15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JLabel getLbltitulo() {
        return lbltitulo;
    }

    public void setLbltitulo(JLabel lbltitulo) {
        this.lbltitulo = lbltitulo;
    }

    public JTable getTabladlg() {
        return tabladlg;
    }

    public void setTabladlg(JTable tabladlg) {
        this.tabladlg = tabladlg;
    }

    public JTextField getTxtbuscardlg() {
        return txtbuscardlg;
    }

    public void setTxtbuscardlg(JTextField txtbuscardlg) {
        this.txtbuscardlg = txtbuscardlg;
    }

    public JTextField getTxtdescripalimento() {
        return txtdescripalimento;
    }

    public void setTxtdescripalimento(JTextField txtdescripalimento) {
        this.txtdescripalimento = txtdescripalimento;
    }

    public JTextField getTxtnombrealiemento() {
        return txtnombrealiemento;
    }

    public void setTxtnombrealiemento(JTextField txtnombrealiemento) {
        this.txtnombrealiemento = txtnombrealiemento;
    }

    public JTextField getTxtporcion() {
        return txtporcion;
    }

    public void setTxtporcion(JTextField txtporcion) {
        this.txtporcion = txtporcion;
    }

    public JTextField getTxtprecioalimento() {
        return txtprecioalimento;
    }

    public void setTxtprecioalimento(JTextField txtprecioalimento) {
        this.txtprecioalimento = txtprecioalimento;
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DlgAlimento;
    private javax.swing.JButton btnagregardieta;
    private javax.swing.JButton btnbuscardlg;
    private javax.swing.JButton btncancelardieta;
    private javax.swing.JButton btnseleccionardlg;
    private javax.swing.JComboBox<String> combohoradieta;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTable tabladlg;
    private javax.swing.JTextField txtbuscardlg;
    private javax.swing.JTextField txtdescripalimento;
    private javax.swing.JTextField txtnombrealiemento;
    private javax.swing.JTextField txtporcion;
    private javax.swing.JTextField txtprecioalimento;
    // End of variables declaration//GEN-END:variables
}
