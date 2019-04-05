package coletaInteligente;

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
    }
    
}
