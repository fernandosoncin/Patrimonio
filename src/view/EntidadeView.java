/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.EntidadeDAO;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.EntidadeM;

/**
 * UNIVERSIDADE DO ESTADO DE MINAS GERAIS - Unidade Frutal
 * @author NUPSI - Núcle de Práticas em Sistemas de Informação
 * Equipe: Gustavo Pinoti,Leopoldo Ferreira, Marlon Moro, Murillo Cuervo
 */
public class EntidadeView extends javax.swing.JInternalFrame {

    /**
     * Creates new form Orgão
     */
    public EntidadeView() {
        entidadeDAO = new EntidadeDAO();
        listaEntidade = new ArrayList<>();

        initComponents();  
        this.setVisible(true);
        atualizaTabelaEntidade();

    }

    EntidadeM entidade;
    EntidadeDAO entidadeDAO;
    List<EntidadeM> listaEntidade;

    public void atualizaTabelaEntidade() {

        try {
            listaEntidade = entidadeDAO.listaTodos();
        } catch (SQLException ex) {
            Logger.getLogger(EntidadeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dados[][] = new String[listaEntidade.size()][4];
        int i = 0;
        for (EntidadeM entidade1 : listaEntidade) {
            dados[i][0] = String.valueOf(entidade1.getId());
            dados[i][1] = entidade1.getNome();
            dados[i][2] = entidade1.getCnpj();
            dados[i][3] = entidade1.getContato();
            i++;
        }
        String tituloColuna[] = {"ID", "Nome", "CNPJ", "Contato"};
        DefaultTableModel tabelaCliente = new DefaultTableModel();
        tabelaCliente.setDataVector(dados, tituloColuna);
        tbeEntidade.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tbeEntidade.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbeEntidade.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbeEntidade.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbeEntidade.getColumnModel().getColumn(3).setPreferredWidth(300);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeEntidade.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbeEntidade.setRowHeight(25);
        tbeEntidade.updateUI();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEntidade = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        tfdID = new javax.swing.JTextField();
        lblCnpj = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        tfdNome = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        tfdCnpj = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        tfdContato = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbeEntidade = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Entidade");
        setToolTipText("");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblNome.setText("ID");

        tfdID.setEditable(false);
        tfdID.setEnabled(false);
        tfdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdIDActionPerformed(evt);
            }
        });

        lblCnpj.setText("Nome");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        tfdNome.setEnabled(false);

        lblTelefone.setText("CNPJ");

        tfdCnpj.setEnabled(false);

        lblEmail.setText("Contato");

