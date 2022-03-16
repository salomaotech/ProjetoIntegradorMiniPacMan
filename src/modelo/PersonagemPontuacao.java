package modelo;

import engine.Personagem;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class PersonagemPontuacao extends Personagem {

    @Override
    public void acoesPersonagem() {

        Border border = BorderFactory.createLineBorder(Color.green, 1);
        this.personagem.setText("Pontos Salomao: " + Integer.toString(PersonagemComida.Score));
        this.personagem.setOpaque(true);
        this.personagem.setBackground(Color.orange);
        this.personagem.setLocation(10, 10);
        this.personagem.setBorder(border);

    }

}
