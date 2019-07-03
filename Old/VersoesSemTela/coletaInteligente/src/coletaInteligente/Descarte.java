/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;
import java.util.Calendar;

/**
 *
 * @author Vinicius
 */
public class Descarte {
    int cod_Lixeira;
    int cod_Cidadao;
    float nivel_Atual;
    Calendar data;
    Calendar hora;

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

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }
    
}
