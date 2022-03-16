package engine;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Personagem extends VidaPersonagem {

    // cria um personagem na construção da classe
    public void setPersonagem(int largura, int altura) {

        // jlabel
        this.personagem = new JLabel("P", SwingConstants.CENTER);
        this.personagem.setSize(largura, altura);

        // add timer de execucao
        this.addTimerExecucao(1);

    }

    // cria um personagem na construção da classe
    public void setPersonagem(String url, int largura, int altura) {

        // imagem
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/" + url));
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(largura, altura, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);

        // jlabel
        this.personagem = new JLabel(imageIcon);
        this.personagem.setSize(largura, altura);

        // add timer de execucao
        this.addTimerExecucao(1);

    }

    // retorna o personagem
    public JLabel getPersonagem() {

        return this.personagem;

    }

    // sobe ou desce
    public void setMoveY(int y) {

        this.personagem.setLocation(this.personagem.getLocation().x, this.personagem.getLocation().y + y);

    }

    // direita ou esquerda
    public void setMoveX(int x) {

        this.personagem.setLocation(this.personagem.getLocation().x + x, this.personagem.getLocation().y);

    }

    // seta posicao
    public void setPosicao(int x, int y) {

        this.personagem.setLocation(x, y);

    }

}
