package br.com.ifba.scop.projetopesquisa.view;

import br.com.ifba.scop.infraestructure.model.ColumnDeleteLabel;
import br.com.ifba.scop.infraestructure.model.ColumnEditLabel;
import br.com.ifba.scop.infraestructure.service.Fachada;
import br.com.ifba.scop.infraestructure.service.IFachada;
import br.com.ifba.scop.infraestructure.view.TelaInicial;
import br.com.ifba.scop.projetopesquisa.dao.DaoProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.tableModel.ProjetoPesquisaTableModel;
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
public class BuscarProjetoPesquisa extends javax.swing.JFrame {

    private final ProjetoPesquisaTableModel modelo = new ProjetoPesquisaTableModel();
    private final IFachada fachada = new Fachada();
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
    private ProjetoPesquisaTableModel getProjetoPesquisaTableModel() {
        return modelo;
    }

    /**
     * Creates new form BuscarProjetoPesquisa
     */
    public BuscarProjetoPesquisa() {
        
        initComponents();
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setToolTipText("Clique neste botão para cadastrar um novo projeto de pesquisa");
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setToolTipText("Clique neste botão para voltar para a tela inicial");
        txtNomeProjeto.setToolTipText("Digite algo neste campo para pesquisar");
        
        this.jtProjetosPesquisa.setModel(modelo);
        this.modelo.updateTableList(this.fachada.getAllProjetos());
        //criando um botão do tipo deletar
        this.deletar = new ColumnDeleteLabel(this.jtProjetosPesquisa, 4);
        //criando um botão do tipo editar
        this.editar = new ColumnEditLabel(this.jtProjetosPesquisa, 5);
        
        //pega todos os proejtos
        List<ProjetoPesquisa> dados = fachada.getAllProjetos();
        
       this.getProjetoPesquisaTableModel().clearTable(); // remove as informações
        
        //for com o tamanho da lista
        for (int i = 0; i < dados.size(); i++) {
            //add cada elemento pela posicao 
            this.getProjetoPesquisaTableModel().addElementIndex(i, dados.get(i));
            //insere os nomes no label de acordo com a coluna
            this.getColumnDeleteLabel().getTableCellEditorComponent(this.jtProjetosPesquisa, "Delete", false, i, 4);
            this.getColumnEditLabel().getTableCellEditorComponent(this.jtProjetosPesquisa, "Edite", false, i, 5);
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

        txtNomeProjeto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProjetosPesquisa = new javax.swing.JTable();
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

        txtNomeProjeto.setMinimumSize(new java.awt.Dimension(6, 27));
        txtNomeProjeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeProjetoKeyReleased(evt);
            }
        });
        getContentPane().add(txtNomeProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 560, 30));

        jtProjetosPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtProjetosPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtProjetosPesquisa.setOpaque(false);
        jtProjetosPesquisa.getTableHeader().setReorderingAllowed(false);
        jtProjetosPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProjetosPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProjetosPesquisa);

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
    private void txtNomeProjetoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProjetoKeyReleased
        
        //Busca por titulo
        this.modelo.updateTableList(this.fachada.findByTitulo(this.txtNomeProjeto.getText()));
        
    }//GEN-LAST:event_txtNomeProjetoKeyReleased

    // Ação que é disparada quando houver um click na tabela
    private void jtProjetosPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProjetosPesquisaMouseClicked
        // selecionado recebe o numero da linha que está selecionada
        this.selecionado = this.jtProjetosPesquisa.getSelectedRow();   
        
        if (this.jtProjetosPesquisa.getSelectedColumn() == 4) {
        // Deleta o projeto selecionado e atualiza a tabela
            if(this.selecionado != -1){           
                int confirmacao = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja remover este projeto pesquisa?", "REMOVER PROJETO PESQUISA", JOptionPane.INFORMATION_MESSAGE);
                //inteiro igualado ao joptionpane  para pegar se o usuário tem certeza de excluir o projeto
                if(confirmacao == JOptionPane.NO_OPTION){
                //se a confirmação é 1, o usuário escolheu "não" ou "cancelar" e retorna para a a tela de busca
                    this.selecionado = -1;
                      
                }else if(confirmacao == JOptionPane.YES_OPTION){
                //se a confirmação é zero, o usuário quer realmente excluir o projeto e os seus dados       
                    this.fachada.deleteProjetoPesquisa(this.fachada.getAllProjetos().get(this.selecionado));
                    this.modelo.updateTableList(this.fachada.getAllProjetos());
                    this.selecionado = -1;
                }
            }else{
            //caso não clique em algo
                JOptionPane.showMessageDialog(null, "Para remover um cadastro, selecione um campo na tabela.", "SELECIONE UM CAMPO", JOptionPane.WARNING_MESSAGE);
                this.selecionado = -1;
            }  
            //editar pelo botão
        } if (this.jtProjetosPesquisa.getSelectedColumn() == 5) {
             new CadastrarProjetoPesquisa(this.fachada.getAllProjetos().get(this.selecionado)).setVisible(true);
                          
        }    
    }//GEN-LAST:event_jtProjetosPesquisaMouseClicked

    // Ação que é disparada quando a tela de cima for fechada
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
        this.modelo.updateTableList(this.fachada.getAllProjetos());
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        new CadastrarProjetoPesquisa().setVisible(true);
        
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
            java.util.logging.Logger.getLogger(BuscarProjetoPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProjetoPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProjetoPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProjetoPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProjetoPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProjetosPesquisa;
    private javax.swing.JLabel lblImagenFundo;
    private javax.swing.JTextField txtNomeProjeto;
    // End of variables declaration//GEN-END:variables
}
