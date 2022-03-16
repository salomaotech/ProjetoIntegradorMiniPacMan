package modelo;

import engine.Colisao;
import engine.Som;

public class ColisaoComida extends Colisao {

    @Override
    public void esperaColisao() {

        if (this.getColidiu() == true) {

            // som
            Som som = new Som();
            som.Play("/sons/comeu.wav", false);

            // aumenta pontuação ao comer
            PersonagemComida.ponto += 1;

        }

    }

}
