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
}
