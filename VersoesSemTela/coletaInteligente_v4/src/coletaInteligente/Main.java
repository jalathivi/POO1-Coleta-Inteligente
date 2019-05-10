package coletaInteligente;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Main {
   
    public static void main(String[] args) {

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
        
        JOptionPane.showMessageDialog(null, "Cadastro Usuário");
        
        do{
       
            codigoCidadao = JOptionPane.showInputDialog("Digite o Código do Cidadao "); 
            nomeCidadao = JOptionPane.showInputDialog("Digite o Nome do Cidadao");
            emailCidadao = JOptionPane.showInputDialog("Digite o E-mail");

            while (!cidadao.verificaEmail(emailCidadao)){
                    JOptionPane.showMessageDialog(null, "E-mail Inválido!");
                    emailCidadao = JOptionPane.showInputDialog("Digite o E-mail");
                    cidadao.setEmail(emailCidadao);
            }

            senhaCidadao = JOptionPane.showInputDialog("Digite a Senha");
            while (!cidadao.verificaSenha(senhaCidadao)){
                    JOptionPane.showMessageDialog(null, "Senha Inválida!\nInsira uma com numeros e tamanho entre 6 e 14 digitos!");
                    senhaCidadao = JOptionPane.showInputDialog("Digite a Senha");
                    cidadao.setSenha(senhaCidadao);
            } 

            JOptionPane.showMessageDialog(null, "Insira a sua localizacao");
            latitude = JOptionPane.showInputDialog("Digite a Latitude");
            longitude = JOptionPane.showInputDialog("Digite a Longitude");

            cidadao.setCodigo(Integer.parseInt(codigoCidadao));
            cidadao.setNome(nomeCidadao);
            cidadao.setEmail(emailCidadao);
            cidadao.setSenha(senhaCidadao);
            cidadao.setLatitude(Float.parseFloat(latitude));
            cidadao.setLongitude(Float.parseFloat(longitude));

            registro.salvaCidadao(cidadao);

            JOptionPane.showMessageDialog(null, "Cadastro Bairro");
           
            do {
                
                String id = JOptionPane.showInputDialog("Digite o codigo do Bairro");
                String nome = JOptionPane.showInputDialog("Digite o nome do Bairro");            
                bairro = new Bairro(id, nome);
                
                registro.salvaBairro(bairro);
                        
                JOptionPane.showMessageDialog(null, "Cadastro Lixeira");

                do{

                    String codigo  = JOptionPane.showInputDialog("Digite o codigo da lixeira");
                    latitude = JOptionPane.showInputDialog("Digite a latitude da lixeira");
                    longitude = JOptionPane.showInputDialog("Digite a longitute da lixeira");
                    capacidade = JOptionPane.showInputDialog("Digite a capacidade total da lixeira");

                    lixeira = new Lixeira(codigo, bairro, latitude, longitude, capacidade);
                    
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
        
//        int resposta, infoColeta, infoColetor, novaColeta;
//        String codigoCidadao, nomeCidadao, emailCidadao, senhaCidadao, latitude, longitude,capacidade, nivel;
//        Calendar data;
//        Bairro bairro;
//        Cidadao cidadao;
//        Coleta coleta;
//        Coletor coletor;
//        Lixeira lixeira;
//        PersistenciaArquivo registro;
//        
//        registro = new PersistenciaArquivo();
//        cidadao = new Cidadao ();
//        
//        JOptionPane.showMessageDialog(null, "Cadastro Usuário");
//        codigoCidadao = JOptionPane.showInputDialog("Digite o Código do Cidadao "); 
//        nomeCidadao = JOptionPane.showInputDialog("Digite o Nome do Cidadao");
//        emailCidadao = JOptionPane.showInputDialog("Digite o E-mail");
//        
//        while (!cidadao.verificaEmail(emailCidadao)){
//                JOptionPane.showMessageDialog(null, "E-mail Inválido!");
//                emailCidadao = JOptionPane.showInputDialog("Digite o E-mail");
//                cidadao.setEmail(emailCidadao);
//        }
//        
//        senhaCidadao = JOptionPane.showInputDialog("Digite a Senha");
//        while (!cidadao.verificaSenha(senhaCidadao)){
//                JOptionPane.showMessageDialog(null, "Senha Inválida!\nInsira uma com numeros e tamanho entre 6 e 14 digitos!");
//                senhaCidadao = JOptionPane.showInputDialog("Digite a Senha");
//                cidadao.setSenha(senhaCidadao);
//        } 
//
//        JOptionPane.showMessageDialog(null, "Insira a sua localizacao");
//        latitude = JOptionPane.showInputDialog("Digite a Latitude");
//        longitude = JOptionPane.showInputDialog("Digite a Longitude");
//        
//        cidadao.setCodigo(Integer.parseInt(codigoCidadao));
//        cidadao.setNome(nomeCidadao);
//        cidadao.setEmail(emailCidadao);
//        cidadao.setSenha(senhaCidadao);
//        cidadao.setLatitude(Float.parseFloat(latitude));
//        cidadao.setLongitude(Float.parseFloat(longitude));
//        
//        registro.salvaCidadao(cidadao);
//        
//        
//        JOptionPane.showMessageDialog(null, "Cadastro de uma lixeira inteligente");
//        
//        do{
//            
//            String codigo  = JOptionPane.showInputDialog("Digite o codigo da lixeira");
//            String id = JOptionPane.showInputDialog("Digite o codigo da regiao da lixeira");
//            String nome = JOptionPane.showInputDialog("Digite o nome da região da lixeira");
//            latitude = JOptionPane.showInputDialog("Digite a latitude da lixeira");
//            longitude = JOptionPane.showInputDialog("Digite a longitute da lixeira");
//            capacidade = JOptionPane.showInputDialog("Digite a capacidade total da lixeira");
//            
//            bairro = new Bairro(id, nome);
//            lixeira = new Lixeira(codigo, bairro, latitude, longitude, capacidade);
//            
//            do{
//                JOptionPane.showMessageDialog(null, "Cadastre o coletor");
//                String codigoColetor = JOptionPane.showInputDialog("Codigo do Coletor: ");
//                String placa = JOptionPane.showInputDialog("Placa do veículo: ");
//                String lat = JOptionPane.showInputDialog("Latitude: ");
//                String lon = JOptionPane.showInputDialog("Longitude: ");
//                String cap = JOptionPane.showInputDialog("Capacidade de carga: ");
//                String marca = JOptionPane.showInputDialog("Marca: ");
//                String modelo = JOptionPane.showInputDialog("Modelo: ");
//                String ano = JOptionPane.showInputDialog("Ano do veículo: ");
//
//                coletor = new Coletor(codigoColetor, placa, marca, modelo, ano, lat, lon, cap );
//
//                novaColeta = JOptionPane.showConfirmDialog(null, "Deseja realizar o registro de uma coleta deste coletor?");
//                if(novaColeta == JOptionPane.YES_OPTION)
//                {
//                    do{
//                        nivel = JOptionPane.showInputDialog("Digite o nível da lixeira quando coletada: ");
//                        
//                        data = Calendar.getInstance();
//                        coleta = new Coleta(lixeira, coletor, nivel, data);
//                        registro.salvaColeta(coleta);
//
//                        novaColeta = JOptionPane.showConfirmDialog(null, "Deseja realizar o registro de uma nova coleta deste coletor?");
//
//                    } while(novaColeta == JOptionPane.YES_OPTION);
//                }
//                registro.salvaColetor(coletor);
//                
//                infoColetor = JOptionPane.showConfirmDialog(null, "Deseja cadastrar novo coletor?");
//            } while(infoColetor == JOptionPane.YES_OPTION);
//
//      
//            registro.salvaLixeira(lixeira);
//            resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar nova lixeira?");
//        } while(resposta == JOptionPane.YES_OPTION);
//        JOptionPane.showMessageDialog(null, "Fim do cadastro");
//    
    
    
}
