package modelo;

import engine.Personagem;

public class PersonagemComida extends Personagem {

    private int x, y;
    private int xN;
    private boolean v1, v2, v3, v4, v5, v6, v7, v8, v9;
    public static int ponto;
    private static int pontoAntes;
    public static int Score;

    // quando comer calcular o proximo ponto
    private void calculaProximoPontoComida() {

        if (ponto != pontoAntes) {

            pontoAntes = ponto;
            x += 40;
            Score += 1;
            this.setPosicao(this.x, this.y);

        }

    }

    // atualiza o proximo tempo de movimento
    private boolean atualizaTempoMovimento(int x, int y) {

        // calcula coordenadas
        calculaProximoPontoComida();

        // propriedades
        boolean resetar = false;

        // valida se atingiu o tempo
        if (this.xN >= 700) {

            this.xN = 0;
            this.y = y;
            resetar = true;
            this.x = x;
            this.y = y;

        }

        // atualiza contador
        this.xN++;

        // retorno
        return resetar;

    }

    @Override
    public void moverAutomatico() {

        if (v1 == false) {

            x = 250;
            y = 110;

            if (this.atualizaTempoMovimento(x, y) == true) {

                v1 = true;

            }

        }

        if (v2 == false && v1 == true) {

            if (this.atualizaTempoMovimento(250, 500) == true) {

                v2 = true;

            }

        }

        if (v3 == false && v2 == true) {

            if (this.atualizaTempoMovimento(50, 550) == true) {

                v3 = true;

            }

        }

        if (v4 == false && v3 == true) {

            if (this.atualizaTempoMovimento(50, 300) == true) {

                v4 = true;

            }

        }

        if (v5 == false && v4 == true) {

            if (this.atualizaTempoMovimento(550, 300) == true) {

                v5 = true;

            }

        }

        if (v6 == false && v5 == true) {

            if (this.atualizaTempoMovimento(500, 15) == true) {

                v6 = true;

            }

        }

        if (v7 == false && v6 == true) {

            if (this.atualizaTempoMovimento(500, 580) == true) {

                v7 = true;

            }

        }

        if (v8 == false && v7 == true) {

            if (this.atualizaTempoMovimento(75, 40) == true) {

                v8 = true;

            }

        }

        if (v9 == false && v8 == true) {

            if (this.atualizaTempoMovimento(0, 0) == true) {

                v1 = false;
                v2 = false;
                v3 = false;
                v4 = false;
                v5 = false;
                v6 = false;
                v7 = false;
                v8 = false;
                this.x = 0;
                this.y = 0;

            }

        }

        this.setPosicao(this.x, this.y);

    }

}
