/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtSueldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAños = new javax.swing.JTextField();
        cmbConsultar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        cmbNueva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Bono Por Anigüedad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese Su Sueldo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        TxtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionListener(evt);
            }
        });
        TxtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSueldoKeyTyped(evt);
            }
        });
        jPanel1.add(TxtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 100, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese Cuantos Años Lleva En La Empresa ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        txtAños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionListener(evt);
            }
        });
        txtAños.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñosKeyTyped(evt);
            }
        });
        jPanel1.add(txtAños, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 150, -1));

        cmbConsultar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbConsultar.setText("Consultar");
        cmbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Usted Recibira Un Bono De: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        txtBono.setEditable(false);
        jPanel1.add(txtBono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 120, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Su Sueldo Es De:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 120, -1));

        txtTotal.setEditable(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 110, -1));

        cmbNueva.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbNueva.setText("Nueva Consulta");
        cmbNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConsultarActionPerformed
        String bono,sueldo;
        int monto,años,bonificacion = 0,total;
        
        if (TxtSueldo.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite su sueldo","error", JOptionPane.ERROR_MESSAGE);
         TxtSueldo.requestFocusInWindow();}
        if (txtAños.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite La Antigüedad","error", JOptionPane.ERROR_MESSAGE);
         txtAños.requestFocusInWindow();}
        else{
        monto=Integer.parseInt(TxtSueldo.getText());
        años=Integer.parseInt(txtAños.getText());
        
        if (años>=1){
            bonificacion=((años-1)*120000)+100000;
            total=monto+bonificacion;
        }
        else{
            total=monto;
        }
        
        bono=String.valueOf(bonificacion);
        txtBono.setText(bono);
        
        sueldo=String.valueOf(total);
        txtTotal.setText(sueldo);
        
        }
    }//GEN-LAST:event_cmbConsultarActionPerformed

    private void TxtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSueldoKeyTyped
        char c=evt.getKeyChar(); 
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_TxtSueldoKeyTyped

    private void txtAñosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñosKeyTyped
        char c=evt.getKeyChar(); 
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtAñosKeyTyped

    private void cmbNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNuevaActionPerformed
        TxtSueldo.setText("");
        txtAños.setText("");
        txtBono.setText("");
        txtTotal.setText("");
        TxtSueldo.requestFocusInWindow();
    }//GEN-LAST:event_cmbNuevaActionPerformed

    private void ActionListener(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionListener
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_ActionListener

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtSueldo;
    private javax.swing.JButton cmbConsultar;
    private javax.swing.JButton cmbNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAños;
    private javax.swing.JTextField txtBono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
