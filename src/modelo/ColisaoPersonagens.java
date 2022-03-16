package modelo;

import engine.Colisao;
import engine.Configuracoes;
import engine.Janela;
import engine.Som;

public class ColisaoPersonagens extends Colisao {

    private boolean colidiu = false;

    @Override
    public void esperaColisao() {

        if (this.getColidiu() == true && colidiu == false) {

            // play em som
            Som som = new Som();
            som.Play("/sons/morreu.wav", false);

            // informo que deve parar os timers
            Configuracoes.timerAtivado = false;

            // informa que colidiu para evitar loop e travar a droga do computador!
            colidiu = true;

            // game over!
            Janela c = new Janela("You Lost!");
            c.setDimensao(445, 400);
            c.Constroe("imagens/fundo2.jpg");

        }

    }

}
