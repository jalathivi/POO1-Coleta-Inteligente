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
       
  public void salvaColetor(Coletor coletor) {
        
        FileWriter arq;
        try {
            arq = new FileWriter("Coletor.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(coletor.getCodigo() + "," + coletor.getPlaca() + ","+ coletor.getMarca() + "," + coletor.getModelo() + "," + coletor.getAno() + "," + coletor.getCapacidade() + "," + coletor.getLatitude() + "," + coletor.getLongitude() + "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  
    public void salvarCidadao(Cidadao cidadao) {
        
        FileWriter arq;
        try {
            arq = new FileWriter("Cidadaos.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(cidadao.getCodigo() + "," + cidadao.getNome()+ "," + cidadao.getEmail() + "," + 
                cidadao.getSenha() + "," + cidadao.getLatitude() + "," + cidadao.getLongitude()+ "\r\n");
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
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

    public void salvaLixeira(Lixeira lixeira) {
    
    FileWriter arq;
        try {
        arq = new FileWriter("Lixeiras.txt", true);//colocar o diretorio certo.      
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.append(lixeira.getCodigo() + "," +lixeira.regiao.getCodigo()
        + ","+ lixeira.getLongitude()+","+ lixeira.getLatitude() +"," + lixeira.getCapacidade()+ "\r\n");
        arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}
