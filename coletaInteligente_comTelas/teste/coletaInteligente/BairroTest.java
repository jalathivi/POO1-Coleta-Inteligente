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
    
    @Test
    public void testSetNomeValido(){
        System.out.println("setNomeValido");
        Bairro instance = new Bairro();
        try {
            instance.setNome("Jardim Limoeiro");
            instance.setNome("Barcelona");
            instance.setNome("Valparaiso");
            instance.setNome("São Marcos I");
            instance.setNome("São Marcos 2");
            
        } catch (Exception ex) {
            Logger.getLogger(BairroTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n" + ex.getMessage());
        }
    }
    
    @Test
    public void testSetNomeInvalido(){
        System.out.println("setNomeInvalido");
        Bairro instance = new Bairro();
        try {
            instance.setNome("");
            instance.setNome(" ");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(BairroTest.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    
}
