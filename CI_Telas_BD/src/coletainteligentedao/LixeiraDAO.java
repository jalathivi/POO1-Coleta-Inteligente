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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    
    public void listaLixeiras (DefaultTableModel model) {
                    
        Connection con = ConexaoDB.getConexao();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("SELECT cod_lixeira, nome, capacidade, latitude, longitude, nivel_atual FROM LIXEIRA INNER JOIN BAIRRO ON (LIXEIRA.cod_bairro = BAIRRO.cod_bairro)");
            rs = stmt.executeQuery();
            
            while(rs.next()) {


                 try {

                     model.addRow(new Object[]{Integer.toString(rs.getInt("cod_lixeira")), rs.getString("nome"),Float.toString(rs.getFloat("capacidade")),Float.toString(rs.getFloat("latitude")), Float.toString(rs.getFloat("longitude")), Float.toString(rs.getFloat("nivel_atual"))});

                 } catch (Exception ex) {
                     Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
                 }

            }   
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na listagem de lixeiras\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt); 
        }  
    }
    
    public List<Integer> listaLixeirasPorBairro(int codbairro) {
        Connection con = ConexaoDB.getConexao();
        ResultSet rs;
        PreparedStatement stmt = null;
        List<Integer> dados = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM lixeira WHERE cod_bairro = ?;");
            stmt.setInt(1, codbairro);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
               dados.add(rs.getInt("cod_lixeira"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(con, stmt);
        }
        return dados;
    }
            
    public void filtraLixeirasPorBairro(DefaultTableModel model, String codbairro) {
        
        Connection con = ConexaoDB.getConexao();
        ResultSet rs;
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("SELECT cod_lixeira, nome, capacidade, latitude, longitude, nivel_atual FROM LIXEIRA INNER JOIN BAIRRO ON (LIXEIRA.cod_bairro = BAIRRO.cod_bairro) WHERE lixeira.cod_bairro = ?");
            stmt.setInt(1, parseInt(codbairro));
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                try {

                     model.addRow(new Object[]{Integer.toString(rs.getInt("cod_lixeira")), rs.getString("nome"),Float.toString(rs.getFloat("capacidade")),Float.toString(rs.getFloat("latitude")), Float.toString(rs.getFloat("longitude")), Float.toString(rs.getFloat("nivel_atual"))});

                } catch (Exception ex) {
                    Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoDB.closeConnection(con, stmt); 
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
