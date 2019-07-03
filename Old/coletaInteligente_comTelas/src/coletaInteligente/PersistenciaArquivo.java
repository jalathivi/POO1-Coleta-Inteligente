
package coletaInteligente;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenciaArquivo {
       
    public void salvaColetor(Coletor coletor) {
        salvaObjeto(coletor, "Coletor.txt");
    }
  
    public void salvaCidadao(Cidadao cidadao) {
        salvaObjeto(cidadao, "Cidadao.txt");
    }
    
    public void salvaColeta(Coleta coleta) {
        salvaObjeto(coleta, "Coleta.txt");
    }
    
    public void salvaDescarte(Descarte descarte) {
        salvaObjeto(descarte, "Descarte.txt");
    }

    public void salvaLixeira(Lixeira lixeira) {
        salvaObjeto(lixeira, "Lixeira.txt");
    }
    
    public void salvaBairro(Bairro bairro) {
        salvaObjeto(bairro, "Bairro.txt");
    }
   
    public void salvaStatus(Status status) {
        salvaObjeto(status, "Status.txt");
    }
     
    public void salvaSituacaoOperacional(SituacaoOperacional situacaoOperacional) {
        salvaObjeto(situacaoOperacional, "SituacaoOperacional.txt");
    }
    
    private void salvaObjeto(Object objGenerico, String nomeArquivo) {
        
        FileWriter arq;
        try {
            arq = new FileWriter(nomeArquivo, true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append( objGenerico.toString() + "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
   }    
    
}
