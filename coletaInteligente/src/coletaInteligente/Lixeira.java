/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;

/**
 *
 * @author Vinicius
 */
public class Lixeira {
    int codigo;
    int cod_Regiao;
    float latitude;
    float longitude;
    int capacidade;
    
    public Lixeira(String codigo, String regiao, String latitude, String longitude, String capacidade){
        this.codigo = Integer.parseInt(codigo);
        this.cod_Regiao = Integer.parseInt(regiao);
        this.latitude = Float.parseFloat(latitude);
        this.longitude = Float.parseFloat(longitude);
        this.capacidade = Integer.parseInt(capacidade);
}
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_Regiao() {
        return cod_Regiao;
    }

    public void setCod_Regiao(int cod_Regiao) {
        this.cod_Regiao = cod_Regiao;
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
}
