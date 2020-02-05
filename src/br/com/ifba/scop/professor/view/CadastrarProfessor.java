/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.professor.view;

import br.com.ifba.scop.infraestructure.service.Singleton;
import br.com.ifba.scop.infraestructure.support.StringUtil;
import br.com.ifba.scop.professor.model.Professor;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bessa
 */
public class CadastrarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarProfessor
     */
    public CadastrarProfessor() {
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

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        lblEstadoCivil = new javax.swing.JLabel();
        CbEstadoCivil = new javax.swing.JComboBox<>();
        lblNascimento = new javax.swing.JLabel();
        txtExpedicao = new javax.swing.JFormattedTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        lblRg = new javax.swing.JLabel();
        txtRg = new javax.swing.JFormattedTextField();
        lblExpedicao = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JFormattedTextField();
        lblTitulo = new javax.swing.JLabel();
        lblOrgExpedidor = new javax.swing.JLabel();
        txtOrgExpedidor = new javax.swing.JTextField();
        lblNacionalidade = new javax.swing.JLabel();
        txtNacionalidade = new javax.swing.JTextField();
        lblNaturalidade = new javax.swing.JLabel();
        txtNaturalidade = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtTitulacao = new javax.swing.JTextField();
        lblTitulacao = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSexo.setText("Sexo:");

        txtSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblEstadoCivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstadoCivil.setText("Estado Civil:");

        CbEstadoCivil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)", "Separado(a)" }));

        lblNascimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNascimento.setText("Data de nascimento:");

        try {
            txtExpedicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCpf.setText("CPF:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblRg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRg.setText("RG:");

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblExpedicao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblExpedicao.setText("Data da expedição:");

        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblTitulo.setText("CADASTRAR PROFESSOR");

        lblOrgExpedidor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOrgExpedidor.setText("Órgão Expedidor:");

        txtOrgExpedidor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblNacionalidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNacionalidade.setText("Nacionalidade:");

        txtNacionalidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblNaturalidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNaturalidade.setText("Naturalidade:");

        txtNaturalidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEndereco.setText("Endereço:");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setText("E-mail:");

        txtMatricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblMatricula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMatricula.setText("Matricula:");

        txtTitulacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTitulacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulacao.setText("Titulação:");

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/scop/professor/view/Imagens/icon_add.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrgExpedidor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOrgExpedidor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEstadoCivil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblExpedicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtExpedicao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRg)
                        .addGap(23, 23, 23)
                        .addComponent(txtRg))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCpf)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNacionalidade)
                            .addComponent(lblNaturalidade)
                            .addComponent(lblEndereco)
                            .addComponent(lblEmail)
                            .addComponent(lblMatricula)
                            .addComponent(lblTitulacao))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulacao, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtMatricula)
                            .addComponent(txtEmail)
                            .addComponent(txtEndereco)
                            .addComponent(txtNaturalidade)
                            .addComponent(txtNacionalidade))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacionalidade)
                    .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo)
                    .addComponent(lblNaturalidade)
                    .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(CbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNascimento)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulacao)
                    .addComponent(txtTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExpedicao)
                    .addComponent(txtExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrgExpedidor)
                            .addComponent(txtOrgExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        Professor professor = new Professor();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        
        if (validaCampos() == true){
            professor.setNome(txtNome.getText());
            professor.setCpf(Integer.parseInt(txtCpf.getText()));
            professor.setEmail(txtEmail.getText());
            professor.setSexo(txtSexo.getText());
            professor.setMatricula(txtMatricula.getText());
            professor.setTitulacao(txtTitulacao.getText());
            professor.setOrgaoExpedidor(txtOrgExpedidor.getText());
            
            try {
                professor.setDataNascimento(formato.parse(txtNascimento.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(CadastrarProfessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            professor.setRg(Integer.parseInt(txtRg.getText()));
            professor.setNacionalidade(txtNacionalidade.getText());
            professor.setNaturalidade(txtNaturalidade.getText());
            
            try {
                professor.setDataExpedicao(formato.parse(txtExpedicao.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(CadastrarProfessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProfessor().setVisible(true);
            }
        });
    }
    
    // Checar se existe campos vazios
    
    private boolean validaCampos(){
        
        StringUtil util = StringUtil.getInstance();
        
                if(txtNome.getText().equals("") && txtSexo.getText().equals("")){
                    if(txtNascimento.getText().equals("") && txtCpf.getText().equals("")){
                        if(txtRg.getText().equals("") && txtExpedicao.getText().equals("")){
                            if (txtOrgExpedidor.getText().equals("") && txtNacionalidade.getText().equals("")){
                                if (txtNaturalidade.getText().equals("") && txtEndereco.getText().equals("")){
                                    if (txtEmail.getText().equals("") && txtMatricula.getText().equals("") && txtTitulacao.getText().equals("")){
                                        JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.", "CAMPOS OBRIGATÓRIOS", JOptionPane.ERROR_MESSAGE);
                                        return false; 
                                    }
                                }
                            }
                        }
                    }
                }
                
        // Validação dos campos individuais
        // nome
        if(util.isNullOrEmpty(txtNome.getText())){
            lblNome.setText("Nome*");
            lblNome.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblNome.setText("Nome");
            lblNome.setForeground(Color.black);
        }
        
        // Campo Sexo
        if(util.isNullOrEmpty(txtSexo.getText())){
            lblSexo.setText("Sexo*");
            lblSexo.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Sexo.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblSexo.setText("Sexo:");
            lblSexo.setForeground(Color.black);
        }
        
        // Campo Nascimento
        if(util.isNullOrEmpty(txtNascimento.getText())){
            lblNascimento.setText("Nascimento:*");
            lblNascimento.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Nascimento.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblNascimento.setText("Nascimento:");
            lblNascimento.setForeground(Color.black);
        }
        
        // Campo CPF
        if(util.isNullOrEmpty(txtCpf.getText())){
            lblCpf.setText("CPF:*");
            lblCpf.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblCpf.setText("CPF:");
            lblCpf.setForeground(Color.black);
        }
        
        // Campo RG
        if(util.isNullOrEmpty(txtRg.getText())){
            lblRg.setText("RG*");
            lblRg.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo RG.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblRg.setText("RG");
            lblRg.setForeground(Color.black);
        }
        
        // Data da expedição
        if(util.isNullOrEmpty(txtExpedicao.getText())){
            lblExpedicao.setText("Data da expedição:*");
            lblExpedicao.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Data da expedição.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblExpedicao.setText("Data da expedição:");
            lblExpedicao.setForeground(Color.black);
        }
        
        // Campo Orgão Expedidor
        if(util.isNullOrEmpty(txtOrgExpedidor.getText())){
            lblOrgExpedidor.setText("Orgão Expedidor:*");
            lblOrgExpedidor.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Orgão Expedidor.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblOrgExpedidor.setText("Orgão Expedidor:");
            lblOrgExpedidor.setForeground(Color.black);
        }   
        
        // Nacionalidade
        if(util.isNullOrEmpty(txtNacionalidade.getText())){
            lblNacionalidade.setText("Nacionalidade:*");
            lblNacionalidade.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Nacionalidade.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblNacionalidade.setText("Nacionalidade:");
            lblNacionalidade.setForeground(Color.black);
        }
        
        // Naturalidade
        if(util.isNullOrEmpty(txtNaturalidade.getText())){
            lblNaturalidade.setText("Naturalidade:*");
            lblNaturalidade.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Naturalidade.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblNaturalidade.setText("Naturalidade:");
            lblNaturalidade.setForeground(Color.black);
        }
        
        // Endereço
        if(util.isNullOrEmpty(txtEndereco.getText())){
            lblEndereco.setText("Endereço:*");
            lblEndereco.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Enrereço.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblEndereco.setText("Endereço:");
            lblEndereco.setForeground(Color.black);
        }
        
        // Campo E-mail
        if(util.isNullOrEmpty(txtEmail.getText())){
            lblEmail.setText("E-mail:*");
            lblEmail.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo E-mail.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblEmail.setText("E-mail:");
            lblEmail.setForeground(Color.black);
        }
        
        // Campo Matricula
        if(util.isNullOrEmpty(txtMatricula.getText())){
            lblMatricula.setText("Matrícula:*");
            lblMatricula.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Matrícula.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblMatricula.setText("Matríula:");
            lblMatricula.setForeground(Color.black);
        }
        
        // Campo Titulação
        if(util.isNullOrEmpty(txtTitulacao.getText())){
            lblTitulacao.setText("Titulação:*");
            lblTitulacao.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Preencha o campo Titulação.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            lblTitulacao.setText("Titulação:");
            lblTitulacao.setForeground(Color.black);
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbEstadoCivil;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblExpedicao;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNacionalidade;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNaturalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOrgExpedidor;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulacao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtExpedicao;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtOrgExpedidor;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTitulacao;
    // End of variables declaration//GEN-END:variables
}
