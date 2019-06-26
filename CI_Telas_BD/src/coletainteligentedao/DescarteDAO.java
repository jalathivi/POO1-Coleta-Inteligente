/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedao;

/**
 *
 * @author Jackson
 */


import conexao.ConexaoDB;
import coletainteligente.Descarte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;


public class DescarteDAO {
      public void insere(Descarte descarte){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO descarte( cod_lixeira, cod_cidadao, data_descarte, hora_descarte, volume) VALUES (?,?,?,?,?)");
            stmt.setInt(1, descarte.lixeira.getCodigo());
            stmt.setInt(2, descarte.cidadao.getCodigo());
            stmt.setDate(3, descarte.getData1());
            stmt.setTime(4, descarte.getTime());
            stmt.setFloat(5, descarte.getVolume());
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("UPDATE lixeira SET nivel_atual = ? WHERE cod_lixeira=?");
            stmt.setFloat(1, descarte.getLixeira().getNivelAtual());
            stmt.setInt(2, descarte.getLixeira().getCodigo());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Insert criado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(DescarteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);  
        }
        
    }
    
   public void listaDescartes(DefaultTableModel model) {
                    
        Connection con = ConexaoDB.getConexao();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM descarte");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                try {
                    model.addRow(new Object[] 
                    {Integer.toString(rs.getInt("cod_lixeira")),Integer.toString(rs.getInt("cod_cidadao")),
                    rs.getDate("data_descarte"),rs.getDate("hora_descarte"),
                    Float.toString(rs.getFloat("volume"))});
                }
                catch (SQLException ex) {
                    Logger.getLogger(DescarteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        } catch (SQLException ex) {
            Logger.getLogger(DescarteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na listagem de descartees\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt); 
        }  
    }
            
    public void deleta(Descarte descarte) {
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM descarte WHERE cod_lixeira=? and cod_cidado =? and data_descarte=?, and hora_descarte=?");
            stmt.setInt(1, descarte.lixeira.getCodigo());
            stmt.setInt(2, descarte.cidadao.getCodigo());
            stmt.setDate(3, descarte.getData1());
            stmt.setTime(4, descarte.getTime());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(DescarteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exclusão não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);   
        }         
    }
    
    public void setDescarte(Descarte descarte) {
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE descarte SET volume=? WHERE cod_lixeira=? and cod_cidadao =? and data_descarte=?, and hora_descarte=?");

            stmt.setFloat(1, descarte.getVolume());
            
            stmt.setInt(2, descarte.lixeira.getCodigo());
            stmt.setInt(3, descarte.cidadao.getCodigo());
            stmt.setDate(4, descarte.getData1());
            stmt.setTime(5, descarte.getTime());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(DescarteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Update não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);   
        }
    }
}
