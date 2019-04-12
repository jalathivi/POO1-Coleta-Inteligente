
package coletaInteligente;
import java.util.Calendar;

public class Descarte {
    int cod_Lixeira;
    int cod_Cidadao;
    float nivel_Atual;
    
    Lixeira lixeira;
    Cidadao cidadao;
    int codigoDescarte;
    int codigoCidadao;
    float volumeAtual;
    Calendar c;
    int dia;
    int mes;
    int ano;
    int hora;
    int minutos;

    public int getCod_Lixeira() {
        return cod_Lixeira;
    }

    public void setCod_Lixeira(int cod_Lixeira) {
        this.cod_Lixeira = cod_Lixeira;
    }

    public int getCod_Cidadao() {
        return cod_Cidadao;
    }

    public void setCod_Cidadao(int cod_Cidadao) {
        this.cod_Cidadao = cod_Cidadao;
    }

    public float getNivel_Atual() {
        return nivel_Atual;
    }

    public void setNivel_Atual(float nivel_Atual) {
        this.nivel_Atual = nivel_Atual;
    }

    public Lixeira getLixeira() {
        return lixeira;
    }

    public void setLixeira(Lixeira lixeira) {
        this.lixeira = lixeira;
    }

    public Cidadao getCidadao() {
        return cidadao;
    }

    public void setCidadao(Cidadao cidadao) {
        this.cidadao = cidadao;
    }

    public int getCodigoDescarte() {
        return codigoDescarte;
    }

    public void setCodigoDescarte(int codigoDescarte) {
        this.codigoDescarte = codigoDescarte;
    }

    public int getCodigoCidadao() {
        return codigoCidadao;
    }

    public void setCodigoCidadao(int codigoCidadao) {
        this.codigoCidadao = codigoCidadao;
    }

    public float getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(float volumeAtual) {
        this.volumeAtual = volumeAtual;
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
        return "Descarte{" + "cod_Lixeira=" + cod_Lixeira + ", cod_Cidadao=" + cod_Cidadao + ", nivel_Atual=" + nivel_Atual + ", lixeira=" + lixeira + ", cidadao=" + cidadao + ", codigoDescarte=" + codigoDescarte + ", codigoCidadao=" + codigoCidadao + ", volumeAtual=" + volumeAtual + ", c=" + c + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", hora=" + hora + ", minutos=" + minutos + '}';
    }
    
    
}
