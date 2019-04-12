/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;

import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class Cidadao {
    String codigo;
    String nome;
    String email;
    String senha;
    Double latitude;
    Double longitude;
    
    public Cidadao (){
    }
    
    public Cidadao (String codigo, String nome, String email, String senha, Double latitude, Double longitude){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public Cidadao (String codigo, String nome, String email, String senha, String latitude, String longitude){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.latitude = Double.parseDouble(latitude);
        this.longitude = Double.parseDouble(longitude);
    }
    

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    
    
    public boolean verificaEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
        Pattern pat = Pattern.compile(emailRegex);
        
        if (email == null)
            return false;
        
        return pat.matcher(email).matches();
    } 
    
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    

    public boolean verificaSenha(String senha){
        // pelo menos um numero e entre 6 e 14 digitos
        String PASSWORD_PATTERN = "((?=.*\\d).{6,14})";
        
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        
        if (senha == null)
            return false;
        
        Matcher matcher = pattern.matcher(senha);
        
        return matcher.matches();
    } 
   
    
    public void setSenha(String senha) {
        /*necessario algo para verificacao e validacao da senha*/
        this.senha = senha;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    
}