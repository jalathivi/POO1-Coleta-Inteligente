/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 20162bsi0317
 */
public class ValidadorUsuario implements Validador {
    
    @Override
    public void verificaNome(String nome) throws Exception{
        if(nome.equalsIgnoreCase(""))
            throw new Exception("O Nome é um campo obrigatório");
    }
    
    @Override
    public void verificaEmail(String email) throws Exception{
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
        Pattern pat = Pattern.compile(emailRegex);
        
        if (email.equalsIgnoreCase(""))
            throw new Exception("O email não pode ser Vazio");
        if(!pat.matcher(email).matches())
            throw new Exception("O email deve ter um formato do tipo nome@nomeProvedorEmail.com");
        
       
    }
    
    @Override
    public void verificaSenha(String senha) throws Exception{
        // pelo menos um numero e entre 6 e 14 digitos
        String PASSWORD_PATTERN = "((?=.*\\d).{6,14})";
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        
        if (senha.equalsIgnoreCase(""))
            throw new Exception("Senha não pode ser vazia");
        if(!pattern.matcher(senha).matches())
            throw new Exception("Senha deve ter de 6 a 14 caracteres numéricos");
    }
    
    public void senhaIguais (String senha, String senha2) throws Exception{
        
        if (!senha.equals(senha2))
            throw new Exception("As senhas digitadas não são iguais!");
    }
    
    
}
