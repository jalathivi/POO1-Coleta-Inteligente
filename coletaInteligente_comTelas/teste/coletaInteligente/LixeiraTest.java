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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void setCodigoValido(){
        System.out.println("setCodigoValido");
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setCodigo("369258");
            instance.setCodigo("666");
            instance.setCodigo("42");
            instance.setCodigo("0");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
    @Test
        public void setCodigoInvalido(){
            System.out.println("setCodigoValido");
            Lixeira instance = new Lixeira();

            try {         
                instance.setCodigo("FuitCarregadoNesseTrab");
                instance.setCodigo(" ");
                instance.setCodigo("!@#");
                instance.setCodigo(":?:1");
                fail("Teste Falhou: Inputs inválidos foram aceitos!\n");

            } catch (Exception ex) {
                Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
   @Test
    public void setLatitudeValido(){
        System.out.println("setLatitudeValido");
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setLatitude("90.000");
            instance.setLatitude("-65.8485");
            instance.setLatitude("-40.42200");
            instance.setLatitude("00");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
    
    @Test
    public void setLatitudeInvalido(){
        System.out.println("setLatitudeInvalido");
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setLatitude("180");
            instance.setLatitude("325oi1265");
            instance.setLatitude("jujuba");
            instance.setLatitude("totosa");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
    @Test
    public void setLongitudeValido(){
        System.out.println("setLongitudeValido");
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setLongitude("90.000");
            instance.setLongitude("-65.8485");
            instance.setLongitude("-40.42200");
            instance.setLongitude("-180");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
    
    @Test
    public void setLongitudeInvalido(){
        System.out.println("setLongitudeInvalido");
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setLongitude("360.0065");
            instance.setLongitude("325oi1265");
            instance.setLongitude("jujuba");
            instance.setLongitude("totosa");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
    @Test
    public void setCapacidadeValido(){
        System.out.println("setLongitudeValido");
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setCapacidade("100");
            instance.setCapacidade("60");
            instance.setCapacidade("40.5");
            instance.setCapacidade("1");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
    
    @Test
    public void setCapacidadeInvalido(){
        System.out.println("setLongitudeInvalido");
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setCapacidade("cheio");
            instance.setCapacidade("vazio");
            instance.setCapacidade("-40");
            instance.setCapacidade("0");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
    @Test
    public void setNivelAtualValido(){
        System.out.println("setLongitudeValido");
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setNivelAtual("100");
            instance.setNivelAtual("60");
            instance.setNivelAtual("40.5");
            instance.setNivelAtual("0");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
    
    @Test
    public void setNivelAtualInvalido(){
        System.out.println("setLongitudeInvalido");
        Lixeira instance = new Lixeira();
   
        try {         
            instance.setNivelAtual("cheio");
            instance.setNivelAtual("vazio");
            instance.setNivelAtual("maromeno");
            instance.setNivelAtual("-40");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(LixeiraTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
    
    
    
    
}
