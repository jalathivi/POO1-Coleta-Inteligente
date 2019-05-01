
package coletaInteligente;

public class Status {
    int codigo;
    String descricao;

    public Status(){
    }
    
    public Status(String codigo, String descricao){
        this.codigo = Integer.parseInt(codigo);
        this.descricao = descricao;
    }
  
    public Status(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    } 
        
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+getDescricao();
    }
    
    
    
}
