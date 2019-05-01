
package coletaInteligente;
import java.util.Calendar;

public class Descarte {

    Lixeira lixeira;
    Cidadao cidadao;
    Calendar data; //data = Calendar.getInstance();
    float nivelAtual;

    public Descarte(){   
    }
            
    public Descarte(Lixeira lixeira, Cidadao cidadao, String nivelAtual, Calendar data){   
        this.lixeira = lixeira;
        this.cidadao = cidadao;
        this.data = data;
        this.nivelAtual = Float.parseFloat(nivelAtual);
    }
 
    public Descarte(Lixeira lixeira, Cidadao cidadao, float nivelAtual, Calendar data ){   
        this.lixeira = lixeira;
        this.cidadao = cidadao;
        this.data = data;
        this.nivelAtual = nivelAtual;
    }
  
    public void setLixeira(Lixeira lixeira){
        this.lixeira = lixeira;
    }
    
    public int getCodLixeira (){
        return lixeira.getCodigo();
    }
    
    public void setCidadao (Cidadao cidadao){
        this.cidadao = cidadao;
    }
    
    public int getCodCidadao (){
        return cidadao.getCodigo(); 
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
        return getCodLixeira()+", "+getCodCidadao()+", "+getNivelAtual()+", "+getStringData()+", "+getStringHora();
    }
    
}
