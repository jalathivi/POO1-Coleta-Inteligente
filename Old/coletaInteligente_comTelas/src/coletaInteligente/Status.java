
package coletaInteligente;

import Validador.ValidadorStatus;
import java.util.Random;

public class Status {
    
    private int codigo;
    private String descricao;

    public Status(){
    }
    
   
    public Status(String descricao) throws Exception{
        Random random = new Random();
        setCodigo(Integer.toString(random.nextInt(100)));
        setDescricao(descricao);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {
        ValidadorStatus valida = new ValidadorStatus();
        valida.codigo(codigo);
        this.codigo = Integer.parseInt(codigo);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws Exception {
        ValidadorStatus valida = new ValidadorStatus();
        valida.descricao(descricao);
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+getDescricao();
    }
    
    
    
}