        tfdContato.setEnabled(false);

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

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEntidadeLayout = new javax.swing.GroupLayout(pnlEntidade);
        pnlEntidade.setLayout(pnlEntidadeLayout);
        pnlEntidadeLayout.setHorizontalGroup(
            pnlEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntidadeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addGap(11, 11, 11)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlEntidadeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfdContato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfdCnpj)
                    .addGroup(pnlEntidadeLayout.createSequentialGroup()
                        .addGroup(pnlEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblEmail)
                            .addComponent(lblCnpj)
                            .addComponent(lblNome)
                            .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEntidadeLayout.setVerticalGroup(
            pnlEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tbeEntidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CNPJ", "Contato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbeEntidade.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbeEntidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeEntidadeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbeEntidade);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(pnlEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdIDActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (tfdNome.getText().isEmpty() || tfdCnpj.getText().isEmpty() || tfdContato.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha todos os campos", "Erro", JOptionPane.WARNING_MESSAGE);
            tfdNome.requestFocusInWindow();
        } else if (tfdID.getText().isEmpty()){
            entidade = new EntidadeM();
            entidade.setNome(tfdNome.getText());
            entidade.setCnpj(tfdCnpj.getText());
            entidade.setContato(tfdContato.getText());
            try {
                entidadeDAO.salvar(entidade);
                JOptionPane.showMessageDialog(null, "Gravado com Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                atualizaTabelaEntidade();
                limpaCamposEntidade();

            } catch (SQLException ex) {
                Logger.getLogger(EntidadeView.class.getName()).log(Level.SEVERE, null, ex);
                if (ex.getErrorCode() == 1062) {
                    JOptionPane.showMessageDialog(null, "Entidade já existente", "Erro", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }  

        } 
        else {
            if (tfdID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione uma Entidade", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
                entidade = new EntidadeM();
                entidade.setId(Integer.parseInt(tfdID.getText()));
                entidade.setNome(tfdNome.getText());
                entidade.setCnpj(tfdCnpj.getText());
                entidade.setContato(tfdContato.getText());
                btnSalvar.setEnabled(true);
                try {
                    entidadeDAO.alterar(entidade);
                    JOptionPane.showMessageDialog(null, "Entidade atualizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(EntidadeView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   
        }
        preparaSalvareCancelar();
        desativaCampos();
        atualizaTabelaEntidade();    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tfdID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione uma Entidade", "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            entidade = new EntidadeM();
            entidade.setId(Integer.parseInt(tfdID.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja Excluir: " + tfdNome.getText() + " ?");
            if (confirma == 0) {
                try {
                    entidadeDAO.excluir(entidade);
                    atualizaTabelaEntidade();
                    limpaCamposEntidade();

                } catch (SQLException ex) {
                    Logger.getLogger(EntidadeView.class.getName()).log(Level.SEVERE, null, ex);
                    if (ex.getErrorCode() == 1451) {
                        JOptionPane.showMessageDialog(null, "Impossível excluir essa Entidade, ele já possui patrimonios cadastrados!", "Erro", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                }

            }
        }
        limpaCamposEntidade();
        atualizaTabelaEntidade();
        preparaExcluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCamposEntidade();
        preparaNovo();
        ativaCampos();
        tfdNome.requestFocusInWindow();
      
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //Antigo
        /**/
        
        preparaAlterar();
        ativaCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tbeEntidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeEntidadeMouseClicked
        // TODO add your handling code here:
        tfdID.setText(tbeEntidade.getValueAt(tbeEntidade.getSelectedRow(), 0).toString());
        tfdNome.setText(tbeEntidade.getValueAt(tbeEntidade.getSelectedRow(), 1).toString());
        tfdCnpj.setText(tbeEntidade.getValueAt(tbeEntidade.getSelectedRow(), 2).toString());
        tfdContato.setText(tbeEntidade.getValueAt(tbeEntidade.getSelectedRow(), 3).toString());
        preparaSelecaoTabela();
    }//GEN-LAST:event_tbeEntidadeMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpaCamposEntidade();
        preparaSalvareCancelar();
        desativaCampos();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    // INÍCIO MÉTODOS DE CONTROLE DE BOTÕES
    
    public void preparaSalvareCancelar() {
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        tbeEntidade.setEnabled(true);
    }
    
    public void limpaCamposEntidade() {
        
        tfdID.setText("");
        tfdNome.setText("");        
        tfdCnpj.setText("");       
        tfdContato.setText("");  

    }
    
    public void ativaCampos() {
        tfdNome.setEnabled(true);   
        tfdCnpj.setEnabled(true);    
        tfdContato.setEnabled(true);
       
    }
    
    public void desativaCampos(){
        tfdID.setText("");
        tfdID.setEnabled(false);
        tfdID.setEditable(false);
        tfdNome.setText("");
        tfdNome.setEnabled(false);
        tfdCnpj.setText("");
        tfdCnpj.setEnabled(false);
        tfdContato.setText("");
        tfdContato.setEnabled(false);
    } 
   
    public void preparaNovo() {
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        tbeEntidade.setEnabled(false);
        tbeEntidade.clearSelection();
    }
    public void preparaAlterar() {
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        tbeEntidade.setEnabled(false);
        tbeEntidade.clearSelection();
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlEntidade;
    private javax.swing.JTable tbeEntidade;
    private javax.swing.JTextField tfdCnpj;
    private javax.swing.JTextField tfdContato;
    private javax.swing.JTextField tfdID;
    private javax.swing.JTextField tfdNome;
    // End of variables declaration//GEN-END:variables
}
