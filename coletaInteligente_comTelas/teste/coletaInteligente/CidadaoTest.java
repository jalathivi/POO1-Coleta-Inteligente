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
public class CidadaoTest {
    
    public CidadaoTest() {
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
     * Test of getCodigo method, of class Cidadao.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Cidadao instance = new Cidadao();
        int expResult = instance.getCodigo();
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Codigo gerado 2 vezes para a mesma instancia");
    }

    /**
     * Test of getNome method, of class Cidadao.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetNome() throws Exception {
        System.out.println("getNome");
        Cidadao instance = new Cidadao();
        String expResult = "Thiago";
        instance.setNome(expResult);
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Nome não está sendo pego corretamente");
    }

    /**
     * Test of setNome method, of class Cidadao.
     * @throws java.lang.Exception
     */
    @Test
    public void testSetNome() throws Exception {
        System.out.println("setNome");
        String nome = "Thiago";
        Cidadao instance = new Cidadao();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Nome não pode ser vazio");
    }

    /**
     * Test of getEmail method, of class Cidadao.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetEmail() throws Exception {
        //System.out.println(" !getEmail ");
        Cidadao instance = new Cidadao();
        String expResult = "thiagom.r@hotmail.com";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        System.out.print(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("getEMail mal executado");
    }

    /**
     * Test of setEmail method, of class Cidadao.
     * @throws java.lang.Exception
     */
    @Test
    public void testSetEmail() throws Exception {
        System.out.println("setEmail");
        String email = "thiagom.r@hotmail.com";
        Cidadao instance = new Cidadao();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Email deve seguir as regras definidas pelo validador");
    }

    /**
     * Test of getSenha method, of class Cidadao.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetSenha() throws Exception {
        System.out.println("getSenha");
        Cidadao instance = new Cidadao();
        String expResult = "123456";
        instance.setSenha(expResult);
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("getSenha incorreto");
    }

    /**
     * Test of setSenha method, of class Cidadao.
     * @throws java.lang.Exception
     */
    @Test
    public void testSetSenha() throws Exception {
        System.out.println("setSenha");
        String senha = "123456";
        Cidadao instance = new Cidadao();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("A senha deve atender os requisitos indicados pelo validador");
    }

    /**
     * Test of getLatitude method, of class Cidadao.
     */
    @Test
    public void testGetLatitude() {
        System.out.println("getLatitude");
        Cidadao instance = new Cidadao();
        float expResult = instance.getLatitude();
        float result = instance.getLatitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("getLatitude Incorreto");
    }

    /**
     * Test of getLongitude method, of class Cidadao.
     */
    @Test
    public void testGetLongitude() {
        System.out.println("getLongitude");
        Cidadao instance = new Cidadao();
        float expResult = instance.getLongitude();
        float result = instance.getLongitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("getLongitude incorreto");
    }

    /**
     * Test of toString method, of class Cidadao.
     */
    //@Test
    public void testToString() {
        System.out.println("toString");
        Cidadao instance = new Cidadao();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
