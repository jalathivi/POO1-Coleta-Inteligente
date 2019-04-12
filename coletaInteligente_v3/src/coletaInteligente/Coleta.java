
package coletaInteligente;
import java.util.Calendar;

public class Coleta {

    Lixeira lixeira;
    Coletor coletor;
    int codigoColeta;
    int codigoColetor;

    float volumeAtual;
    Calendar c;
    int dia;
    int mes;
    int ano;
    int hora;
    int minutos;
    
    public Coleta (){
    }
            
    public Coleta(String cod_lixeira, String cod_coletor, String nivel_Atual)
    {   
      
        this.codigoColeta = Integer.parseInt(cod_lixeira);
        this.codigoColetor = Integer.parseInt(cod_coletor);
        this.volumeAtual = Float.parseFloat(nivel_Atual);
        c = Calendar.getInstance();
        this.dia = c.get(Calendar.DAY_OF_MONTH);
        this.mes = c.get(Calendar.MONTH);
        this.ano = c.get(Calendar.YEAR);
        this.hora = c.get(Calendar.HOUR_OF_DAY);
        this.minutos = c.get(Calendar.MINUTE);  
    }
 
    public void setVolumeAtual(float volumeAtual) {
        this.volumeAtual = volumeAtual;
    }
    public float getVolumeAtual() {
        return volumeAtual;
    }

    public int getMinutos() 
    {
        return minutos;
    }
    public int getHora() 
    {
        return hora;
    }
    public int getDia()
    {
        return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getAno()
    {
        return ano;
    }

    @Override
    public String toString() {
        return "lixeira=" + lixeira + ", coletor=" + coletor + ", codigoColeta=" + codigoColeta + ", codigoColetor=" + codigoColetor + ", volumeAtual=" + volumeAtual + ", c=" + c + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", hora=" + hora + ", minutos=" + minutos;
    }
    
}
