package engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class EventoTeclado extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void setEventoTeclado(JFrame janela, Personagem personagem) {

        janela.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == 38) {

                    personagem.setMoveY(-10);

                }

                if (e.getKeyCode() == 40) {

                    personagem.setMoveY(10);

                }

                if (e.getKeyCode() == 37) {

                    personagem.setMoveX(-10);

                }

                if (e.getKeyCode() == 39) {

                    personagem.setMoveX(10);

                }
            }

        });

    }

}
