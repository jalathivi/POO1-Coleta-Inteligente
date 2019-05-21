
package coletaInteligente;

import Validador.ValidadorCidadao;
import java.util.Random;

public class Cidadao{
    
    int codigo;
    private String nome;
    private String email;
    private String senha;
    float latitude;
    float longitude;
    
    public Cidadao (){
    }
   
    public Cidadao (String nome, String email, String senha) throws Exception {
        Random random = new Random();
        setCodigo(random.nextInt(100));
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setLatitude(random.nextFloat());
        setLongitude(random.nextFloat());
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        ValidadorCidadao valCidadao = new ValidadorCidadao();
        valCidadao.verificaNome(nome);
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) throws Exception {
        ValidadorCidadao valCidadao = new ValidadorCidadao();
        valCidadao.verificaEmail(email);
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) throws Exception {
        ValidadorCidadao valCidadao = new ValidadorCidadao();
        valCidadao.verificaSenha(senha);        
        this.senha = senha;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude){
        this.latitude = latitude;
    }
    
    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude){
        this.longitude = longitude;
    }
    
    @Override
    public String toString() {
        return getCodigo()+", "+getNome()+", "+getEmail()+", "+getSenha()+", "+getLatitude()+", "+getLongitude();   
    }



    

}