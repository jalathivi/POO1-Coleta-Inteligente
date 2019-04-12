
package coletaInteligente;
import java.util.Calendar;

public class SituacaoOperacionalLixeira {
    Lixeira lixeira;
    Status status;
    Coletor coletor;
    Calendar c;
    int dia;
    int mes;
    int ano;
    int hora;
    int minutos;

    public Lixeira getLixeira() {
        return lixeira;
    }

    public void setLixeira(Lixeira lixeira) {
        this.lixeira = lixeira;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Coletor getColetor() {
        return coletor;
    }

    public void setColetor(Coletor coletor) {
        this.coletor = coletor;
    }

    public Calendar getC() {
        return c;
    }

    public void setC(Calendar c) {
        this.c = c;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "SituacaoOperacionalLixeira{" + "lixeira=" + lixeira + ", status=" + status + ", coletor=" + coletor + ", c=" + c + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", hora=" + hora + ", minutos=" + minutos + '}';
    }
    
    
}
