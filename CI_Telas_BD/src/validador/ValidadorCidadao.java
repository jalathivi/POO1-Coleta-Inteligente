/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador;

import java.util.regex.Pattern;

/**
 *
 * @author 20162bsi0317
 */
public class ValidadorCidadao implements Validador {
    
    
   public void codigo(String codigo) throws Exception {
        if(codigo.equalsIgnoreCase(""))
            throw new Exception("O campo codigo deve ser preenchido");
        if (!codigo.matches("[0-9]*"))
            throw new Exception ("O campo codigo só deve ter numeros sem sinal");
    }    
    
   
    @Override
    public void nome(String nome) throws Exception{
        if(nome.equalsIgnoreCase(""))
            throw new Exception("O Nome é um campo obrigatório");
        
        if ((nome.matches("[\\W]*") && !nome.matches("[a-zA-Z]*")) || (nome.matches("[0-9]*") && !nome.matches("[a-zA-Z]*")) )  
            throw new Exception("Marca deve conter letras!");
    }
    
    @Override
    public void email(String email) throws Exception{
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
        Pattern pat = Pattern.compile(emailRegex);
        
        if (email.equalsIgnoreCase(""))
            throw new Exception("O email não pode ser Vazio");
        if(!pat.matcher(email).matches())
            throw new Exception("O email deve ter um formato do tipo nome@nomeProvedorEmail.com");
        
       
    }
    
    @Override
    public void senha(String senha) throws Exception{
        // pelo menos um numero e entre 6 e 14 digitos
        String PASSWORD_PATTERN = "((?=.*\\d).{6,14})";
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        
        if (senha.equalsIgnoreCase(""))
            throw new Exception("Senha não pode ser vazia");
        if(!pattern.matcher(senha).matches())
            throw new Exception("Senha deve ter de 6 a 14 caracteres");
    }
    
    
}
