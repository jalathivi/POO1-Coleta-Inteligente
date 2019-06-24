
package coletainteligente;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class SituacaoOperacional {
    public Lixeira lixeira;
    public Coletor coletor;
    public Status status;
    private Calendar data;
    private Date date;
    
    public SituacaoOperacional(){
    }
    
    public SituacaoOperacional(Lixeira lixeira, Coletor coletor, Status status, Calendar data ){
        setLixeira(lixeira);
        setColetor(coletor);
        setStatus(status);
        setData(data);
    }   
    
    //Contrutor pro BD
    public SituacaoOperacional(Lixeira lixeira, Coletor coletor, Status status, Date date) {
        setLixeira(lixeira);
        setColetor(coletor);
        setStatus(status);
        setDate(date);
    }
    
    
    public void setData (Calendar data){
        this.data = data;
    }
    
    public Calendar getData (){
        return data;
    }
    
    public void setStatus (Status status){
        this.status = status;
    }
    
    public int getCodStatus (){
        return status.getCodigo();
    }
    
    public void setLixeira(Lixeira lixeira){
        this.lixeira = lixeira;
    }
    
    public void setColetor (Coletor coletor){
        this.coletor = coletor;
    }
    
    public int getCodLixeira (){
        return lixeira.getCodigo();
    }
    
    public int getCodColetor (){
        return coletor.getCodigo();
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
        return getCodLixeira()+", "+getCodLixeira()+", "+getCodStatus()+", "+getStringData()+", "+getStringHora();
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    public java.sql.Date getDate() {
        java.sql.Date date = new java.sql.Date(this.date.getTime());
        System.out.print("date:" + date);
        
        return date;
    }
    
    public Time getTime() {
        Time time = new Time(date.getTime());
        System.out.print(time);
        return time;
    }
   
}
