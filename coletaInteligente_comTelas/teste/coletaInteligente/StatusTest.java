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

    /**
     * Teste do Método setDescricao
     */
    
    @Test
    public void setDescricaoValido(){
        System.out.println("setDescricaoValido");
        Status instance = new Status();
   
        try {         
            instance.setDescricao("Não Atende a Demanda");
            instance.setDescricao("Ok");
            instance.setDescricao("Quebrada");
        } catch (Exception ex) {
            Logger.getLogger(StatusTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }

    }
    
    
    @Test
    public void setDescricaoInvalido(){
        System.out.println("setDescricaoInvalido");
        Status instance = new Status();
   
        try {         
            instance.setDescricao("");
            instance.setDescricao(" ");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
        } catch (Exception ex) {
            Logger.getLogger(StatusTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    
}
