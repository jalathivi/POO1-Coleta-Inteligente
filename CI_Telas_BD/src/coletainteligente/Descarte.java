
package coletainteligente;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

public class Descarte {
    
    public Lixeira lixeira;
    public Cidadao cidadao;
    public Date data;
    public float volume;
   
    public Descarte(){
        
    }

    
    public Descarte(Lixeira lixeira, Cidadao cidadao, String volume, Date data ){
        setLixeira(lixeira);
        setCidadao(cidadao);
        setData(data);
        setVolume(volume);
    }    

    
    public void setCidadao(Cidadao cidadao) {
        this.cidadao = cidadao;
    }
    
    public void setLixeira(Lixeira lixeira) {
        this.lixeira = lixeira;
    }
    
    public Cidadao getCidadao() {
        return cidadao;
    }
    
    public Lixeira getLixeira() {
        return lixeira;
    }
    
    public void setVolume(String nivelAtual) {
        this.volume = Float.parseFloat(nivelAtual);
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
        return getLixeira().getCodigo()+", "+getCidadao().getCodigo()+", "+getVolume()+", "+getStringData()+", "+getStringHora();
    }
    
}
