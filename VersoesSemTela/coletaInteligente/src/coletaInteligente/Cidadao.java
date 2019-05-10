/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;

public class Cidadao {
    String codigo;
    String nome;
    String email;
    String senha;
    Double latitude;
    Double longitude;
    
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
    
    /*
    public int verifica_email(String email){
    } 
    */
    
    public void setEmail(String email) {
        /*necessario algo para verificacao e validacao do email*/
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    
    /*
    public int verifica_senha(String senha){
    } 
    */
    
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
    
    /*
    public void printa(Cidadao cidadao){
        System.out.println(cidadao.getCodigo() + "," + cidadao.getNome()+ "," + cidadao.getEmail() + "," + cidadao.getSenha() + "," + cidadao.getLatitude() + "," + cidadao.getLongitude()+ "\r\n");  
    }
    */
}