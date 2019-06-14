/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedao;

import conexao.ConexaoDB;
import coletainteligente.Lixeira;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Vinicius
 * /*
 * */
 
public class LixeiraDAO {
    
    public LixeiraDAO(){
    }
    
    public void insere(Lixeira lixeira){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO lixeira (cod_bairro, capacidade, nivel_atual, latitude, longitude) VALUES (?,?,?,?,?)");
            stmt.setInt(1, lixeira.bairro.getCodigo());
            stmt.setFloat(2, lixeira.getCapacidade());
            stmt.setFloat(3, lixeira.getNivelAtual());
            stmt.setFloat(4, lixeira.getLatitude());
            stmt.setFloat(5, lixeira.getLongitude());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Insert criado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);  
        }
        
    }
    
    public void listaLixeiras (JTable jTableLixeira) {
                    
        Connection con = ConexaoDB.getConexao();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM LIXEIRA");
            rs = stmt.executeQuery();
            jTableLixeira.setModel(DbUtils.resultSetToTableModel(rs));    
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na listagem de lixeiras\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt); 
        }  
    }
            
    public void filtraLixeirasPorBairro(JTable jTableLixeira, JTextField jTextFieldBairro) {
        
        Connection con = ConexaoDB.getConexao();
        ResultSet rs;
        PreparedStatement stmt;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM LIXEIRA WHERE cod_bairro = ?");
            stmt.setInt(1, parseInt(jTextFieldBairro.getText()));
            rs = stmt.executeQuery();
            jTableLixeira.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }            
            
    public void deleta(Lixeira lixeira) {
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM lixeira WHERE cod_lixeira=?");
            stmt.setInt(1, lixeira.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exclusão não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);   
        }         
    }
    public void genericSQL(String sql) {
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {        
            stmt = con.prepareStatement(sql);           
            stmt.executeUpdate();          
            JOptionPane.showMessageDialog(null, "Comando executado com sucesso");
            ConexaoDB.closeConnection(con, stmt);   
            
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na instrução SQL!\n" + ex.getMessage());
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
        } 
    }
    
    public void setLixeira(Lixeira lixeira) {
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE lixeira SET cod_bairro=?, capacidade=?, latitude=?, longitude=?, nivel_atual=? WHERE cod_lixeira=?");
            stmt.setInt(1, lixeira.getRegiao().getCodigo());
            stmt.setFloat(2, lixeira.getCapacidade());
            stmt.setFloat(3, lixeira.getLatitude());
            stmt.setFloat(4, lixeira.getLongitude());
            stmt.setFloat(5, lixeira.getNivelAtual());
            stmt.setInt(6, lixeira.getCodigo());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Update não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);   
        }   
    }
        
       
}
