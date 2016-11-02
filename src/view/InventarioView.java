/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.BlocoDAO;
import dao.PatrimonioDAO;
import dao.PisoDAO;
import dao.SalaDAO;
import dao.UnidadeDAO;
import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.BlocoM;
import model.PatrimonioM;
import model.PisoM;
import model.SalaM;
import model.UnidadeM;
import util.ColorirEsperados;
import util.ColorirReais;
import util.ColorirSala;

/**
 *
 * @author Leopo
 */
public class InventarioView extends javax.swing.JInternalFrame {
    UnidadeDAO unidadeDAO;
    BlocoDAO blocoDAO;
    PisoDAO pisoDAO;
    SalaDAO salaDAO;
    PatrimonioDAO patrimonioDAO;

    List<UnidadeM> listaUnidade;
    List<BlocoM> listaBloco;
    List<PisoM> listaPiso;
    List<SalaM> listaSala;
    List<PatrimonioM> listaPatrimonioEsperados;
    List<PatrimonioM> listaPatrimonioReais;
    
    UnidadeM unidade;
    BlocoM bloco;
    PisoM piso;
    int numeroSala = -1;
    
    public InventarioView() {   
        salaDAO = new SalaDAO();
        pisoDAO = new PisoDAO();
        blocoDAO = new BlocoDAO();
        unidadeDAO = new UnidadeDAO();
        patrimonioDAO = new PatrimonioDAO();
        
        listaUnidade = new ArrayList<>();
        listaBloco = new ArrayList<>();
        listaPiso = new ArrayList<>();
        listaSala = new ArrayList<>();
        listaPatrimonioEsperados = new ArrayList<>();
        listaPatrimonioReais = new ArrayList<>();
        
        unidade = new UnidadeM();
        bloco = new BlocoM();
        piso = new PisoM();
        
        initComponents();
        this.setVisible(true); 
        atualizaBoxUnidade();
        atualizaTabelaSala();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sprSala = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblUnidade = new javax.swing.JLabel();
        lblBloco = new javax.swing.JLabel();
        lblPiso = new javax.swing.JLabel();
        cbxUnidade = new javax.swing.JComboBox<>();
        cbxBloco = new javax.swing.JComboBox<>();
        cbxPiso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbeSala = new javax.swing.JTable();
        lblFiltros = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbeEsperados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbeReais = new javax.swing.JTable();
        tfdCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAchei = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        sprSala.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblUnidade.setText("Unidade");

        lblBloco.setText("Bloco");

        lblPiso.setText("Piso");

        cbxUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUnidadeActionPerformed(evt);
            }
        });

        cbxBloco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxBloco.setPreferredSize(new java.awt.Dimension(56, 27));
        cbxBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBlocoActionPerformed(evt);
            }
        });

        cbxPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxPiso.setPreferredSize(new java.awt.Dimension(56, 27));
        cbxPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPisoActionPerformed(evt);
            }
        });

        tbeSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ));
        tbeSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeSalaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeSala);

        lblFiltros.setText("Filtros");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Iniciar Inventario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Limpar Filtro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPiso)
                                    .addComponent(lblUnidade)
                                    .addComponent(lblBloco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxBloco, javax.swing.GroupLayout.Alignment.LEADING, 0, 280, Short.MAX_VALUE)
                                    .addComponent(cbxUnidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPiso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFiltros)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFiltros))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidade)
                    .addComponent(cbxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBloco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPiso)
                    .addComponent(cbxPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton4))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbeEsperados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbeEsperados);

        tbeReais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbeReais);

        jButton1.setText("Encontrei!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAchei.setText("Ta Aqui!!");
        btnAchei.setEnabled(false);
        btnAchei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcheiActionPerformed(evt);
            }
        });

        jButton3.setText("Finalizar Sala");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprSala, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnAchei)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprSala)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAchei)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void atualizaTabelaSala() {
        try {
            listaSala = salaDAO.listaTodosInventario();
        } catch (SQLException ex) {
            Logger.getLogger(OrgaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
       Object dados[][] = new String[listaSala.size()][5];
        int i = 0;
        for (SalaM sal : listaSala) {
            dados[i][0] = String.valueOf(sal.getId());
            dados[i][1] = sal.getDescricao();
            dados[i][2] = sal.getPiso().getDescricao();
            dados[i][3] = sal.getPiso().getBloco().getDescricao();
            if(sal.getInventario() == 0)
                dados[i][4] = "A Fazer";
            else if(sal.getInventario() == -1)
                dados[i][4] = "Incompleto";
            else 
                dados[i][4] = "Completo";
            i++;          
        }
        
        
        
        String tituloColuna[] = {"ID","Nome", "Piso", "Bloco","Inventario"};
        
        tbeSala.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tbeSala.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbeSala.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbeSala.getColumnModel().getColumn(2).setPreferredWidth(80);
        tbeSala.getColumnModel().getColumn(3).setPreferredWidth(80);
        tbeSala.getColumnModel().getColumn(4).setPreferredWidth(80);
        
         
        tbeSala.setDefaultRenderer(Object.class, new ColorirSala());
        /*DefaultTableCellRenderer centralizado = new ColorirGreen();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeSala.getColumnModel().getColumn(0).setCellRenderer(centralizado);*/
        
        
        
        tbeSala.setRowHeight(25);
        tbeSala.updateUI();
    }
    
    public void atualizaBoxUnidade() {
        cbxUnidade.removeAllItems();
        cbxUnidade.addItem("--Selecione--");
        try {
            listaUnidade = unidadeDAO.listaTodos();
        } catch (SQLException ex) {
            Logger.getLogger(OrgaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dados[][] = new String[listaUnidade.size()][5];
        int i = 0;
        for (UnidadeM uni : listaUnidade) {
            cbxUnidade.addItem(uni.getNome());
        }

    }
    
    private void cbxUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUnidadeActionPerformed

        if (cbxUnidade.getSelectedIndex() < 1) {
            cbxBloco.removeAllItems();
            cbxBloco.addItem("--Selecione--");

        } else {
            cbxBloco.removeAllItems();
            cbxBloco.addItem("--Selecione--");
            //UnidadeM unid = new UnidadeM();
            try {
                unidade = unidadeDAO.buscaNome(cbxUnidade.getSelectedItem().toString());
                listaBloco = blocoDAO.buscaUni(unidade.getId());
                for (BlocoM bloc : listaBloco) {
                    cbxBloco.addItem(bloc.getDescricao());
                }
            } catch (SQLException ex) {
                Logger.getLogger(PisoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_cbxUnidadeActionPerformed

    private void cbxBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBlocoActionPerformed
 if (cbxBloco.getSelectedIndex() < 1) {
            cbxPiso.removeAllItems();
            cbxPiso.addItem("--Selecione--");
        } else {
            cbxPiso.removeAllItems();
            cbxPiso.addItem("--Selecione--");

            try {
                //bloc = blocoDAO.buscaNome(cbxBloco.getSelectedItem().toString());
                bloco = blocoDAO.busca_id_unidade(unidade.getId(), cbxBloco.getSelectedItem().toString());
                listaPiso = pisoDAO.buscaBloc(bloco.getId());
                for (PisoM pis : listaPiso) {
                    cbxPiso.addItem(pis.getDescricao());
                }
            } catch (SQLException ex) {
                cbxPiso.removeAllItems();
                cbxPiso.addItem("--Selecione--");
            }
        }

    }//GEN-LAST:event_cbxBlocoActionPerformed

    private void cbxPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPisoActionPerformed

    }//GEN-LAST:event_cbxPisoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (cbxUnidade.getSelectedIndex() == 0 || cbxBloco.getSelectedIndex() == 0 || cbxPiso.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(null, "Prencha todos os campos.", "Erro", JOptionPane.WARNING_MESSAGE);       
         }else{
         try {
             unidade = unidadeDAO.buscaNome(cbxUnidade.getSelectedItem().toString());//pega a unidade selecionada
             bloco = blocoDAO.busca_id_unidade(unidade.getId(), cbxBloco.getSelectedItem().toString());// todos os blocos da unidade de cima
             piso = pisoDAO.busca_id_bloco(bloco.getId(), cbxPiso.getSelectedItem().toString());//todos os pisos da unidade de cima
         } catch (SQLException ex) {
             Logger.getLogger(RelatorioSalaView.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Selecione um piso para a busca.", "Erro", JOptionPane.WARNING_MESSAGE);
         }
         atualizaTabelaSala(piso.getId(),bloco.getId(),unidade.getId());
         }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbeSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeSalaMouseClicked
        numeroSala = Integer.parseInt(tbeSala.getValueAt(tbeSala.getSelectedRow(), 0).toString());
        atualizaTabelaPatrimoniosEsperados();
        atualizaTabelaPatrimonioReais();
        btnAchei.setEnabled(true);
    }//GEN-LAST:event_tbeSalaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(numeroSala != -1 ){
            try { 

                if(!tfdCodigo.getText().equals("S/P.") && !tfdCodigo.getText().equals("S/P") &&!tfdCodigo.getText().equals("s/p") && !tfdCodigo.getText().equals("s/p.") && !tfdCodigo.getText().equals("S/ P.") ){
                    PatrimonioDAO.patrimonioInventariado(tfdCodigo.getText(),numeroSala);
                    atualizaTabelaPatrimonioReais();
                    atualizaTabelaPatrimoniosEsperados();
                }else{
                    JOptionPane.showMessageDialog(null, "Por Favor, informe um codigo que nao seja 'S/P.'!");
                }

            } catch (SQLException ex) {
                Logger.getLogger(InventarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, Selecione uma sala!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAcheiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcheiActionPerformed
        if(tbeEsperados.getSelectedRowCount() > 0){
            try {
                PatrimonioDAO.inventarioTaAqui(Integer.parseInt(tbeEsperados.getValueAt(tbeEsperados.getSelectedRow(), 0).toString()));
                atualizaTabelaPatrimonioReais();
                atualizaTabelaPatrimoniosEsperados();
            } catch (SQLException ex) {
                Logger.getLogger(InventarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Patrimonio por favor!");
        }
        
    }//GEN-LAST:event_btnAcheiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Você deseja iniciar o Inventario?") == 0){
            if(JOptionPane.showConfirmDialog(null, "Todas as informações de inventario serão perdidas. Deseja continuar?") == 0){
                try {
                    SalaDAO.iniciaInventario();
                    PatrimonioDAO.iniciaInventario();
                    atualizaTabelaSala();
                } catch (SQLException ex) {
                    Logger.getLogger(InventarioView.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Probelma ao iniciar Inventario:\n"+ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SalaDAO sala = new SalaDAO();
        try {
            if(JOptionPane.showConfirmDialog(null, "Deseja finalizar Sala:\n"
                    +"\nUnidade: "+sala.busca(numeroSala).getPiso().getBloco().getUnidadeM().getNome()
                    + "\nBloco: "+sala.busca(numeroSala).getPiso().getBloco().getDescricao()
                    + "\nPiso: "+sala.busca(numeroSala).getPiso().getDescricao()
                    + "\nSala: "+sala.busca(numeroSala).getDescricao()) == 0){
                if(listaPatrimonioEsperados.isEmpty() ){
                    try {
                        SalaDAO.finalizaSala(numeroSala, 1);
                        atualizaTabelaSala();
                        atualizaTabelaPatrimoniosEsperados();
                    } catch (SQLException ex) {
                        Logger.getLogger(InventarioView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    try {
                        SalaDAO.finalizaSala(numeroSala, -1);
                        PatrimonioDAO.inventarioNaoEncontrados(listaPatrimonioEsperados);
                        atualizaTabelaSala();
                    } catch (SQLException ex) {
                        Logger.getLogger(InventarioView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        atualizaTabelaSala();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void atualizaTabelaPatrimonioReais(){
        try {
            listaPatrimonioReais = patrimonioDAO.listaPatrimonioReais(numeroSala);
        } catch (SQLException ex) {
            Logger.getLogger(InventarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Object dados[][] = new String[listaPatrimonioReais.size()][4];
        int i = 0;
        for (PatrimonioM pat : listaPatrimonioReais) {
            dados[i][0] = ""+pat.getId();
            dados[i][1] = pat.getCodigo();
            dados[i][2] = pat.getDescricao();
            dados[i][3] = "Encontrado";
            i++;
        }
        String tituloColuna[] = {"ID","Codigo", "Descrição","Inventario"};
        DefaultTableModel tabelaCliente = new DefaultTableModel();
        tabelaCliente.setDataVector(dados, tituloColuna);
        tbeReais.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        
        tbeReais.setDefaultRenderer(Object.class, new ColorirReais());
        
        tbeReais.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbeReais.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbeReais.getColumnModel().getColumn(2).setPreferredWidth(250);
        
        tbeReais.setRowHeight(25);
        tbeReais.updateUI();
    }
    
    public void atualizaTabelaPatrimoniosEsperados(){
        try {
            listaPatrimonioEsperados = patrimonioDAO.listaPatrimonioEsperados(numeroSala);
        } catch (SQLException ex) {
            Logger.getLogger(InventarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
         Object dados[][] = new String[listaPatrimonioEsperados.size()][4];
        int i = 0;
        for (PatrimonioM pat : listaPatrimonioEsperados) {
            dados[i][0] = ""+pat.getId();
            dados[i][1] = pat.getCodigo();
            dados[i][2] = pat.getDescricao();
            if(pat.getInventario() == 0)
                dados[i][3] = "A Encontrar";
            else
                dados[i][3] = "Perdido";
            i++;
        }
        String tituloColuna[] = {"ID","Codigo", "Descrição","Inventario"};
        DefaultTableModel tabelaCliente = new DefaultTableModel();
        tabelaCliente.setDataVector(dados, tituloColuna);
        tbeEsperados.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        
        
                
        
        
        tbeEsperados.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbeEsperados.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbeEsperados.getColumnModel().getColumn(2).setPreferredWidth(250);
        
        tbeEsperados.setDefaultRenderer(Object.class, new ColorirEsperados());
        
        tbeEsperados.setRowHeight(25);
        tbeEsperados.updateUI();
    
    }
    
    public void atualizaTabelaSala(int id_piso, int id_bloco, int id_unidade) {
        try {
            listaSala = salaDAO.listaBuscaInventario(id_piso, id_bloco, id_unidade);
        } catch (SQLException ex) {
            Logger.getLogger(OrgaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object dados[][] = new String[listaSala.size()][5];
        int i = 0;
        for (SalaM sal : listaSala) {
            dados[i][0] = String.valueOf(sal.getId());
            dados[i][1] = sal.getDescricao();
            dados[i][2] = sal.getPiso().getDescricao();
            dados[i][3] = sal.getPiso().getBloco().getDescricao();
            dados[i][4] = String.valueOf(sal.getInventario());
            i++;           
        }
        
        String tituloColuna[] = {"ID","Nome", "Piso Pertencente", "Bloco Pertencente","Inventario"};
        DefaultTableModel tabelaCliente = new DefaultTableModel();
        tabelaCliente.setDataVector(dados, tituloColuna);
        tbeSala.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tbeSala.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbeSala.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbeSala.getColumnModel().getColumn(2).setPreferredWidth(80);
        tbeSala.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        //TableCellRenderer renderer = new Colorir();
        //tbeSala.setDefaultRenderer(Object.class, renderer);
        
        /*DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeSala.getColumnModel().getColumn(0).setCellRenderer(centralizado);*/
        tbeSala.setRowHeight(25);
        tbeSala.updateUI();
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAchei;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbxBloco;
    private javax.swing.JComboBox<String> cbxPiso;
    private javax.swing.JComboBox<String> cbxUnidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBloco;
    private javax.swing.JLabel lblFiltros;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JSeparator sprSala;
    private javax.swing.JTable tbeEsperados;
    private javax.swing.JTable tbeReais;
    private javax.swing.JTable tbeSala;
    private javax.swing.JTextField tfdCodigo;
    // End of variables declaration//GEN-END:variables
}

