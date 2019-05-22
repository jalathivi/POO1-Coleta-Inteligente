
package coletaInteligente;

import Validador.ValidadorLixeira;
import Validador.ValidadorPosicao;

import java.util.Random;

public class Lixeira {
    
    private int codigo;
    private Bairro bairro;
    private float capacidade;
    private float nivelAtual;
    private float latitude;
    private float longitude;    
    
    
    public Lixeira(){
    }
    

    public Lixeira(Bairro bairro, String capacidade, String nivelAtual) throws Exception{   
        Random random = new Random();
        setCodigo(Integer.toString(random.nextInt(100)));
        setRegiao(bairro);
        setLatitude(Float.toString(random.nextFloat()));
        setLongitude(Float.toString(random.nextFloat()));
        setCapacidade(capacidade);
        setNivelAtual(nivelAtual);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {     
        ValidadorLixeira valLixeira = new ValidadorLixeira();
        valLixeira.codigo(codigo);
        this.codigo = Integer.parseInt(codigo);
    }

    public int getCodRegiao() {
        return bairro.getCodigo();
    }
    
    public String getNomeBairro() {
        return bairro.getNome();
    }

    public void setRegiao(Bairro bairro) {
        this.bairro = bairro;
    }


    public void setNivelAtual(String nivel) throws Exception {
        ValidadorLixeira valLixeira = new ValidadorLixeira();
        valLixeira.nivelAtual(nivel);
        this.nivelAtual = Float.parseFloat(nivel);
    }
    
    public float getNivelAtual() {
        return nivelAtual;
    }

    public float getLatitude() {
        return latitude;
    }    
    
    public void setLatitude(String latitude) throws Exception {
        ValidadorPosicao valPosicao = new ValidadorPosicao();
        valPosicao.latitude(latitude);
        this.latitude = Float.parseFloat(latitude);
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) throws Exception {
        ValidadorPosicao valPosicao = new ValidadorPosicao();
        valPosicao.latitude(longitude);
        this.longitude = Float.parseFloat(longitude);
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) throws Exception{
        ValidadorLixeira valLixeira = new ValidadorLixeira();
        valLixeira.capacidade(capacidade);
        this.capacidade = Float.parseFloat(capacidade);
    }

    @Override
    public String toString() {
        return  getCodigo()+", "+getCodRegiao()+", "+getCapacidade()+", "+getLatitude()+", "+getLongitude()+", "+ getNivelAtual();
    }

}
