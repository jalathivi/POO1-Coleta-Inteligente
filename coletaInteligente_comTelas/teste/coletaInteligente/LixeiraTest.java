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
        setCodigoValido("369258");
        setCodigoValido("666");
        setCodigoValido("666");
        setCodigoValido("42");
        setCodigoValido("0");
        setCodigoInvalido("FuitCarregadoNesseTrab");
        setCodigoInvalido(" ");
        setCodigoInvalido("!@#");
        setCodigoInvalido(":?:1");
    }
    
    public void setCodigoValido(String codigo){
        System.out.println("setCodigoValido");
        Lixeira instance = new Lixeira();
   
        try {
            instance.setCodigo(codigo);
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }
    public void setCodigoInvalido(String codigo){
        System.out.println("setCodigoValido");
        Lixeira instance = new Lixeira();

        try {         
            instance.setCodigo(codigo);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");

        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   @Test
    public void testSetLatitude() {
        setLatitudeValido("90.000");
        setLatitudeValido("-65.8485");
        setLatitudeValido("-40.42200");
        setLatitudeValido("00");
        setLatitudeInvalido("180");
        setLatitudeInvalido("325oi1265");
        setLatitudeInvalido("jujuba");
        setLatitudeInvalido("totosa");
    }
        
    public void setLatitudeValido(String latitude){
        System.out.println("setLatitudeValido");
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
        System.out.println("setLatitudeInvalido");
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
        setLongitudeValido("90.000");
        setLongitudeValido("-65.8485");
        setLongitudeValido("-40.42200");
        setLongitudeValido("-180");
        setLongitudeInvalido("360.0065");
        setLongitudeInvalido("325oi1265");
        setLongitudeInvalido("jujuba");
        setLongitudeInvalido("totosa"); 
    }
        
    public void setLongitudeValido(String longitude){
        System.out.println("setLongitudeValido");
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
        System.out.println("setLongitudeInvalido");
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
        setCapacidadeValido("100");
        setCapacidadeValido("60");
        setCapacidadeValido("40.5");
        setCapacidadeValido("1");
        setCapacidadeInvalido("cheio");
        setCapacidadeInvalido("-40");
        setCapacidadeInvalido("0");
    }
    public void setCapacidadeValido(String capacidade){
        System.out.println("setLongitudeValido");
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
        System.out.println("setLongitudeInvalido");
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
        setNivelAtualValido("100");
        setNivelAtualValido("60");
        setNivelAtualValido("40.5");
        setNivelAtualValido("0");
        setNivelAtualInvalido("cheia");
        setNivelAtualInvalido("maromeno");
        setNivelAtualInvalido("-40");
    }
    
    public void setNivelAtualValido(String nivelAtual){
        System.out.println("setLongitudeValido");
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
        System.out.println("setLongitudeInvalido");
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
