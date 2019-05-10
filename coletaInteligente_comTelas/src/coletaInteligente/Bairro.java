
package coletaInteligente;

import java.util.Random;

public class Bairro {
    int codigo;
    String nome;
    Random random = new Random();
    
    public Bairro(){
    }
    
    public Bairro(String nomeBairro) {
        this.codigo = random.nextInt(100);
        this.nome = nomeBairro;
    }
    
    public Bairro(int codigoBairro, String nomeBairro) {
        this.codigo = random.nextInt(100);
        this.nome = nomeBairro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        this.codigo = random.nextInt(100);
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
