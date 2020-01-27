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
import static java.lang.Thread.sleep;

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
        lblMotionPesquisa = new javax.swing.JLabel();
        lblMotionPesquisador = new javax.swing.JLabel();
        lblMotionPatente = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/botao_pesquisa.png"))); // NOI18N
        btnCadPesquisa.setBorder(null);
        btnCadPesquisa.setBorderPainted(false);
        btnCadPesquisa.setContentAreaFilled(false);
        btnCadPesquisa.setDefaultCapable(false);
        btnCadPesquisa.setFocusPainted(false);
        btnCadPesquisa.setHideActionText(true);
        btnCadPesquisa.setSelected(true);
        btnCadPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadPesquisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadPesquisaMouseExited(evt);
            }
        });
        btnCadPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 350, 130));

        btnCadPatente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadPatente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/botao_patente.png"))); // NOI18N
        btnCadPatente.setBorder(null);
        btnCadPatente.setBorderPainted(false);
        btnCadPatente.setContentAreaFilled(false);
        btnCadPatente.setDefaultCapable(false);
        btnCadPatente.setFocusPainted(false);
        btnCadPatente.setFocusable(false);
        btnCadPatente.setRequestFocusEnabled(false);
        btnCadPatente.setRolloverEnabled(false);
        btnCadPatente.setSelected(true);
        btnCadPatente.setVerifyInputWhenFocusTarget(false);
        btnCadPatente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadPatenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadPatenteMouseExited(evt);
            }
        });
        btnCadPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPatenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 340, 130));

        btnCadPesquisador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadPesquisador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/botao_pesquisador.png"))); // NOI18N
        btnCadPesquisador.setBorder(null);
        btnCadPesquisador.setContentAreaFilled(false);
        btnCadPesquisador.setDefaultCapable(false);
        btnCadPesquisador.setFocusPainted(false);
        btnCadPesquisador.setFocusable(false);
        btnCadPesquisador.setRequestFocusEnabled(false);
        btnCadPesquisador.setRolloverEnabled(false);
        btnCadPesquisador.setVerifyInputWhenFocusTarget(false);
        btnCadPesquisador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadPesquisadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadPesquisadorMouseExited(evt);
            }
        });
        btnCadPesquisador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPesquisadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadPesquisador, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 232, 380, 110));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/logo_central.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 410, 350));

        lblMotionPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/pesquisa.gif"))); // NOI18N
        getContentPane().add(lblMotionPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 260, 60));

        lblMotionPesquisador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/pesquisa.gif"))); // NOI18N
        getContentPane().add(lblMotionPesquisador, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 260, 60));

        lblMotionPatente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/infraestructure/view/pesquisa.gif"))); // NOI18N
        getContentPane().add(lblMotionPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 260, 60));

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

    private void btnCadPesquisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadPesquisaMouseEntered
        // TODO add your handling code here:
        //Label de imagem retorna positivo para o movimento da imagem, se for verdadeiro aparece
        lblMotionPesquisa.setVisible(true);
        
        //cria thread para acontecer o movimento
        new Thread(){
            public void run(){
                
                //local do label
                int x = 590;
                int y = lblMotionPesquisa.getLocation().y;
                
                //recebe o local e move para direita
                while(true){
                    x++;
                    if(x< getWidth()){
                        x=700;
                    }
                    lblMotionPesquisa.setLocation(x, y);
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        
        }.start();
    }//GEN-LAST:event_btnCadPesquisaMouseEntered

    private void btnCadPesquisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadPesquisaMouseExited
        // TODO add your handling code here:
        lblMotionPesquisa.setVisible(false);
    }//GEN-LAST:event_btnCadPesquisaMouseExited

    private void btnCadPesquisadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadPesquisadorMouseEntered
        // TODO add your handling code here:
         //Label de imagem retorna positivo para o movimento da imagem, se for verdadeiro aparece
        lblMotionPesquisador.setVisible(true);
        
        //cria thread para acontecer o movimento
        new Thread(){
            public void run(){
                
                //local do label
                int x = 590;
                int y = lblMotionPesquisador.getLocation().y;
                
                //recebe o local e move para direita
                while(true){
                    x++;
                    if(x< getWidth()){
                        x=750;
                    }
                    lblMotionPesquisador.setLocation(x, y);
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        
        }.start();
    }//GEN-LAST:event_btnCadPesquisadorMouseEntered

    private void btnCadPesquisadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadPesquisadorMouseExited
        // TODO add your handling code here:
        lblMotionPesquisador.setVisible(false);
    }//GEN-LAST:event_btnCadPesquisadorMouseExited

    private void btnCadPatenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadPatenteMouseEntered
        // TODO add your handling code here:
         //Label de imagem retorna positivo para o movimento da imagem, se for verdadeiro aparece
        lblMotionPatente.setVisible(true);
        
        //cria thread para acontecer o movimento
        new Thread(){
            public void run(){
                
                //local do label
                int x = 590;
                int y = lblMotionPatente.getLocation().y;
                
                //recebe o local e move para direita
                while(true){
                    x++;
                    if(x< getWidth()){
                        x=683;
                    }
                    lblMotionPatente.setLocation(x, y);
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        
        }.start();
    }//GEN-LAST:event_btnCadPatenteMouseEntered

    private void btnCadPatenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadPatenteMouseExited
        // TODO add your handling code here:
        lblMotionPatente.setVisible(false);
    }//GEN-LAST:event_btnCadPatenteMouseExited

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
    private javax.swing.JLabel lblMotionPatente;
    private javax.swing.JLabel lblMotionPesquisa;
    private javax.swing.JLabel lblMotionPesquisador;
    // End of variables declaration//GEN-END:variables
}
