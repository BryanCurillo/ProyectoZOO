/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author ASUS ROG
 */
public class viewVistaCliente extends javax.swing.JPanel {

    /**
     * Creates new form viewVistaAnimal
     */
    public viewVistaCliente() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblAnimal = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jbtnAgregarAnimal = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jBtnModificarAnimal = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jBtnEliminarAnimal = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jBtnImprimirAnimal = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jTextField1 = new javax.swing.JTextField();
        jCbFiltro = new javax.swing.JComboBox<>();
        jBtnBuscarAnimal = new javax.swing.JButton();
        jBtnActualizarAnimal = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("VISTA DE CLIENTES");

        jTblAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Genero", "Especie", "Edad", "Id de la dieta", "Id del habitad", "Id del cuidador", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTblAnimal);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnAgregarAnimal.setText("AGREGAR");
        jbtnAgregarAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnAgregarAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbtnAgregarAnimal);
        jToolBar1.add(jSeparator1);

        jBtnModificarAnimal.setText("MODIFICAR");
        jToolBar1.add(jBtnModificarAnimal);
        jToolBar1.add(jSeparator2);

        jBtnEliminarAnimal.setText("ELIMINAR");
        jBtnEliminarAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEliminarAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnEliminarAnimal);
        jToolBar1.add(jSeparator3);

        jBtnImprimirAnimal.setText("IMPRIMIR REPORTE");
        jToolBar1.add(jBtnImprimirAnimal);
        jToolBar1.add(jSeparator4);

        jTextField1.setToolTipText("PUEDE BUSCAR MEDIANTE CEDULA, NOMBRE, APELLIDO O USUARIO");
        jToolBar1.add(jTextField1);

        jCbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jToolBar1.add(jCbFiltro);

        jBtnBuscarAnimal.setText("BUSCAR");
        jToolBar1.add(jBtnBuscarAnimal);

        jBtnActualizarAnimal.setText("ACTUALIZAR");
        jBtnActualizarAnimal.setFocusable(false);
        jBtnActualizarAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnActualizarAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnActualizarAnimal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjBtnActualizarAnimal() {
        return jBtnActualizarAnimal;
    }

    public void setjBtnActualizarAnimal(JButton jBtnActualizarAnimal) {
        this.jBtnActualizarAnimal = jBtnActualizarAnimal;
    }

    public JButton getjBtnBuscarAnimal() {
        return jBtnBuscarAnimal;
    }

    public void setjBtnBuscarAnimal(JButton jBtnBuscarAnimal) {
        this.jBtnBuscarAnimal = jBtnBuscarAnimal;
    }

    public JButton getjBtnEliminarAnimal() {
        return jBtnEliminarAnimal;
    }

    public void setjBtnEliminarAnimal(JButton jBtnEliminarAnimal) {
        this.jBtnEliminarAnimal = jBtnEliminarAnimal;
    }

    public JButton getjBtnImprimirAnimal() {
        return jBtnImprimirAnimal;
    }

    public void setjBtnImprimirAnimal(JButton jBtnImprimirAnimal) {
        this.jBtnImprimirAnimal = jBtnImprimirAnimal;
    }

    public JButton getjBtnModificarAnimal() {
        return jBtnModificarAnimal;
    }

    public void setjBtnModificarAnimal(JButton jBtnModificarAnimal) {
        this.jBtnModificarAnimal = jBtnModificarAnimal;
    }

    public JComboBox<String> getjCbFiltro() {
        return jCbFiltro;
    }

    public void setjCbFiltro(JComboBox<String> jCbFiltro) {
        this.jCbFiltro = jCbFiltro;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JToolBar.Separator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JToolBar.Separator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JToolBar.Separator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JToolBar.Separator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JToolBar.Separator getjSeparator3() {
        return jSeparator3;
    }

    public void setjSeparator3(JToolBar.Separator jSeparator3) {
        this.jSeparator3 = jSeparator3;
    }

    public JToolBar.Separator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JToolBar.Separator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JTable getjTblAnimal() {
        return jTblAnimal;
    }

    public void setjTblAnimal(JTable jTblAnimal) {
        this.jTblAnimal = jTblAnimal;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }

    public JButton getJbtnAgregarAnimal() {
        return jbtnAgregarAnimal;
    }

    public void setJbtnAgregarAnimal(JButton jbtnAgregarAnimal) {
        this.jbtnAgregarAnimal = jbtnAgregarAnimal;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizarAnimal;
    private javax.swing.JButton jBtnBuscarAnimal;
    private javax.swing.JButton jBtnEliminarAnimal;
    private javax.swing.JButton jBtnImprimirAnimal;
    private javax.swing.JButton jBtnModificarAnimal;
    private javax.swing.JComboBox<String> jCbFiltro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTable jTblAnimal;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbtnAgregarAnimal;
    // End of variables declaration//GEN-END:variables
}
