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

public class ArmazenaArquivo {
  
    
  String caminho = "C:\\Users\\Jackson\\Documents\\GitHub\\POO1-Coleta-Inteligente\\dados\\";
  
  public void salvaColetor(Coletor coletor) {
        
        FileWriter arq;
        try {
            arq = new FileWriter(caminho + "Coletor.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(coletor.getCodigo() + "," + coletor.getPlaca() + ","+ coletor.getMarca() + "," + coletor.getModelo() + "," + coletor.getAno() + "," + coletor.getCapacidade() + "," + coletor.getLatitude() + "," + coletor.getLongitude() + "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(ArmazenaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  
    public void salvaCidadao(Cidadao cidadao) {
        
        FileWriter arq;
        try {
            arq = new FileWriter(caminho + "Cidadao.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(cidadao.getCodigo() + "," + cidadao.getNome()+ "," + cidadao.getEmail() + "," + 
                cidadao.getSenha() + "," + cidadao.getLatitude() + "," + cidadao.getLongitude()+ "\r\n");
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(ArmazenaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    public void salvaColeta(Coleta coleta) {
        
        FileWriter arq;
        try {
            arq = new FileWriter(caminho + "Coleta.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(coleta.lixeira.getCodigo()+ ", " +  coleta.coletor.getCodigo() + ", " + coleta.getNivel_Atual() + ", " + coleta.getHora() + ":" + coleta.getMinutos() + " , " + coleta.getDia() + "/" + coleta.getMes() + "/" + coleta.getAno()+ "\r\n");       
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(ArmazenaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salvaLixeira(Lixeira lixeira) {
    
    FileWriter arq;
        try {
        arq = new FileWriter(caminho + "Lixeiras.txt", true);      
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.append(lixeira.getCodigo() + "," +lixeira.regiao.getCodigo()
        + ","+ lixeira.getLongitude()+","+ lixeira.getLatitude() +"," + lixeira.getCapacidade()+ "\r\n");
        arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(ArmazenaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void salvaBairro(Bairro bairro) {
    
    FileWriter arq;
        try {
        arq = new FileWriter(caminho + "Bairro.txt", true);    
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.append(bairro.getCodigo() + "," + bairro.getNome() + "\r\n");
        arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(ArmazenaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
}
