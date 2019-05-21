
package coletaInteligente;

import Validador.ValidadorBairro;

public class Bairro {
    
    int codigo;
    String nome;
    
    public Bairro(){
    }
    
    
    public Bairro(String codigo, String nomeBairro) throws Exception {
        setCodigo(Integer.parseInt(codigo));
        setNome(nomeBairro);
    }
    
    public Bairro(int codigoBairro, String nomeBairro) throws Exception {
        setCodigo(codigo);
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
