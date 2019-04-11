/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */

public class RecuperaArquivo {
  
    
  String caminho = "C:\\Users\\Jackson\\Documents\\GitHub\\POO1-Coleta-Inteligente\\dados\\";
  
  public void listaBairro() {
      
    FileReader arq;
    
    try {
        arq = new FileReader(caminho + "Bairro.txt"); 
        BufferedReader lerArq = new BufferedReader(arq);
        String linhas = "\nBairros Cadastrados\n";
        String linha = lerArq.readLine(); 
        while (linha != null) {
            linhas = linhas + "\n" + linha;
            linha = lerArq.readLine();
        }
        arq.close();
        JOptionPane.showMessageDialog(null, linhas);
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
        e.getMessage());
    }
 }

  
  public void buscaCodigoBairro(Bairro bairro, int codigo) {
      
    FileReader arq;
    bairro.setCodigo(-1);
    try {
        arq = new FileReader(caminho + "Bairro.txt"); 
        BufferedReader lerArq = new BufferedReader(arq);
        String codigoBairro;
        String nomeBairro;
        String linha = lerArq.readLine(); 
        while (linha != null) {
            codigoBairro = linha.split(",|,\\s")[0];
            nomeBairro = linha.split(",|,\\s")[1];
            if (codigo == Integer.parseInt(codigoBairro)){
                bairro.setCodigo(Integer.parseInt(codigoBairro));
                bairro.setNome(nomeBairro);
                break;
            }
            linha = lerArq.readLine();
        }
        arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
        e.getMessage());
    }
 }
 
  
  public void buscaCodigoColetor(Coletor coletor, int codigo) {
      
    FileReader arq;
    coletor.setCodigo(-1);
    try {
        arq = new FileReader(caminho + "Coletor.txt"); 
        BufferedReader lerArq = new BufferedReader(arq);
        int codigoColetor;
        String placa;
        float latitude;
        float longitude;
        float capacidade;
        String marca;
        String modelo;
        int ano;
        String linha = lerArq.readLine(); 
        while (linha != null) {
            codigoColetor = Integer.parseInt(linha.split(",|,\\s")[0]);
            placa = linha.split(",|,\\s")[1];
            marca = linha.split(",|,\\s")[2];
            modelo = linha.split(",|,\\s")[3];
            ano = Integer.parseInt(linha.split(",|,\\s")[4]);
            capacidade = Float.parseFloat(linha.split(",|,\\s")[5]);
            latitude = Float.parseFloat(linha.split(",|,\\s")[6]);
            longitude = Float.parseFloat(linha.split(",|,\\s")[7]);
                
            if (codigo == codigoColetor){
                coletor.setCodigo(codigoColetor);
                coletor.setPlaca(placa);
                coletor.setMarca(marca);
                coletor.setModelo(modelo);
                coletor.setAno(ano);
                coletor.setCapacidade(capacidade);
                coletor.setLatitude(latitude);
                coletor.setLongitude(longitude);
                
                break;
            }
            linha = lerArq.readLine();
        }
        arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
        e.getMessage());
    }
 }
  
}
