
package coletainteligente;
import java.util.Calendar;

public class SituacaoOperacional {
    private Lixeira lixeira;
    private Coletor coletor;
    private Status status;
    private Calendar data;
    
    public SituacaoOperacional(){
    }
    
    /*NÃO ESTÁ DANDO CERTO CONSTRUTORES COM PAREMETROS POR MOTIVOS DE VALIDACAO
    public SituacaoOperacional(Lixeira lixeira, Coletor coletor, Status status, Calendar data ){
        this.lixeira = lixeira;
        this.coletor = coletor;
        this.status = status;
        this.data = data;
    }*/
    
    public SituacaoOperacional(Lixeira lixeira, Coletor coletor, Status status, Calendar data ){
        setLixeira(lixeira);
        setColetor(coletor);
        setStatus(status);
        setData(data);
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
   
}
