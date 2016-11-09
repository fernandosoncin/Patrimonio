/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.BaixadoDAO;
import dao.BlocoDAO;
import dao.GrauConservacaoDAO;
import dao.OrgaoDAO;
import dao.PatrimonioDAO;
import dao.PisoDAO;
import dao.SubTipoDAO;
import dao.TipoDAO;
import dao.UnidadeDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.BaixadoM;
import model.BlocoM;
import model.GrauConservacaoM;
import model.OrgaoM;
import model.PatrimonioM;
import model.PisoM;
import model.SubTipoM;
import model.TipoM;
import model.UnidadeM;

/**
 *
 * @author Leopo
 */
public class BaixadoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form BaixadoView
     */
    List<PatrimonioM> listaPatrimonio;
    List<BaixadoM> listaBaixado;
    List<UnidadeM> listaUnidade;
    UnidadeDAO unidadeDAO;
    List<BlocoM> listaBloco;
    BlocoDAO blocoDAO;
    List<PisoM> listaPiso;
    PisoDAO pisoDAO;
    UnidadeM unidadeM;
    BlocoM blocoM;
    PisoM pisoM;
    OrgaoM orgao;
    OrgaoDAO orgaoDAO;
    GrauConservacaoM conservacao;
    GrauConservacaoDAO conservacaoDAO;
    TipoM tipo;
    TipoDAO tipoDAO;
    SubTipoM subtipo;
    SubTipoDAO subtipoDAO;
    BaixadoDAO baixadoDAO;
    
    int inicio = 0, quantMax, pagAtual, pagUltima;
    int cont = 0;
    int ultimoID;
    
    PatrimonioDAO patrimonioDAO;
    
    public BaixadoView() throws SQLException {
        
        initComponents();
        
        baixadoDAO = new BaixadoDAO();
        this.setVisible(true);
        patrimonioDAO = new PatrimonioDAO();
        listaPatrimonio = new ArrayList<>();
        listaBaixado = new ArrayList<>();
        listaUnidade = new ArrayList<>();
        unidadeDAO = new UnidadeDAO();
        listaBloco = new ArrayList<>();
        blocoDAO = new BlocoDAO();
        listaPiso = new ArrayList<>();
        pisoDAO = new PisoDAO();
        orgaoDAO = new OrgaoDAO();
        conservacaoDAO = new GrauConservacaoDAO();
        tipoDAO = new TipoDAO();
        tipo = new TipoM();
        subtipo = new SubTipoM();
        subtipoDAO = new SubTipoDAO();
        
        preencheFiltro();
        atualizaTabelaBaixado(inicio);
        validaQuantidade();    
    }
    //METODO PARA PREENCHER AS OPÇÕES DO COMBO BOX
     public void preencheFiltro(){
        cbxFiltro.removeAllItems();
        cbxFiltro.addItem("--Selecione--");      
        cbxFiltro.addItem("Codigo");
        cbxFiltro.addItem("Descrição");
        cbxFiltro.addItem("Conservação");
        cbxFiltro.addItem("Subtipo");
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
        tbeBusca = new javax.swing.JTable();
        cbxFiltro = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        tfdFiltroBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        lblQuantPaginas = new javax.swing.JLabel();
        tfdNavegacao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        tbeBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Data", "Usuario??"
            }
        ));
        jScrollPane1.setViewportView(tbeBusca);

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiltroActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(65, 26));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtro");

        btnAnterior.setText("<<");
        btnAnterior.setEnabled(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        lblQuantPaginas.setText("quant de paginas");

        tfdNavegacao.setPreferredSize(new java.awt.Dimension(6, 23));

        jLabel3.setText("Ir para:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdFiltroBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 388, Short.MAX_VALUE)
                        .addComponent(btnAnterior)
                        .addGap(4, 4, 4)
                        .addComponent(lblQuantPaginas)
                        .addGap(4, 4, 4)
                        .addComponent(btnProximo)
                        .addGap(291, 291, 291)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdFiltroBusca)
                    .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(lblQuantPaginas)
                    .addComponent(tfdNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFiltroActionPerformed

    }//GEN-LAST:event_cbxFiltroActionPerformed
//METODO PARA ATUALIZAR A TABELA BUSCA
     public void atualizaTabelaBusca(){
        String dados[][] = new String[listaBaixado.size()][8];
        int i = 0;
        for (BaixadoM bai : listaBaixado) {
            dados[i][0] = String.valueOf(bai.getId());
            dados[i][1] = bai.getDescricao();
            dados[i][2] = bai.getCodigo();
            dados[i][3] = bai.getSubTipo().getDescricao();
            dados[i][4] = bai.getGrau_conservacao().getDescricao();
            dados[i][5] = bai.getNotaFiscal();
            dados[i][6] = bai.getEntidade().getNome();            
            i++;          
        }
        
        String tituloColuna[] = {"ID", "Descricâo", "Código", "Subtipo", "Grau de Conservação", "Nota Fiscal", "Orgão"};
        DefaultTableModel tabelaCliente = new DefaultTableModel();
        tabelaCliente.setDataVector(dados, tituloColuna);
        tbeBusca.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        //COMANDOS PARA SETAR O TAMANHO DOS CAMPOS DA TABELA
        tbeBusca.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbeBusca.getColumnModel().getColumn(1).setPreferredWidth(90);
        tbeBusca.getColumnModel().getColumn(2).setPreferredWidth(215);
        tbeBusca.getColumnModel().getColumn(3).setPreferredWidth(90);
        tbeBusca.getColumnModel().getColumn(4).setPreferredWidth(215);
        tbeBusca.getColumnModel().getColumn(5).setPreferredWidth(90);
        tbeBusca.getColumnModel().getColumn(6).setPreferredWidth(90);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeBusca.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbeBusca.setRowHeight(25);
        tbeBusca.updateUI();
    } 
     //METODO PARRA ATUALIZAR A TABELA DE PATRIMONIOS BAIXADOS SETANDO APENAS 100 ELEMENTOS
     //PERCORRE 100 APARTIR DO INICIO
     public void atualizaTabelaBaixado(int inicio) {

        try {
            listaBaixado = baixadoDAO.lista100(inicio);
        } catch (SQLException ex) {
            Logger.getLogger(OrgaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dados[][] = new String[listaBaixado.size()][8];
        int i = 0;
        for (BaixadoM bai : listaBaixado) {
            dados[i][0] = String.valueOf(bai.getId());
            dados[i][1] = bai.getDescricao();
            dados[i][2] = bai.getCodigo();
            dados[i][3] = bai.getSubTipo().getDescricao();
            dados[i][4] = bai.getGrau_conservacao().getDescricao();
            dados[i][5] = bai.getNotaFiscal();
            dados[i][6] = bai.getEntidade().getNome();            
            i++;          
        }
        
        String tituloColuna[] = {"ID", "Descricâo", "Código", "Subtipo", "Grau de Conservação", "Nota Fiscal", "Orgão"};
        DefaultTableModel tabelaCliente = new DefaultTableModel();
        tabelaCliente.setDataVector(dados, tituloColuna);
        tbeBusca.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        tbeBusca.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbeBusca.getColumnModel().getColumn(1).setPreferredWidth(90);
        tbeBusca.getColumnModel().getColumn(2).setPreferredWidth(215);
        tbeBusca.getColumnModel().getColumn(3).setPreferredWidth(90);
        tbeBusca.getColumnModel().getColumn(4).setPreferredWidth(215);
        tbeBusca.getColumnModel().getColumn(5).setPreferredWidth(90);
        tbeBusca.getColumnModel().getColumn(6).setPreferredWidth(90);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeBusca.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbeBusca.setRowHeight(25);
        tbeBusca.updateUI();
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        inicio = 0;
        btnAnterior.setEnabled(true);
        btnAnterior.setEnabled(false);
        
        if(tfdFiltroBusca.getText().equals("") || cbxFiltro.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Selecione um Filtro!!");
        }else{

            try {                  
                    //SELECIONADO CODIGO
                if(cbxFiltro.getSelectedItem().toString().equals("Codigo")) {
                    listaBaixado = null;                   
                    // LISTA UMA BUSCA DE 100 ELEMENTOS 
                    listaBaixado = baixadoDAO.buscaPatrimonio100(tfdFiltroBusca.getText(), inicio);
                    //SETA O LBL DE QUANTIDADE DE PAGINAS, BUSCA ESTA INFO NO BANCO
                    validaQuantidadeBuscaCodigo();
                    
                    cont = 1;
                    if(listaBaixado.size() < 1){
                           JOptionPane.showMessageDialog(null, "Código não Encontrado");
                           btnAnterior.setEnabled(false);
                           btnAnterior.setEnabled(false);
                           lblQuantPaginas.setText("0/0");
                    }                   
                }else
                    //FEITO
                if(cbxFiltro.getSelectedItem().toString().equals("Descrição")){
                    listaBaixado = null;                   
                    listaBaixado = baixadoDAO.buscaDescricao100(tfdFiltroBusca.getText(), inicio);
                    validaQuantidadeBuscaDescricao();
                    cont = 2;
                    if(listaBaixado.size() < 1){
                           JOptionPane.showMessageDialog(null, "Descrição não Encontrada");
                           btnAnterior.setEnabled(false);
                           btnAnterior.setEnabled(false);
                           lblQuantPaginas.setText("0/0");
                    }
                }else
                //FEITO
                if(cbxFiltro.getSelectedItem().toString().equals("Orgão")){
                    listaBaixado = null;
                    try{
                        //BUSCA UM ORGAO APARTIR DO NOME, UTILIZA-SE O ID DESTE ORGAO NA CHAMADA DE METODO ABAIXO
                        orgao = orgaoDAO.buscaNome(tfdFiltroBusca.getText());                                               
                        listaBaixado = baixadoDAO.buscaOrgao100(orgao.getId(),inicio);
                        
                        validaQuantidadeBuscaOrgao();
                        cont = 3;       
                        
                    }catch(java.lang.NullPointerException ex){
                        JOptionPane.showMessageDialog(null, "Digite um orgão valido!" );
                        btnAnterior.setEnabled(false);
                        btnAnterior.setEnabled(false);
                        lblQuantPaginas.setText("0/0");
                    }
                }else
                //FEITO
                if(cbxFiltro.getSelectedItem().toString().equals("Conservação")){
                    listaBaixado = null;
                    try{
                            conservacao = conservacaoDAO.buscaNome(tfdFiltroBusca.getText());
                            listaBaixado = baixadoDAO.buscaConservacao100(conservacao.getId(),inicio);
                            
                            validaQuantidadeBuscaConservacao();
                            
                            cont = 4;
                     }catch(java.lang.NullPointerException ex){
                        JOptionPane.showMessageDialog(null, "Conservação não Encontrada" );
                    }                    
                    if(listaBaixado.size() < 1){
                           JOptionPane.showMessageDialog(null, "Conservação não Encontrada");
                            btnAnterior.setEnabled(false);
                            btnAnterior.setEnabled(false);
                            lblQuantPaginas.setText("0/0");
                    }
                }else
                    
                if(cbxFiltro.getSelectedItem().toString().equals("Subtipo")){
                    try{
                        subtipo = subtipoDAO.buscaNome(tfdFiltroBusca.getText());
                        listaBaixado = baixadoDAO.buscaSubtipo100(subtipo.getId(),inicio);
                        validaQuantidadeBuscaSubtipo();
                        cont = 5;
                     }catch(java.lang.NullPointerException ex){
                        JOptionPane.showMessageDialog(null, "Digite um SubTipo valido!" );
                    }
                    if(listaBaixado.size() < 1){
                           JOptionPane.showMessageDialog(null, "Conservação não Encontrada");
                            btnAnterior.setEnabled(false);
                            btnAnterior.setEnabled(false);
                            lblQuantPaginas.setText("0/0");
                    }
                }

                
                    atualizaTabelaBusca();
                

            } catch (SQLException ex) {
                Logger.getLogger(ConsultaView.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ""+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        switch (cont) {
            case 0:
                //ATUALIZA A TABELA SEM NENHUM FILTRO
            anteriorNormal();
            atualizaTabelaBusca();
            break;
            case 1:
                //ATUALIZA A TABELA PELA BUSCA DE PATRIMONIO
            anteriorBuscaPatrimonio();
            atualizaTabelaBusca();
            break;
            case 2:
                //ATUALIZA A TABELA PELA BUSCA DE DESCRIÇÃO
            anteriorBuscaDescricao();
            atualizaTabelaBusca();
            break;
            case 3:
                //ATUALIZA A TABELA PELA BUSCA DE ORGÃO
            anteriorBuscaOrgao();
            atualizaTabelaBusca(); 
            break;
            case 4:
                //ATUALIZA A TABELA PELA BUSCA DE CONCERVAÇÃO
            anteriorBuscaConservacao();
            atualizaTabelaBusca();
            break;
            case 5:
                //ATUALIZA A TABELA PELA BUSCA DE SUBTIPO
            anteriorBuscaSubtipo();
            atualizaTabelaBusca(); 
            break;
            default:
            break;
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed
//METODOS DO BOTAO ANTERIOR
    public void anteriorNormal(){
        inicio -=100;
        atualizaTabelaBaixado(inicio);
        btnProximo.setEnabled(true);
        pagAtual--;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio==0){
            btnAnterior.setEnabled(false);
        }
    }
    public void anteriorBuscaPatrimonio(){
        inicio -=100;
        try {
            listaBaixado = baixadoDAO.buscaPatrimonio100(tfdFiltroBusca.getText(), inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnProximo.setEnabled(true);
        pagAtual--;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio==0){
            btnAnterior.setEnabled(false);
        }
    }
    public void anteriorBuscaDescricao(){
        inicio -=100;
        try {
            listaBaixado = baixadoDAO.buscaDescricao100(tfdFiltroBusca.getText(), inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnProximo.setEnabled(true);
        pagAtual--;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio==0){
            btnAnterior.setEnabled(false);
        }
    }
    
    public void anteriorBuscaOrgao(){
        inicio -=100;
        try {
           orgao = orgaoDAO.buscaNome(tfdFiltroBusca.getText());                       
           listaBaixado = baixadoDAO.buscaOrgao100(orgao.getId(),inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnProximo.setEnabled(true);
        pagAtual--;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio==0){
            btnAnterior.setEnabled(false);
        }
    }
    public void anteriorBuscaConservacao(){
        inicio -=100;
        try {
           conservacao = conservacaoDAO.buscaNome(tfdFiltroBusca.getText());
           listaBaixado = baixadoDAO.buscaConservacao100(conservacao.getId(),inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnProximo.setEnabled(true);
        pagAtual--;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio==0){
            btnAnterior.setEnabled(false);
        }
    }
     public void anteriorBuscaSubtipo(){
        inicio -=100;
        try {
           subtipo = subtipoDAO.buscaNome(tfdFiltroBusca.getText());
            listaBaixado = baixadoDAO.buscaSubtipo100(subtipo.getId(),inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnProximo.setEnabled(true);
        pagAtual--;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio==0){
            btnAnterior.setEnabled(false);
        }
    }
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
       switch (cont) {
            case 0:
            proximoNormal();
            atualizaTabelaBusca();
            break;
            case 1:
            proximoBuscaPatrimonio();
            atualizaTabelaBusca();
            break;
            case 2:
            proximoBuscaDescricao();
            atualizaTabelaBusca(); 
            break;
            case 3:
            proximoBuscaOrgao();
            atualizaTabelaBusca();
            break;
            case 4:
            proximoBuscaConservacao();
            atualizaTabelaBusca();
            break;
            case 5:
            proximoBuscaSubtipo();
            atualizaTabelaBusca();
            break;
            default:
            break;
        }
    }//GEN-LAST:event_btnProximoActionPerformed
//METODOS BOTAO BUSCA PROXIMO
    public void proximoNormal(){
        inicio+=100;
        atualizaTabelaBaixado(inicio);
        btnAnterior.setEnabled(true);
        pagAtual++;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio>=(quantMax-100)){
            btnProximo.setEnabled(false);
        }
    }
    public void proximoBuscaPatrimonio(){
        inicio+=100;
        try {
            listaBaixado = baixadoDAO.buscaPatrimonio100(tfdFiltroBusca.getText(), inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnAnterior.setEnabled(true);
        pagAtual++;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio>=(quantMax-100)){
            btnProximo.setEnabled(false);
        }
    }
    public void proximoBuscaDescricao(){
        inicio+=100;
        try {
            listaBaixado = baixadoDAO.buscaDescricao100(tfdFiltroBusca.getText(), inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnAnterior.setEnabled(true);
        pagAtual++;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio>=(quantMax-100)){
            btnProximo.setEnabled(false);
        }
    }
    
    public void proximoBuscaOrgao(){
        inicio+=100;
        try {
           orgao = orgaoDAO.buscaNome(tfdFiltroBusca.getText());                       
           listaBaixado = baixadoDAO.buscaOrgao100(orgao.getId(),inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnAnterior.setEnabled(true);
        pagAtual++;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio>=(quantMax-100)){
            btnProximo.setEnabled(false);
        }
    }
    public void proximoBuscaConservacao(){
        inicio+=100;
        try {
           conservacao = conservacaoDAO.buscaNome(tfdFiltroBusca.getText());
           listaBaixado = baixadoDAO.buscaConservacao100(conservacao.getId(),inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnAnterior.setEnabled(true);
        pagAtual++;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio>=(quantMax-100)){
            btnProximo.setEnabled(false);
        }
    }
    public void proximoBuscaSubtipo(){
        inicio+=100;
        try {
           subtipo = subtipoDAO.buscaNome(tfdFiltroBusca.getText());
            listaBaixado = baixadoDAO.buscaSubtipo100(subtipo.getId(),inicio);
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnAnterior.setEnabled(true);
        pagAtual++;
        lblQuantPaginas.setText(pagAtual+"/"+pagUltima);
        if(inicio>=(quantMax-100)){
            btnProximo.setEnabled(false);
        }
    }
    


//Metodos de validar quantidade, 
//ESTES METODOS BUSCAM NO BANCO A QUANTIDADE DE RESULTADOS PARA CADA CASO E SETA A LABEL DE QUANTIDADE DE PAGINAS
    public void validaQuantidade() throws SQLException{
        this.quantMax = baixadoDAO.quantidade();
        
        pagAtual = 1;
        
        if(quantMax % 100 == 0){
             pagUltima = quantMax / 100;
        }else if(quantMax <= 100){
            pagUltima = 1;
            btnProximo.setEnabled(false);
        }else{
             pagUltima = (quantMax / 100) + 1;
        }
        
        lblQuantPaginas.setText(pagAtual + "/" + pagUltima);
        
    }
    public void validaQuantidadeBuscaDescricao() throws SQLException{
        this.quantMax = baixadoDAO.quantidadeDescricao(tfdFiltroBusca.getText());
        
        pagAtual = 1;
        
        if(quantMax % 100 == 0){
             pagUltima = quantMax / 100;
        }else if(quantMax <= 100){
            pagUltima = 1;
            btnProximo.setEnabled(false);
        }else{
             pagUltima = (quantMax / 100) + 1;
        }
        
        lblQuantPaginas.setText(pagAtual + "/" + pagUltima);
    }
    public void validaQuantidadeBuscaConservacao() throws SQLException{
        conservacao = conservacaoDAO.buscaNome(tfdFiltroBusca.getText());                          
        this.quantMax = baixadoDAO.quantidadeConservacao(conservacao.getId());
        
        pagAtual = 1;
        
        if(quantMax % 100 == 0){
             pagUltima = quantMax / 100;
        }else if(quantMax <= 100){
            pagUltima = 1;
            btnProximo.setEnabled(false);
        }else{
             pagUltima = (quantMax / 100) + 1;
        }
        
        lblQuantPaginas.setText(pagAtual + "/" + pagUltima);
        
    }
    public void validaQuantidadeBuscaSubtipo() throws SQLException{
         subtipo = subtipoDAO.buscaNome(tfdFiltroBusca.getText());
                                         
        this.quantMax = baixadoDAO.quantidadeSubtipo(subtipo.getId()); 
        
        pagAtual = 1;
        
        if(quantMax % 100 == 0){
             pagUltima = quantMax / 100;
        }else if(quantMax <= 100){
            pagUltima = 1;
            btnProximo.setEnabled(false);
        }else{
             pagUltima = (quantMax / 100) + 1;
        }
        
        lblQuantPaginas.setText(pagAtual + "/" + pagUltima);
        
    }
    public void validaQuantidadeBuscaOrgao() throws SQLException{
        
        orgao = orgaoDAO.buscaNome(tfdFiltroBusca.getText());
        this.quantMax = baixadoDAO.quantidadeOrgao(orgao.getId());
        
        pagAtual = 1;
        
        if(quantMax % 100 == 0){
             pagUltima = quantMax / 100;
        }else if(quantMax <= 100){
            pagUltima = 1;
            btnProximo.setEnabled(false);
        }else{
             pagUltima = (quantMax / 100) + 1;
        }
        
        lblQuantPaginas.setText(pagAtual + "/" + pagUltima);
        
    }
     public void validaQuantidadeBuscaCodigo() throws SQLException{
        this.quantMax = baixadoDAO.quantidadeCodigo(tfdFiltroBusca.getText());
        
        pagAtual = 1;
        
        if(quantMax % 100 == 0){
             pagUltima = quantMax / 100;
        }else if(quantMax <= 100){
            pagUltima = 1;
            btnProximo.setEnabled(false);
        }else{
             pagUltima = (quantMax / 100) + 1;
        }
        
        lblQuantPaginas.setText(pagAtual + "/" + pagUltima);
        
    }
     public void validaQuantidadeBuscaIdSala() throws SQLException{
        this.quantMax = patrimonioDAO.quantidadeIdSala(Integer.parseInt(tfdFiltroBusca.getText()));
        pagAtual = 1;
        
        if(quantMax % 100 == 0){
             pagUltima = quantMax / 100;
        }else if(quantMax <= 100){
            pagUltima = 1;
            btnProximo.setEnabled(false);
        }else{
             pagUltima = (quantMax / 100) + 1;
        }
        
        lblQuantPaginas.setText(pagAtual + "/" + pagUltima);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantPaginas;
    private javax.swing.JTable tbeBusca;
    private javax.swing.JTextField tfdFiltroBusca;
    private javax.swing.JTextField tfdNavegacao;
    // End of variables declaration//GEN-END:variables
}
