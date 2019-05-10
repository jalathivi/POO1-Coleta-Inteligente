package coletaInteligente;
import java.util.Calendar;
import javax.swing.JOptionPane;
import Visao.TelaVersoes;

public class Main {
   
    
    public static void main(String[] args) {
        TelaVersoes versoes = new TelaVersoes();
        versoes.show(true);
    
    }
}






/*public static void main(String[] args) {

        int resposta, infoColeta, infoColetor, novaColeta;
        String codigoCidadao, nomeCidadao, emailCidadao, senhaCidadao, latitude, longitude,capacidade, nivel;
        Calendar data;
        Bairro bairro;
        Cidadao cidadao;
        Coleta coleta;
        Coletor coletor;
        Lixeira lixeira;
        PersistenciaArquivo registro;
        
        registro = new PersistenciaArquivo();
        cidadao = new Cidadao ();
        
        JOptionPane.showMessageDialog(null, "Lixeira Inteligente - Versão Cidadão");
        JOptionPane.showMessageDialog(null, "Cadastro Usuário");
        
        do{ 
            nomeCidadao = JOptionPane.showInputDialog("Digite o Nome do Cidadao");
            emailCidadao = JOptionPane.showInputDialog("Digite o E-mail");

            while (!cidadao.verificaEmail(emailCidadao)){
                    JOptionPane.showMessageDialog(null, "E-mail Inválido!");
                    emailCidadao = JOptionPane.showInputDialog("Digite o E-mail");
            }

            senhaCidadao = JOptionPane.showInputDialog("Digite a Senha");
            while (!cidadao.verificaSenha(senhaCidadao)){
                    JOptionPane.showMessageDialog(null, "Senha Inválida!\nInsira uma com numeros e tamanho entre 6 e 14 digitos!");
                    senhaCidadao = JOptionPane.showInputDialog("Digite a Senha");
                    
            } 

            JOptionPane.showMessageDialog(null, "Obtivemos a sua Localização");

            cidadao.setCodigo();
            cidadao.setNome(nomeCidadao);
            cidadao.setEmail(emailCidadao);
            cidadao.setSenha(senhaCidadao);
            cidadao.setLatitude();
            cidadao.setLongitude();

            registro.salvaCidadao(cidadao);
            
            JOptionPane.showMessageDialog(null, "Lixeira Inteligente - Versão Administrador");

            JOptionPane.showMessageDialog(null, "Cadastre as Regiões de Atuação do Sistema");
           
            do {
                
                String nome = JOptionPane.showInputDialog("Digite o nome do Bairro");            
                bairro = new Bairro(nome);
                
                registro.salvaBairro(bairro);
                        
                JOptionPane.showMessageDialog(null, "Cadastro de Lixeira na Região");

                do{
                    capacidade = JOptionPane.showInputDialog("Digite a capacidade total da lixeira");
                    
                    lixeira = new Lixeira(bairro, capacidade);
                    
                    JOptionPane.showMessageDialog(null, "Cadastro Coletor");
                    
                    do{
                        
                        String codigoColetor = JOptionPane.showInputDialog("Codigo do Coletor: ");
                        String placa = JOptionPane.showInputDialog("Placa do veículo: ");
                        String lat = JOptionPane.showInputDialog("Latitude: ");
                        String lon = JOptionPane.showInputDialog("Longitude: ");
                        String cap = JOptionPane.showInputDialog("Capacidade de carga: ");
                        String marca = JOptionPane.showInputDialog("Marca: ");
                        String modelo = JOptionPane.showInputDialog("Modelo: ");
                        String ano = JOptionPane.showInputDialog("Ano do veículo: ");

                        coletor = new Coletor(codigoColetor, placa, marca, modelo, ano, lat, lon, cap );

                        novaColeta = JOptionPane.showConfirmDialog(null, "Deseja realizar o registro de uma coleta deste coletor?");
                      
                        if(novaColeta == JOptionPane.YES_OPTION)
                        {
                            do{
                                nivel = JOptionPane.showInputDialog("Digite o nível da lixeira quando coletada: ");

                                data = Calendar.getInstance();
                                coleta = new Coleta(lixeira, coletor, nivel, data);
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
           

                resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar novo Bairro?");
            } while(resposta == JOptionPane.YES_OPTION);
              

            resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar novo Cidadão?");
        } while(resposta == JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null, "Fim do cadastro");        

    }
    */
