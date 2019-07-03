
package coletaInteligente;
import java.util.Calendar;

public class Coleta {

    Lixeira lixeira;
    Coletor coletor;
    Calendar data;
    float nivelAtual;

    public Coleta (){   
    }
            
    public Coleta(Lixeira lixeira, Coletor coletor, String nivelAtual, Calendar data ){   
        this.lixeira = lixeira;
        this.coletor = coletor;
        this.data = data;
        this.nivelAtual = Float.parseFloat(nivelAtual);
    }
 
    public Coleta(Lixeira lixeira, Coletor coletor,  float nivelAtual, Calendar data){   
        this.lixeira = lixeira;
        this.coletor = coletor;
        this.data = data;
        this.nivelAtual = nivelAtual;
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
    
    public void setNivelAtual(float nivelAtual) {
        this.nivelAtual = nivelAtual;
    }
    
    public float getNivelAtual() {
        return nivelAtual;
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
        return getCodLixeira()+", "+getCodColetor()+", "+getNivelAtual()+", "+getStringData()+", "+getStringHora();
    }
    
}
