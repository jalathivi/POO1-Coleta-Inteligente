/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

/**
 *
 * @author thiag
 */
public interface Validador {
    
    public void nome(String nome) throws Exception;
    public void email(String email) throws Exception;
    public void senha(String senha) throws Exception;
    
    
    
}
