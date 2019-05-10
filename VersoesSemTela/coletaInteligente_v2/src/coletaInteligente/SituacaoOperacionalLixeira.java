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
public class SituacaoOperacionalLixeira {
    int cod_Lixeira;
    int cod_Status;
    Calendar data;
    Calendar hora;
    int cod_Coletor;

    public int getCod_Lixeira() {
        return cod_Lixeira;
    }

    public void setCod_Lixeira(int cod_Lixeira) {
        this.cod_Lixeira = cod_Lixeira;
    }

    public int getCod_Status() {
        return cod_Status;
    }

    public void setCod_Status(int cod_Status) {
        this.cod_Status = cod_Status;
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

    public int getCod_Coletor() {
        return cod_Coletor;
    }

    public void setCod_Coletor(int cod_Coletor) {
        this.cod_Coletor = cod_Coletor;
    }
    
}
