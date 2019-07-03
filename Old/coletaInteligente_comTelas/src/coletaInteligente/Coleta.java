
package coletaInteligente;
import java.util.Calendar;
import java.util.Random;

public class Coleta {

    //private Lixeira lixeira;
    //private Coletor coletor;
    private Calendar data;
    private float nivelAtual;
    private int cod_lixeira;
    private int cod_coletor;

    public Coleta (){   
    }
     
    //Não está funcionando passar as classes por parametro ainda Lixeira lixeira, Coletor coletor
    public Coleta(float nivelAtual, Calendar data ){
        setCodLixeira();
        setCodColetor();
        setData(data);
        setNivelAtual(nivelAtual);
    }
    
    public void setCodLixeira() {
        Random random = new Random();
        this.cod_lixeira = random.nextInt(4);
    }
    
    public int getCodLixeira() {
        return cod_lixeira;
    }
    
    public void setCodColetor() {
        Random random = new Random();
        this.cod_coletor = random.nextInt(4);
    }
    
    public int getCodColetor() {
        return cod_coletor;
    }
 
    
  
    /*public void setLixeira(Lixeira lixeira){
        this.lixeira = lixeira;
    }
    
    public void setColetor (Coletor coletor){
        this.coletor = coletor;
    }*/
    
    /*public int getCodLixeira (){
        return lixeira.getCodigo();
    }
    
    public int getCodColetor (){
        return coletor.getCodigo();
    }*/
    
   public void setNivelAtual(float nivelAtual) {
        this.nivelAtual = nivelAtual;
    }
    
    public float getNivelAtual() {
        return nivelAtual;
    }
    
    public void setData(Calendar data) {
        this.data = data;
    }
    
    public Calendar getData() {
        return data;
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
