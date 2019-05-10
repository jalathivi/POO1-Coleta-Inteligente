
package coletaInteligente;

import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class Cidadao {
    int codigoCidadao;
    String nomeCidadao;
    String emailCidadao;
    String senhaCidadao;
    float latitude;
    float longitude;
    
    public Cidadao (){
    }
    
    public Cidadao (int codigo, String nome, String email, String senha, float latitude, float longitude){
        this.codigoCidadao = codigo;
        this.nomeCidadao = nome;
        this.emailCidadao = email;
        this.senhaCidadao = senha;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public Cidadao (String codigo, String nome, String email, String senha, String latitude, String longitude){
        this.codigoCidadao = Integer.parseInt(codigo);
        this.nomeCidadao = nome;
        this.emailCidadao = email;
        this.senhaCidadao = senha;
        this.latitude = Float.parseFloat(latitude);
        this.longitude = Float.parseFloat(longitude);
    }
    

    
    public int getCodigoCidadao() {
        return codigoCidadao;
    }

    public void setCodigoCidadao(int codigoCidadao) {
        this.codigoCidadao = codigoCidadao;
    }

    public String getNomeCidadao() {
        return nomeCidadao;
    }

    public void setNomeCidadao(String nomeCidadao) {
        this.nomeCidadao = nomeCidadao;
    }

    public String getEmail() {
        return emailCidadao;
    }
    
    
    public boolean verificaEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
        Pattern pat = Pattern.compile(emailRegex);
        
        if (email == null)
            return false;
        
        return pat.matcher(email).matches();
    } 
    
    
    public void setEmail(String email) {
        this.emailCidadao = email;
    }

    public String getSenhaCidadao() {
        return senhaCidadao;
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
   
    
    public void setSenhaCidadao(String senhaCidadao) {
        /*necessario algo para verificacao e validacao da senhaCidadao*/
        this.senhaCidadao = senhaCidadao;
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
        return "codigoCidadao=" + codigoCidadao + ", nomeCidadao=" + nomeCidadao + ", emailCidadao=" + emailCidadao + ", senhaCidadao=" + senhaCidadao + ", latitude=" + latitude + ", longitude=" + longitude;
    }



    

}