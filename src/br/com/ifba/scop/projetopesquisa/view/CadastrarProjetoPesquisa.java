/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.view;

import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import br.com.ifba.scop.grupopesquisa.view.CadastrarGrupoPesquisa;
import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import br.com.ifba.scop.infraestructure.support.DateUtil;
import br.com.ifba.scop.infraestructure.support.EmailUtils;
import br.com.ifba.scop.infraestructure.support.StringUtil;
import br.com.ifba.scop.projetopesquisa.dao.DaoProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.dao.IDaoProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import br.com.ifba.scop.infraestructure.service.Singleton;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jonatasfbastos
 */
public class CadastrarProjetoPesquisa extends javax.swing.JFrame {
    
    private final ProjetoPesquisa projeto;
    private final DateUtil utilDate = new DateUtil();
    private final List<GrupoPesquisa> grupos = Singleton.getInstance().getAllGrupoPesquisa();
    
    
    // Esse contrutor é chamado quando a operação for salvar
    /**
     * Creates new form CadastrarProjetoPesquisa
     */
    public CadastrarProjetoPesquisa() {
        initComponents();
        
        for(int i = 0; i < this.grupos.size(); i++){
            this.combxGrupoPesquisa.addItem(this.grupos.get(i));
        }
        
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setToolTipText("Clique aqui para salvar o cadastro");
        btnCadastrarGrupoPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarGrupoPesquisa.setToolTipText("Clique aqui para cadastrar um novo grupo de pesquisa");
        this.radioSim.setSelected(true);
        this.radioSim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.radioNao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.projeto = new ProjetoPesquisa();
    }
    
