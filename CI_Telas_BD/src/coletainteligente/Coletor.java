package coletainteligente;

import validador.ValidadorColetor;
import validador.ValidadorPosicao;
import java.util.Random;

public class Coletor {
    
    private int codigo;
    private String placa;
    private float capacidade;
    private String marca;
    private String modelo;
    private int ano;
    private float latitude;
    private float longitude;
    
    
    public Coletor (){
    }
     
    public Coletor(String placa, String marca, String  modelo, String ano, String capacidade ) throws Exception{
        Random random = new Random();
        setCodigo(Integer.toString(random.nextInt(90)));
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setCapacidade(capacidade);
        setLatitude(Float.toString(random.nextFloat() + random.nextInt(90)));
        setLongitude(Float.toString(random.nextFloat() + random.nextInt(90)));
    }
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.codigo(codigo);
        this.codigo = Integer.parseInt(codigo);
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws Exception {
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.placa(placa);
        this.placa = placa;
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
        valPosicao.longitude(longitude);
        this.longitude = Float.parseFloat(longitude);
    }
    

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) throws Exception{
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.capacidade(capacidade);
        this.capacidade = Float.parseFloat(capacidade);
    }

    public String getMarca(){
       return marca;
    }
    
    public void setMarca(String marca) throws Exception{
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.marca(marca);
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws Exception {
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.modelo(modelo);
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(String ano) throws Exception{
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.ano(ano);
        this.ano = Integer.parseInt(ano);
    }

    @Override
    public String toString() {
        return getCodigo()+", "+getPlaca()+", "+getMarca()+", "+getModelo()+", "+getAno()+", "+getCapacidade()+", "+getLatitude()+", "+getLongitude() ;
    }

}