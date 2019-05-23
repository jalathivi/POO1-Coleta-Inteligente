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
 * @author Jackson
 */
public class BairroTest {
    
    public BairroTest() {
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
       
        Bairro instance = new Bairro();
   
        try {         
            instance.setCodigo(codigo);
        } catch (Exception ex) {
            Logger.getLogger(BairroTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Input válido não foi aceito!\n");
            System.out.println(ex.getMessage());
        }
    }    
    
    public void setCodigoInvalido(String codigo){
    
        Bairro instance = new Bairro();

        try {         
            instance.setCodigo(codigo);
            fail("Teste Falhou: Input inválido foi aceito!\n");
        } catch (Exception ex) {
            Logger.getLogger(BairroTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }   
    
    /*
    * Teste do Método setNome
    */
    @Test
    public void testSetNome(){
      
        System.out.println("setNomeInválido");
        setNomeInvalido("");
        setNomeInvalido(" ");
        setNomeInvalido("123");
        setNomeInvalido("   ");
        setNomeInvalido(".");
        setNomeInvalido("-");
        
        System.out.println("setNomeVálido");
        setNomeValido("Morada de Laranjeiras");
        setNomeValido("Barcelona");
        setNomeValido("São Marcos 1");
        setNomeValido("São Marcos II");
    }
    
    public void setNomeInvalido(String nome){
        
        Bairro instance = new Bairro();
        
        try {
            instance.setNome(nome);
            fail("Teste Falhou: Input inválido foi aceito!\n");
        } catch (Exception ex) {
            Logger.getLogger(BairroTest.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    
    public void setNomeValido(String nome){
        
        Bairro instance = new Bairro();
        
        try {
            instance.setNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(BairroTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Input válido não foi aceito!\n");
        }
        
    }
    
    
    
    
}
