/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;
import javax.swing.JOptionPane;


/**
 *
 * @author vinic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lixeira = JOptionPane.showInputDialog("Digite o código da lixeira: ");
        String coletor = JOptionPane.showInputDialog("Digite o código do coletor: ");
        String nivel = JOptionPane.showInputDialog("Digite o nível da lixeira quando coletada: ");
        
        Coleta coletaLixo = new Coleta(lixeira, coletor, nivel);
        coletaLixo.imprimeInfo();
        
        PersistenciaArquivo salvar = new PersistenciaArquivo();
        salvar.salvaColeta(coletaLixo);
    }
    
}
