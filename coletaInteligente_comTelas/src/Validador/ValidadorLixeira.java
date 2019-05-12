/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;


/**
 *
 * @author Vinicius
 */
public class ValidadorLixeira {
        
    public void codigo(String cod) throws Exception {
        if(cod.equalsIgnoreCase(""))
            throw new Exception("O campo codigo deve ser preenchido");
        if (!cod.matches("[0-9]*"))
            throw new Exception ("O campo codigo só deve ter numeros sem sinal");
    }
    
    public void bairro(String bairro) throws Exception {
        if (bairro.equalsIgnoreCase(""))
            throw new Exception ("O campo bairro deve ser preenchido");
        if (!bairro.matches("[a-z A-Z0-9]*"))
            throw new Exception ("O campo bairro só deve ter letras e números");
    }
    
    public void latitude(String lat) throws Exception {
        if (lat.equalsIgnoreCase(""))
              throw new Exception("O campo latitude deve ser preenchido"); 
        if (!lat.matches("[-+]?[0-9]*\\.?[0-9]*"))
            throw new Exception("O campo latitude deve ser numérico");
        
        Float float_lat = Float.parseFloat(lat); 
        if (float_lat < -90 || float_lat > 90)
            throw new Exception("Intervalo valido para a latitude é -90º a 90º");            
    }

    public void longitude(String lon) throws Exception {
        if (lon.equalsIgnoreCase(""))
              throw new Exception("O campo latitude deve ser preenchido"); 
        if (!lon.matches("[-+]?[0-9]*\\.?[0-9]*"))
            throw new Exception("O campo latitude deve ser numérico");
        
        Float float_lon = Float.parseFloat(lon); 
        if (float_lon < -180 || float_lon > 180)
            throw new Exception("Intervalo valido para a longitude é -180º a 180º"); 
    }

    public void capacidade(String capacidade) throws Exception {
        if (capacidade.equalsIgnoreCase(""))
            throw new Exception("O campo capacidade deve ser preenchido");
        if (!capacidade.matches("[0-9]*"))
            throw new Exception ("O campo capacidade só suporta números");
    }
    public void todosCampos(String cod, String bai, String lat, String lon, String cap) {
        try {
            codigo(cod);
            bairro(bai);
            latitude(lat);
            longitude(lon);
            capacidade(cap);  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    
//    Exemplo de testes:         
//    ValidadorLixeira validaLixeira = new ValidadorLixeira();
//    validaLixeira.todosCampos("1", "santo antonio", "-40.00", "-20.00", "200");
}