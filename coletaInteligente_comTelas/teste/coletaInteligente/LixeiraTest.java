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
 * @author Vinicius
 */
public class LixeiraTest {
    
    public LixeiraTest() {
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
    
    @Test
    public void testSetCodigo(){
        
        System.out.println("setCodigoValido");
        setCodigoValido("369258");
        setCodigoValido("666");
        setCodigoValido("666");
        setCodigoValido("42");
        setCodigoValido("0");
        
        System.out.println("setCodigoInvalido");
        setCodigoInvalido("FuitCarregadoNesseTrab");
        setCodigoInvalido(" ");
        setCodigoInvalido("!@#");
        setCodigoInvalido(":?:1");
    }
    
    public void setCodigoValido(String codigo){
       
        Lixeira instance = new Lixeira();
   
        try {
            instance.setCodigo(codigo);
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Input válido não foi aceito!\n");
        }
    }
    public void setCodigoInvalido(String codigo){
        
        Lixeira instance = new Lixeira();

        try {         
            instance.setCodigo(codigo);
            fail("Teste Falhou: Input inválido foi aceito!\n");

        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
     
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setLatitude(latitude);
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void setLatitudeInvalido(String latitude){
       
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setLatitude(latitude);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void testSetLongitude() {
        
        System.out.println("setLongitudeValido");
        setLongitudeValido("90.000");
        setLongitudeValido("-65.8485");
        setLongitudeValido("-40.42200");
        setLongitudeValido("-180");
    
        System.out.println("setLongitudeInvalido");
        setLongitudeInvalido("360.0065");
        setLongitudeInvalido("325oi1265");
        setLongitudeInvalido("jujuba");
        setLongitudeInvalido("totosa"); 
    }
        
    public void setLongitudeValido(String longitude){
        
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setLongitude(longitude);
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
     
    public void setLongitudeInvalido(String longitude){
       
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setLongitude(longitude);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }  

    
    @Test
    public void testSetCapacidade() {
        
        System.out.println("setLongitudeValido");
        setCapacidadeValido("100");
        setCapacidadeValido("60");
        setCapacidadeValido("40.5");
        setCapacidadeValido("1");
        
        System.out.println("setLongitudeInvalido");
        setCapacidadeInvalido("cheio");
        setCapacidadeInvalido("-40");
        setCapacidadeInvalido("0");
    }
    public void setCapacidadeValido(String capacidade){
        
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setCapacidade(capacidade);
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
 
    public void setCapacidadeInvalido(String capacidade){
        
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setCapacidade(capacidade);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
    @Test
    public void testSetNivelAtual() {
        
        System.out.println("setLongitudeValido");
        setNivelAtualValido("100");
        setNivelAtualValido("60");
        setNivelAtualValido("40.5");
        setNivelAtualValido("0");
        
        System.out.println("setLongitudeInvalido");
        setNivelAtualInvalido("cheia");
        setNivelAtualInvalido("maromeno");
        setNivelAtualInvalido("-40");
    }
    
    public void setNivelAtualValido(String nivelAtual){
        
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setNivelAtual(nivelAtual);
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void setNivelAtualInvalido(String nivelAtual){
        
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setNivelAtual(nivelAtual);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
 
}
