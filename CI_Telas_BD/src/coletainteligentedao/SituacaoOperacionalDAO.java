/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedao;

import coletainteligente.Bairro;
import coletainteligente.Lixeira;
import coletainteligente.Status;
import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class SituacaoOperacionalDAO {
    
  /*  public void insere(Bairro bairro, Lixeira lixeira, Status status){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO situacao_operacional ( cod_lixeira, cod_coletor, marca, ano, capacidade, latitude, longitude) VALUES (?,?,?,?,?,?,?)");
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
*/
    
}
