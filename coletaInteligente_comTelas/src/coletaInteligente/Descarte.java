
package coletaInteligente;
import java.util.Calendar;
import java.util.Random;

public class Descarte {
    //private Lixeira lixeira;
    //private Cidadao cidadao;
    private Calendar data;
    private float nivelAtual;
    
    //ATributos provisórios
    private int codLixeira;
    private int codCidadao;
    

    public Descarte(){
        
    }

    //CONTRUTOR PROVISÓRIO ENQUANTO NÃO DÁ PRA RESGATAR AS INFORMAÇÕES DO BANCO, OU DO ARQUIVO POR PREGUIÇA RS
    public Descarte(float nivelAtual, Calendar data) {
        setCodCidadao();
        setCodLixeira();
        setData(data);
        setNivelAtual(nivelAtual);
    }
  
    /*public void setLixeira(Lixeira lixeira){
        this.lixeira = lixeira;
    }*/
    public void setCodCidadao() {
        Random random = new Random();
        int cidadao = random.nextInt(100);
        this.codCidadao = cidadao;
    }
    
    public int getCodCidadao() {
        return codCidadao;
    }
    
    public int getCodLixeira() {
        return codLixeira;
    }
    
    public void setCodLixeira() {
        Random random = new Random();
        int lixeira = random.nextInt(100);
        this.codLixeira = lixeira;
    }
    
    /*public void setCidadao(Cidadao cidadao) {
        this.cidadao = cidadao;
    }*/
    
    /*public void setLixeira(Lixeira lixeira) {
        this.lixeira = lixeira;
    }*/
    
    /*public Cidadao getCidadao() {
        return cidadao;
    }*/
    
    /*public Lixeira getLixeira() {
        return lixeira;
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
        return getCodLixeira()+", "+getCodCidadao()+", "+getNivelAtual()+", "+getStringData()+", "+getStringHora();
    }
    
}
