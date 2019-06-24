
package coletainteligente;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

public class Coleta {



    public Lixeira lixeira;
    public Coletor coletor;
    private Date data;
    private float volume;

    public Coleta (){   
    }

     public Coleta(Lixeira lixeira, Coletor coletor, String volume,Date hora, Date data ){
        setLixeira(lixeira);
        setColetor(coletor);
        setData(data);
        setVolume(volume);
    } 
  
    public void setLixeira(Lixeira lixeira){
        this.lixeira = lixeira;
    }

    public Lixeira getLixeira (){
        return lixeira;
    }

    public void setColetor (Coletor coletor){
        this.coletor = coletor;
    }
    
    public Coletor getColetor (){
        return coletor;
    }

 public void setVolume(String volume) {
        this.volume = Float.parseFloat(volume);
    }
    
    public float getVolume() {
        return volume;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    public Date getData() {
        return data;
    }

    public java.sql.Date getData1() {
        java.sql.Date data = new java.sql.Date(this.data.getTime());
        return data;
    }
     
    public String getStringHora() {
        DateFormat hora = DateFormat.getTimeInstance();
        return hora.format(data);
    }
    
    
    public Time getTime() {
        Time time = new Time(data.getTime());
        return time;
    }

    public String getStringData() {
        DateFormat formataData = DateFormat.getDateInstance();
        return formataData.format(data);
    }

    @Override
    public String toString() {
        return getLixeira().getCodigo()+", "+getColetor().getCodigo()+", "+getVolume()+", "+getStringData()+", "+getStringHora();
    }
    
}
