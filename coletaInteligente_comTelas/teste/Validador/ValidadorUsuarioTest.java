/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

import coletaInteligente.Cidadao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20162BSI0317
 */
public class ValidadorUsuarioTest {
    
    public ValidadorUsuarioTest() {
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
     * Test of verificaNome method, of class ValidadorUsuario.
     */
//    @Test
    public void testVerificaNome() throws Exception {
        System.out.println("verificaNome");
        String nome = "";
        ValidadorUsuario instance = new ValidadorUsuario();
        instance.verificaNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaEmail method, of class ValidadorUsuario.
     */
//    @Test
    public void testVerificaEmail() throws Exception {
        System.out.println("verificaEmail");
        String email = "";
        ValidadorUsuario instance = new ValidadorUsuario();
        instance.verificaEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaSenha method, of class ValidadorUsuario.
     */
    @Test
    public void testVerificaSenha() throws Exception {
        setSenhaInvalida("156duyabdua");
        
    }
    
    private void setSenhaInvalida(String senha) {
        ValidadorUsuario instancia = new ValidadorUsuario();
        
        try {
            instancia.verificaSenha(senha);
            fail("");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); 
            
        }
      
    }

    /**
     * Test of senhaIguais method, of class ValidadorUsuario.
     */
//    @Test
    public void testSenhaIguais() throws Exception {
        System.out.println("senhaIguais");
        String senha = "";
        String senha2 = "";
        ValidadorUsuario instance = new ValidadorUsuario();
        instance.senhaIguais(senha, senha2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
