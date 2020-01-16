/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.view;

import br.com.ifba.scop.infraestructure.service.IFachada;
import br.com.ifba.scop.patente.model.Patente;
import java.util.List;

/**
 *
 * @author Igor Lopes
 */
public class CentroPatente extends javax.swing.JFrame {

    /**
     * Creates new form CentroPatente
     */
    public CentroPatente() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panSearch = new javax.swing.JPanel();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        chkArea = new javax.swing.JCheckBox();
        chkNum = new javax.swing.JCheckBox();
        chkTitle = new javax.swing.JCheckBox();
        panJanelaTitulo = new javax.swing.JPanel();
        lblJanelaTitulo = new javax.swing.JLabel();
        panTableData = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPatentes = new javax.swing.JTable();
        panButton = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblPesquisar.setText("Pesquisa:");

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        chkArea.setText("Por Area");
        chkArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkAreaMouseClicked(evt);
            }
        });

        chkNum.setText("Por Numero");
        chkNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkNumMouseClicked(evt);
            }
        });

        chkTitle.setText("Por Titulo");
        chkTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkTitleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panSearchLayout = new javax.swing.GroupLayout(panSearch);
        panSearch.setLayout(panSearchLayout);
        panSearchLayout.setHorizontalGroup(
            panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSearchLayout.createSequentialGroup()
                        .addComponent(lblPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar))
                    .addGroup(panSearchLayout.createSequentialGroup()
                        .addComponent(chkArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTitle)
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panSearchLayout.setVerticalGroup(
            panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkArea)
                    .addComponent(chkNum)
                    .addComponent(chkTitle))
                .addContainerGap())
        );

        lblJanelaTitulo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblJanelaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJanelaTitulo.setText("Centro de Patentes");

        javax.swing.GroupLayout panJanelaTituloLayout = new javax.swing.GroupLayout(panJanelaTitulo);
        panJanelaTitulo.setLayout(panJanelaTituloLayout);
        panJanelaTituloLayout.setHorizontalGroup(
            panJanelaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJanelaTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJanelaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );
        panJanelaTituloLayout.setVerticalGroup(
            panJanelaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJanelaTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJanelaTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblPatentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Numero", "Titulo", "Area", "Dia", "Mês", "Ano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPatentes);

        javax.swing.GroupLayout panTableDataLayout = new javax.swing.GroupLayout(panTableData);
        panTableData.setLayout(panTableDataLayout);
        panTableDataLayout.setHorizontalGroup(
            panTableDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTableDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        panTableDataLayout.setVerticalGroup(
            panTableDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panButtonLayout = new javax.swing.GroupLayout(panButton);
        panButton.setLayout(panButtonLayout);
        panButtonLayout.setHorizontalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panButtonLayout.setVerticalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnDeletar)
                    .addComponent(btnListar)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panJanelaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panTableData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJanelaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panTableData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(panButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This button deletes a register.
     * @param evt 
     */
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    /**
     * This button calls update screen.
     * @param evt Action Event
     */
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        AtualizaPatente atualiza = new AtualizaPatente(); // instanciando nova tela
        atualiza.setVisible(true); // tornando visível
    }//GEN-LAST:event_btnAtualizarActionPerformed

    /**
     * Search by ID.
     * @param evt Mouse event
     */
    private void chkAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAreaMouseClicked
        // TODO add your handling code here:
        // desmarcando demais campos
        if (this.chkNum.isSelected()) {
            this.chkNum.setSelected(false);
        }
        if (this.chkTitle.isSelected()) {
            this.chkTitle.setSelected(false);
        }
    }//GEN-LAST:event_chkAreaMouseClicked

    /**
     * Search by Number.
     * @param evt Mouse event
     */
    private void chkNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkNumMouseClicked
        // TODO add your handling code here:
        // desmarcando demais campos
        if (this.chkArea.isSelected()) {
            this.chkArea.setSelected(false);
        }
        if (this.chkTitle.isSelected()) {
            this.chkTitle.setSelected(false);
        }
    }//GEN-LAST:event_chkNumMouseClicked

    /**
     * Search by title.patente
     * @param evt Mouse Event
     */
    private void chkTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkTitleMouseClicked
        // TODO add your handling code here:
        // desmarcando demais campos
        if (this.chkArea.isSelected()) {
            this.chkArea.setSelected(false);
        }
        if (this.chkNum.isSelected()) {
            this.chkNum.setSelected(false);
        }
    }//GEN-LAST:event_chkTitleMouseClicked

    /**
     * This event is for search.
     * @param evt Action Event
     */
    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
        // instanciando patente entidade
        Patente patente = new Patente();
        // instanciando fachada
        IFachada fachada = 
                new br.com.ifba.scop.infraestructure.service.Fachada();
        // qual o tipo de pesquisa
        if (this.chkArea.isSelected()) {
            // area
            patente.setAreaInvencao(this.txtPesquisar.getText());
            // retorna pesquisa de área
            List<Patente> dados = fachada.searchPatenteArea(patente);
            // testa se houve erro
            if (dados == null || dados.isEmpty()) {
                javax.swing.JOptionPane.showConfirmDialog(null, 
                        "Erro de Busca por Área! Nada Encontrado.");
            }
        } else if (this.chkNum.isSelected()) {
            // numero
            // evita erro de string não poder ser convertida para numero
            long num = (long) this.stringBeNumber(this.txtPesquisar.getText());
            patente.setNumero(num);
            // retorna pesquisa de numero
            List<Patente> dados = fachada.searchPatenteNumber(patente);
            // testa se houve erro
            if (dados == null || dados.isEmpty()) {
                javax.swing.JOptionPane.showConfirmDialog(null, 
                        "Erro de Busca por Número! Nada Encontrado.");
            }
        } else if (this.chkTitle.isSelected()) {
            // titulo
            patente.setTituloInvencao(this.txtPesquisar.getText());
            // retorna pesquisa de titulo
            List<Patente> dados = fachada.searchPatenteTitle(patente);
            // testa se houve erro
            if (dados == null || dados.isEmpty()) {
                javax.swing.JOptionPane.showConfirmDialog(null, 
                        "Erro de Busca por Título! Nada Encontrado.");
            }
        }
    }//GEN-LAST:event_txtPesquisarActionPerformed

    /**
     * This method calls cadastro patente screen.
     * @param evt Action event
     */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        CadastroPatente casdastro = new CadastroPatente(); // instanciando nova tela
        casdastro.setVisible(true); // tornando tela de cadastro visivel
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * Inserts all data inside the JTable.
     * @param evt Action Event
     */
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        // instancia fachada
        IFachada fachada =
                new br.com.ifba.scop.infraestructure.service.Fachada();
        // inserindo numa lista
        List<Patente> patentes = fachada.takeAllPatente();
        if (patentes == null || patentes.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, 
                    "Erro: Nenhuma Patente Encontrada.");
            return;
        }
        
    }//GEN-LAST:event_btnListarActionPerformed

    /**
     * Cleans JTable.
     * @param evt Action Event.
     */
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CentroPatente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentroPatente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentroPatente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentroPatente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentroPatente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JCheckBox chkArea;
    private javax.swing.JCheckBox chkNum;
    private javax.swing.JCheckBox chkTitle;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblJanelaTitulo;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JPanel panButton;
    private javax.swing.JPanel panJanelaTitulo;
    private javax.swing.JPanel panSearch;
    private javax.swing.JPanel panTableData;
    private javax.swing.JTable tblPatentes;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
    
    /**
     * This Method verifies if a string can be a number or not.
     * @param value String.
     * @return Integer.
     */
    private int stringBeNumber(String value) {
        int number;
        try {
            number = Integer.parseInt(value);
        } catch (NumberFormatException ex) {
            number = 0;
        }
        return number;
    }
}
