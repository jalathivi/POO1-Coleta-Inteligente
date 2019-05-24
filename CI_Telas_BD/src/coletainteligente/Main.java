package coletainteligente;
import java.util.Calendar;
import javax.swing.JOptionPane;
import visao.TelaVersoes;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
 
    
    public static void main(String[] args) throws Exception {
       
        TelaVersoes versoes = new TelaVersoes();
        versoes.show(true);
    
       /*Random random = new Random();
        
        int resposta;
        boolean concluido;
        Calendar data;
        Bairro bairro = new Bairro ();
        Cidadao cidadao = new Cidadao();
        Coleta coleta = new Coleta();
        Coletor coletor = new Coletor();
        Lixeira lixeira = new Lixeira();
        PersistenciaArquivo registro =  new PersistenciaArquivo();
        
        JOptionPane.showMessageDialog(null, "Versão Usuário");
        
        JOptionPane.showMessageDialog(null, "Cadastrar Usuário");
        
        do{ 
           
           concluido = false;
           do{
                try {
                    cidadao.setCodigo(Integer.toString(random.nextInt(90)));  
                    cidadao.setLatitude(Float.toString(random.nextFloat() + random.nextInt(90)));
                    cidadao.setLongitude(Float.toString(random.nextFloat() + random.nextInt(90)));
                    cidadao.setNome(JOptionPane.showInputDialog("Nome"));
                    cidadao.setEmail(JOptionPane.showInputDialog("E-mail"));
                    cidadao.setSenha(JOptionPane.showInputDialog("Senha"));
                    registro.salvaCidadao(cidadao);
                    concluido = true;
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
           }while(concluido == false);
            JOptionPane.showMessageDialog(null, "Obtivemos a sua Localização!");

            JOptionPane.showMessageDialog(null, "Versão Administrador");

            JOptionPane.showMessageDialog(null, "Cadastrar Bairro");
           
            do {
                
                concluido = false;
                do{
                
                    try {
                        bairro.setCodigo(Integer.toString(random.nextInt(90)));
                        bairro.setNome(JOptionPane.showInputDialog("Nome"));
                        registro.salvaBairro(bairro);
                        concluido = true;
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }while(concluido == false);
                
                JOptionPane.showMessageDialog(null, "Cadastrar Lixeira");

                do{
                   
                    concluido = false;
                    do{
                     
                        try {
                            lixeira.setCodigo(Integer.toString(random.nextInt(90)));  
                            lixeira.setLatitude(Float.toString(random.nextFloat() + random.nextInt(90)));
                            lixeira.setLongitude(Float.toString(random.nextFloat() + random.nextInt(90)));
                            lixeira.setRegiao(bairro);
                            lixeira.setCapacidade(JOptionPane.showInputDialog("Capacidade da lixeira"));
                            concluido = true;
                        } catch (Exception ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }while(concluido == false);
                    
                    JOptionPane.showMessageDialog(null, "Cadastrar Coletor");
                    
                    do{
                        
                        concluido = false;
                        do{
                            
                            try {
                                coletor.setCodigo(Integer.toString(random.nextInt(90)));  
                                coletor.setLatitude(Float.toString(random.nextFloat() + random.nextInt(90)));
                                coletor.setLongitude(Float.toString(random.nextFloat() + random.nextInt(90)));
                                coletor.setCapacidade(JOptionPane.showInputDialog("Capacidade do coletor"));
                                coletor.setPlaca(JOptionPane.showInputDialog("Placa"));
                                coletor.setMarca(JOptionPane.showInputDialog("Marca"));
                                coletor.setModelo(JOptionPane.showInputDialog("Modelo"));
                                coletor.setAno(JOptionPane.showInputDialog("Ano"));
                                registro.salvaColetor(coletor);
                                concluido = true;
                            } catch (Exception ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(null, ex.getMessage());
                            }
                       
                        }while(concluido == false);
                        
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar o registro de uma coleta deste coletor?");
                      
                        if(resposta == JOptionPane.YES_OPTION)
                        {
                            do{
                           
                                data = Calendar.getInstance();
                 
                                coleta.setLixeira(lixeira);
                                coleta.setColetor(coletor);
                                coleta.setNivelAtual(JOptionPane.showInputDialog("Nível da lixeira quando coletada"));
                                coleta.setData(data);
                                
                                registro.salvaColeta(coleta);

                                resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar uma nova coleta com esse coletor?");

                            } while(resposta == JOptionPane.YES_OPTION);
                        }
                       
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo coletor?");
                    } while(resposta == JOptionPane.YES_OPTION);

                    
                    registro.salvaLixeira(lixeira);
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar uma nova lixeira?");
                } while(resposta == JOptionPane.YES_OPTION);
           

                resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um  novo Bairro?");
            } while(resposta == JOptionPane.YES_OPTION);
              

            resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar novo Cidadão?");
        } while(resposta == JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null, "Fim do cadastro");   
        */
        
   
        
        
        
        
        
        
        
        
        
        
        
    }

  }





      

    
   
