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
    
    public void salvaLixeira(Lixeira lixeira) {
        
        FileWriter arq;
        try {
            arq = new FileWriter("C:\\..\\Lixeiras.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(lixeira.getCodigo() + "," +lixeira.getCod_Regiao()
                + ","+ lixeira.getLongitude()+","+ lixeira.getLatitude() +"," + lixeira.getCapacidade()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void salvarCidadao(Cidadao cidadao) {
        
        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\20172bsi0513\\Cidadaos.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(cidadao.getCodigo() + "," + cidadao.getNome()+ "," + cidadao.getEmail() + "," + 
                cidadao.getSenha() + "," + cidadao.getLatitude() + "," + cidadao.getLongitude()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
