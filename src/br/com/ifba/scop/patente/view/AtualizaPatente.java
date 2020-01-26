/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.view;

import br.com.ifba.scop.infraestructure.service.IFachada;
import br.com.ifba.scop.patente.model.Patente;

/**
 *
 * @author Igor Lopes
 */
public class AtualizaPatente extends javax.swing.JFrame {

    /**
     * Creates new form AtualizaPatente
     */
    public AtualizaPatente() {
        initComponents();
    }
    
    /**
     * Create a new Instance of AtualizaPatente.
     * @param id String - pk
     * @param num String - patente number
     */
    public AtualizaPatente(String id, String num) {
        this.initComponents();
        // inserindo valores
        this.txtID.setText(id);
        this.txtNumPatente.setText(num);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panHead = new javax.swing.JPanel();
        lblTituloJanela = new javax.swing.JLabel();
        panData = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblNumPatente = new javax.swing.JLabel();
        txtNumPatente = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        lblTituloPatente = new javax.swing.JLabel();
        txtTituloPatente = new javax.swing.JTextField();
        lblAreaPatente = new javax.swing.JLabel();
        txtAreaPatente = new javax.swing.JTextField();
        panButton = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Patente");
        setResizable(false);

        lblTituloJanela.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTituloJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloJanela.setText("ATUALIZAR PATENTE");

        javax.swing.GroupLayout panHeadLayout = new javax.swing.GroupLayout(panHead);
        panHead.setLayout(panHeadLayout);
        panHeadLayout.setHorizontalGroup(
            panHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloJanela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panHeadLayout.setVerticalGroup(
            panHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloJanela, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblID.setText("ID*");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });

        lblNumPatente.setText("N° PATENTE*");

        txtNumPatente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumPatenteKeyReleased(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblData.setText("DATA*");

        lblDay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblDay.setText("DIA*");

        lblMonth.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblMonth.setText("MÊS*");

        lblYear.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblYear.setText("ANO*");

        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiaKeyReleased(evt);
            }
        });

        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMesKeyReleased(evt);
            }
        });

        txtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnoKeyReleased(evt);
            }
        });

        lblTituloPatente.setText("TÍTULO*");

        lblAreaPatente.setText("AREA*");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panButtonLayout = new javax.swing.GroupLayout(panButton);
        panButton.setLayout(panButtonLayout);
        panButtonLayout.setHorizontalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panButtonLayout.setVerticalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panButtonLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(btnAtualizar)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout panDataLayout = new javax.swing.GroupLayout(panData);
        panData.setLayout(panDataLayout);
        panDataLayout.setHorizontalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDataLayout.createSequentialGroup()
                        .addComponent(lblTituloPatente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDataLayout.createSequentialGroup()
                        .addComponent(lblAreaPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAreaPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDataLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panDataLayout.createSequentialGroup()
                                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDay, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panDataLayout.createSequentialGroup()
                                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panDataLayout.createSequentialGroup()
                                            .addComponent(lblNumPatente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNumPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panDataLayout.createSequentialGroup()
                                            .addComponent(lblMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(panButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panDataLayout.setVerticalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumPatente)
                    .addComponent(txtNumPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDay)
                    .addComponent(lblMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloPatente)
                    .addComponent(txtTituloPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaPatente)
                    .addComponent(txtAreaPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This button is for update a patente that was registered.
     * @param evt Action Event
     */
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        // instanciando entidade
        Patente patente = new Patente();
        // inserindo valores
        patente.setId((long)this.stringBeNumber(this.txtID.getText())); //id
        patente.setNumero((long)this.stringBeNumber(this.txtNumPatente.getText()));
        //data
        patente.setDia(this.stringBeNumber(this.txtDia.getText()));
        patente.setMes(this.stringBeNumber(this.txtMes.getText()));
        patente.setAno(this.stringBeNumber(this.txtAno.getText()));
        // titulo e area
        patente.setTituloInvencao(this.txtTituloPatente.getText());
        patente.setAreaInvencao(this.txtAreaPatente.getText());
        // instanciando fachada
        IFachada fachada = 
                new br.com.ifba.scop.infraestructure.service.Fachada();
        // enviando para a fachada e testando operação
        if (!fachada.updatePatente(patente)) {
            javax.swing.JOptionPane.showMessageDialog(null, 
                    "Impossível Atualizar! Dados Inválidos.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, 
                    "Sucesso ao Atualizar!");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    /**
     * It Doesn't allow character that can not be change to number.
     * @param evt 
     */
    private void txtDiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyReleased
        // TODO add your handling code here:
        if (!this.stringBeNumberBool(this.txtDia.getText())) {
            this.txtDia.setText("");
        }
    }//GEN-LAST:event_txtDiaKeyReleased

    /**
     * It Doesn't allow character that can not be change to number.
     * @param evt 
     */
    private void txtMesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyReleased
        // TODO add your handling code here:
        if (!this.stringBeNumberBool(this.txtMes.getText())) {
            this.txtMes.setText("");
        }
    }//GEN-LAST:event_txtMesKeyReleased

    /**
     * It Doesn't allow character that can not be change to number.
     * @param evt 
     */
    private void txtAnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoKeyReleased
        // TODO add your handling code here:
        if (!this.stringBeNumberBool(this.txtAno.getText())) {
            this.txtAno.setText("");
        }
    }//GEN-LAST:event_txtAnoKeyReleased

    /**
     * It Doesn't allow character that can not be change to number.
     * @param evt 
     */
    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
        // TODO add your handling code here:
        if (!this.stringBeNumberBool(this.txtID.getText())) {
            this.txtID.setText("");
        }
    }//GEN-LAST:event_txtIDKeyReleased

    /**
     * It Doesn't allow character that can not be change to number.
     * @param evt 
     */
    private void txtNumPatenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPatenteKeyReleased
        // TODO add your handling code here:
        if (!this.stringBeNumberBool(this.txtNumPatente.getText())) {
            this.txtNumPatente.setText("");
        }
    }//GEN-LAST:event_txtNumPatenteKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="cpanDatad" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(AtualizaPatente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizaPatente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizaPatente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizaPatente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizaPatente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JLabel lblAreaPatente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblNumPatente;
    private javax.swing.JLabel lblTituloJanela;
    private javax.swing.JLabel lblTituloPatente;
    private javax.swing.JLabel lblYear;
    private javax.swing.JPanel panButton;
    private javax.swing.JPanel panData;
    private javax.swing.JPanel panHead;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAreaPatente;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNumPatente;
    private javax.swing.JTextField txtTituloPatente;
    // End of variables declaration//GEN-END:variables
    
    /**
     * This Method verifies if a string can be a number or not.
     * @param value String.
     * @return Integer.
     */
    private int stringBeNumber(String value) {
        int number;
        number = this.stringBeNumberBool(value) ? Integer.parseInt(value) : 0;
        return number;
    }
    
    /**
     * This Method verifies if a string can be a number or not.
     * @param value String.
     * @return Boolean.
     */
    private boolean stringBeNumberBool(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    
}
