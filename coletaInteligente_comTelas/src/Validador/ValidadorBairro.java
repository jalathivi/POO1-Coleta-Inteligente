/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;


public class ValidadorBairro {
        
    
        public void codigo(String codigo) throws Exception {
            if(codigo.equalsIgnoreCase(""))
                throw new Exception("O campo codigo deve ser preenchido");
            if (!codigo.matches("[0-9]*"))
                throw new Exception ("O campo codigo só deve ter numeros sem sinal");
        }
        
        
        public void nome(String nome) throws Exception{
  
            if (nome.equalsIgnoreCase(""))
                throw new Exception("Bairro não pode ser vazio!");

            if(nome.length()> 32)
                throw new Exception("Bairro pode possuir no máximo 32 caracteres!");
    }
    
}
