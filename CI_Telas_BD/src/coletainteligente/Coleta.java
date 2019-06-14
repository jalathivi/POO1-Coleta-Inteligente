
package coletainteligente;
import java.util.Calendar;
import java.util.Date;

public class Coleta {



    public Lixeira lixeira;
    public Coletor coletor;
    private Calendar data;
    private Date data_atual;
    private Date hora;
    private float volume;

    public Coleta (){   
    }

     public Coleta(Lixeira lixeira, Coletor coletor, String volume,Date hora, Calendar data ){
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
    
    public void setData(Calendar data) {
        this.data = data;
    }
    
    public Calendar getData() {
        return data;
    }
    
      /**
     * @param hora the hora to set
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    public Date getHoras() {
        return hora;
    }
    
    
    /**
     * @return the data_atual
     */
    public Date getData_atual() {
        return data_atual;
    }

    /**
     * @param data_atual the data_atual to set
     */
    public void setData_atual(Date data_atual) {
        this.data_atual = data_atual;
    }

    
    public int getHora() {
        return data.get(Calendar.HOUR_OF_DAY);
    }
    
    public int getMinutos(){
        return data.get(Calendar.MINUTE);
    }
    
    public int getDia(){
        return data.get(Calendar.DAY_OF_MONTH);
    }
    public int getMes(){
        return data.get(Calendar.MONTH);
    }
    public int getAno(){
        return data.get(Calendar.YEAR);
    }

    public String getStringHora(){
        return " " + getHora() + ":" + getMinutos() + " ";
    }
            
    public String getStringData(){
        return " " + getAno() + "-" + getMes() + "-" +  + getDia() + " ";
    }
    
    @Override
    public String toString() {
        return getLixeira().getCodigo()+", "+getColetor().getCodigo()+", "+getVolume()+", "+getStringData()+", "+getStringHora();
    }
    
}
