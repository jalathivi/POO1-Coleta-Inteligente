package coletaInteligente;


/**
 * @author Jackson Willian Silva Agostinho
 */
public class Coletor {
    
    int codigoColetor;
    String placa;
    float latitude;
    float longitude;
    float capacidade;
    String marca;
    String modelo;
    int ano;

    public Coletor(String codigoColetor, String placa, String marca, String  modelo, String ano, String latitude, String longitude, String capacidade ) {
        
        this.codigoColetor = Integer.parseInt(codigoColetor);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = Integer.parseInt(ano);
        this.longitude = Float.parseFloat(longitude);
        this.latitude = Float.parseFloat(latitude);
        this.capacidade = Float.parseFloat(capacidade);
   
    }

    public int getCodigo() {
        return codigoColetor;
    }

    public void setCodigo(int codigo) {
        this.codigoColetor = codigoColetor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public String getMarca(){
       return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}