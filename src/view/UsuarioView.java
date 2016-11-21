/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.HistoricoAcaoDAO;
import dao.UsuarioDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.HistoricoAcaoM;
import model.UsuarioM;
import util.LimiteDigitos;

/**
 *
 * @author NUPSI-02
 */
public class UsuarioView extends javax.swing.JInternalFrame {

    /**
     * Creates new form UsuarioView
     */
    public UsuarioView(UsuarioM usuarioAtivo) {
         listaUsuario = new ArrayList<>();
        initComponents();      
        this.setVisible(true);
        this.usuarioAtivo = usuarioAtivo;
        atualizaTabelaUsuario();
        tfdUsuario.setDocument(new LimiteDigitos(20));
        tfdSenha.setDocument(new LimiteDigitos(20));
        tfdNome.setDocument(new LimiteDigitos(45));
        tfdMasp.setDocument(new LimiteDigitos(45));
        tfdContato.setDocument(new LimiteDigitos(45));
    }
    UsuarioM usuario;
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    List<UsuarioM> listaUsuario;
    
    UsuarioM usuarioAtivo;
    int idHistorico;
    String acao;
    String descricaoHistorico;
    
    public void salvaHistorico() throws SQLException{
        HistoricoAcaoM historico = new HistoricoAcaoM();
        historico.setIdObjeto(idHistorico);
        historico.setTipoObjeto(descricaoHistorico);
        historico.setAcao(acao);
        historico.setDataAcao(new Date(System.currentTimeMillis()));
        historico.setUsuario(usuarioAtivo);
        
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

        pnlUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ckxAdministrador = new javax.swing.JCheckBox();
        tfdID = new javax.swing.JTextField();
        tfdUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        tfdNome = new javax.swing.JTextField();
        tfdMasp = new javax.swing.JTextField();
        tfdContato = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfdSenha = new javax.swing.JPasswordField();
        tfdConfirmaSenha = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbeUsuario = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);

        jLabel2.setText("ID");

        jLabel3.setText("Usuário");

        jLabel4.setText("Senha");

        ckxAdministrador.setText("Administrador");
        ckxAdministrador.setEnabled(false);

        tfdID.setEditable(false);
        tfdID.setEnabled(false);

        tfdUsuario.setEnabled(false);

        jLabel5.setText("Confirmar Senha");

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

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tfdNome.setEnabled(false);

        tfdMasp.setEnabled(false);

        tfdContato.setEnabled(false);

        jLabel10.setText("Contato");

        jLabel11.setText("Nome");

        jLabel12.setText("MASP/RA");

        tfdSenha.setEnabled(false);

