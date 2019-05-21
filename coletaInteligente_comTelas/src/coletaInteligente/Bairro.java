
package coletaInteligente;

import Validador.ValidadorBairro;

public class Bairro {
    
    int codigo;
    String nome;
    
    public Bairro(){
    }
    
    /* NÃO ESTÁ DANDO CERTO CONSTRUTORES COM PAREMETROS POR MOTIVOS DE VALIDACAO
    public Bairro(String codigo, String nomeBairro) {
        this.codigo = Integer.parseInt(codigo);
        this.nome = nomeBairro;
    }
    
    public Bairro(int codigoBairro, String nomeBairro) {
        this.codigo = codigoBairro;
        this.nome = nomeBairro;
    }
    */

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
