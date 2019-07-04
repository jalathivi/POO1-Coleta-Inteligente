
package coletainteligente;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

public class SituacaoOperacional {
    public Lixeira lixeira;
    public Coletor coletor;
    public Status status;
    private Date date;
    
    public SituacaoOperacional(){
    }
        
    //Contrutor pro BD
    public SituacaoOperacional(Lixeira lixeira, Coletor coletor, Status status, Date date) {
        setLixeira(lixeira);
        setColetor(coletor);
        setStatus(status);
        setDate(date);
    }
    
    
    public void setData (Date data){
        this.date = data;
    }
    
    public Date getData (){
        return date;
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
 
    public String getStringHora() {
        DateFormat hora = DateFormat.getTimeInstance();
        return hora.format(date);
    }
    
    public String getStringData() {
        DateFormat formataData = DateFormat.getDateInstance();
        return formataData.format(date);
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
   
   @Override
    public String toString() {
        return getCodLixeira()+", "+getCodLixeira()+", "+getCodStatus()+", "+getStringData()+", "+getStringHora();
    }    
    
    
}
