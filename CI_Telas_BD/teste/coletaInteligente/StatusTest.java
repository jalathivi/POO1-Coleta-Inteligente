/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;

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
     * Test of getCodigo method, of class Status.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Status instance = new Status();
        int expResult = instance.getCodigo();
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Status.
     */
    @Test
    public void testGetDescricao() throws Exception {
        System.out.println("getDescricao");
        Status instance = new Status();
        String expResult = "Estragado";
        instance.setDescricao(expResult);
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Status.
     * @throws java.lang.Exception
     */
    @Test
    public void testSetDescricao() throws Exception {
        System.out.println("setDescricao");
        String descricao = "Estragado";
        Status instance = new Status();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
