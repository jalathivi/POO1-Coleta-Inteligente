
package coletainteligente;

import validador.ValidadorBairro;
import java.util.Random;

public class Bairro {
    
    private int codigo;
    private String nome;
    
    public Bairro(){
    }
    
    public Bairro(String nomeBairro) throws Exception {
        Random random = new Random();
        setCodigo(Integer.toString(random.nextInt(90)));
        setNome(nomeBairro);
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) throws Exception {
        ValidadorBairro valida = new ValidadorBairro();
        valida.codigo(codigo);
        this.codigo = Integer.parseInt(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        ValidadorBairro valida = new ValidadorBairro();
        valida.nome(nome);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+ getNome();
    }
    
}
