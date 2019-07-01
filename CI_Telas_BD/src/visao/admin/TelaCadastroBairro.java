/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.admin;

import coletainteligente.Bairro;
import coletainteligente.PersistenciaArquivo;
import coletainteligentedao.BairroDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Jackson
 */
public class TelaCadastroBairro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastraBairro
     */
    
    public TelaCadastroBairro() {
        initComponents();
        BairroDAO bairroDAO = new BairroDAO();
        jListBairros.setListData(bairroDAO.selectListaBairro().toArray());
        
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNomeBairro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBairros = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jTextFieldNomeNew = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Bairro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Novo Bairro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        campoNomeBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeBairroActionPerformed(evt);
            }
        });
        getContentPane().add(campoNomeBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, -1));

        jLabel2.setText("Cadastro Bairro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        Salvar.setText("Cadastrar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        getContentPane().add(Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jScrollPane1.setViewportView(jListBairros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 146, -1));

        jLabel3.setText("Bairros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jTextFieldNomeNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeNewActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 93, -1));

        jLabel4.setText("Alterar Nome");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        setSize(new java.awt.Dimension(542, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        BairroDAO bairroDAO = new BairroDAO();
        
        PersistenciaArquivo registro = new PersistenciaArquivo();
        
        String nome = campoNomeBairro.getText();

        try {
            Bairro bairro = new Bairro(nome);
            bairroDAO.insere(bairro);
            registro.salvaBairro(bairro);
            //JOptionPane.showMessageDialog(null, "Bairro cadastrado com sucesso!");
            jListBairros.setListData(bairroDAO.selectListaBairro().toArray());
        
            campoNomeBairro.setText("");
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_SalvarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
      
        if (! campoNomeBairro.getText().equals("")){
            int resposta = JOptionPane.showConfirmDialog(null, "Há campos preenchidos!\nTem certeza que deseja sair dessa tela?");
        
           if (resposta == JOptionPane.YES_OPTION){
                this.dispose();
           }
        }else{
            this.dispose();
        }
        
    }//GEN-LAST:event_SairActionPerformed

    private void campoNomeBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeBairroActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        BairroDAO bairroDAO = new BairroDAO();
        int index = jListBairros.getSelectedIndex();
        ArrayList dados = bairroDAO.selectListaBairro();
        bairroDAO.deleta((String) dados.get(index));
        jListBairros.setListData(bairroDAO.selectListaBairro().toArray());
        
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        BairroDAO bairroDAO = new BairroDAO();
        int index = jListBairros.getSelectedIndex();
        ArrayList dados = bairroDAO.selectListaBairro();
        if(("".equals(jTextFieldNomeNew.getText())) || index == -1 ) {
            JOptionPane.showMessageDialog(null, "Insira um nome");
        }else{
            bairroDAO.alteraBairro((String) dados.get(index), jTextFieldNomeNew.getText());
            jTextFieldNomeNew.setText(null);
            jListBairros.setListData(bairroDAO.selectListaBairro().toArray());
        
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTextFieldNomeNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeNewActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroBairro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    private javax.swing.JTextField campoNomeBairro;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jListBairros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNomeNew;
    // End of variables declaration//GEN-END:variables
}
