
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
        
        String sSwitch = JOptionPane.showInputDialog("Escolha uma opção:\n <1> cadastrar lixeira \n<2> cadastrar coletor \n<3> cadastrar coleta \n<4> cadastrar cidadão\n ");
        int nSwitch = Integer.parseInt(sSwitch);
       
        Lixeira lixeira = new Lixeira();
        Coletor coletor = new Coletor();
        Regiao regiao =  new Regiao();
        Coleta coletaLixo = new Coleta();
        Cidadao cidadao = new Cidadao ();
        PersistenciaArquivo salvar = new PersistenciaArquivo();         
         
        switch(nSwitch) {
            case 1:
                // Lixeira
                String codigo  = JOptionPane.showInputDialog("Digite o codigo da lixeira");
                String latitude = JOptionPane.showInputDialog("Digite a latitude da lixeira");
                String longitude = JOptionPane.showInputDialog("Digite a longitute da lixeira");
                String capacidade = JOptionPane.showInputDialog("Digite a capacidade da lixeira");
                
                lixeira.setCodigo(codigo);
                lixeira.setLatitude(latitude);
                lixeira.setLongitude(longitude);
                lixeira.setCapacidade(capacidade);
                
                salvar.salvaLixeira(lixeira);
                
                break;
        
            case 2:
                // Coletor
                String codigoColetor = JOptionPane.showInputDialog("Codigo do Coletor: ");
                String placa = JOptionPane.showInputDialog("Placa: ");
                String lat = JOptionPane.showInputDialog("Latitude: ");
                String lon = JOptionPane.showInputDialog("Longitude: ");
                String cap = JOptionPane.showInputDialog("Capacidade: ");
                String marca = JOptionPane.showInputDialog("Marca: ");
                String modelo = JOptionPane.showInputDialog("Modelo: ");
                String ano = JOptionPane.showInputDialog("Ano: "); 

                coletor.setCodigo();
                coletor.setPlaca(placa);
                coletor.setLatitude(lat);
                coletor.setLongitude(lon);
                coletor.setMarca(marca);
                coletor.setModelo(modelo);
                coletor.setAno(ano);                 
                coletor.setCapacidade(placa);
              
                salvar.salvaColetor(coletor);
                break;
                
            case 3:
                // Coleta
                String col = JOptionPane.showInputDialog("Digite o código do coletor: ");
                String nivel = JOptionPane.showInputDialog("Digite o nível da lixeira quando coletada: ");
                Coleta coleta = new Coleta();
                coletaLixo.imprimeInfo();
                salvar.salvaColeta(coletaLixo);
                break;
            
            case 4:
                // Cidadao
                String codi = JOptionPane.showInputDialog("Digite o Código do Cliente "); 
                String nomeC = JOptionPane.showInputDialog("Digite o Nome do Cliente");
                String email = JOptionPane.showInputDialog("Digite o E-mail");
                String senha = JOptionPane.showInputDialog("Digite a Senha");
                String lati = JOptionPane.showInputDialog("Digite a Latitude");
                String longi = JOptionPane.showInputDialog("Digite a Longitude");
                
                Cidadao cidadao = new Cidadao (codi, nomeC, email, senha, lati, longi);
                salvar.salvarCidadao(cidadao);        
   
                break;
                
            case 5:
                // Região
                String codRegiao = JOptionPane.showInputDialog("Digite o código regiao: ");
                String nome = JOptionPane.showInputDialog("Digite o nome da regiao: ");               
                regiao.setCodigo(codRegiao);
                regiao.setNome(nome); 
        }
    }
}
