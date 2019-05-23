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
