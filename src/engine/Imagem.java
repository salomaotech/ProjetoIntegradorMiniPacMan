package engine;

import java.awt.Image;

import javax.swing.*;

public class Imagem {

    public JLabel getImagem(String url, int largura, int altura) {

        // imagem
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/" + url));
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(largura, altura, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);

        // jlabel
        JLabel fundo = new JLabel(imageIcon);
        fundo.setSize(largura, altura);

        fundo.setLocation(0, 0);
        // retorno
        return fundo;

    }

}
