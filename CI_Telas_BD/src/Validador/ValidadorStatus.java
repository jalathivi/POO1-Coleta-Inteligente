/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

public class ValidadorStatus {
    
    
    public void verificaDescricao(String descricao) throws Exception{
    
        if(descricao.equals(""))
            throw new Exception("Descrição não deve ser vazio!");
        
       if(descricao.length() > 256)
           throw new Exception ("Descrição pode possuir no máximo 32 caracteres!");
    }
}
