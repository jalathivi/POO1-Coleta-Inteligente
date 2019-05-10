
package coletaInteligente;

import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class Cidadao {
    int codigo;
    String nome;
    String email;
    String senha;
    float latitude;
    float longitude;
    
    public Cidadao (){
    }
    
    public Cidadao (int codigo, String nome, String email, String senha, float latitude, float longitude){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public Cidadao (String codigo, String nome, String email, String senha, String latitude, String longitude){
        this.codigo = Integer.parseInt(codigo);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.latitude = Float.parseFloat(latitude);
        this.longitude = Float.parseFloat(longitude);
    }
    

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigoCidadao) {
        this.codigo = codigoCidadao;
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

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+getNome()+", "+getEmail()+", "+getSenha()+", "+getLatitude()+", "+getLongitude();   
    }



    

}