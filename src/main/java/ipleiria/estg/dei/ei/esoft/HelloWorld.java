package ipleiria.estg.dei.ei.esoft;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {
    private JPanel painelPrincipal;

    public HelloWorld() {
        setMinimumSize(new Dimension(300, 200));
        JLabel lblMensagem2 = new JLabel("Joao Fernandes esteve aqui!"); //minha linha de code
    //AJAJJSSKALMAXLS
        //painelPrincipal.add(lblMensagem2);
        setContentPane(painelPrincipal);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
