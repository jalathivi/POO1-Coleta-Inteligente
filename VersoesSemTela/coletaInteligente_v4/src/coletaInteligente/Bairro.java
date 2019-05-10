
package coletaInteligente;

public class Bairro {
    int codigo;
    String nome;
    
    public Bairro(){
    }
    
    public Bairro(String codigoBairro, String nomeBairro) {
        this.codigo = Integer.parseInt (codigoBairro) ;
        this.nome = nomeBairro;
    }
    
    public Bairro(int codigoBairro, String nomeBairro) {
        this.codigo = codigoBairro;
        this.nome = nomeBairro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+ getNome();
    }
    
}
