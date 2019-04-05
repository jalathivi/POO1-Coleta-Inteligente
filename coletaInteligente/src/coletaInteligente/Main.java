
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String codigo = JOptionPane.showInputDialog("Digite o Código do Cliente ");
        String nome = JOptionPane.showInputDialog("Digite o Nome do Cliente");
        String email = JOptionPane.showInputDialog("Digite o E-mail");
        String senha = JOptionPane.showInputDialog("Digite a Senha");
        String latitude = JOptionPane.showInputDialog("Digite a Latitude");
        String longitude = JOptionPane.showInputDialog("Digite a Longitude");
        
        Cidadao cidadao = new Cidadao (codigo, nome, email, senha, latitude, longitude);
        
        /*
        cidadao.printa(cidadao);
        */
        
        PersistenciaArquivo salvar = new PersistenciaArquivo();
        salvar.salvarCidadao(cidadao);

      
        PersistenciaArquivo registro = new PersistenciaArquivo();
        
        String codigo  = JOptionPane.showInputDialog("Digite o codigo da lixeira");
        String cod_Regiao = JOptionPane.showInputDialog("Digite a regiao da lixeira");
        String latitude = JOptionPane.showInputDialog("Digite a latitude da lixeira");
        String longitude = JOptionPane.showInputDialog("Digite a longitute da lixeira");
        String capacidade = JOptionPane.showInputDialog("Digite a capacidade da lixeira");
        
        Lixeira lixeira = new Lixeira(codigo, cod_Regiao, latitude, longitude, capacidade);
        registro.salvaLixeira(lixeira);
        

        String codigoColetor = JOptionPane.showInputDialog("Codigo do Coletor: ");
        String placa = JOptionPane.showInputDialog("Placa: ");
        String latitude = JOptionPane.showInputDialog("Latitude: ");
        String longitude = JOptionPane.showInputDialog("Longitude: ");
        String capacidade = JOptionPane.showInputDialog("Capacidade: ");
        String marca = JOptionPane.showInputDialog("Marca: ");
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        String ano = JOptionPane.showInputDialog("Ano: "); 
        
       Coletor coletor = new Coletor(codigoColetor, placa, marca, modelo, ano, latitude, longitude, capacidade ); 
       PersistenciaArquivo arquivo = new PersistenciaArquivo();
       arquivo.salvaColetor(coletor);
  

  
        String lixeira = JOptionPane.showInputDialog("Digite o código da lixeira: ");
        String coletor = JOptionPane.showInputDialog("Digite o código do coletor: ");
        String nivel = JOptionPane.showInputDialog("Digite o nível da lixeira quando coletada: ");
        
        Coleta coletaLixo = new Coleta(lixeira, coletor, nivel);
        coletaLixo.imprimeInfo();
        
        PersistenciaArquivo salvar = new PersistenciaArquivo();
        salvar.salvaColeta(coletaLixo);

    }
    
}
