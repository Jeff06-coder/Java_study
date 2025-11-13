package project_aula05;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class UsandoBiblioteca {
    public static void main(String[] args) {
        
        //Para criar a janela
        JFrame janela = new JFrame("Minha janela");

        //Config do tamanho da janela
        janela.setSize(400,600);
        //Fechando o programa se clicar no X
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Adicionando um texto para a janela
        JLabel texto = new JLabel("Hello, word", JLabel.CENTER);
        janela.add(texto);
        //Fazendo a janela aparecer
        janela.setVisible(true);

    }
}
