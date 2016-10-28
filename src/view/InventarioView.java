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
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.BlocoM;
import model.PatrimonioM;
import model.PisoM;
import model.SalaM;
import model.UnidadeM;

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
    List<PatrimonioM> listaPatrimonio;
    
    UnidadeM unidade;
    BlocoM bloco;
    PisoM piso;
    
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
        listaPatrimonio = new ArrayList<>();
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tbeEsperados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbeReais = new javax.swing.JTable();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPiso)
                            .addComponent(lblUnidade)
                            .addComponent(lblBloco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxBloco, javax.swing.GroupLayout.Alignment.LEADING, 0, 280, Short.MAX_VALUE)
                            .addComponent(cbxUnidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPiso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 158, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFiltros)
                                .addGap(146, 146, 146))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFiltros)
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
                .addComponent(btnBuscar)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprSala, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprSala)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaTabelaSala() {
        try {
            listaSala = salaDAO.listaTodos();
        } catch (SQLException ex) {
            Logger.getLogger(OrgaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
       String dados[][] = new String[listaSala.size()][4];
        int i = 0;
        for (SalaM sal : listaSala) {
            dados[i][0] = String.valueOf(sal.getId());
            dados[i][1] = sal.getDescricao();
            dados[i][2] = sal.getPiso().getDescricao();
            dados[i][3] = sal.getPiso().getBloco().getDescricao();
            i++;          
        }
        
        String tituloColuna[] = {"ID","Nome", "Piso Pertencente", "Bloco Pertencente"};
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
        
        TableCellRenderer renderer = new EvenOddRenderer();
        tbeSala.setDefaultRenderer(Object.class, renderer);
        
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeSala.getColumnModel().getColumn(0).setCellRenderer(centralizado);
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
        int numeroSala = Integer.parseInt(tbeSala.getValueAt(tbeSala.getSelectedRow(), 0).toString());
        try {
            listaPatrimonio = patrimonioDAO.listaTodosSala(numeroSala);
            
            atualizaTabelaPatrimoniosEsperados();
        } catch (SQLException ex) {
            Logger.getLogger(InventarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbeSalaMouseClicked

    public void atualizaTabelaPatrimoniosEsperados(){
         String dados[][] = new String[listaPatrimonio.size()][2];
        int i = 0;
        for (PatrimonioM pat : listaPatrimonio) {
            dados[i][0] = pat.getCodigo();
            dados[i][1] = pat.getDescricao();
            i++;
        }
        String tituloColuna[] = {"Codigo", "Descrição"};
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
        
        
        tbeEsperados.getColumnModel().getColumn(0).setPreferredWidth(80);
        tbeEsperados.getColumnModel().getColumn(1).setPreferredWidth(250);
        
        tbeEsperados.setRowHeight(25);
        tbeEsperados.updateUI();
    
    }
    
    public void atualizaTabelaSala(int id_piso, int id_bloco, int id_unidade) {
        try {
            listaSala = salaDAO.listaSelecionados(id_piso, id_bloco, id_unidade);
        } catch (SQLException ex) {
            Logger.getLogger(OrgaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dados[][] = new String[listaSala.size()][4];
        int i = 0;
        for (SalaM sal : listaSala) {
            dados[i][0] = String.valueOf(sal.getId());
            dados[i][1] = sal.getDescricao();
            dados[i][2] = sal.getPiso().getDescricao();
            dados[i][3] = sal.getPiso().getBloco().getDescricao();
            i++;           
        }
        
        String tituloColuna[] = {"ID","Nome", "Piso Pertencente", "Bloco Pertencente"};
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
        
        TableCellRenderer renderer = new EvenOddRenderer();
        tbeSala.setDefaultRenderer(Object.class, renderer);
        
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeSala.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbeSala.setRowHeight(25);
        tbeSala.updateUI();
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbxBloco;
    private javax.swing.JComboBox<String> cbxPiso;
    private javax.swing.JComboBox<String> cbxUnidade;
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
    // End of variables declaration//GEN-END:variables
}
class EvenOddRenderer implements TableCellRenderer {

  public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {
    Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
        table, value, isSelected, hasFocus, row, column);
    ((JLabel) renderer).setOpaque(true);
    Color foreground, background;
    
    if (isSelected) {
      foreground = Color.BLACK;
      background = Color.LIGHT_GRAY;
    }else if (row <= 5) {
        foreground = Color.BLACK;
        Color c = new Color(0,255, 0);
        background = c;
      } else if(row <= 10){
        foreground = Color.white;
        Color c = new Color(255, 250, 0);
        foreground = Color.BLACK;
        background = c;
        
      }else{
          background = Color.white;
          foreground = Color.black;
      }
    
    renderer.setForeground(foreground);
    renderer.setBackground(background);
    return renderer;
  }
}
