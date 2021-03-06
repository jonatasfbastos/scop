/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.view;

import br.com.ifba.scop.grupopesquisa.view.CadastrarGrupoPesquisa;
import br.com.ifba.scop.infraestructure.service.Singleton;
import br.com.ifba.scop.infraestructure.support.StringUtil;
import br.com.ifba.scop.infraestructure.view.TelaInicial;
import br.com.ifba.scop.login.usuario.model.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class TelaLogin extends javax.swing.JFrame {
    
    private final Usuario usuarioTela = new Usuario();

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
        private boolean validaCampos(){
        StringUtil util = StringUtil.getInstance();
        
        if (txtUsuario.getText().equals("") && txtSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.", "CAMPOS OBRIGATÓRIOS", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(util.isNullOrEmpty(txtUsuario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Usuario.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(util.isNullOrEmpty(txtSenha.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Senha.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        lblIconeUsuario = new javax.swing.JLabel();
        lblIconeSenha = new javax.swing.JLabel();
        btnNovoUsuario = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblUsurário = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("Login"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 153));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, 30));

        lblIconeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/login/view/icon_usuario_.png"))); // NOI18N
        getContentPane().add(lblIconeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 30));

        lblIconeSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/login/view/icon_senha_.png"))); // NOI18N
        getContentPane().add(lblIconeSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, 30));

        btnNovoUsuario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnNovoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoUsuario.setText("clique aqui");
        btnNovoUsuario.setBorderPainted(false);
        btnNovoUsuario.setContentAreaFilled(false);
        btnNovoUsuario.setDefaultCapable(false);
        btnNovoUsuario.setFocusPainted(false);
        btnNovoUsuario.setFocusable(false);
        btnNovoUsuario.setRequestFocusEnabled(false);
        btnNovoUsuario.setRolloverEnabled(false);
        btnNovoUsuario.setSelected(true);
        btnNovoUsuario.setVerifyInputWhenFocusTarget(false);
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 120, 30));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/login/view/botao_entrar.png"))); // NOI18N
        btnEntrar.setBorder(null);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 130, 50));

        txtSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 180, 30));

        lblUsurário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/login/view/tela_login_usuario.png"))); // NOI18N
        getContentPane().add(lblUsurário, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 320, 430));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/login/view/tela_login_fundo.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CadastrarUsuario  cadastrousuario = new CadastrarUsuario();
        cadastrousuario.setVisible(true);
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        if(validaCampos()){
            this.usuarioTela.setLogin(this.txtUsuario.getText());
            this.usuarioTela.setSenha(this.txtSenha.getText());
            
            List<Usuario> dados = Singleton.getInstance().findByLoginSenha(usuarioTela);
            
            if(dados == null || dados.isEmpty()){
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.", "TENTE NOVAMENTE", JOptionPane.ERROR_MESSAGE);                
            }else{
                this.dispose();
                new TelaInicial().setVisible(true);
            }            
        }
       
       
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblIconeSenha;
    private javax.swing.JLabel lblIconeUsuario;
    private javax.swing.JLabel lblUsurário;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