        tfdConfirmaSenha.setEnabled(false);

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfdNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfdMasp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfdContato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckxAdministrador)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir))
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfdSenha)
                    .addComponent(tfdConfirmaSenha))
                .addContainerGap())
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckxAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        tbeUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Nome", "MASP", "Contato", "Adminstrador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeUsuario);
        if (tbeUsuario.getColumnModel().getColumnCount() > 0) {
            tbeUsuario.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void atualizaTabelaUsuario() {

        try {
            listaUsuario = usuarioDAO.listaTodos();
            
            for(int i = 0; i < listaUsuario.size(); i++)
            {
                UsuarioM usuario = listaUsuario.get(i);

                if(usuario.getUsuario().equals("root"));
                {
                    listaUsuario.remove(usuario);
                    break;
                }
            }
        } catch (SQLException ex){
            Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dados[][] = new String[listaUsuario.size()][6];
        int i = 0;
        for (UsuarioM usuario1 : listaUsuario) {
                    dados[i][0] = String.valueOf(usuario1.getId());
                    dados[i][1] = usuario1.getUsuario();
                    dados[i][2] = ""+usuario1.isAdmin();
                    dados[i][3] = usuario1.getNome();
                    dados[i][4] = usuario1.getMasp();
                    dados[i][5] = usuario1.getContato();
                    i++;
        }
        String tituloColuna[] = {"ID", "Usuario", "Admin", "Nome", "MASP", "Contato"};
        
        DefaultTableModel tabelaUsuario = new DefaultTableModel();
        tabelaUsuario.setDataVector(dados, tituloColuna);
        tbeUsuario.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                  false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tbeUsuario.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbeUsuario.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbeUsuario.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbeUsuario.getColumnModel().getColumn(3).setPreferredWidth(300);
        tbeUsuario.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbeUsuario.getColumnModel().getColumn(5).setPreferredWidth(300);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeUsuario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbeUsuario.setRowHeight(25);
        tbeUsuario.updateUI();

    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         if (tfdUsuario.getText().isEmpty() || tfdSenha.getText().isEmpty() || tfdConfirmaSenha.getText().isEmpty() || tfdNome.getText().isEmpty() || tfdMasp.getText().isEmpty() || tfdContato.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha todos os campos.", "Erro", JOptionPane.WARNING_MESSAGE);
            tfdNome.requestFocusInWindow();
        } else if (tfdID.getText().isEmpty()){
            if(tfdSenha.getText().equals(tfdConfirmaSenha.getText())){
                
                usuario = new UsuarioM();
                usuario.setUsuario(tfdUsuario.getText());
                usuario.setSenha(tfdSenha.getText());
                usuario.setAdmin(ckxAdministrador.isSelected());
                usuario.setNome(tfdNome.getText());
                usuario.setMasp(tfdMasp.getText());
                usuario.setContato(tfdContato.getText());
                try {
                    
                    idHistorico = usuarioDAO.salvar(usuario);
                    acao = "Novo Usuário";
                    descricaoHistorico = usuario.getNome();
                    salvaHistorico();
                    JOptionPane.showMessageDialog(null, "Usuario Gravado com Sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    atualizaTabelaUsuario();
                    limpaCamposUsuario();
                    preparaSalvareCancelar();
                    desativaCampos();
                  

                } catch (SQLException ex) {
                    Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
                    if (ex.getErrorCode() == 1062) {
                        JOptionPane.showMessageDialog(null, "Usuario com nome já existente.", "Erro", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Senhas não coincidem", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        }
        else {
            if(tfdSenha.getText().equals(tfdConfirmaSenha.getText())){
                usuario = new UsuarioM();
                usuario.setId(Integer.parseInt(tfdID.getText()));
                usuario.setUsuario(tfdUsuario.getText());
                usuario.setSenha(tfdSenha.getText());
                usuario.setAdmin(ckxAdministrador.isSelected());
                usuario.setNome(tfdNome.getText());
                usuario.setMasp(tfdMasp.getText());
                usuario.setContato(tfdContato.getText());

                try {
                    idHistorico = usuario.getId();
                    acao = "Alterar Usuário";
                    descricaoHistorico = usuario.getNome();
                    salvaHistorico();
                    usuarioDAO.alterar(usuario);
                    JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    preparaSalvareCancelar();
                    desativaCampos();
                    atualizaTabelaUsuario();
                } catch (SQLException ex) {
                    if (ex.getErrorCode() == 1062) {
                        JOptionPane.showMessageDialog(null, "Usuario com nome já existente.", "Erro", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Senhas não coincidem", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        }
            
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpaCamposUsuario();
        preparaSalvareCancelar();
        desativaCampos();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCamposUsuario();
        preparaNovo();
        ativaCampos();
        tfdNome.requestFocusInWindow();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tfdID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione uma Usuario.", "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            usuario = new UsuarioM();
            usuario.setId(Integer.parseInt(tfdID.getText()));
            usuario.setNome(tfdNome.getText());
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja Excluir: " + tfdNome.getText() + " ?");
            if (confirma == 0) {
                try {
                    acao = "Excluir Usuário";
                    idHistorico = usuario.getId();
                    descricaoHistorico = usuario.getNome();
                    salvaHistorico();
                    usuarioDAO.excluir(usuario);
                    atualizaTabelaUsuario();
                    limpaCamposUsuario();

                } catch (SQLException ex) {
                    Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
                }

            }
        }
        limpaCamposUsuario();
        atualizaTabelaUsuario();
        preparaExcluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        preparaAlterar();
        ativaCampos();
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tbeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeUsuarioMouseClicked
       String admStr;
        boolean admBol; 
        tfdUsuario.setText(tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 1).toString());
        admStr = tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 2).toString();
            admBol = Boolean.parseBoolean(admStr);
            ckxAdministrador.setSelected(admBol);
        tfdNome.setText(tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 3).toString());
        tfdMasp.setText(tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 4).toString());
        tfdContato.setText(tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 5).toString());
        
        // Bloco senha para pegar a senha direto do banco
        tfdID.setText(tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 0).toString());
        try {
            usuario = usuarioDAO.UsuarioMById(Integer.parseInt(tfdID.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfdSenha.setText(usuario.getSenha());
        tfdConfirmaSenha.setText(usuario.getSenha());
        // Fim bloco senha
        
       preparaSelecaoTabela();
    }//GEN-LAST:event_tbeUsuarioMouseClicked

        // INÍCIO MÉTODOS DE CONTROLE DE BOTÕES
    
    public void preparaSalvareCancelar() {
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        tbeUsuario.setEnabled(true);
    }
    
    public void limpaCamposUsuario() {
        
        tfdID.setText("");
        tfdNome.setText("");
        tfdMasp.setText("");
        tfdContato.setText("");
        tfdUsuario.setText("");        
        tfdSenha.setText("");       
        tfdConfirmaSenha.setText("");  
        ckxAdministrador.setSelected(false);

    }
    
    public void ativaCampos() {
        tfdNome.setEnabled(true);
        tfdMasp.setEnabled(true);
        tfdContato.setEnabled(true);
        tfdUsuario.setEnabled(true);   
        tfdSenha.setEnabled(true);    
        tfdConfirmaSenha.setEnabled(true);
        ckxAdministrador.setEnabled(true);
       
    }
    
    public void desativaCampos(){
        tfdID.setText("");
        tfdID.setEnabled(false);
        tfdID.setEditable(false);
        tfdUsuario.setText("");
        tfdUsuario.setEnabled(false);
        tfdSenha.setText("");
        tfdSenha.setEnabled(false);
        tfdConfirmaSenha.setText("");
        tfdConfirmaSenha.setEnabled(false);
        tfdNome.setText("");
        tfdNome.setEnabled(false);
        tfdMasp.setText("");
        tfdMasp.setEnabled(false);
        tfdContato.setText("");
        tfdContato.setEnabled(false);
        ckxAdministrador.setEnabled(false);

    } 
   
    public void preparaNovo() {
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        tbeUsuario.setEnabled(false);
        tbeUsuario.clearSelection();
    }
    public void preparaAlterar() {
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        tbeUsuario.setEnabled(false);
        tbeUsuario.clearSelection();
    }
    
    public void preparaExcluir() {
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
    }
    
    public void preparaSelecaoTabela(){
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnAlterar.setEnabled(true);
    }
    
    // FIM MÉTODOS DE CONTROLE DE BOTÕES

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox ckxAdministrador;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JTable tbeUsuario;
    private javax.swing.JPasswordField tfdConfirmaSenha;
    private javax.swing.JTextField tfdContato;
    private javax.swing.JTextField tfdID;
    private javax.swing.JTextField tfdMasp;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JPasswordField tfdSenha;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
