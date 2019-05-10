
package coletaInteligente;

public class Status {
    int codigoStatus;
    String descricaoStatus;

    public int getCodigoStatus() {
        return codigoStatus;
    }

    public void setCodigoStatus(int codigoStatus) {
        this.codigoStatus = codigoStatus;
    }

    public String getDescricaoStatus() {
        return descricaoStatus;
    }

    public void setDescricaoStatus(String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
    }

    @Override
    public String toString() {
        return "Status{" + "codigoStatus=" + codigoStatus + ", descricaoStatus=" + descricaoStatus + '}';
    }
    
    
    
}
