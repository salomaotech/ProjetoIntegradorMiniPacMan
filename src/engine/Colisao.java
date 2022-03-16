package engine;

import java.awt.Component;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class Colisao {

    private JLabel personagem;
    private JLabel objeto;
    private final Timer tempo = new Timer();

    public void setObjetos(JLabel a, JLabel b) {

        this.personagem = a;
        this.objeto = b;

    }

    // informa se dois componentes colidiram
    public boolean getColidiu() {

        Component a = this.objeto;
        Component b = this.personagem;
        int aX = a.getX();
        int aY = a.getY();
        int ladoDireitoA = aX + a.getWidth();
        int ladoEsquerdoA = aX;
        int ladoBaixoA = aY + a.getHeight();
        int ladoCimaA = aY;
        int bX = b.getX();
        int bY = b.getY();
        int ladoDireitoB = bX + b.getWidth();
        int ladoEsquerdoB = bX;
        int ladoBaixoB = bY + b.getHeight();
        int ladoCimaB = bY;
        boolean bateu = false;
        boolean cDireita = false;
        boolean cCima = false;
        boolean cBaixo = false;
        boolean cEsquerda = false;

        if (ladoDireitoA >= ladoEsquerdoB) {

            cDireita = true;

        }
        if (ladoCimaA <= ladoBaixoB) {

            cCima = true;

        }
        if (ladoBaixoA >= ladoCimaB) {

            cBaixo = true;

        }

        if (ladoEsquerdoA <= ladoDireitoB) {

            cEsquerda = true;

        }

        if (cDireita && cEsquerda && cBaixo && cCima) {

            bateu = true;

        }

        return bateu;

    }

    // será sobrescrita
    public void esperaColisao() {

    }

    // adiciona um timer de execucao
    public void addTimerExecucao(int segundos) {

        // novo timertask
        TimerTask task = new TimerTask() {

            // executa
            @Override
            public void run() {

                esperaColisao();

            }

        };

        // define o tempo
        this.tempo.scheduleAtFixedRate(task, 0, segundos * 10);

    }

}
