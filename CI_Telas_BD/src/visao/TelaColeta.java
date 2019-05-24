/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import coletainteligente.PersistenciaArquivo;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class TelaColeta extends javax.swing.JFrame {

    /**
     * Creates new form TelaGeraRota
     */
    public TelaColeta() {
        initComponents();
        
        jComboBoxRegiao.removeAllItems();
        jComboBoxRegiao.addItem("Morada de Laranjeiras");
        jComboBoxRegiao.addItem("Laranjeiras");
        jComboBoxRegiao.addItem("Jacaraípe");
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxRegiao = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jButtonGerarRota = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNivel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerar Rota");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Selecione a Região para a Rota");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 35, -1, -1));

        jComboBoxRegiao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Região X", "Região Y", "Região Z" }));
        jComboBoxRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegiaoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxRegiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 422, -1));

        jLabel2.setText("Melhor rota para a coleta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 120, 299, -1));

        jButtonGerarRota.setText("Gerar Rota");
        jButtonGerarRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRotaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRota, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 86, -1, -1));

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 252, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 419, 75));

        jButton1.setText("Registrar Coleta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel3.setText("Nivel Coletado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        getContentPane().add(jTextFieldNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, -1));

        setSize(new java.awt.Dimension(558, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jComboBoxRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegiaoActionPerformed



    }//GEN-LAST:event_jComboBoxRegiaoActionPerformed

    private void jButtonGerarRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRotaActionPerformed
        // TODO add your handling code here:
        if(jComboBoxRegiao.getSelectedIndex() == 0){
            jTextField1.setText("Lixeira 8, Lixeira 2, Lixeira 6, Lixeira 4");
            
            
        }else{
            if(jComboBoxRegiao.getSelectedIndex() == 1) {
                jTextField1.setText("Lixeira 25, Lixeira 29, Lixeira 32");
                
            }else{
                jTextField1.setText("Lixeira 10, Lixeira 12, Lixeira 15, Lixeira 16, Lixeira 18, Lixeira 19");
                
            }
        }
    }//GEN-LAST:event_jButtonGerarRotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Calendar data = Calendar.getInstance();
       // Coleta coleta = new Coleta(Float.parseFloat(jTextFieldNivel.getText()), data);
        PersistenciaArquivo arquivo = new PersistenciaArquivo();
       // arquivo.salvaColeta(coleta);
        JOptionPane.showMessageDialog(null, "Coleta Registrada");
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaColeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGerarRota;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxRegiao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldNivel;
    // End of variables declaration//GEN-END:variables
}
