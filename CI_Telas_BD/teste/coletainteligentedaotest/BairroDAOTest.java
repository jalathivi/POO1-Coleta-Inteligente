/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedaotest;

import coletainteligente.Bairro;
import coletainteligentedao.BairroDAO;
import java.util.ArrayList;
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
public class BairroDAOTest {
    
    public BairroDAOTest() {
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
     * Test of insere method, of class BairroDAO.
     */
    //@Test
    public void testInsere() {
        System.out.println("1231");
        Bairro b = null;
        BairroDAO instance = new BairroDAO();
        instance.insere(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readBairro method, of class BairroDAO.
     */
    @Test
    public void testReadBairro() {
        System.out.println("readBairro");
        String nome = "";
        BairroDAO instance = new BairroDAO();
        boolean expResult = false;
        boolean result = instance.readBairro(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectListaBairro method, of class BairroDAO.
     */
    @Test
    public void testSelectListaBairro() {
        System.out.println("selectListaBairro");
        BairroDAO instance = new BairroDAO();
        ArrayList expResult = instance.selectListaBairro();
        ArrayList result = instance.selectListaBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleta method, of class BairroDAO.
     */
    @Test
    public void testDeleta() {
        System.out.println("deleta");
        String nome = "";
        BairroDAO instance = new BairroDAO();
        instance.deleta(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alteraBairro method, of class BairroDAO.
     */
    @Test
    public void testAlteraBairro() {
        System.out.println("alteraBairro");
        String nomeOld = "Coqueiral";
        String nome = "Santa Monica";
        BairroDAO instance = new BairroDAO();
        instance.alteraBairro(nomeOld, nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
}
