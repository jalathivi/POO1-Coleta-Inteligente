
package coletaInteligente;

public class Bairro {
    int codigoBairro;
    String nomeBairro;
    
    public Bairro(String codigoBairro, String nomeBairro) {
        this.codigoBairro = Integer.parseInt (codigoBairro) ;
        this.nomeBairro = nomeBairro;
    }

    public int getCodigoBairro() {
        return codigoBairro;
    }

    public void setCodigoBairro(int codigoBairro) {
        this.codigoBairro = codigoBairro;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    @Override
    public String toString() {
        return "Bairro{" + "codigoBairro=" + codigoBairro + ", nomeBairro=" + nomeBairro + '}';
    }
    
}
