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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author thiag
 */
public class CidadaoDAO {
    public void Insere(Cidadao c) {
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(
                    "INSERT INTO cidadao (cod_cidadao, nome, senha, email, latitude, longitude) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, c.getCodigo());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getSenha());
            stmt.setString(4, c.getEmail());
            stmt.setFloat(5, c.getLatitude());
            stmt.setFloat(6, c.getLongitude());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Insert criado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo");
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }
    
    public void Seleciona(Cidadao c, String linha) throws Exception {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs;
        
        try {
            stmt = conexao.prepareStatement(linha);
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                c.setCodigo(rs.getInt("cod_cidadao"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setSenha(rs.getString("senha"));
                c.setLatitude(rs.getFloat("latitude"));
                c.setLongitude(rs.getFloat("longitude"));
                JOptionPane.showMessageDialog(null, "Usuario encontrado");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Email não encontrado");
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
            
        }
            
    }
    public void selecionaEmail(Cidadao c, String email) throws Exception{
        //Cidadao c = new Cidadao();
        String linha = "SELECT * FROM cidadao WHERE email = '" + email + "';";
        Seleciona(c, linha);
        //return c;
    }

}