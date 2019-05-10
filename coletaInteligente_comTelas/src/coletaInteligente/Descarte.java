
package coletaInteligente;
import java.util.Calendar;

public class Descarte {

    Lixeira lixeira;
    Cidadao cidadao;
    Calendar data; //data = Calendar.getInstance();
    float nivelAtual;
    
    //ATributos provisórios? Talvez
    int codLixeira;
    int codCidadao;
    

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

    //CONTRUTOR PROVISÓRIO ENQUANTO NÃO DÁ PRA RESGATAR AS INFORMAÇÕES DO BANCO, OU DO ARQUIVO POR PREGUIÇA RS
    public Descarte(int codLixeira, int codCidadao, int nivel, Calendar data) {
        this.codLixeira = codLixeira;
        this.codCidadao = codCidadao;
        this.data = data;
        this.nivelAtual = nivel;
    }
  
    public void setLixeira(Lixeira lixeira){
        this.lixeira = lixeira;
    }
    
    /*public int getCodLixeira (){
        return lixeira.getCodigo();
    }*/
    public int getCodLixeira (){
        return codLixeira;
    }
    
    public void setCidadao (Cidadao cidadao){
        this.cidadao = cidadao;
    }
    
    /*public int getCodCidadao (){
        return cidadao.getCodigo(); 
    }*/
    public int getCodCidadao (){
        return codCidadao; 
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
