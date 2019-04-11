
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;
import javax.swing.JOptionPane;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sSwitch = JOptionPane.showInputDialog("Escolha uma opção:\n <1> cadastrar lixeira \n<2> cadastrar coletor \n<3> cadastrar coleta \n<4> cadastrar cidadão\n ");
        int nSwitch = Integer.parseInt(sSwitch);
        
        switch(nSwitch) {
            case 1:
                PersistenciaArquivo registro = new PersistenciaArquivo();

                String codigo  = JOptionPane.showInputDialog("Digite o codigo da lixeira");
                String nome = JOptionPane.showInputDialog("Digite o codigo da regiao da lixeira");
                String id = JOptionPane.showInputDialog("Digite o nome da região da lixeira");
                String latitude = JOptionPane.showInputDialog("Digite a latitude da lixeira");
                String longitude = JOptionPane.showInputDialog("Digite a longitute da lixeira");
                String capacidade = JOptionPane.showInputDialog("Digite a capacidade da lixeira");

                Regiao regiao =  new Regiao(id, nome);
                Lixeira lixeira = new Lixeira(codigo, regiao, latitude, longitude, capacidade);
                registro.salvaLixeira(lixeira);
                break;
        
            case 2:
                String codigoColetor = JOptionPane.showInputDialog("Codigo do Coletor: ");
                String placa = JOptionPane.showInputDialog("Placa: ");
                String lat = JOptionPane.showInputDialog("Latitude: ");
                String lon = JOptionPane.showInputDialog("Longitude: ");
                String cap = JOptionPane.showInputDialog("Capacidade: ");
                String marca = JOptionPane.showInputDialog("Marca: ");
                String modelo = JOptionPane.showInputDialog("Modelo: ");
                String ano = JOptionPane.showInputDialog("Ano: "); 

                Coletor coletor = new Coletor(codigoColetor, placa, marca, modelo, ano, lat, lon, cap ); 
                PersistenciaArquivo arquivo = new PersistenciaArquivo();
                arquivo.salvaColetor(coletor);
                break;
                
            case 3:
                String lix = JOptionPane.showInputDialog("Digite o código da lixeira: ");
                String col = JOptionPane.showInputDialog("Digite o código do coletor: ");
                String nivel = JOptionPane.showInputDialog("Digite o nível da lixeira quando coletada: ");

                Coleta coletaLixo = new Coleta(lix, col, nivel);
                coletaLixo.imprimeInfo();

                PersistenciaArquivo salvar = new PersistenciaArquivo();
                salvar.salvaColeta(coletaLixo);
                break;
            
            case 4:
                String codi = JOptionPane.showInputDialog("Digite o Código do Cliente "); 
                String nomeC = JOptionPane.showInputDialog("Digite o Nome do Cliente");
                String email = JOptionPane.showInputDialog("Digite o E-mail");
                String senha = JOptionPane.showInputDialog("Digite a Senha");
                String lati = JOptionPane.showInputDialog("Digite a Latitude");
                String longi = JOptionPane.showInputDialog("Digite a Longitude");
                
                Cidadao cidadao = new Cidadao (codi, nomeC, email, senha, lati, longi);
                
                while (!cidadao.verificaEmail(email)){
                    email = JOptionPane.showInputDialog("Digite o E-mail");
                    cidadao.setEmail(email);
                }
                while (!cidadao.verificaSenha(senha)){
                    senha = JOptionPane.showInputDialog("Digite a Senha");
                    cidadao.setSenha(senha);
                }

                PersistenciaArquivo salvarC = new PersistenciaArquivo();
                salvarC.salvaCidadao(cidadao);        
                
            break;
        }

    }
    
}
