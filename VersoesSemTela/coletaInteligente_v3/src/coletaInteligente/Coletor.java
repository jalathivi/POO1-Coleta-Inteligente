package coletaInteligente;

public class Coletor {
    
    int codigoColetor;
    String placaColetor;
    float latitude;
    float longitude;
    float capacidadeColetor;
    String marcaColetor;
    String modeloColetor;
    int anoColetor;

    public Coletor(String codigoColetor, String placa, String marca, String  modelo, String ano, String latitude, String longitude, String capacidade ) {
        
        this.codigoColetor = Integer.parseInt(codigoColetor);
        this.placaColetor = placa;
        this.marcaColetor = marca;
        this.modeloColetor = modelo;
        this.anoColetor = Integer.parseInt(ano);
        this.longitude = Float.parseFloat(longitude);
        this.latitude = Float.parseFloat(latitude);
        this.capacidadeColetor = Float.parseFloat(capacidade);
   
    }

    public int getCodigo() {
        return codigoColetor;
    }

    public void setCodigo(int codigo) {
        this.codigoColetor = codigo;
    }

    public String getPlacaColetor() {
        return placaColetor;
    }

    public void setPlacaColetor(String placaColetor) {
        this.placaColetor = placaColetor;
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

    public float getCapacidadeColetor() {
        return capacidadeColetor;
    }

    public void setCapacidadeColetor(float capacidadeColetor) {
        this.capacidadeColetor = capacidadeColetor;
    }

    public String getMarcaColetor(){
       return marcaColetor;
    }
    
    public void setMarcaColetor(String marcaColetor){
        this.marcaColetor = marcaColetor;
    }
    
    public String getModeloColetor() {
        return modeloColetor;
    }

    public void setModeloColetor(String modeloColetor) {
        this.modeloColetor = modeloColetor;
    }

    public int getAnoColetor() {
        return anoColetor;
    }

    public void setAnoColetor(int anoColetor) {
        this.anoColetor = anoColetor;
    }

    @Override
    public String toString() {
        return "codigoColetor=" + codigoColetor + ", placaColetor=" + placaColetor + ", latitude=" + latitude + ", longitude=" + longitude + ", capacidadeColetor=" + capacidadeColetor + ", marcaColetor=" + marcaColetor + ", modeloColetor=" + modeloColetor + ", anoColetor=" + anoColetor;
    }

    
    
}
