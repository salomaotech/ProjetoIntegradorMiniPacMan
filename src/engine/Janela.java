package engine;

import javax.swing.*;

public class Janela {

    private final JFrame janela = new JFrame();
    private int altura = 640, largura = 695;

    // construtor
    public Janela(String titulo) {

        janela.setTitle(titulo);

    }

    // seta a dimensao, deve ser invocada antes de Constroe
    public void setDimensao(int largura, int altura) {

        this.altura = altura;
        this.largura = largura;

    }

    // constroe a janela
    public void Constroe(String urlFundo) {

        // valida se vai usar imagem de fundo
        if (urlFundo != null) {

            // imagem de fundo
            Imagem imagemFundo = new Imagem();
            this.janela.add(imagemFundo.getImagem(urlFundo, this.altura, this.largura - 36));

        }

        // seta propriedades
        this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.janela.setBounds(0, 0, altura, largura);
        this.janela.setResizable(false);
        this.janela.setVisible(true);

    }

    // destroi a janela
    public void Destroi() {

        this.janela.dispose();

    }

    // add componente na janela
    public void addCompomenteJanela(JLabel componente) {

        this.janela.add(componente);

    }

    // get ponteiro para a janela
    public JFrame getPonteiroMemoria() {

        return this.janela;

    }

}
