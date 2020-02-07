/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.fornecedor.view;

import br.com.ifba.scop.fornecedor.model.Fornecedor;
import br.com.ifba.scop.fornecedor.tableModel.*;
import br.com.ifba.scop.infraestructure.model.ColumnDeleteLabel;
import br.com.ifba.scop.infraestructure.model.ColumnEditLabel;
import br.com.ifba.scop.infraestructure.service.Singleton;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mvictor
 */
public class ListaFornecedor extends javax.swing.JFrame {

    private static final int largura = 190;
    private static final int altura = 19;
    private final FornecedorTableModel modelo = new FornecedorTableModel();
    private final ColumnDeleteLabel deletar;
    private final ColumnEditLabel edite;    
    int selecionado = -1;
    int opcRadio = -1;
    
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
        return this.edite;
    }
    /**
     * It Returns the patente table model (jtable).
     * @return PatenteTableModel
     */
    private FornecedorTableModel getGrupoPesquisaTableModel() {
        return modelo;
    }
   
    
    /**
     * Creates new form ListaFornecedor
     */
    public ListaFornecedor() {
        initComponents();  
        this.setLocationRelativeTo(null);
        this.tableFornecedor.setModel(modelo);
        this.modelo.updateTableList(Singleton.getInstance().getAllFornecedor());
        //criando um botão do tipo deletar
        this.deletar = new ColumnDeleteLabel(this.tableFornecedor, 4);
        //criando um botão do tipo editar
        this.edite = new ColumnEditLabel(this.tableFornecedor, 5);
        
        //pega todos os proejtos
       List<Fornecedor> dados = Singleton.getInstance().getAllFornecedor();
       
       this.getGrupoPesquisaTableModel().clearTable(); // remove as informações
        
        //for com o tamanho da lista
        for (int i = 0; i < dados.size(); i++) {
            //add cada elemento pela posicao 
            this.getGrupoPesquisaTableModel().addElementIndex(i, dados.get(i));
            //insere os nomes no label de acordo com a coluna
            this.getColumnDeleteLabel().getTableCellEditorComponent(this.tableFornecedor, "Delete", false, i, 4);
            this.getColumnEditLabel().getTableCellEditorComponent(this.tableFornecedor, "Edite", false, i, 5);
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

        panelBusca = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRadioNome = new javax.swing.JRadioButton();
        btnRadioCNPJ = new javax.swing.JRadioButton();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFornecedor = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Busca");

        panelBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Busca", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        txtBusca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusca.setToolTipText("");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/icon_pesquisar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar CNPJ");

        btnRadioNome.setText("IE");
        btnRadioNome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnRadioNomeItemStateChanged(evt);
            }
        });

        btnRadioCNPJ.setText("CNPJ");
        btnRadioCNPJ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnRadioCNPJItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelBuscaLayout = new javax.swing.GroupLayout(panelBusca);
        panelBusca.setLayout(panelBuscaLayout);
        panelBuscaLayout.setHorizontalGroup(
            panelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscaLayout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRadioNome)
                    .addComponent(btnRadioCNPJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBuscaLayout.setVerticalGroup(
            panelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscaLayout.createSequentialGroup()
                .addGroup(panelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelBuscaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRadioCNPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRadioNome))
                    .addGroup(panelBuscaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addGroup(panelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelTable.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista de Fornecedores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        tableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableFornecedor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableFornecedor.getTableHeader().setResizingAllowed(false);
        tableFornecedor.getTableHeader().setReorderingAllowed(false);
        tableFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableFornecedor);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/icon_add.png"))); // NOI18N
        btnAdd.setText("NOVO FORNECEDOR");
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/fornecedor/imagens/icon_add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/icon_home.png"))); // NOI18N
        btnAtualizar.setText("TELA PRINCIPAL");
        btnAtualizar.setBorderPainted(false);
        btnAtualizar.setContentAreaFilled(false);
        btnAtualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/fornecedor/imagens/icon_home.png"))); // NOI18N
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       switch(opcRadio)
       {
           case -1:
               if(Singleton.getInstance().existIEBase(txtBusca.getText()))
               {
                    modelo.clearTable();
                    modelo.updateTableList(Singleton.getInstance().findByIE(txtBusca.getText()));
               }
               else
               {
                   JOptionPane.showMessageDialog(this, "Não existe nenhum Inscrição Estadual com esse número","Aviso", JOptionPane.WARNING_MESSAGE);
               }
            break;
           
           case 1:
               if(Singleton.getInstance().existCNPJBase(txtBusca.getText()))
               {
                    modelo.clearTable();
                    modelo.updateTableList(Singleton.getInstance().findByCnpj(txtBusca.getText()));
               }
               else
               {
                   JOptionPane.showMessageDialog(this, "Não existe nenhum CNPJ com esse número","Aviso", JOptionPane.WARNING_MESSAGE);
               }
            break;
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRadioCNPJItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnRadioCNPJItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == java.awt.event.ItemEvent.SELECTED)
        {
            //this.btnRadioNome.setEnabled(false);
            this.btnRadioNome.setSelected(false);
            this.opcRadio = 1;
        }
        else if(evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED)
        {
            //this.btnRadioNome.setEnabled(true);
            this.btnRadioNome.setSelected(true);
            this.opcRadio = -1;
        }
    }//GEN-LAST:event_btnRadioCNPJItemStateChanged

    private void btnRadioNomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnRadioNomeItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == java.awt.event.ItemEvent.SELECTED)
        {
            this.btnRadioCNPJ.setSelected(false);
        }
        else if(evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED)
        {
            this.btnRadioCNPJ.setSelected(true);
        }
    }//GEN-LAST:event_btnRadioNomeItemStateChanged

    private void tableFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFornecedorMouseClicked
        // TODO add your handling code here:
        // selecionado recebe o numero da linha que está selecionada
        this.selecionado = this.tableFornecedor.getSelectedRow();   
        
        if (this.tableFornecedor.getSelectedColumn() == 4) {
        // Deleta o projeto selecionado e atualiza a tabela
            if(this.selecionado != -1){           
                int confirmacao = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja remover este grupo de pesquisa?", "REMOVER PROJETO PESQUISA", JOptionPane.INFORMATION_MESSAGE);
                //inteiro igualado ao joptionpane  para pegar se o usuário tem certeza de excluir o grupo
                if(confirmacao == JOptionPane.NO_OPTION){
                //se a confirmação é 1, o usuário escolheu "não" ou "cancelar" e retorna para a a tela de busca
                    this.selecionado = -1;
                      
                }else if(confirmacao == JOptionPane.YES_OPTION){
                //se a confirmação é zero, o usuário quer realmente excluir o projeto e os seus dados       
                    Singleton.getInstance().deletarFornecedor(Singleton.getInstance().getAllFornecedor().get(this.selecionado));
                    this.modelo.updateTableList(Singleton.getInstance().getAllFornecedor());
                    this.selecionado = -1;
                }
            }else{
            //caso não clique em algo
                JOptionPane.showMessageDialog(null, "Para remover um cadastro, selecione um campo na tabela.", "SELECIONE UM CAMPO", JOptionPane.WARNING_MESSAGE);
                this.selecionado = -1;
            }  
            //editar pelo botão
        } if (this.tableFornecedor.getSelectedColumn() == 5) {
            new EditarFornecedor(Singleton.getInstance().getAllFornecedor().get(this.selecionado)).setVisible(true);
        }   
    }//GEN-LAST:event_tableFornecedorMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        CadastrarFornecedor add = new CadastrarFornecedor();
        add.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(ListaFornecedor.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ListaFornecedor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JRadioButton btnRadioCNPJ;
    private javax.swing.JRadioButton btnRadioNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBusca;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTable tableFornecedor;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
