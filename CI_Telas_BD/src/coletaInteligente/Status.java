
package coletaInteligente;

import Validador.ValidadorStatus;
import java.util.Random;

public class Status {
    Random random = new Random();
    int codigo = random.nextInt(100);
    String descricao;

    public Status(){
    }
    
    /*NÃO ESTÁ DANDO CERTO CONSTRUTORES COM PAREMETROS POR MOTIVOS DE VALIDACAO
    public Status(String codigo, String descricao){
        this.codigo = Integer.parseInt(codigo);
        this.descricao = descricao;
    }
  
    public Status(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    } */
        
    public int getCodigo() {
        return codigo;
    }

    /*public void setCodigo(int codigo) {
        this.codigo = codigo;
    }*/

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws Exception {
        ValidadorStatus valida = new ValidadorStatus();
        valida.verificaDescricao(descricao);
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+getDescricao();
    }
    
    
    
}
