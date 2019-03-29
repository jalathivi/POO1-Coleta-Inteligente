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

public class Coleta {
    Lixeira nome_Lixeira;
    Coletor nome_Coletor;
    float nivel_Atual;
    Calendar data;
    Calendar hora;

    public void setNome_Lixeira(Lixeira nome_Lixeira) {
        this.nome_Lixeira = nome_Lixeira;
    }

    public void setNome_Coletor(Coletor nome_Coletor) {
        this.nome_Coletor = nome_Coletor;
    }

    public void setNivel_Atual(float nivel_Atual) {
        this.nivel_Atual = nivel_Atual;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }

}
