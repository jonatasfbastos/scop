package br.com.ifba.scop.professor.view;

import br.com.ifba.scop.professor.view.*;
import br.com.ifba.scop.infraestructure.model.ColumnDeleteLabel;
import br.com.ifba.scop.infraestructure.model.ColumnEditLabel;
import br.com.ifba.scop.infraestructure.service.Singleton;
import br.com.ifba.scop.infraestructure.view.TelaInicial;
import br.com.ifba.scop.professor.dao.DaoProfessor;
import br.com.ifba.scop.professor.model.Professor;
import br.com.ifba.scop.professor.tableModel.ProfessorTableModel;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lucas
 */
public class BuscarProfessor extends javax.swing.JFrame {

    private final ProfessorTableModel modelo = new ProfessorTableModel();
    private final ColumnDeleteLabel deletar;
    private final ColumnEditLabel editar;    
    int selecionado = -1;
    
    /**
     * It Returns a Button Table instance.
     * @return ButtonTable Instance
     */
    private ColumnDeleteLabel getColumnDeleteLabel() {
        return this.deletar;
    }
    /**
     * It Returns a Button Table instance.
     * @return ButtonTable Instance
     */
    private ColumnEditLabel getColumnEditLabel() {
        return this.editar;
    }
    /**
     * It Returns the patente table model (jtable).
     * @return PatenteTableModel
     */
    private ProfessorTableModel getProfessorTableModel() {
        return modelo;
    }

    /**
     * Creates new form BuscarProjetoPesquisa
     */
    public BuscarProfessor() {
        
        initComponents();
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setToolTipText("Clique neste botão para cadastrar um novo projeto de pesquisa");
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setToolTipText("Clique neste botão para voltar para a tela inicial");
        txtNomeProfessor.setToolTipText("Digite algo neste campo para pesquisar");
        
        this.jtProfessor.setModel(modelo);
        this.modelo.updateTableList(Singleton.getInstance().getAllProfessor());
        //criando um botão do tipo deletar
        this.deletar = new ColumnDeleteLabel(this.jtProfessor, 4);
        //criando um botão do tipo editar
        this.editar = new ColumnEditLabel(this.jtProfessor, 5);
        
        //pega todos os projetos
        List<Professor> dados = Singleton.getInstance().getAllProfessor();
        
       this.getProfessorTableModel().clearTable(); // remove as informações
        
        //for com o tamanho da lista
        for (int i = 0; i < dados.size(); i++) {
            //add cada elemento pela posicao 
            this.getProfessorTableModel().addElementIndex(i, dados.get(i));
            //insere os nomes no label de acordo com a coluna
            this.getColumnDeleteLabel().getTableCellEditorComponent(this.jtProfessor, "Delete", false, i, 4);
            this.getColumnEditLabel().getTableCellEditorComponent(this.jtProfessor, "Edite", false, i, 5);
        }
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeProfessor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProfessor = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lblImagenFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Projeto de Pesquisa");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomeProfessor.setMinimumSize(new java.awt.Dimension(6, 27));
        txtNomeProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeProfessorKeyReleased(evt);
            }
        });
        getContentPane().add(txtNomeProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 560, 30));

        jtProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtProfessor.setOpaque(false);
        jtProfessor.getTableHeader().setReorderingAllowed(false);
        jtProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProfessorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProfessor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 195, 557, 271));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/icon_add.png"))); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 472, 40, 40));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/icon_home.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        lblImagenFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/fundo_tela_buscarr.png"))); // NOI18N
        getContentPane().add(lblImagenFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 640));
        lblImagenFundo.getAccessibleContext().setAccessibleParent(lblImagenFundo);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Ação que é disparada quando algo é diditado no txtNomeProjeto
    private void txtNomeProfessorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProfessorKeyReleased
        
        //Busca por titulo
        this.modelo.updateTableList(Singleton.getInstance().findByProfessor(this.txtNomeProfessor.getText()));
        
    }//GEN-LAST:event_txtNomeProfessorKeyReleased

    // Ação que é disparada quando houver um click na tabela
    private void jtProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProfessorMouseClicked
        // selecionado recebe o numero da linha que está selecionada
        this.selecionado = this.jtProfessor.getSelectedRow();   
        
        if (this.jtProfessor.getSelectedColumn() == 4) {
        // Deleta o projeto selecionado e atualiza a tabela
            if(this.selecionado != -1){           
                int confirmacao = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja remover este projeto pesquisa?", "REMOVER PROJETO PESQUISA", JOptionPane.INFORMATION_MESSAGE);
                //inteiro igualado ao joptionpane  para pegar se o usuário tem certeza de excluir o projeto
                if(confirmacao == JOptionPane.NO_OPTION){
                //se a confirmação é 1, o usuário escolheu "não" ou "cancelar" e retorna para a a tela de busca
                    this.selecionado = -1;
                      
                }else if(confirmacao == JOptionPane.YES_OPTION){
                //se a confirmação é zero, o usuário quer realmente excluir o projeto e os seus dados       
                    Singleton.getInstance().deleteProjetoPesquisa(Singleton.getInstance().getAllProjetos().get(this.selecionado));
                    this.modelo.updateTableList(Singleton.getInstance().getAllProfessor());
                    this.selecionado = -1;
                }
            }else{
            //caso não clique em algo
                JOptionPane.showMessageDialog(null, "Para remover um cadastro, selecione um campo na tabela.", "SELECIONE UM CAMPO", JOptionPane.WARNING_MESSAGE);
                this.selecionado = -1;
            }  
            //editar pelo botão
        } if (this.jtProfessor.getSelectedColumn() == 5) {
            new CadastrarProfessor(Singleton.getInstance().getAllProfessor().get(this.selecionado)).setVisible(true);
                          
        }    
    }//GEN-LAST:event_jtProfessorMouseClicked

    // Ação que é disparada quando a tela de cima for fechada
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
        this.modelo.updateTableList(Singleton.getInstance().getAllProfessor());
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        new CadastrarProfessor().setVisible(true);
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProfessor;
    private javax.swing.JLabel lblImagenFundo;
    private javax.swing.JTextField txtNomeProfessor;
    // End of variables declaration//GEN-END:variables
}