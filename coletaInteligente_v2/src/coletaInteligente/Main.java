
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;
import javax.swing.JOptionPane;


/**
 *
 * @author eu 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resposta;
        int infoColeta;
        int infoColetor;
        int novaColeta;
        
        JOptionPane.showMessageDialog(null, "Cadastre o seu Usuário");
        String codi = JOptionPane.showInputDialog("Digite o Código do Cliente "); 
        String nomeC = JOptionPane.showInputDialog("Digite o Nome do Cliente");
        String email = JOptionPane.showInputDialog("Digite o E-mail");
        String senha = JOptionPane.showInputDialog("Digite a Senha");
        JOptionPane.showMessageDialog(null, "Insira a sua localizacao");
        String lati = JOptionPane.showInputDialog("Digite a Latitude");
        String longi = JOptionPane.showInputDialog("Digite a Longitude");
        
        Cidadao cidadao = new Cidadao (codi, nomeC, email, senha, lati, longi);
        
        PersistenciaArquivo registro = new PersistenciaArquivo();
        
        registro.salvarCidadao(cidadao);
        
        JOptionPane.showMessageDialog(null, "Cadastro de uma lixeira inteligente");
        
        do{
            String codigo  = JOptionPane.showInputDialog("Digite o codigo da lixeira");
            String id = JOptionPane.showInputDialog("Digite o codigo da regiao da lixeira");
            String nome = JOptionPane.showInputDialog("Digite o nome da região da lixeira");
            String latitude = JOptionPane.showInputDialog("Digite a latitude da lixeira");
            String longitude = JOptionPane.showInputDialog("Digite a longitute da lixeira");
            String capacidade = JOptionPane.showInputDialog("Digite a capacidade total da lixeira");
            
            Regiao regiao =  new Regiao(id, nome);
            Lixeira lixeira = new Lixeira(codigo, regiao, latitude, longitude, capacidade);
            
            do{
                JOptionPane.showMessageDialog(null, "Cadastre o coletor");
                String codigoColetor = JOptionPane.showInputDialog("Codigo do Coletor: ");
                String placa = JOptionPane.showInputDialog("Placa do veículo: ");
                String lat = JOptionPane.showInputDialog("Latitude: ");
                String lon = JOptionPane.showInputDialog("Longitude: ");
                String cap = JOptionPane.showInputDialog("Capacidade de carga: ");
                String marca = JOptionPane.showInputDialog("Marca: ");
                String modelo = JOptionPane.showInputDialog("Modelo: ");
                String ano = JOptionPane.showInputDialog("Ano do veículo: ");

                Coletor coletor = new Coletor(codigoColetor, placa, marca, modelo, ano, lat, lon, cap );

                novaColeta = JOptionPane.showConfirmDialog(null, "Deseja realizar o registro de uma coleta deste coletor?");
                if(novaColeta == JOptionPane.YES_OPTION)
                {
                    do{
                        String nivel = JOptionPane.showInputDialog("Digite o nível da lixeira quando coletada: ");
                        Coleta coleta = new Coleta(codigo, codigoColetor, nivel);

                        registro.salvaColeta(coleta);

                        novaColeta = JOptionPane.showConfirmDialog(null, "Deseja realizar o registro de uma nova coleta deste coletor?");

                    } while(novaColeta == JOptionPane.YES_OPTION);
                }
                registro.salvaColetor(coletor);

                infoColetor = JOptionPane.showConfirmDialog(null, "Deseja cadastrar novo coletor?");

            } while(infoColetor == JOptionPane.YES_OPTION);

      
            registro.salvaLixeira(lixeira);
            resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar nova lixeira?");
        } while(resposta == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "Fim do cadastro");
        
    
    }
    
}
