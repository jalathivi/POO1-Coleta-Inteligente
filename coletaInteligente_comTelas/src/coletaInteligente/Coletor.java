package coletaInteligente;

public class Coletor {
    
    int codigo;
    String placa;
    float latitude;
    float longitude;
    float capacidade;
    String marca;
    String modelo;
    int ano;

    public Coletor (){
    }
    
    public Coletor(String codigo, String placa, String marca, String  modelo, String ano, String latitude, String longitude, String capacidade ) {
        this.codigo = Integer.parseInt(codigo);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = Integer.parseInt(ano);
        this.longitude = Float.parseFloat(longitude);
        this.latitude = Float.parseFloat(latitude);
        this.capacidade = Float.parseFloat(capacidade);
    }
    //COLETOR TEM UM CÓDIGO E NÃO TEM UM NOME? E SE ELE VAI DIRIGIR NÃO DEVERIA TER A CNH?
    public Coletor(int codigo, String placa, String marca, String  modelo, int ano, float latitude, float longitude, float capacidade ) {
        this.codigo = codigo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.longitude = longitude;
        this.latitude = latitude;
        this.capacidade = capacidade;
    }    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    @Override
    public String toString() {
        return getCodigo()+", "+getPlaca()+", "+getMarca()+", "+getModelo()+", "+getAno()+", "+getCapacidade()+", "+getLatitude()+", "+getLongitude() ;
    }

}