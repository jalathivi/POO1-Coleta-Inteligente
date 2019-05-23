/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

/**
 *
 * @author 20172BSI0335
 */
public class ValidadorPosicao {
    
    
    public void latitude(String latitude) throws Exception {
        if (latitude.equalsIgnoreCase(""))
              throw new Exception("O campo latitude deve ser preenchido"); 
        if (!latitude.matches("[-+]?[0-9]*\\.?[0-9]*"))
            throw new Exception("O campo latitude deve ser numérico");
        
        Float float_latitude = Float.parseFloat(latitude); 
        if (float_latitude < -90 || float_latitude > 90)
            throw new Exception("Intervalo valido para a latitude é -90º a 90º");            
    }

    public void longitude(String longitude) throws Exception {
        if (longitude.equalsIgnoreCase(""))
              throw new Exception("O campo longitude deve ser preenchido"); 
        if (!longitude.matches("[-+]?[0-9]*\\.?[0-9]*"))
            throw new Exception("O campo longitude deve ser numérico");
        
        Float float_latitude = Float.parseFloat(longitude); 
        if (float_latitude < -180 || float_latitude > 180)
            throw new Exception("Intervalo valido para a longitude é -180º a 180º"); 
    }
}
