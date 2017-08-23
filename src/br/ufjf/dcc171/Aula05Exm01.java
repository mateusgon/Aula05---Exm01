package br.ufjf.dcc171;

import javax.swing.JFrame;

public class Aula05Exm01 {

    public static void main(String[] args) {
        JanelaCheckBox janela = new JanelaCheckBox();
        janela.setSize(300, 100);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
