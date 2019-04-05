/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinic
 */

public class PersistenciaArquivo {
    
    public void salvaColeta(Coleta coleta) {
        
        FileWriter arq;
        try {
            arq = new FileWriter("Coleta.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(coleta.getCod_Lixeira() + ", " +  coleta.getCod_Coletor() + ", " + coleta.getNivel_Atual() + ", " + coleta.getHora() + ":" + coleta.getMinutos() + " , " + coleta.getDia() + "/" + coleta.getMes() + "/" + coleta.getAno()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
