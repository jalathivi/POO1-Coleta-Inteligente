/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligenteDAO;


import Conexao.ConexaoDB;
import coletaInteligente.Cidadao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author thiag
 */
public class CidadaoDAO {
    
   public CidadaoDAO(){
   }
    
    public void insere(Cidadao c){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO cidadao (nome, senha, email, latitude, longitude) VALUES (?,?,?,?,?)");
           //stmt.setInt(1, c.getCodigo());
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSenha());
            stmt.setString(3, c.getEmail());
            stmt.setFloat(4, c.getLatitude());
            stmt.setFloat(5, c.getLongitude());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Insert criado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }
    
    public void altera(Cidadao c){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE cidadao SET nome=?, senha=?, email=?, latitude=?, longitude =? WHERE cod_cidadao=?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSenha());
            stmt.setString(3, c.getEmail());
            stmt.setFloat(4, c.getLatitude());
            stmt.setFloat(5, c.getLongitude());
            stmt.setInt(6, c.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Update não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }

    public void alteraSenha(String senha, String email){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE cidadao SET senha=? WHERE email=?");
            stmt.setString(1, senha);
            stmt.setString(2, email);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Update não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }

    
    
    public void deletaUsuario(String email) {
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
       try {
           stmt = con.prepareStatement("DELETE FROM cidadao WHERE email=?");
           stmt.setString(1, email);
            
           stmt.executeUpdate();

           JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso");
           ConexaoDB.closeConnection(con, stmt);
       } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exclusão não deu certo!\n" + ex.getMessage()); 
        } finally {
            ConexaoDB.closeConnection(con, stmt);   
        }
            
    }
    
    
    public void deleta(Cidadao c){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM cidadao WHERE cod_cidadao=?");
            stmt.setInt(1, c.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exclusão não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }    
        
    
    
    
    public void seleciona(Cidadao c, String linha) throws Exception {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs;
        
        try {
            stmt = conexao.prepareStatement(linha);
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                c.setCodigo(Integer.toString(rs.getInt("cod_cidadao")));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setSenha(rs.getString("senha"));
                c.setLatitude(Float.toString(rs.getFloat("latitude")));
                c.setLongitude(Float.toString(rs.getFloat("longitude")));
         
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Email não encontrado");
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
    }
    
    public boolean checkLogin(String email, String senha) {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = conexao.prepareStatement("SELECT * FROM cidadao WHERE email = ? and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
           if(rs.next()) {
               check = true;
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return check;
    }
    

   public void selecionaLista(ArrayList lista, String linha) throws Exception {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs;
        
        try {
            stmt = conexao.prepareStatement(linha);
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Cidadao c = new Cidadao();
                c.setCodigo(Integer.toString(rs.getInt("cod_cidadao")));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setSenha(rs.getString("senha"));
                c.setLatitude(Float.toString(rs.getFloat("latitude")));
                c.setLongitude(Float.toString(rs.getFloat("longitude")));
               
                lista.add(c);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Email não encontrado");
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
            
        }
            
    }    
    
    public void selecionaEmail(Cidadao c) throws Exception{
        //Cidadao c = new Cidadao();
        String linha = "SELECT * FROM cidadao WHERE email = '" + c.getEmail() + "';";
        seleciona(c, linha);
        //return c;
    }
    
    public boolean selectEmail(String email) {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = conexao.prepareStatement("SELECT * FROM cidadao WHERE email = ?;");
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            
           if(rs.next()) {
               check = true;
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return check;
    }
    
    public void selecionaNome(Cidadao c, ArrayList lista) throws Exception{
        //Cidadao c = new Cidadao();
        String linha = "SELECT * FROM cidadao WHERE nome = '"+ c.getNome() +"';";
        selecionaLista(lista, linha);
        //return c;
    }

}
