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
        
        PersistenciaArquivo registro = new PersistenciaArquivo();
        
        String codigo  = JOptionPane.showInputDialog("Digite o codigo da lixeira");
        String cod_Regiao = JOptionPane.showInputDialog("Digite a regiao da lixeira");
        String latitude = JOptionPane.showInputDialog("Digite a latitude da lixeira");
        String longitude = JOptionPane.showInputDialog("Digite a longitute da lixeira");
        String capacidade = JOptionPane.showInputDialog("Digite a capacidade da lixeira");
        
        Lixeira lixeira = new Lixeira(codigo, cod_Regiao, latitude, longitude, capacidade);
        registro.salvaLixeira(lixeira);
    }
    
}
