/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedao;

import conexao.ConexaoDB;
import coletainteligente.Status;
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
 * @author Lavinia
 */
public class StatusDAO {
    public void insere(Status b){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO status (descricao) VALUES (?);");
           //stmt.setInt(1, c.getCodigo());
            stmt.setString(1, b.getDescricao());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Insert criado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }  
    
    /**
     *Retorna Falso caso não encontre a descricao
     * @param descricao
     * @return check
     */
    
    public boolean readDescricao(String descricao) {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = conexao.prepareStatement("SELECT * FROM status WHERE descricao = ?;");
            stmt.setString(1, descricao);
            rs = stmt.executeQuery();
            
           if(rs.next()) {
               check = true;
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return check;
    }
    
    
    public ArrayList selectListaStatus() {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList dados = new ArrayList();

        try {
            stmt = conexao.prepareStatement("SELECT * FROM status;");
            //stmt.setString(1, descricao);
            rs = stmt.executeQuery();
            
           while(rs.next()) {
               dados.add(rs.getString("descricao"));
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return dados;
    }
 
    public ArrayList selectListaCodStatus() {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList dados = new ArrayList();

        try {
            stmt = conexao.prepareStatement("SELECT * FROM status;");
            //stmt.setString(1, descricao);
            rs = stmt.executeQuery();
            
           while(rs.next()) {
               dados.add(rs.getString("cod_status"));
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return dados;
    }


    public void deleta(String descricao){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            System.out.print(descricao);
            stmt = con.prepareStatement("DELETE FROM status WHERE descricao=?");
            stmt.setString(1, descricao);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exclusão não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }    
    
    public void alteraStatus(String descricaoOld, String descricao){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE status SET descricao=? WHERE descricao=?");
            stmt.setString(1, descricao);
            stmt.setString(2, descricaoOld);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Update não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }
}
