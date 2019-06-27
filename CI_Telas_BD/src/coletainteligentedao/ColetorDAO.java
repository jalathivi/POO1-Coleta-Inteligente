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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinicius
 */
public class ColetorDAO {
    
public void insere(Coletor coletor){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO coletor ( placa, modelo, marca, ano, capacidade, latitude, longitude) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1, coletor.getPlaca());
            stmt.setString(2, coletor.getModelo());
            stmt.setString(3, coletor.getMarca());
            stmt.setInt(4, coletor.getAno());
            stmt.setFloat(5, coletor.getCapacidade());
            stmt.setFloat(6, coletor.getLatitude());
            stmt.setFloat(7, coletor.getLongitude());
            
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
    
   public void listaColetores(DefaultTableModel model) {
                    
        Connection con = ConexaoDB.getConexao();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM coletor");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                try {
                    model.addRow(new Object[] 
                    {Integer.toString(rs.getInt("cod_coletor")),rs.getString("placa"),rs.getString("modelo"),rs.getString("marca"),
                     Integer.toString(rs.getInt("ano")), Integer.toString(rs.getInt("capacidade")), Float.toString(rs.getFloat("latitude")),
                     Float.toString(rs.getFloat("longitude"))});
                }
                catch (SQLException ex) {
                    Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        } catch (SQLException ex) {
            Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na listagem de coletores\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt); 
        }  
    }
            
    public void filtraColetoresPorMarca(DefaultTableModel model, String modelo) {
        
        Connection con = ConexaoDB.getConexao();
        ResultSet rs;
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM coletor WHERE modelo = ?");
            stmt.setString(1,(modelo));
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                try {
                    model.addRow(new Object[] 
                    {Integer.toString(rs.getInt("cod_coletor")),rs.getString("placa"),rs.getString("modelo"),rs.getString("marca"),
                     Integer.toString(rs.getInt("ano")), Integer.toString(rs.getInt("capacidade")), Float.toString(rs.getFloat("latitude")),
                     Float.toString(rs.getFloat("longitude"))});
                }
                catch (SQLException ex) {
                    Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoDB.closeConnection(con, stmt);  
        }
    }            
        
    
    
    public List<Coletor> listaColetoresList() {
                    
        Connection con = ConexaoDB.getConexao();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List <Coletor> listaColetor = new ArrayList();
        listaColetor.clear();
        Coletor coletor;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM coletor ORDER BY cod_coletor ASC");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                coletor = new Coletor();
                try {
                    coletor.setCodigo(Integer.toString(rs.getInt("cod_coletor")));
                    
                    coletor.setPlaca(rs.getString("placa"));
                    coletor.setModelo(rs.getString("modelo"));
                    coletor.setMarca(rs.getString("marca"));
                    coletor.setCapacidade(Float.toString(rs.getFloat("capacidade")));
                   
                    listaColetor.add(coletor);

                } catch (Exception ex) {
                    Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na listagem de coletores\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt); 
        }  
       return listaColetor;
    }
    
    public ArrayList selectListaModelo() {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList listaModelo = new ArrayList();

        try {
            stmt = conexao.prepareStatement("SELECT modelo FROM coletor GROUP BY modelo;");
            rs = stmt.executeQuery();
            
           while(rs.next()) {
               listaModelo.add(rs.getString("modelo"));
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(ColetorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return listaModelo;
    }
          
    
    
    public void deleta(Coletor coletor) {
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM coletor WHERE cod_coletor=?");
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
            
            stmt = con.prepareStatement("UPDATE coletor SET placa=?, modelo=?, marca=?, ano=?, capacidade=?, latitude=?, longitude=?  WHERE cod_coletor=?");

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
