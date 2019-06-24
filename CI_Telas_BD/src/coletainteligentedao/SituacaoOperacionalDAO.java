/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedao;

import coletainteligente.Bairro;
import coletainteligente.Lixeira;
import coletainteligente.SituacaoOperacional;
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
    
    public void insere(SituacaoOperacional so){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO situacao_operacional (cod_lixeira, cod_coletor, cod_status, hora_status, data_status) VALUES (?,?,?,?,?);");
            stmt.setInt(1, so.lixeira.getCodigo());
            stmt.setInt(2, so.coletor.getCodigo());
            stmt.setInt(3, so.status.getCodigo());
            stmt.setTime(4, so.getTime());
            stmt.setDate(5, so.getDate());
            stmt.executeUpdate();
            
            System.out.print("Insert criado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(SituacaoOperacionalDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);  
        }
        
    }

    
}
