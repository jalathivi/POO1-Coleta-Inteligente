/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedao;

import conexao.ConexaoDB;
import coletainteligente.Coletor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Vinicius
 */
public class ColetorDAO {
    
public void insere(Coletor coletor){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO lixeira (cod_coletor, placa, modelo, marca, ano, capacidade, latitude, longitude) VALUES (?,?,?,?,?)");
            stmt.setInt(1, coletor.getCodigo());
            stmt.setString(2, coletor.getPlaca());
            stmt.setString(3, coletor.getModelo());
            stmt.setString(4, coletor.getMarca());
            stmt.setInt(5, coletor.getAno());
            stmt.setFloat(6, coletor.getCapacidade());
            stmt.setFloat(7, coletor.getLatitude());
            stmt.setFloat(8, coletor.getLongitude());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Insert criado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);  
        }
        
    }
    
    public void listaColetores(JTable jTableLixeira) {
                    
        Connection con = ConexaoDB.getConexao();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM COLETOR");
            rs = stmt.executeQuery();
            jTableLixeira.setModel(DbUtils.resultSetToTableModel(rs));    
        } catch (SQLException ex) {
            Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na listagem de coletores\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt); 
        }  
    }
            
    public void filtraColetoresPorMarca(JTable jTableLixeira, JTextField jTextField) {
        
        Connection con = ConexaoDB.getConexao();
        ResultSet rs;
        PreparedStatement stmt;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM COLETOR WHERE MODELO ILIKE ?");
            stmt.setString(1,(jTextField.getText()));
            rs = stmt.executeQuery();
            jTableLixeira.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }            
            
    public void deleta(Coletor coletor) {
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM lixeira WHERE cod_coletor=?");
            stmt.setInt(1, coletor.getCodigo());
            
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
    
    public void setColetor(Coletor coletor) {
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE lixeira SET placa=? modelo=? marca=? ano=? capacidade=? latitude=? longitude=?  WHERE cod_coletor=?");

            stmt.setString(1, coletor.getPlaca());
            stmt.setString(2, coletor.getModelo());
            stmt.setString(3, coletor.getMarca());
            stmt.setInt(4, coletor.getAno());
            stmt.setFloat(5, coletor.getCapacidade());
            stmt.setFloat(6, coletor.getLatitude());
            stmt.setFloat(7, coletor.getLongitude());
            
            stmt.setInt(8, coletor.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Update não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);   
        }
    }
}
