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
    
    public void verificaNome(String nome) throws Exception;
    public void verificaEmail(String email) throws Exception;
    public void verificaSenha(String senha) throws Exception;
    
    
    
}
