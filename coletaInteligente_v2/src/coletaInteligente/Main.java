
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;
import java.io.File;
import java.io.IOException;
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
        
        Lixeira lixeira = new Lixeira();
        Coletor coletor = new Coletor();
        Bairro bairro =  new Bairro();
        Coleta coleta = new Coleta();
        Cidadao cidadao = new Cidadao ();
        ArmazenaArquivo salvar = new ArmazenaArquivo();         
        RecuperaArquivo recupera = new RecuperaArquivo();
        Boolean continuar = true;
        
        while (continuar){
            
            String sSwitch = JOptionPane.showInputDialog("Escolha uma opção:\n <1> cadastrar lixeira \n<2> cadastrar coletor \n<3> cadastrar coleta \n<4> cadastrar cidadão\n <5>  cadastrar bairro\n <0> Sair ");
            int nSwitch = Integer.parseInt(sSwitch);
            
            switch(nSwitch) {
                case 1:
                    // Lixeira
                    String codigoLixeira  = JOptionPane.showInputDialog("Digite o codigo da lixeira");
                    lixeira.setCodigo(Integer.parseInt(codigoLixeira));
                    String codigoBairro  = JOptionPane.showInputDialog("Digite o codigo da regiao");
                    recupera.buscaCodigoBairro(bairro, Integer.parseInt(codigoBairro));
                    if (bairro.getCodigo() == -1 ){
                        JOptionPane.showMessageDialog(null, "Bairro não cadastrado!\nÉ necessário que cadastre esse bairro antes.");
                        break;
                    }
                    lixeira.setRegiao(bairro);
                    String latitude = JOptionPane.showInputDialog("Digite a latitude da lixeira");
                    lixeira.setLatitude(Float.parseFloat(latitude));
                    String longitude = JOptionPane.showInputDialog("Digite a longitute da lixeira");
                    lixeira.setLongitude(Float.parseFloat(longitude));
                    String capacidade = JOptionPane.showInputDialog("Digite a capacidade da lixeira");
                    lixeira.setCapacidade(Float.parseFloat(capacidade));
                    salvar.salvaLixeira(lixeira);
                    break;

                case 2:

                    // Coletor
                    String codigoColetor = JOptionPane.showInputDialog("Codigo do Coletor: ");
                    coletor.setCodigo(Integer.parseInt(codigoColetor));
                    String placa = JOptionPane.showInputDialog("Placa: ");
                    coletor.setPlaca(placa);
                    String lat = JOptionPane.showInputDialog("Latitude: ");
                    coletor.setLatitude(Float.parseFloat(lat));
                    String lon = JOptionPane.showInputDialog("Longitude: ");
                    coletor.setLongitude(Float.parseFloat(lon));
                    String cap = JOptionPane.showInputDialog("Capacidade: ");
                    coletor.setCapacidade(Float.parseFloat(cap));
                    String marca = JOptionPane.showInputDialog("Marca: ");
                    coletor.setMarca(marca);
                    String modelo = JOptionPane.showInputDialog("Modelo: ");
                    coletor.setModelo(modelo);
                    String ano = JOptionPane.showInputDialog("Ano: ");
                    coletor.setAno(Integer.parseInt(ano));
                    salvar.salvaColetor(coletor);
                    break;

                case 3:
                    // Coleta
                    String codigoColetor1  = JOptionPane.showInputDialog("Digite o codigo do coletor");    
                    recupera.buscaCodigoColetor(coletor, Integer.parseInt(codigoColetor1));
                    if (coletor.getCodigo() == -1 ){
                        JOptionPane.showMessageDialog(null, "Coletor não cadastrado!\nÉ necessário que cadastre esse coletor antes.");
                        break;
                    }
                    coleta.setColetor(coletor);
                    String codLixeira = JOptionPane.showInputDialog("Digite o código da lixeira: ");
                    //recupera.buscaCodigoLixeira
                   
                    salvar.salvaColeta(coleta);
                    break;

                case 4:
                    // Cidadao
                    String codi = JOptionPane.showInputDialog("Digite o Código do Cliente "); 
                    String nomeC = JOptionPane.showInputDialog("Digite o Nome do Cliente");
                    String email = JOptionPane.showInputDialog("Digite o E-mail");
                    String senha = JOptionPane.showInputDialog("Digite a Senha");
                    String lati = JOptionPane.showInputDialog("Digite a Latitude");
                    String longi = JOptionPane.showInputDialog("Digite a Longitude");
                    salvar.salvaCidadao(cidadao);        
                    break;

                case 5:
                    // Região
                    String codRegiao = JOptionPane.showInputDialog("Digite o código regiao: ");
                    bairro.setCodigo(Integer.parseInt(codRegiao));
                    String nome = JOptionPane.showInputDialog("Digite o nome da regiao: ");               
                    bairro.setNome(nome);
                    salvar.salvaBairro(bairro);
                    break;
                
                case 0:
                    // Sair
                    continuar = false;
                    break;
            }
            
        }
    }
}
