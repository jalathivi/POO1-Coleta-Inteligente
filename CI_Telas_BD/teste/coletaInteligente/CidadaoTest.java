/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package coletaInteligente;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thiag
 */
public class CidadaoTest {
    
    public CidadaoTest() {
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

    /*
    * Teste do Método setCodigo
    */
    @Test
    public void testSetCodigo(){
        
        System.out.println("setCodigoValido");
        setCodigoValido("369258");
        setCodigoValido("666");
        setCodigoValido("42");
        setCodigoValido("0");
        
        System.out.println("setCodigoInvalido");
        setCodigoInvalido("-1");
        setCodigoInvalido("A");
        setCodigoInvalido(" ");
        setCodigoInvalido("");
        setCodigoInvalido("!@#");
        setCodigoInvalido(":?:1");
    }
    
    public void setCodigoValido(String codigo){
       
        Cidadao  instance = new Cidadao();
   
        try {     
            instance.setCodigo(codigo);
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Input válido não foi aceito!\n");
            System.out.println(ex.getMessage());
        }
    }    
    
    public void setCodigoInvalido(String codigo){
    
        Cidadao  instance = new Cidadao();
        try {
           
            instance.setCodigo(codigo);
            fail("Teste Falhou: Input inválido foi aceito!\n");
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }       
       
    
    
    /**
     * Método setNome
     */
    @Test
    public void testSetNome(){
        
        System.out.println("setNomeValido");
        testSetNomeValido("Lavinia C");
        testSetNomeValido("Vinicius Freitas");
        testSetNomeValido("Thiago Moreira");
        testSetNomeValido("Jackson W Silva");
        
        System.out.println("setNomeInvalido");
        testSetNomeInvalido("");
        testSetNomeInvalido(" ");
        testSetNomeInvalido(". ");
        testSetNomeInvalido("123");
   
    }
    
    public void testSetNomeValido(String nome) {
        
        Cidadao instance = new Cidadao();
  
        try {
            instance.setNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

     public void testSetNomeInvalido(String nome){
      
        Cidadao instance = new Cidadao();
        
        try {
            instance.setNome(nome);
            fail("Teste Falhou: Input inválido foi aceito!\n");
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    
    
    
    /**
     * Método setEmail
     */
    @Test
    public void testSetEmail(){
        
        System.out.println("setEmailValido");
        testSetEmailValido("lavinia@gmail.com");
        testSetEmailValido("vinicius.freitas123@outlook.com");
        testSetEmailValido("tmoreira@hotmail.com");
        testSetEmailValido("jackson.silva@gmail.com");
        
        System.out.println("setEmailInvalido");
        testSetEmailInvalido("lavinia@gmail");
        testSetEmailInvalido("vinicius.gmail.com");
        testSetEmailInvalido("thiago@com");
        testSetEmailInvalido("@gmail.com");
        testSetEmailInvalido("");
        testSetEmailInvalido(" ");
   
    }
    
    public void testSetEmailValido(String email) {
        
        Cidadao instance = new Cidadao();
        
        try {
            instance.setEmail(email);
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

     public void testSetEmailInvalido(String email){
      
        Cidadao instance = new Cidadao();
        
        try {
            instance.setEmail(email);
            fail("Teste Falhou: Input inválido foi aceito!\n");
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
        

     
    /**
     * Método setSenha
     */
     
    @Test
    public void testSetSenha(){
        
        System.out.println("setSenhaValido");
        testSetSenhaValido("1234acb#");
        testSetSenhaValido("naruto2019");
        testSetSenhaValido("Ichigo15");
        testSetSenhaValido("Rukia2019");
        
        System.out.println("setSenhaInvalido");
        testSetSenhaInvalido("12311");
        testSetSenhaInvalido("         ");
        testSetSenhaInvalido("..-- ");
        testSetSenhaInvalido("");
   
    }
    
    public void testSetSenhaValido(String senha) {
        
        Cidadao instance = new Cidadao();
        
        try {
            instance.setSenha(senha);
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

     public void testSetSenhaInvalido(String senha){
      
        Cidadao instance = new Cidadao();
        
        try {
            instance.setSenha(senha);
            fail("Teste Falhou: Input inválido foi aceito!\n");
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
     
        
    /**
     * Método setLatitude
     */
       
         
   @Test
    public void testSetLatitude() {
        
        System.out.println("setLatitudeValido");
        setLatitudeValido("90.000");
        setLatitudeValido("-65.8485");
        setLatitudeValido("-40.42200");
        setLatitudeValido("00");
        
        System.out.println("setLatitudeInvalido");
        setLatitudeInvalido("180");
        setLatitudeInvalido("325oi1265");
        setLatitudeInvalido("jujuba");
        setLatitudeInvalido("totosa");
    }
        
    public void setLatitudeValido(String latitude){
     
        Cidadao instance = new Cidadao();
   
        try {         
            instance.setLatitude(latitude);
            
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void setLatitudeInvalido(String latitude){
       
        Cidadao instance = new Cidadao();
   
        try {         
            instance.setLatitude(latitude);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
     
    /**
     * Método setLogitude
     */
         
    @Test
    public void testSetLongitude() {
        
        System.out.println("setLongitudeValido");
        setLongitudeValido("90.000");
        setLongitudeValido("-65.8485");
        setLongitudeValido("-40.42200");
    
        System.out.println("setLongitudeInvalido");
        setLongitudeInvalido("360.0065");
        setLongitudeInvalido("325oi1265");
        setLongitudeInvalido("jujuba");
        setLongitudeInvalido("totosa"); 
    }
        
    public void setLongitudeValido(String longitude){
        
        Cidadao instance = new Cidadao();
   
        try {         
            instance.setLongitude(longitude);
            
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
     
    public void setLongitudeInvalido(String longitude){
       
        Cidadao instance = new Cidadao();
   
        try {         
            instance.setLongitude(longitude);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(CidadaoTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }  
    
    
  
    
}
