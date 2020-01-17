/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.view;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import br.com.ifba.scop.infraestructure.service.Fachada;
import br.com.ifba.scop.infraestructure.service.IFachada;
import br.com.ifba.scop.infraestructure.support.StringUtil;
import br.com.ifba.scop.projetopesquisa.dao.DaoProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.dao.IDaoProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jonatasfbastos
 */
public class CadastrarProjetoPesquisa extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarProjetoPesquisa
     */
    public CadastrarProjetoPesquisa() {
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

        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTituloProjeto = new javax.swing.JLabel();
        lblSubarea = new javax.swing.JLabel();
        lblLinhaPesquisa = new javax.swing.JLabel();
        txtTituloProjeto = new javax.swing.JTextField();
        txtSubarea = new javax.swing.JTextField();
        txtLinhaPesquisa = new javax.swing.JTextField();
        chkSim = new javax.swing.JCheckBox();
        lblFinanciamento = new javax.swing.JLabel();
        chkNao = new javax.swing.JCheckBox();
        lblFonte = new javax.swing.JLabel();
        txtFonte = new javax.swing.JTextField();
        lblDataInicio = new javax.swing.JLabel();
        jspDataInicio = new javax.swing.JSpinner();
        lblDataTermino = new javax.swing.JLabel();
        jspDataTermino = new javax.swing.JSpinner();
        lblGrupoPesquisa = new javax.swing.JLabel();
        lblCampus = new javax.swing.JLabel();
        txtLocalDesenvolvimento = new javax.swing.JTextField();
        txtGrupoPesquisa = new javax.swing.JTextField();
        lblLocalDesensolvimento = new javax.swing.JLabel();
        txtCampus = new javax.swing.JTextField();
        lblViabilidadeTecnica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtViabilidadeTecnica = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        lblTelefone.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cadastro de Projeto de pesquisa");

        lblTituloProjeto.setText("Título do projeto");

        lblSubarea.setText("Subárea");

        lblLinhaPesquisa.setText("Linha de pesquisa");

        txtTituloProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloProjetoActionPerformed(evt);
            }
        });

        txtSubarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubareaActionPerformed(evt);
            }
        });

        txtLinhaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinhaPesquisaActionPerformed(evt);
            }
        });

        chkSim.setSelected(true);
        chkSim.setText("Sim");
        chkSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSimActionPerformed(evt);
            }
        });

        lblFinanciamento.setText("Financiamento");

        chkNao.setText("Não");

        lblFonte.setText("Fonte");

        txtFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFonteActionPerformed(evt);
            }
        });

        lblDataInicio.setText("Data de inicio");

        jspDataInicio.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        lblDataTermino.setText("Data de Término prevista");

        jspDataTermino.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, java.util.Calendar.DAY_OF_MONTH));

        lblGrupoPesquisa.setText("Grupo de pesquisa");

        lblCampus.setText("Campus");

        txtLocalDesenvolvimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalDesenvolvimentoActionPerformed(evt);
            }
        });

        txtGrupoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoPesquisaActionPerformed(evt);
            }
        });

        lblLocalDesensolvimento.setText("Local de desenvolvimento da pesquisa (espaço físico)");

        txtCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampusActionPerformed(evt);
            }
        });

        lblViabilidadeTecnica.setText("Viabilidade técnica");

        txtViabilidadeTecnica.setColumns(20);
        txtViabilidadeTecnica.setRows(5);
        jScrollPane1.setViewportView(txtViabilidadeTecnica);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGrupoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(lblFinanciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblGrupoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLinhaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLinhaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubarea, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSubarea, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(lblDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(chkNao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkSim, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblLocalDesensolvimento, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtLocalDesenvolvimento, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(551, 551, 551)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTituloProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTituloProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblViabilidadeTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(lblDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jspDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jspDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViabilidadeTecnica)
                    .addComponent(lblTituloProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTituloProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jspDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataInicio))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jspDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataTermino))
                        .addGap(14, 14, 14)
                        .addComponent(lblFonte)
                        .addGap(6, 6, 6)
                        .addComponent(txtFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addGap(8, 8, 8)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSubarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSubarea, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLinhaPesquisa)
                        .addGap(11, 11, 11)
                        .addComponent(txtLinhaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGrupoPesquisa)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFinanciamento)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkNao)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chkSim)
                                .addComponent(lblCampus))))
                    .addComponent(txtGrupoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLocalDesensolvimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocalDesenvolvimento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
            
            IFachada fachada = new Fachada();
            ProjetoPesquisa projeto = new ProjetoPesquisa();
            
            if(validaCampos() == true){
                
                // Atribuindo os dados dos campos aos atributos do objeto
                projeto.setCampus(this.txtCampus.getText());
                projeto.setDataInicio((Date) this.jspDataInicio.getValue());
                projeto.setDataTermino((Date) this.jspDataTermino.getValue());
                projeto.setEspaco(this.txtLocalDesenvolvimento.getText());
                projeto.setFinaciamento(this.txtFonte.getText());
                projeto.setLinhaPesquisa(this.txtLinhaPesquisa.getText());
                projeto.setSubArea(this.txtSubarea.getText());
                projeto.setTitulo(this.txtTituloProjeto.getText());
                projeto.setViabilidadeTec(this.txtViabilidadeTecnica.getText());

                // Salvo com sucesso
                if(fachada.saveProjetoPesquisa(projeto) == projeto){
                    
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                    
                    // Fecha a janela
                    this.dispose();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao salvar");
                }

            }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampusActionPerformed

    private void txtGrupoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoPesquisaActionPerformed

    private void txtLocalDesenvolvimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalDesenvolvimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalDesenvolvimentoActionPerformed

    private void txtFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFonteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFonteActionPerformed

    private void chkSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSimActionPerformed

    private void txtLinhaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinhaPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinhaPesquisaActionPerformed

    private void txtSubareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubareaActionPerformed

    private void txtTituloProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloProjetoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    /**
     * 
     * @return true se todos os campos obrigatórios estiverem preenchidos
     */
    
    private boolean validaCampos(){
        
        
        if(txtTituloProjeto.getText() == null){
            
            JOptionPane.showMessageDialog(null, "Campo obrigatório vazio! (Titulo do projeto)");
            
            return false;
        }
        
        if(txtSubarea.getText() == null){
            
            JOptionPane.showMessageDialog(null, "Campo obrigatório vazio! (Subárea)");
            
            return false;
        }
        
        if(txtLinhaPesquisa.getText() == null){
            
            JOptionPane.showMessageDialog(null, "Campo obrigatório vazio! (Linha de pesquisa)");
            
            return false;
        }
        
        if(txtCampus.getText() == null){
            
            JOptionPane.showMessageDialog(null, "Campo obrigatório vazio! (Campus)");
            
            return false;
        }
       
        if(txtLocalDesenvolvimento.getText() == null){
            
            JOptionPane.showMessageDialog(null, "Campo obrigatório vazio! (Local de desenvolvimento)");
            
            return false;
        }
       
        if(txtViabilidadeTecnica.getText() == null){
            
            JOptionPane.showMessageDialog(null, "Campo obrigatório vazio! (Viabilidade tecnica)");
            
            return false;
        }
        
        if(jspDataInicio.getValue() == null){
            
            JOptionPane.showMessageDialog(null, "Campo obrigatório vazio! (Data início)");
            
            return false;
        }
        
        if(jspDataTermino.getValue() == null){

              JOptionPane.showMessageDialog(null, "Campo obrigatório vazio! (Data termino)");

              return false;
          }
        
        
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(CadastrarProjetoPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProjetoPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProjetoPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProjetoPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProjetoPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBox chkNao;
    private javax.swing.JCheckBox chkSim;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JSpinner jspDataInicio;
    private javax.swing.JSpinner jspDataTermino;
    private javax.swing.JLabel lblCampus;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblDataTermino;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFinanciamento;
    private javax.swing.JLabel lblFonte;
    private javax.swing.JLabel lblGrupoPesquisa;
    private javax.swing.JLabel lblLinhaPesquisa;
    private javax.swing.JLabel lblLocalDesensolvimento;
    private javax.swing.JLabel lblSubarea;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTituloProjeto;
    private javax.swing.JLabel lblViabilidadeTecnica;
    private javax.swing.JTextField txtCampus;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFonte;
    private javax.swing.JTextField txtGrupoPesquisa;
    private javax.swing.JTextField txtLinhaPesquisa;
    private javax.swing.JTextField txtLocalDesenvolvimento;
    private javax.swing.JTextField txtSubarea;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTituloProjeto;
    private javax.swing.JTextArea txtViabilidadeTecnica;
    // End of variables declaration//GEN-END:variables
}
