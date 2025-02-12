/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ALEJO
 */
public class viewRegistrarProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarPersona
     */
    public viewRegistrarProveedor() {
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

        bggenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        comboCiudad = new javax.swing.JComboBox<>();
        btregistrar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        txtid_prov = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtOtraCiudad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName(""); // NOI18N
        setVisible(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel8.setText("TELEFONO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 30));

        comboCiudad.setBackground(new java.awt.Color(255, 253, 227));
        comboCiudad.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        comboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar ciudad", "ALAUSI", "AMBATO", "ARENILLAS", "ATACAMES", "ATAHUALPA", "AZOGUES", "BABAHOYO", "BAÑOSDEAGUASANTA", "BIBLIAN", "BOLIVAR", "CAÑAR", "CATAMAYO", "CAYAMBE", "CEVALLOS", "CHAGUARPAMBA", "CHAMBO", "CHILLANES", "CHIMBO", "CHINCHIPE", "CHONE", "CHORDELEG", "COTACACHI", "CUENCA", "CUMANDA", "CUYABENO", "DAULE", "DELEG", "DURAN", "ELCARMEN", "EL GUABO", "EL OYALFARO", "EL PAN", "EL  TAMBO", "ELTRIUNFO", "ESMERALDAS", "ESPEJO", "GIRON", "GONZALOPIZARRO", "GUACHAPALA", "GUALACEO", "GUALAQUIZA", "GUARANDA", "GUAYAQUIL", "HUAQUILLAS", "IBARRA", "JIPIJAPA", "JUNIN", "LA CONCORDIA", "LAGO AGRIO", "LA LIBERTAD", "LATACUNGA", "LA TRONCAL", "LOJA", "MACARA", "MACHALA", "MANTA", "MILAGRO", "MONTECRISTI", "MONTUFAR", "MORONA", "NABON", "NARANJAL", "OÑA", "ORELLANA", "OTAVALO", "PASAJE", "PASTAZA", "PATATE", "PAUTE", "PEDERNALES", "PICHINCHA", "PIÑAS", "PLAYAS", "PORTOVELO", "PUCARA", "PUERTOLOPEZ", "QUEVEDO", "QUITO", "RIOBAMBA", "RIOVERDE", "ROCAFUERTE", "RUMIÑAHUI", "SALCEDO", "SALINAS", "SAMBORONDON", "SAN CRISTOBAL", "SAN FERNANDO", "SAN LORENZO", "SAN MIGUEL", "SANTA ANA", "SANTA ELENA", "SANTA ISABEL", "SANTIAGO", "SANTO DOMINGO", "SARAGURO", "SIGSIG", "SIMON BOLIVAR", "SUCUA", "SUCUMBIOS", "TENA", "TULCAN", "VALENCIA", "VENTANAS", "VINCES", "ZAMORA", "ZARUMA", "OTRO..." }));
        comboCiudad.setBorder(null);
        jPanel1.add(comboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 210, -1));

        btregistrar.setBackground(new java.awt.Color(210, 215, 159));
        btregistrar.setFont(new java.awt.Font("MS Gothic", 1, 28)); // NOI18N
        btregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprobado (1).png"))); // NOI18N
        btregistrar.setText("REGISTRARSE");
        btregistrar.setBorder(null);
        jPanel1.add(btregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        btcancelar.setBackground(new java.awt.Color(210, 215, 159));
        btcancelar.setFont(new java.awt.Font("MS Gothic", 1, 28)); // NOI18N
        btcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btcancelar.setText("CANCELAR");
        btcancelar.setBorder(null);
        jPanel1.add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));
        jPanel1.add(txtid_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 25, 22));

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 44)); // NOI18N
        jLabel3.setText("REGISTRO DE PROVEEDOR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txttelefono.setBackground(new java.awt.Color(255, 253, 227));
        txttelefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txttelefono.setToolTipText("INGRESE LA CONTRASEÑA");
        txttelefono.setBorder(null);
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 210, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel6.setText("NOMBRE DEL PROVEEDOR:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 40));

        txtnombre.setBackground(new java.awt.Color(255, 253, 227));
        txtnombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtnombre.setToolTipText("INGRESE LA CONTRASEÑA");
        txtnombre.setBorder(null);
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 210, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel7.setText("CIUDAD:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        txtOtraCiudad.setBackground(new java.awt.Color(255, 253, 227));
        txtOtraCiudad.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtOtraCiudad.setToolTipText("INGRESE LA CONTRASEÑA");
        txtOtraCiudad.setBorder(null);
        jPanel1.add(txtOtraCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 210, 30));

        jLabel2.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        jLabel2.setText("(Escriba aqui de ser otra ciudad)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 380, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agente-inmobiliario (2).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 320, 330));

        jLabel9.setFont(new java.awt.Font("MS Gothic", 1, 44)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 49, 109));
        jLabel9.setText("PROVEEDORES");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 458, 290, -1));

        jLabel5.setFont(new java.awt.Font("MS Gothic", 1, 44)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(95, 111, 148));
        jLabel5.setText("PROVEEDORES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 460, 270, -1));

        jLabel1.setBackground(new java.awt.Color(210, 215, 159));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bggenero;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btregistrar;
    private javax.swing.JComboBox<String> comboCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtOtraCiudad;
    private javax.swing.JLabel txtid_prov;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    public ButtonGroup getBggenero() {
        return bggenero;
    }

    public void setBggenero(ButtonGroup bggenero) {
        this.bggenero = bggenero;
    }

    public JButton getBtcancelar() {
        return btcancelar;
    }

    public void setBtcancelar(JButton btcancelar) {
        this.btcancelar = btcancelar;
    }

    public JButton getBtregistrar() {
        return btregistrar;
    }

    public void setBtregistrar(JButton btregistrar) {
        this.btregistrar = btregistrar;
    }

    public JComboBox<String> getComboCiudad() {
        return comboCiudad;
    }

    public void setComboCiudad(JComboBox<String> comboCiudad) {
        this.comboCiudad = comboCiudad;
    }

    public JTextField getTxtOtraCiudad() {
        return txtOtraCiudad;
    }

    public void setTxtOtraCiudad(JTextField txtOtraCiudad) {
        this.txtOtraCiudad = txtOtraCiudad;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextField txttelefono) {
        this.txttelefono = txttelefono;
    }

    public JLabel getTxtid_prov() {
        return txtid_prov;
    }

    public void setTxtid_prov(JLabel txtid_prov) {
        this.txtid_prov = txtid_prov;
    }


}
