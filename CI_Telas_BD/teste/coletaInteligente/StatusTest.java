/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;

import coletainteligente.Status;
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
public class StatusTest {
    
    public StatusTest() {
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
       
        Status instance = new Status();
   
        try {         
            instance.setCodigo(codigo);
        } catch (Exception ex) {
            Logger.getLogger(StatusTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Input válido não foi aceito!\n");
            System.out.println(ex.getMessage());
        }
    }    
    
    public void setCodigoInvalido(String codigo){
    
        Status instance = new Status();

        try {         
            instance.setCodigo(codigo);
            fail("Teste Falhou: Input inválido foi aceito!\n");
        } catch (Exception ex) {
            Logger.getLogger(StatusTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }   
    
    
    /**
     * Teste do Método setDescricao
     */
    
    @Test
    public void testSetDescricao(){
        
        
        System.out.println("setDescricaoValido");
        setDescricaoValido("Não Atende a Demanda");
        setDescricaoValido("Ok");
        setDescricaoValido("Quebrada");
        
        System.out.println("");
        setDescricaoInvalido("");
        setDescricaoInvalido("");
    }
    
        
    public void setDescricaoValido(String descricao){   
        
        Status instance = new Status();
     
        try {         
            instance.setDescricao(descricao);
        } catch (Exception ex) {
            Logger.getLogger(StatusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setDescricaoInvalido(String descricao){
  
        Status instance = new Status();
   
        try {         
            instance.setDescricao(descricao);
            fail("Teste Falhou: Input inválido foi aceito!\n");
        } catch (Exception ex) {
            Logger.getLogger(StatusTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    
}
