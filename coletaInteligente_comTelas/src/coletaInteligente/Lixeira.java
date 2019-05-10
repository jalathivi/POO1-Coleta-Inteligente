
package coletaInteligente;

import java.util.Random;

public class Lixeira {
    int codigo;
    Bairro regiao;
    float latitude;
    float longitude;
    float capacidade;
    
    Random random = new Random();
    
    public Lixeira(){
    }
    
    public Lixeira(Bairro regiao, String capacidade){
        this.codigo = random.nextInt(100);
        this.regiao = regiao;
        this.latitude = random.nextFloat();
        this.longitude = random.nextFloat();
        this.capacidade = Float.parseFloat(capacidade);
    }
    
    public Lixeira(Bairro regiao, float capacidade){
        this.codigo = random.nextInt(100);
        this.regiao = regiao;
        this.latitude = random.nextFloat();
        this.longitude = random.nextFloat();
        this.capacidade = capacidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        this.codigo = random.nextInt(100);
    }

    public int getCodRegiao() {
        return regiao.getCodigo();
    }
    
    public String getNomeBairro() {
        return regiao.getNome();
    }

    public void setRegiao(Bairro regiao) {
        this.regiao = regiao;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude() {
        this.latitude = random.nextInt(100);
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude() {
        this.longitude = random.nextInt(100);
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return  getCodigo()+", "+getCodRegiao()+", "+getCapacidade()+", "+getLatitude()+", "+getLongitude();
    }

}
