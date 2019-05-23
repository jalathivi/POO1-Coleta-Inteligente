/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligenteDAO;

import coletaInteligente.Cidadao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson
 */
public class CidadaoDAOTest {
    
    public CidadaoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     *  INSERE
     */
    
    @Test
    public void testInsere() {
        
        System.out.println("Insere");
       
        Cidadao c = new Cidadao();
        
        try {
            
 
            
            c.setEmail("lavinia@gmail.com");
            c.setNome("Lavinia");
            c.setSenha("abc124");
            c.setLatitude("-43.9122");
            c.setLongitude("-44.9231");
            insereCidadao(c);            
                
            
        } catch (Exception ex) {
            Logger.getLogger(CidadaoDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    
    public void insereCidadao(Cidadao cidadao){
    
        CidadaoDAO instance = new CidadaoDAO();
        
        instance.insere(cidadao);
      
    }
 
    
/*   
*  CONSULTA   
*/ 
 
    
 @Test
 public void testSelecionaEmail(){
     
     System.out.println("BUSCA EMAIL ");
     
    Cidadao c = new Cidadao();
   
    try {
        c.setEmail("jakson.r@hotmail.com");
        selecionaEmail(c);
        JOptionPane.showMessageDialog(null, "Encontrou E-mail"+ c.toString() );
    } catch (Exception ex) {
        Logger.getLogger(CidadaoDAOTest.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    
 } 
 
 public void selecionaEmail(Cidadao c) {
     
    CidadaoDAO instance = new CidadaoDAO();
    
    try {
          instance.selecionaEmail(c);
      } catch (Exception ex) {
          Logger.getLogger(CidadaoDAOTest.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, ex);
      }
} 
     
    
    @Test
 public void testSelecionaNome(){
     
     System.out.println("BUSCA NOME ");
     
    Cidadao c = new Cidadao();
    ArrayList<Cidadao> listaCidadao = new ArrayList<Cidadao>();
    
    try {
        c.setNome("jackson");
        selecionaNome(c, listaCidadao);
    } catch (Exception ex) {
        Logger.getLogger(CidadaoDAOTest.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    for(Cidadao cidadao: listaCidadao){
         JOptionPane.showMessageDialog(null, "Encontrou os nomes "+ cidadao.toString() );
    }
   
 } 
 
 public void selecionaNome(Cidadao c, ArrayList listaCidadao) {
     
    CidadaoDAO instance = new CidadaoDAO();
    
    try {
          instance.selecionaNome(c, listaCidadao);
      } catch (Exception ex) {
          Logger.getLogger(CidadaoDAOTest.class.getName()).log(Level.SEVERE, null, ex);
      }
} 
 
 
 
/*
 * ALTERA
 */ 
 
    @Test
    public void testAltera() {
        
        System.out.println("Altera");
       
        Cidadao c = new Cidadao();
        
        try {
           
            c.setCodigo("6");
            c.setEmail("vinicius@gmail.com");
            c.setNome("Vinicius Freitas");
            c.setSenha("124GHF");
            c.setLatitude("-43.9122");
            c.setLongitude("-42.9231");
            alteraCidadao(c);              
            
        } catch (Exception ex) {
            Logger.getLogger(CidadaoDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    
    public void alteraCidadao(Cidadao cidadao){
    
        CidadaoDAO instance = new CidadaoDAO();
        
        instance.altera(cidadao);
      
    } 
 
 /*
 * APAGA
 */
 
    @Test
    public void testDeleta() {
        
        System.out.println("Deleta");
       
        Cidadao c = new Cidadao();
        
        try {
           
            c.setCodigo("6");
            c.setEmail("vinicius@gmail.com");
            c.setNome("Vinicius Freitas");
            c.setSenha("124GHF");
            c.setLatitude("-43.9122");
            c.setLongitude("-42.9231");
            deletaCidadao(c);              
            
        } catch (Exception ex) {
            Logger.getLogger(CidadaoDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    
    public void deletaCidadao(Cidadao cidadao){
    
        CidadaoDAO instance = new CidadaoDAO();
        
        instance.deleta(cidadao);
      
    } 
     
    
    
}
