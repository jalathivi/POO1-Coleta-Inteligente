
package coletaInteligente;

import Validador.ValidadorBairro;
import java.util.Random;

public class Bairro {
    Random random = new Random();
    
    int codigo = random.nextInt(100);
    String nome;
    
    
    public Bairro(){
    }
    
    /*/*NÃO ESTÁ DANDO CERTO CONSTRUTORES COM PAREMETROS POR MOTIVOS DE VALIDACAO
    public Bairro(String nomeBairro) {
        this.codigo = random.nextInt(100);
        this.nome = nomeBairro;
    }
    
    public Bairro(int codigoBairro, String nomeBairro) {
        this.codigo = codigoBairro;
        this.nome = nomeBairro;
    }*/

    public int getCodigo() {
        return codigo;
    }
    
    /*
    public void setCodigo() {
        this.codigo = random.nextInt(100);
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        ValidadorBairro valida = new ValidadorBairro();
        valida.verificaNome(nome);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+ getNome();
    }
    
}
