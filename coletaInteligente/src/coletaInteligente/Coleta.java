/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;
import java.util.Calendar;

/**
 *
 * @author thiagomr8
 * TESTE BRANCH 29-03/16:02
 */
public class Coleta {
    //Atributos
    String cod_Lixeira;
    String cod_Coletor;
    float nivel_Atual;
    Calendar c = Calendar.getInstance();
    int dia;
    int mes;
    int ano;
    int hora;
    int minutos;
    
    public Coleta(String cod_Lixeira, String cod_Coletor, String nivel_Atual) 
    {
        this.cod_Lixeira = cod_Lixeira;
        this.cod_Coletor = cod_Coletor;
        this.nivel_Atual = Float.parseFloat(nivel_Atual);
        this.dia = c.get(Calendar.DAY_OF_MONTH);
        this.mes = c.get(Calendar.MONTH);
        this.ano = c.get(Calendar.YEAR);
        this.hora = c.get(Calendar.HOUR_OF_DAY);
        this.minutos = c.get(Calendar.MINUTE);
            
    }

    public String getCod_Lixeira() {
        return cod_Lixeira;
    }

    public void setCod_Lixeira(String cod_Lixeira) {
        this.cod_Lixeira = cod_Lixeira;
    }

    public String getCod_Coletor() {
        return cod_Coletor;
    }

    public void setCod_Coletor(String cod_Coletor) {
        this.cod_Coletor = cod_Coletor;
    }

    public float getNivel_Atual() {
        return nivel_Atual;
    }

    public void setNivel_Atual(float nivel_Atual) {
        this.nivel_Atual = nivel_Atual;
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
    
    //Imprimindo Informações
    public void imprimeInfo()
    {
        System.out.println("Lixeira: " + getCod_Lixeira() + ", " + "Coletor: " + getCod_Coletor() + ", " + "Nível na coleta: " + getNivel_Atual() + ", " + "Horas " + getHora() + ":" + getMinutos() + " , " + getDia() + "/" + getMes() + "/" + getAno());
    }
}
