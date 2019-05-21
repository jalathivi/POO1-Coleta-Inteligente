
package coletaInteligente;

import Validador.ValidadorBairro;
import java.util.Random;

public class Bairro {
    
    int codigo;
    String nome;
    
    public Bairro(){
    }
    
    public Bairro(String nomeBairro) throws Exception {
        Random random = new Random();
        setCodigo(random.nextInt());
        setNome(nomeBairro);
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
