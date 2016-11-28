package view;

import dao.HistoricoAcaoDAO;
import dao.UsuarioDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.HistoricoAcaoM;
import model.UsuarioM;
import util.LimiteDigitos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leopo
 */
public class MinhaContaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form MinhaContaView4
     */
    public UsuarioM usuario = new UsuarioM();
    
    int idHistorico;
    String acao;
    String descricaoHistorico;
    
    public MinhaContaView(UsuarioM usuario) {
        initComponents();      
        this.setVisible(true);
        this.usuario = usuario;
        
        tfdUsuario.setDocument(new LimiteDigitos(20));
        tfdSenha.setDocument(new LimiteDigitos(20));
        tfdNome.setDocument(new LimiteDigitos(45));
        tfdMasp.setDocument(new LimiteDigitos(45));
        tfdContato.setDocument(new LimiteDigitos(45));
        iniciaUsuario(usuario);
       
    }
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    
     public void salvaHistorico() throws SQLException{
        HistoricoAcaoM historico = new HistoricoAcaoM();
        historico.setIdObjeto(idHistorico);
        historico.setTipoObjeto(descricaoHistorico);
        historico.setAcao(acao);
        historico.setDataAcao(new Date(System.currentTimeMillis()));
        historico.setUsuario(usuario);
        
        HistoricoAcaoDAO.salvar(historico);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMinhaConta = new javax.swing.JPanel();
        tfdSenha = new javax.swing.JPasswordField();
        tfdConfirmaSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfdMasp = new javax.swing.JTextField();
        tfdContato = new javax.swing.JTextField();
        tfdID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfdUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTipoDeConta = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Minha Conta");

        tfdSenha.setEnabled(false);
        tfdSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdSenhaActionPerformed(evt);
            }
        });

        tfdConfirmaSenha.setEnabled(false);

        jLabel3.setText("ID");

        jLabel4.setText("Usuário");

        tfdNome.setEnabled(false);

        jLabel5.setText("Senha");

        tfdMasp.setEnabled(false);

        tfdContato.setEnabled(false);

        tfdID.setEditable(false);
        tfdID.setEnabled(false);

        jLabel10.setText("Contato");

        tfdUsuario.setEnabled(false);

        jLabel11.setText("Nome");

        jLabel12.setText("MASP");

        jLabel1.setText("Detalhes da Conta");

        jLabel2.setText("Tipo de Conta:");

        lblTipoDeConta.setText("TipoDeConta");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Confirma Senha");

        javax.swing.GroupLayout pnlMinhaContaLayout = new javax.swing.GroupLayout(pnlMinhaConta);
        pnlMinhaConta.setLayout(pnlMinhaContaLayout);
        pnlMinhaContaLayout.setHorizontalGroup(
            pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMinhaContaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMinhaContaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoDeConta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMinhaContaLayout.createSequentialGroup()
                        .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMinhaContaLayout.createSequentialGroup()
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar))
                            .addComponent(tfdNome, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(tfdMasp)
                            .addComponent(tfdContato)
                            .addComponent(tfdUsuario)
                            .addComponent(tfdSenha)
                            .addComponent(tfdConfirmaSenha))
                        .addContainerGap(55, Short.MAX_VALUE))))
        );
        pnlMinhaContaLayout.setVerticalGroup(
            pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMinhaContaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblTipoDeConta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMinhaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMinhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdSenhaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        ativaCampos();
        preparaSalvar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        iniciaUsuario(usuario); //quero que quando clica em cancelar, volta as informações iniciais
        desativaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      if (tfdUsuario.getText().isEmpty() || tfdSenha.getText().isEmpty() || tfdConfirmaSenha.getText().isEmpty() || tfdNome.getText().isEmpty() || tfdMasp.getText().isEmpty() || tfdContato.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha todos os campos.", "Erro", JOptionPane.WARNING_MESSAGE);
            tfdNome.requestFocusInWindow();
        }else {
             if(tfdSenha.getText().equals(tfdConfirmaSenha.getText())){
                
                usuario.setNome(tfdNome.getText());
                usuario.setMasp(tfdMasp.getText());
                usuario.setContato(tfdContato.getText());
                usuario.setUsuario(tfdUsuario.getText());
                usuario.setSenha(tfdSenha.getText());
                try {
                    idHistorico = Integer.parseInt(tfdID.getText());
                    acao = "Alterar Usuário";
                    descricaoHistorico = usuario.getNome();
                    usuarioDAO.alterar(usuario);
                    salvaHistorico();
                    JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    desativaCampos();
                } catch (SQLException ex) {
                          if (ex.getErrorCode() == 1062) {
                        JOptionPane.showMessageDialog(null, "Usuario com nome já existente.", "Erro", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
            }

        }else{
                 JOptionPane.showMessageDialog(null, "Senhas não coincidem.", "Erro", JOptionPane.WARNING_MESSAGE);
             }
         }
    }//GEN-LAST:event_btnSalvarActionPerformed
    public void iniciaUsuario(UsuarioM usuario){
       tfdID.setText(usuario.getId().toString());
       tfdNome.setText(usuario.getNome());
       tfdMasp.setText(usuario.getMasp());
       tfdContato.setText(usuario.getContato());
       tfdUsuario.setText(usuario.getUsuario());
       tfdSenha.setText(usuario.getSenha());
       tfdConfirmaSenha.setText(usuario.getSenha());
        if(usuario.isAdmin() == true){
        lblTipoDeConta.setText("Administrador");
        }else{
        lblTipoDeConta.setText("Normal");
        }
      
    }

  
    public void desativaCampos(){

        tfdNome.setEnabled(false);
        tfdMasp.setEnabled(false);
        tfdContato.setEnabled(false);
        tfdUsuario.setEnabled(false);
        tfdSenha.setEnabled(false);
        tfdConfirmaSenha.setEnabled(false);
        
       btnAlterar.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
    }
    
    public void ativaCampos(){
        tfdNome.setEnabled(true);
        tfdMasp.setEnabled(true);
        tfdContato.setEnabled(true);
        tfdUsuario.setEnabled(true);
        tfdSenha.setEnabled(true);
        tfdConfirmaSenha.setEnabled(true);
    }
    public void preparaSalvar(){
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblTipoDeConta;
    private javax.swing.JPanel pnlMinhaConta;
    private javax.swing.JPasswordField tfdConfirmaSenha;
    private javax.swing.JTextField tfdContato;
    private javax.swing.JTextField tfdID;
    private javax.swing.JTextField tfdMasp;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JPasswordField tfdSenha;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
