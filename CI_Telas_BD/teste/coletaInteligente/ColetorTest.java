/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;

import coletainteligente.Coletor;
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
       
        Coletor instance = new Coletor();
   
        try {         
            instance.setCodigo(codigo);
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Input válido não foi aceito!\n");
            System.out.println(ex.getMessage());
        }
    }    
    
    public void setCodigoInvalido(String codigo){
    
        Coletor instance = new Coletor();

        try {         
            instance.setCodigo(codigo);
            fail("Teste Falhou: Input inválido foi aceito!\n");
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }       
    
    /**
     * Test of setPlaca method, of class Coletor.
     */
    @Test
    public void testSetPlaca(){
        testSetPlacaValida("ABC1234");
        testSetPlacaInvalida("");
        testSetPlacaInvalida(" ");
        testSetPlacaInvalida("ABC-123");
        testSetPlacaInvalida("ABCD123");
        testSetPlacaInvalida("ABC11111");
        testSetPlacaInvalida("ABC 123");
        testSetPlacaInvalida("AAAAAAA");
        testSetPlacaInvalida("abc1234");
    }
    
    public void testSetPlacaValida(String placa) {
        System.out.println("setPlacaValida");
        Coletor instance = new Coletor();
        
        try {
            instance.setPlaca(placa);
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

    public void testSetPlacaInvalida(String placa){
        System.out.println("setPlacaInvalida");
        Coletor instance = new Coletor();
        
        try {
            instance.setPlaca(placa);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }


    /**
     * Test of setCapacidade method, of class Coletor.
     */
    @Test
    public void testSetCapacidade(){
        testSetCapacidadeValida("112");
        testSetCapacidadeValida("3333");
        testSetCapacidadeInvalida("");
        testSetCapacidadeInvalida(" ");
        testSetCapacidadeInvalida("0");
        testSetCapacidadeInvalida("abc3");

    }
    
    public void testSetCapacidadeValida(String capacidade) {
        System.out.println("setCapacidadeValida");
        Coletor instance = new Coletor();
        
        try {
            instance.setCapacidade(capacidade);

        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

    public void testSetCapacidadeInvalida(String capacidade){
        System.out.println("testSetCapacidadeInvalida");
        Coletor instance = new Coletor();
        
        try {
            instance.setCapacidade(capacidade);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setMarca method, of class Coletor.
     */
    @Test
    public void testSetMarca(){
        testSetMarcaValida("Toyota");
        testSetMarcaValida("Volkswagen");
        testSetMarcaInvalida("");
        testSetMarcaInvalida(" ");
        testSetMarcaInvalida("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

    }
    
    public void testSetMarcaValida(String marca) {
        System.out.println("testSetMarcaValida");
        Coletor instance = new Coletor();
        
        try {
            instance.setMarca(marca);

        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }


    public void testSetMarcaInvalida(String marca) {
        System.out.println("testSetMarcaInvalida");
        Coletor instance = new Coletor();
        
        try {
            instance.setMarca(marca);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setModelo method, of class Coletor.
     */
    @Test
    public void testSetModelo(){
        testSetModeloValido("VEGALIX");
        testSetModeloValido("sita 6000");
        testSetModeloInvalido("");
        testSetModeloInvalido(" ");
        testSetModeloInvalido("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

    }
    
    public void testSetModeloValido(String modelo) {
        System.out.println("testSetModeloValido");
        Coletor instance = new Coletor();
     
        try {
            instance.setModelo(modelo);

        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

    public void testSetModeloInvalido(String modelo) {
        System.out.println("testSetModeloInvalido");
        Coletor instance = new Coletor();
        
        try {
            instance.setModelo(modelo);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setAno method, of class Coletor.
     */
    @Test
    public void testSetAno(){
        testSetAnoValido("2008");
        testSetAnoValido("1955");
        testSetAnoInvalido("");
        testSetAnoInvalido(" ");
        testSetAnoInvalido("2050");
        testSetAnoInvalido("abcde");
        testSetAnoInvalido("abc1998");
        testSetAnoInvalido("1900");   

    }

    public void testSetAnoValido(String ano) {
        System.out.println("testSetAnoValido");
        Coletor instance = new Coletor();
        
        try {
            instance.setAno(ano);

        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
        }
    }

    public void testSetAnoInvalido(String ano){
        System.out.println("testSetAnoInvalido");
        Coletor instance = new Coletor();
        
        try {
            instance.setAno(ano);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   @Test
    public void testSetLatitude() {
        
        System.out.println("setLatitudeValido");
        setLatitudeValido("90.000");
        setLatitudeValido("-65.8485");
        setLatitudeValido("-40.42200");
        setLatitudeValido("00");
        
        System.out.println("setLatitudeInvalido");
        setLatitudeInvalido("180");
        setLatitudeInvalido("325oi1265");
        setLatitudeInvalido("jujuba");
        setLatitudeInvalido("totosa");
    }
        
    public void setLatitudeValido(String latitude){
     
        Coletor instance = new Coletor();
   
        try {         
            instance.setLatitude(latitude);
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void setLatitudeInvalido(String latitude){
       
        Coletor instance = new Coletor();
   
        try {         
            instance.setLatitude(latitude);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
    
    @Test
    public void testSetLongitude() {
        
        System.out.println("setLongitudeValido");
        setLongitudeValido("90.000");
        setLongitudeValido("-65.8485");
        setLongitudeValido("-40.42200");
    
        System.out.println("setLongitudeInvalido");
        setLongitudeInvalido("360.0065");
        setLongitudeInvalido("325oi1265");
        setLongitudeInvalido("jujuba");
        setLongitudeInvalido("totosa"); 
    }
        
    public void setLongitudeValido(String longitude){
        
        Coletor instance = new Coletor();
   
        try {         
            instance.setLongitude(longitude);
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Teste Falhou: Inputs válidos não foram aceitos!\n");
            System.out.println(ex.getMessage());
        }
    }
     
    public void setLongitudeInvalido(String longitude){
       
        Coletor instance = new Coletor();
   
        try {         
            instance.setLongitude(longitude);
            fail("Teste Falhou: Inputs inválidos foram aceitos!\n");
            
        } catch (Exception ex) {
            Logger.getLogger(ColetorTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }  

    
}
