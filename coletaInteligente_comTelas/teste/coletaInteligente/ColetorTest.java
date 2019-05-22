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
 * @author Lavinia
 */
public class ColetorTest {
    
    public ColetorTest() {
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
     * Test of setPlaca method, of class Coletor.
     */
    @Test
    public void testSetPlacaValida() {
        System.out.println("setPlacaValida");
        Coletor instance = new Coletor();
        
        try {
            instance.setPlaca("ABC1234");
            instance.setPlaca("APA9293");
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

    /**
     * Test of setPlaca method, of class Coletor.
     */
    @Test
    public void testSetPlacaInvalida(){
        System.out.println("SetPlacaInvalida");
        Coletor instance = new Coletor();
        
        try {
            instance.setPlaca("");
            instance.setPlaca(" ");
            instance.setPlaca("ABC-123");
            instance.setPlaca("ABCD123");
            instance.setPlaca("ABC11111");
            instance.setPlaca("ABC 123");
            instance.setPlaca("AAAAAAA");
            instance.setPlaca("abc1234");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }


    /**
     * Test of setCapacidade method, of class Coletor.
     */
    @Test
    public void testSetCapacidadeValida() {
        System.out.println("setCapacidadeValida");
        Coletor instance = new Coletor();
        
        try {
            instance.setCapacidade("112");
            instance.setCapacidade("3333");

        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

    /**
     * Test of setCapacidade method, of class Coletor.
     */
    @Test
    public void testSetCapacidadeInvalida(){
        System.out.println("testSetCapacidadeInvalida");
        Coletor instance = new Coletor();
        
        try {
            instance.setCapacidade("0");
            instance.setCapacidade("");
            instance.setCapacidade(" ");
            instance.setCapacidade("abc8");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setMarca method, of class Coletor.
     */
    @Test
    public void testSetMarcaValida() {
        System.out.println("testSetMarcaValida");
        Coletor instance = new Coletor();
        
        try {
            instance.setMarca("Toyota");
            instance.setMarca("Volkswagen");

        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

    /**
     * Test of setMarca method, of class Coletor.
     */
    @Test
    public void testSetMarcaInvalida() {
        System.out.println("testSetMarcaInvalida");
        Coletor instance = new Coletor();
        
        try {
            instance.setMarca("");
            instance.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            instance.setMarca(" ");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setModelo method, of class Coletor.
     */
    @Test
    public void testSetModeloValido() {
        System.out.println("testSetModeloValido");
        Coletor instance = new Coletor();
     
        try {
            instance.setModelo("VEGALIX");
            instance.setModelo("SITA 6000");

        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

    /**
     * Test of setModelo method, of class Coletor.
     */
    @Test
    public void testSetModeloInvalido() {
        System.out.println("testSetModeloInvalido");
        Coletor instance = new Coletor();
        
        try {
            instance.setModelo("");
            instance.setModelo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            instance.setModelo(" ");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setAno method, of class Coletor.
     */
    @Test
    public void testSetAnoValido() {
        System.out.println("testSetAnoValido");
        Coletor instance = new Coletor();
        
        try {
            instance.setAno("2008");
            instance.setAno("1955");

        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

    /**
     * Test of setAno method, of class Coletor.
     */
    @Test
    public void testSetAnoInvalido(){
        System.out.println("testSetAnoInvalido");
        Coletor instance = new Coletor();
        
        try {
            instance.setAno("1900");
            instance.setAno("abc1998");
            instance.setAno("abcde");
            instance.setAno("2050");
            instance.setAno("");
            instance.setAno(" ");
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