    // Esse contrutor é chamado quando a operação for aualizar
    public CadastrarProjetoPesquisa(ProjetoPesquisa editado) {
        initComponents();
        
        btnCadastrar.setText("Atualizar");
        
        this.projeto = editado;
        
        this.txtTituloProjeto.setText(editado.getTitulo());
        this.txtSubarea.setText(editado.getSubArea());
        this.txtLinhaPesquisa.setText(editado.getLinhaPesquisa());
        this.txtCampus.setText(editado.getCampus());
        this.txtLocalDesenvolvimento.setText(editado.getEspaco());
        this.txtViabilidadeTecnica.setText(editado.getViabilidadeTec());
        this.txtFonte.setText(editado.getFinaciamento());
        this.txtForDataInicio.setText(this.utilDate.toString(editado.getDataInicio()));
        this.txtForDataTermino.setText(this.utilDate.toString(editado.getDataTermino()));
        this.radioSim.setSelected(editado.isFinanciada());
        this.radioNao.setSelected(!this.radioSim.isSelected());
        this.txtFonte.setText(editado.getFinaciamento());
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
        grupoBotoes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblTituloProjeto = new javax.swing.JLabel();
        lblSubarea = new javax.swing.JLabel();
        lblLinhaPesquisa = new javax.swing.JLabel();
        txtTituloProjeto = new javax.swing.JTextField();
        txtSubarea = new javax.swing.JTextField();
        txtLinhaPesquisa = new javax.swing.JTextField();
        lblFinanciamento = new javax.swing.JLabel();
        lblFonte = new javax.swing.JLabel();
        txtFonte = new javax.swing.JTextField();
        lblDataInicio = new javax.swing.JLabel();
        lblDataTermino = new javax.swing.JLabel();
        lblGrupoPesquisa = new javax.swing.JLabel();
        lblCampus = new javax.swing.JLabel();
        txtLocalDesenvolvimento = new javax.swing.JTextField();
        lblLocalDesenvolvimento = new javax.swing.JLabel();
        txtCampus = new javax.swing.JTextField();
        lblViabilidadeTecnica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtViabilidadeTecnica = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtForDataInicio = new javax.swing.JFormattedTextField();
        txtForDataTermino = new javax.swing.JFormattedTextField();
        radioSim = new javax.swing.JRadioButton();
        radioNao = new javax.swing.JRadioButton();
        btnCadastrarGrupoPesquisa = new javax.swing.JButton();
        combxGrupoPesquisa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 168, 303, 27));

        lblEmail.setText("Email");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 148, 50, -1));

        lblTelefone.setText("Telefone");
        jPanel1.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 209, 60, -1));

        lblTituloProjeto.setText("Título do projeto");
        jPanel1.add(lblTituloProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 110, 20));

        lblSubarea.setText("Subárea");
        jPanel1.add(lblSubarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, -1));

        lblLinhaPesquisa.setText("Linha de pesquisa");
        jPanel1.add(lblLinhaPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 328, 120, -1));
        jPanel1.add(txtTituloProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 303, 27));
        jPanel1.add(txtSubarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, 303, 27));
        jPanel1.add(txtLinhaPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 353, 303, 27));

        lblFinanciamento.setText("Financiamento");
        jPanel1.add(lblFinanciamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 130, -1));

        lblFonte.setText("Fonte");
        jPanel1.add(lblFonte, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 70, -1));
        jPanel1.add(txtFonte, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 306, 27));

        lblDataInicio.setText("Data de inicio");
        jPanel1.add(lblDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 259, 140, -1));

        lblDataTermino.setText("Data de Término prevista");
        jPanel1.add(lblDataTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 297, 180, -1));

        lblGrupoPesquisa.setText("Grupo de Pesquisa");
        jPanel1.add(lblGrupoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 391, 300, -1));

        lblCampus.setText("Campus");
        jPanel1.add(lblCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 110, -1));
        jPanel1.add(txtLocalDesenvolvimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 303, 27));

        lblLocalDesenvolvimento.setText("Local de desenvolvimento da pesquisa (espaço físico)");
        jPanel1.add(lblLocalDesenvolvimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 360, -1));
        jPanel1.add(txtCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 303, 27));

        lblViabilidadeTecnica.setText("Viabilidade técnica");
        jPanel1.add(lblViabilidadeTecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 90, 130, -1));

        txtViabilidadeTecnica.setColumns(20);
        txtViabilidadeTecnica.setRows(5);
        jScrollPane1.setViewportView(txtViabilidadeTecnica);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 110, 306, -1));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/icon_add.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 517, 50, -1));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)-#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 229, 303, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/Logo_scop_projeto.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 190, 120));

        try {
            txtForDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtForDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 110, -1));

        try {
            txtForDataTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtForDataTermino.setToolTipText("");
        jPanel1.add(txtForDataTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 110, -1));

        grupoBotoes.add(radioSim);
        radioSim.setText("Sim");
        radioSim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioSimItemStateChanged(evt);
            }
        });
        jPanel1.add(radioSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        grupoBotoes.add(radioNao);
        radioNao.setText("Não");
        jPanel1.add(radioNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        btnCadastrarGrupoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/icon_add.png"))); // NOI18N
        btnCadastrarGrupoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarGrupoPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrarGrupoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 50, -1));

        combxGrupoPesquisa.setModel(new DefaultComboBoxModel<>()
        );
        jPanel1.add(combxGrupoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 303, 26));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/projetopesquisa/view/imagens/fundo_tela_buscarr.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
            

        // Verifica se o projeto é valido
        if(validaCampos() == true){

            // Atribuindo os dados dos campos aos atributos do objeto
            this.projeto.setCampus(this.txtCampus.getText());
            this.projeto.setDataInicio(this.utilDate.toDate(this.txtForDataInicio.getText()));
            this.projeto.setDataTermino(this.utilDate.toDate(this.txtForDataTermino.getText()));
            this.projeto.setEspaco(this.txtLocalDesenvolvimento.getText());
            this.projeto.setFinaciamento(this.txtFonte.getText());
            this.projeto.setLinhaPesquisa(this.txtLinhaPesquisa.getText());
            this.projeto.setSubArea(this.txtSubarea.getText());
            this.projeto.setTitulo(this.txtTituloProjeto.getText());
            this.projeto.setViabilidadeTec(this.txtViabilidadeTecnica.getText());
            this.projeto.setFinanciada(this.radioSim.isSelected());
            

            // Já existe na base. Updade nele!
            if(Singleton.getInstance().getByIdProjeto(projeto.getId()) == projeto){

                // Atualixzado com sucesso
                if(Singleton.getInstance().updateProjetoPesquisa(projeto) == projeto){

                    JOptionPane.showMessageDialog(null, "Editado com sucesso!");

                    // Fecha a janela
                    this.dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao editar");
                }

            }else{
                // Ainda não existe na base

                // Salvo com sucesso
                if(Singleton.getInstance().saveProjetoPesquisa(projeto) == projeto){

                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

                    // Fecha a janela
                    this.dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao salvar");
                }
            }
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // Evento que acontece ao mudar de para "Sim" ou para "Não" os botoẽs radio
    private void radioSimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioSimItemStateChanged
        // TODO add your handling code here:
        this.txtFonte.setText("");
        this.txtFonte.setEditable(this.radioSim.isSelected());
        
        if(!radioSim.isSelected()){
           lblFonte.setText("Fonte");
           lblFonte.setForeground(Color.black);
           txtFonte.setToolTipText("Não é possível preencher este campo");
        }
    }//GEN-LAST:event_radioSimItemStateChanged

    private void btnCadastrarGrupoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarGrupoPesquisaActionPerformed
        // TODO add your handling code here:
        new CadastrarGrupoPesquisa().setVisible(true);        
    }//GEN-LAST:event_btnCadastrarGrupoPesquisaActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

        
    /**
     * 
     * @return true se todos os campos obrigatórios estiverem preenchidos
     */
    
    private boolean validaCampos(){
        
        StringUtil util = StringUtil.getInstance();
        EmailUtils emailValido = EmailUtils.getInstance();
        
       //se todos os campos não estiverem preenchidos
        if(txtTituloProjeto.getText().equals("") && txtEmail.getText().equals("")){
            if(txtSubarea.getText().equals("") && txtTelefone.getText().equals("(  )-     -    ")){
                if(txtLinhaPesquisa.getText().equals("")){
                    if(txtCampus.getText().equals("") && txtLocalDesenvolvimento.getText().equals("")){
                        if(txtViabilidadeTecnica.getText().equals("") && txtFonte.getText().equals("")){
                            if(txtForDataInicio.getText().equals("  /  /    ") && txtForDataTermino.getText().equals("  /  /    ")){
                                lblTituloProjeto.setText("Título do Projeto*");
                                lblTituloProjeto.setForeground(Color.red);
                                lblEmail.setText("Email*");
                                lblEmail.setForeground(Color.red);
                                lblTelefone.setText("Telefone*");
                                lblTelefone.setForeground(Color.red);
                                lblSubarea.setText("Subárea*");
                                lblSubarea.setForeground(Color.red);
                                lblLinhaPesquisa.setText("Linha de Pesquisa*");
                                lblLinhaPesquisa.setForeground(Color.red);
                                lblCampus.setText("Campus*");
                                lblCampus.setForeground(Color.red);
                                lblLocalDesenvolvimento.setText("Local de Desenvolvimento*");
                                lblLocalDesenvolvimento.setForeground(Color.red);
                                lblViabilidadeTecnica.setText("Viabilidade Técnica*");
                                lblViabilidadeTecnica.setForeground(Color.red);
                                lblDataInicio.setText("Data de Início*");
                                lblDataInicio.setForeground(Color.red);
                                lblDataTermino.setText("Data de Término*");
                                lblDataTermino.setForeground(Color.red);
                                lblFonte.setText("Fonte*");
                                lblFonte.setForeground(Color.red);
                                
                                JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.", "CAMPOS OBRIGATÓRIOS", JOptionPane.ERROR_MESSAGE);
                                return false;
                            } 
                        }
                    }               
                }
            }
        }     
             
  //checa cada campo individualmente                   
        if(util.isNullOrEmpty(txtTituloProjeto.getText())){
           lblTituloProjeto.setText("Título do Projeto*");
           lblTituloProjeto.setForeground(Color.red);
           JOptionPane.showMessageDialog(null, "Preencha o campo Título de Projeto.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
           lblTituloProjeto.setText("Título do Projeto");
           lblTituloProjeto.setForeground(Color.black);
        }
        
        
        if(util.isNullOrEmpty(txtEmail.getText())){
           lblEmail.setText("Email*");
           lblEmail.setForeground(Color.red);
           JOptionPane.showMessageDialog(null, "Preencha o campo Email.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
           lblEmail.setText("Email");
           lblEmail.setForeground(Color.black);
        }
        
        //verifica se o Email é válido.
        if(emailValido.isEmailValid(txtEmail.getText())){
            lblEmail.setText("Email");
            lblEmail.setForeground(Color.BLACK);
        }else{
            lblEmail.setText("Email*");
            lblEmail.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Digite um Email válido.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(txtTelefone.getText().equals("(  )-     -    ")){
           lblTelefone.setText("Telefone*");
           lblTelefone.setForeground(Color.red);
           JOptionPane.showMessageDialog(null, "Preencha o campo Telefone.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
           lblTelefone.setText("Telefone");
           lblTelefone.setForeground(Color.black);
        }
        
        if(util.isNullOrEmpty(txtSubarea.getText())){
           lblSubarea.setText("Subárea*");
           lblSubarea.setForeground(Color.red);   
           JOptionPane.showMessageDialog(null, "Preencha o campo Subárea.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
           lblSubarea.setText("Subárea");
           lblSubarea.setForeground(Color.black);
        }
        
        if(util.isNullOrEmpty(txtLinhaPesquisa.getText())){
            lblLinhaPesquisa.setText("Linha de Pesquisa*");
            lblLinhaPesquisa.setForeground(Color.red);  
            JOptionPane.showMessageDialog(null, "Preencha o campo Linha de Pesquisa.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblLinhaPesquisa.setText("Linha de Pesquisa");
            lblLinhaPesquisa.setForeground(Color.black);
        }
        
        if(util.isNullOrEmpty(txtCampus.getText())){
           lblCampus.setText("Campus*");
           lblCampus.setForeground(Color.red);  
            JOptionPane.showMessageDialog(null, "Preencha o campo Campus.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
           return false;
        }else{
           lblCampus.setText("Campus");
           lblCampus.setForeground(Color.black);  
        }
       
        if(util.isNullOrEmpty(txtLocalDesenvolvimento.getText())){
           lblLocalDesenvolvimento.setText("Local de Desenvolvimento*");
           lblLocalDesenvolvimento.setForeground(Color.red); 
           JOptionPane.showMessageDialog(null, "Preencha o campo Local de Desenvolvimento.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
           lblLocalDesenvolvimento.setText("Local de Desenvolvimento");
           lblLocalDesenvolvimento.setForeground(Color.black);
        }
       
        if(util.isNullOrEmpty(txtViabilidadeTecnica.getText())){
           lblViabilidadeTecnica.setText("Viabilidade Técnica*");
           lblViabilidadeTecnica.setForeground(Color.red);  
           JOptionPane.showMessageDialog(null, "Preencha o campo Viabilidade Técnica.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
           lblViabilidadeTecnica.setText("Viabilidade Técnica");
           lblViabilidadeTecnica.setForeground(Color.black);
        }
        
        if(this.txtForDataInicio.getText().equals("  /  /    ")){
            lblDataInicio.setText("Data de Início*");
            lblDataInicio.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Data de Início.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE); 
            return false;
        }else{
            lblDataInicio.setText("Data de Início");
            lblDataInicio.setForeground(Color.black);
        }
        
        if(this.txtForDataTermino.getText().equals("  /  /    ")){
            lblDataTermino.setText("Data de Término*");
            lblDataTermino.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Data de Término.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblDataTermino.setText("Data de Término");
            lblDataTermino.setForeground(Color.black);
        }
        
        if(util.isNullOrEmpty(txtFonte.getText())){
           lblFonte.setText("Fonte*");
           lblFonte.setForeground(Color.red);
           JOptionPane.showMessageDialog(null, "Preencha o campo Fonte.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
           lblFonte.setText("Fonte");
           lblFonte.setForeground(Color.black);
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
    private javax.swing.JButton btnCadastrarGrupoPesquisa;
    private javax.swing.JComboBox<GrupoPesquisa> combxGrupoPesquisa;
    private javax.swing.ButtonGroup grupoBotoes;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblCampus;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblDataTermino;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFinanciamento;
    private javax.swing.JLabel lblFonte;
    private javax.swing.JLabel lblGrupoPesquisa;
    private javax.swing.JLabel lblLinhaPesquisa;
    private javax.swing.JLabel lblLocalDesenvolvimento;
    private javax.swing.JLabel lblSubarea;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTituloProjeto;
    private javax.swing.JLabel lblViabilidadeTecnica;
    private javax.swing.JRadioButton radioNao;
    private javax.swing.JRadioButton radioSim;
    private javax.swing.JTextField txtCampus;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFonte;
    private javax.swing.JFormattedTextField txtForDataInicio;
    private javax.swing.JFormattedTextField txtForDataTermino;
    private javax.swing.JTextField txtLinhaPesquisa;
    private javax.swing.JTextField txtLocalDesenvolvimento;
    private javax.swing.JTextField txtSubarea;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtTituloProjeto;
    private javax.swing.JTextArea txtViabilidadeTecnica;
    // End of variables declaration//GEN-END:variables
}
