/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ALEJO
 */
public class viewRegistroAlimento extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroAlimento
     */
    public viewRegistroAlimento() {
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

        jDlgProveedor = new javax.swing.JDialog();
        lbltitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladlg = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLabel8 = new javax.swing.JLabel();
        txtbuscardlg = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnseleccionardlg = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        txtidAli = new javax.swing.JTextField();
        txtidPorv = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnSeleccionarProv = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtnombreProv = new javax.swing.JTextField();
        txtciudadProv = new javax.swing.JTextField();
        txttelefonoProv = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombrealimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdescripcion = new javax.swing.JTextArea();
        jbtnAgregar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        txtPrecio1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jDlgProveedor.setResizable(false);
        jDlgProveedor.setSize(new java.awt.Dimension(545, 310));

        lbltitulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltitulo.setText("SELECCIÓN DE PROVEEDOR");

        tabladlg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Ciudad", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabladlg);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.add(jSeparator1);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("BUSCAR:  ");
        jToolBar1.add(jLabel8);
        jToolBar1.add(txtbuscardlg);
        jToolBar1.add(jSeparator2);

        btnseleccionardlg.setText("SELECCIONAR");
        jToolBar1.add(btnseleccionardlg);
        jToolBar1.add(jSeparator3);

        javax.swing.GroupLayout jDlgProveedorLayout = new javax.swing.GroupLayout(jDlgProveedor.getContentPane());
        jDlgProveedor.getContentPane().setLayout(jDlgProveedorLayout);
        jDlgProveedorLayout.setHorizontalGroup(
            jDlgProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jDlgProveedorLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lbltitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgProveedorLayout.setVerticalGroup(
            jDlgProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(970, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtidAli, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 167, 0, 0));
        getContentPane().add(txtidPorv, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 167, 0, 0));

        jPanel2.setBackground(new java.awt.Color(210, 215, 159));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(210, 215, 159));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel16.setText("PROVEEDOR");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnSeleccionarProv.setBackground(new java.awt.Color(255, 253, 227));
        btnSeleccionarProv.setText("SELECCIONAR");
        jPanel1.add(btnSeleccionarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 120, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel17.setText("NOMBRE:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        jLabel18.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel18.setText("CIUDAD:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 40));

        jLabel19.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel19.setText("TELÉFONO:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, 30));

        txtnombreProv.setBackground(new java.awt.Color(255, 253, 227));
        jPanel1.add(txtnombreProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 270, 30));

        txtciudadProv.setBackground(new java.awt.Color(255, 253, 227));
        jPanel1.add(txtciudadProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 270, 30));

        txttelefonoProv.setBackground(new java.awt.Color(255, 253, 227));
        jPanel1.add(txttelefonoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 270, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 520, 200));

        txtPrecio.setBackground(new java.awt.Color(255, 253, 227));
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 278, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel7.setText("PRECIO:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel5.setText("NOMBRE: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        txtnombrealimento.setBackground(new java.awt.Color(255, 253, 227));
        jPanel2.add(txtnombrealimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 278, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel9.setText("DESCRIPCIÓN:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, -1));

        txtAdescripcion.setBackground(new java.awt.Color(255, 253, 227));
        txtAdescripcion.setColumns(20);
        txtAdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAdescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 270, 70));

        jbtnAgregar.setBackground(new java.awt.Color(210, 215, 159));
        jbtnAgregar.setFont(new java.awt.Font("MS Gothic", 1, 28)); // NOI18N
        jbtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprobado (1).png"))); // NOI18N
        jbtnAgregar.setText("AGREGAR");
        jbtnAgregar.setBorder(null);
        jPanel2.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 166, -1));

        jbtnCancelar.setBackground(new java.awt.Color(210, 215, 159));
        jbtnCancelar.setFont(new java.awt.Font("MS Gothic", 1, 28)); // NOI18N
        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        jbtnCancelar.setText("CANCELAR");
        jbtnCancelar.setBorder(null);
        jPanel2.add(jbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        txtPrecio1.setEditable(false);
        txtPrecio1.setBackground(new java.awt.Color(255, 253, 227));
        txtPrecio1.setText("$");
        jPanel2.add(txtPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 20, 30));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 40)); // NOI18N
        jLabel3.setText("Datos del Proveedor");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 191, 410, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 530, 540));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 1, 44)); // NOI18N
        jLabel4.setText("ALIMENTO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 480, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos-para-mascotas (2).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 330, 300));

        jLabel6.setFont(new java.awt.Font("MS Gothic", 1, 44)); // NOI18N
        jLabel6.setText("REGISTRO DE ALIMENTO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, -1));

        jLabel1.setBackground(new java.awt.Color(210, 215, 159));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarProv;
    private javax.swing.JButton btnseleccionardlg;
    private javax.swing.JDialog jDlgProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTable tabladlg;
    private javax.swing.JTextArea txtAdescripcion;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio1;
    private javax.swing.JTextField txtbuscardlg;
    private javax.swing.JTextField txtciudadProv;
    private javax.swing.JTextField txtidAli;
    private javax.swing.JTextField txtidPorv;
    private javax.swing.JTextField txtnombreProv;
    private javax.swing.JTextField txtnombrealimento;
    private javax.swing.JTextField txttelefonoProv;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnseleccionardlg() {
        return btnseleccionardlg;
    }

    public void setBtnseleccionardlg(JButton btnseleccionardlg) {
        this.btnseleccionardlg = btnseleccionardlg;
    }

    public JButton getjButton15() {
        return btnSeleccionarProv;
    }

    public void setjButton15(JButton jButton15) {
        this.btnSeleccionarProv = jButton15;
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

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JButton getJbtnAgregar() {
        return jbtnAgregar;
    }

    public void setJbtnAgregar(JButton jbtnAgregar) {
        this.jbtnAgregar = jbtnAgregar;
    }

    public JButton getJbtnCancelar() {
        return jbtnCancelar;
    }

    public void setJbtnCancelar(JButton jbtnCancelar) {
        this.jbtnCancelar = jbtnCancelar;
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

    public JTextArea getTxtAdescripcion() {
        return txtAdescripcion;
    }

    public void setTxtAdescripcion(JTextArea txtAdescripcion) {
        this.txtAdescripcion = txtAdescripcion;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JTextField getTxtbuscardlg() {
        return txtbuscardlg;
    }

    public void setTxtbuscardlg(JTextField txtbuscardlg) {
        this.txtbuscardlg = txtbuscardlg;
    }

    public JTextField getTxtciudadProv() {
        return txtciudadProv;
    }

    public void setTxtciudadProv(JTextField txtciudadProv) {
        this.txtciudadProv = txtciudadProv;
    }

    public JTextField getTxtnombreProv() {
        return txtnombreProv;
    }

    public void setTxtnombreProv(JTextField txtnombreProv) {
        this.txtnombreProv = txtnombreProv;
    }

    public JTextField getTxtnombrealimento() {
        return txtnombrealimento;
    }

    public void setTxtnombrealimento(JTextField txtnombrealimento) {
        this.txtnombrealimento = txtnombrealimento;
    }

    public JTextField getTxttelefonoProv() {
        return txttelefonoProv;
    }

    public void setTxttelefonoProv(JTextField txttelefonoProv) {
        this.txttelefonoProv = txttelefonoProv;
    }

    public JButton getBtnSeleccionarProv() {
        return btnSeleccionarProv;
    }

    public void setBtnSeleccionarProv(JButton btnSeleccionarProv) {
        this.btnSeleccionarProv = btnSeleccionarProv;
    }

    public JDialog getjDlgProveedor() {
        return jDlgProveedor;
    }

    public void setjDlgProveedor(JDialog jDlgProveedor) {
        this.jDlgProveedor = jDlgProveedor;
    }

    public JTextField getTxtPrecio1() {
        return txtPrecio1;
    }

    public void setTxtPrecio1(JTextField txtPrecio1) {
        this.txtPrecio1 = txtPrecio1;
    }

    public JTextField getTxtidAli() {
        return txtidAli;
    }

    public void setTxtidAli(JTextField txtidAli) {
        this.txtidAli = txtidAli;
    }

    public JTextField getTxtidPorv() {
        return txtidPorv;
    }

    public void setTxtidPorv(JTextField txtidPorv) {
        this.txtidPorv = txtidPorv;
    }

}
