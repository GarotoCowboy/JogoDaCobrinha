package jogo.tela;

import javax.swing.*;

public class IniciarJogo extends JFrame {

    public static void main(String[] args) {
        new IniciarJogo();
    }
    IniciarJogo(){
        add(new TelaJogo());
        setTitle("Joginho da Cobra");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

}
