/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.HistoricoAcaoM;
import model.UsuarioM;

/**
 *
 * @author NUPSI-03
 */
public class HistoricoAcaoDAO {
    
    PreparedStatement pst = null;
    String sql = null;
    List<HistoricoAcaoM> retBusca = new ArrayList<>();
    
    
    
    public List<HistoricoAcaoM> listaTodos() throws SQLException{
        List<HistoricoAcaoM> listaHistorico = new ArrayList<HistoricoAcaoM>();
        String sql = "select * from HistoricoAcoes";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
        UsuarioDAO user = new UsuarioDAO();
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
           listaHistorico.add(new HistoricoAcaoM(rs.getString("tipoObjeto"),
                   rs.getDate("dataAcao"),
                   user.UsuarioMById(rs.getInt("usuario")),
                   rs.getString("acao") ));
        }
        pst.close();
        return listaHistorico;
    }
     public List<HistoricoAcaoM> lista100(int ultimo) throws SQLException{
        List<HistoricoAcaoM> listaHistorico = new ArrayList<>();
        String sql = "select * from HistoricoAcoes limit ?,100";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, ultimo);
        UsuarioDAO user = new UsuarioDAO();
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
           listaHistorico.add(new HistoricoAcaoM(rs.getString("tipoObjeto"),
                   rs.getDate("dataAcao"),
                   user.UsuarioMById(rs.getInt("usuario")),
                   rs.getString("acao") ));
        }
        pst.close();
        return listaHistorico;
    }
     public int contaTodos() throws SQLException{           
        sql = "select count(*) quantidade from HistoricoAcoes";
        pst = Conexao.getInstance().prepareStatement(sql);       
        ResultSet rs = pst.executeQuery();
        int quant = 0;
        while(rs.next()){
            quant = rs.getInt("quantidade");
        }        
        pst.close();        
        return quant;
     }
    
    public static void salvar(HistoricoAcaoM historico) throws SQLException{
        PreparedStatement pst;
        String sql;
      
        sql = "insert into HistoricoAcoes values(?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setInt(2, historico.getIdObjeto());
        pst.setString(3, historico.getTipoObjeto());
        pst.setString(4, historico.getAcao());
        pst.setDate(5, historico.getDataAcao());
        pst.setInt(6, historico.getUsuario().getId());
        pst.execute();
        pst.close();
  
    }  
    
    public List<HistoricoAcaoM> buscaDescricao(String desc) throws SQLException{
        String aux = "%"+desc+"%";
        sql = "select * from HistoricoAcoes where tipoObjeto like ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, aux);
        
        ResultSet rs = pst.executeQuery();
        UsuarioDAO user = new UsuarioDAO();
        while(rs.next()){
            
            retBusca.add(new HistoricoAcaoM(rs.getString("tipoObjeto"), rs.getDate("dataAcao"), user.UsuarioMById(rs.getInt("id_usuario")), rs.getString("acao")));
        }
        
        pst.close();
        return retBusca;
    }
    public List<HistoricoAcaoM> buscaDescricao100(String desc, int ultimo) throws SQLException{
        String aux = "%"+desc+"%";
        sql = "select * from HistoricoAcoes where tipoObjeto like ? limit ?,100";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, aux);
        pst.setInt(2, ultimo);
        
        ResultSet rs = pst.executeQuery();
        UsuarioDAO user = new UsuarioDAO();
        while(rs.next()){
            
            retBusca.add(new HistoricoAcaoM(rs.getString("tipoObjeto"), rs.getDate("dataAcao"), user.UsuarioMById(rs.getInt("id_usuario")), rs.getString("acao")));
        }
        
        pst.close();
        return retBusca;
    }
    public List<HistoricoAcaoM> buscaUsuario(UsuarioM usuario) throws SQLException{
        sql = "select * from HistoricoAcoes where id_usuario = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, usuario.getId());
        
        ResultSet rs = pst.executeQuery();
        UsuarioDAO user = new UsuarioDAO();
        while(rs.next()){
            
            retBusca.add(new HistoricoAcaoM(rs.getString("tipoObjeto"), rs.getDate("dataAcao"), user.UsuarioMById(rs.getInt("id_usuario")), rs.getString("acao")));
        }
        
        pst.close();
        return retBusca;
    }
     public List<HistoricoAcaoM> buscaUsuario100(UsuarioM usuario, int ultimo) throws SQLException{
        sql = "select * from HistoricoAcoes where id_usuario = ? limit ?,100";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, usuario.getId());
        pst.setInt(2, ultimo);
        
        ResultSet rs = pst.executeQuery();
        UsuarioDAO user = new UsuarioDAO();
        while(rs.next()){
            
            retBusca.add(new HistoricoAcaoM(rs.getString("tipoObjeto"), rs.getDate("dataAcao"), user.UsuarioMById(rs.getInt("id_usuario")), rs.getString("acao")));
        }
        
        pst.close();
        return retBusca;
    }
    
    public List<HistoricoAcaoM> buscaPeriodo(Date inicio, Date fim) throws SQLException{
        
        sql = "select * from HistoricoAcoes where dataAcao between ? and ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setDate(1, inicio);
        pst.setDate(2, fim);
        
        ResultSet rs = pst.executeQuery();
        UsuarioDAO user = new UsuarioDAO();
        while(rs.next()){
            
            retBusca.add(new HistoricoAcaoM(rs.getString("tipoObjeto"), rs.getDate("dataAcao"), user.UsuarioMById(rs.getInt("id_usuario")), rs.getString("acao")));
        }
        
        pst.close();
        return retBusca;
    }
    public List<HistoricoAcaoM> buscaPeriodo100(Date inicio, Date fim, int ultimo) throws SQLException{
        
        sql = "select * from HistoricoAcoes where dataAcao between ? and ? limit ?,100";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setDate(1, inicio);
        pst.setDate(2, fim);
        pst.setInt(3, ultimo);
        
        ResultSet rs = pst.executeQuery();
        UsuarioDAO user = new UsuarioDAO();
        while(rs.next()){
            
            retBusca.add(new HistoricoAcaoM(rs.getString("tipoObjeto"), rs.getDate("dataAcao"), user.UsuarioMById(rs.getInt("id_usuario")), rs.getString("acao")));
        }
        
        pst.close();
        return retBusca;
    }
   
    
 
    public List<HistoricoAcaoM> busca(HistoricoAcaoM historico, int qnt, int combCampos) throws SQLException{
        PreparedStatement pst = null;
        String sql = null;
        List<HistoricoAcaoM> retornoHistorico = new ArrayList<HistoricoAcaoM>();     
        //Qnt é para verificar quantos campos foram preenchidos nos filtros.
        //combCampos é uma combinação matematica para saber quais campos foram preenchidos
        //campo1 = 2, campo2 = 3, campo3 = 5, campo4 = 7
    
        if (qnt == 1){
            
            
            if (combCampos == 3){
                
            }
            
            if (combCampos == 7){
                sql = "select * from HistoricoAcoes where acao = ?";
                pst = Conexao.getInstance().prepareStatement(sql);
                pst.setString(1, historico.getAcao().toString());
            }
        }
       
        ResultSet rs = pst.executeQuery();
        UsuarioDAO user = new UsuarioDAO();
        while(rs.next()){
            
            retornoHistorico.add(new HistoricoAcaoM(rs.getString("tipoObjeto"), rs.getDate("dataAcao"), user.UsuarioMById(rs.getInt("id_usuario")), rs.getString("acao")));
        }
        pst.close();
        return retornoHistorico;
     }
    
    
    
}
