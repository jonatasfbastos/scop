/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestructure.view;

import br.com.ifba.scop.pesquisador.view.AtualizacaoPesquisador;
import br.com.ifba.scop.pesquisador.view.CadastroPesquisador;
import br.com.ifba.scop.patente.view.CentroPatente;
import br.com.ifba.scop.projetopesquisa.view.BuscarProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.view.CadastrarProjetoPesquisa;

/**
 *
 * @author Lucas
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jButton2 = new javax.swing.JButton();
        btnCadPesquisa = new javax.swing.JButton();
        btnCadPatente = new javax.swing.JButton();
        btnCadPesquisador = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/bota_icone_pesquisar.png"))); // NOI18N
        btnCadPesquisa.setBorder(null);
        btnCadPesquisa.setContentAreaFilled(false);
        btnCadPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 340, 120));

        btnCadPatente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadPatente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/botao_icone_patente.png"))); // NOI18N
        btnCadPatente.setBorder(null);
        btnCadPatente.setContentAreaFilled(false);
        btnCadPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPatenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 330, 120));

        btnCadPesquisador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadPesquisador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/botao_icone_pesquisador.png"))); // NOI18N
        btnCadPesquisador.setBorder(null);
        btnCadPesquisador.setBorderPainted(false);
        btnCadPesquisador.setContentAreaFilled(false);
        btnCadPesquisador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPesquisadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadPesquisador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 340, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/logo_central.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 410, 350));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/fundo_roxo.png"))); // NOI18N
        lblFundo.setText("lblFundo");
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1060, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method calls patente screen main.
     * @param evt Action Event
     */
    private void btnCadPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPatenteActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false); // invisivel
        //this.getDefaultCloseOperation(); // fechando
        CentroPatente centroPatente = new CentroPatente();
        centroPatente.setVisible(true);
    }//GEN-LAST:event_btnCadPatenteActionPerformed

    private void btnCadPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPesquisaActionPerformed
        // TODO add your handling code here:
        BuscarProjetoPesquisa buscarProjeto = new BuscarProjetoPesquisa();
        buscarProjeto.setVisible(true);
    }//GEN-LAST:event_btnCadPesquisaActionPerformed

    private void btnCadPesquisadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPesquisadorActionPerformed
        // TODO add your handling code here:
        CadastroPesquisador cadastrarPesquisador = new CadastroPesquisador();
        cadastrarPesquisador.setVisible(true);
    }//GEN-LAST:event_btnCadPesquisadorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadPatente;
    private javax.swing.JButton btnCadPesquisa;
    private javax.swing.JButton btnCadPesquisador;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
