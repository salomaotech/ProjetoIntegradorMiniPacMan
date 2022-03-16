package modelo;

import engine.EventoTeclado;
import engine.Janela;

public class Desafio1 {

    private final Janela janela = new Janela("Mini Pac Man Beta - Salomão Silva");

    // constroe a janela do desafio
    private void constroeJanela() {

        this.janela.Constroe("imagens/fundo.png");

    }

    // adiciona um personagem
    private void carregaPersonagens() {

        // personsagem
        Personagem1 personagem1 = new Personagem1();
        personagem1.setPersonagem("imagens/1.png", 50, 67);

        // personsagem
        Personagem2 personagem2 = new Personagem2();
        personagem2.setPersonagem("imagens/2.png", 50, 67);

        // personsagem
        Personagem3 personagem3 = new Personagem3();
        personagem3.setPersonagem("imagens/3.png", 50, 67);

        // personsagem
        Personagem4 personagem4 = new Personagem4();
        personagem4.setPersonagem("imagens/4.png", 63, 67);

        // personsagem
        PersonagemComida comida = new PersonagemComida();
        comida.setPersonagem("imagens/comida1.png", 32, 32);

        // personsagem pontuacao - GAMBIARRA TEMPORARIA RS!
        PersonagemPontuacao pontuacao = new PersonagemPontuacao();
        pontuacao.setPersonagem(200, 32);

        // informa quem é cada personagem
        this.janela.addCompomenteJanela(personagem1.getPersonagem());
        this.janela.addCompomenteJanela(personagem2.getPersonagem());
        this.janela.addCompomenteJanela(personagem3.getPersonagem());
        this.janela.addCompomenteJanela(personagem4.getPersonagem());
        this.janela.addCompomenteJanela(pontuacao.getPersonagem());
        this.janela.addCompomenteJanela(comida.getPersonagem());

        // evento
        EventoTeclado evt = new EventoTeclado();
        evt.setEventoTeclado(this.janela.getPonteiroMemoria(), personagem4);

        // informa a colisão dos personagens
        ColisaoComida colisao = new ColisaoComida();
        colisao.setObjetos(personagem4.getPersonagem(), comida.getPersonagem());
        colisao.addTimerExecucao(50);

        // informa a colisão dos personagens
        ColisaoPersonagens colisao1 = new ColisaoPersonagens();
        colisao1.setObjetos(personagem4.getPersonagem(), personagem1.getPersonagem());
        colisao1.addTimerExecucao(20);

        // informa a colisão dos personagens
        ColisaoPersonagens colisao2 = new ColisaoPersonagens();
        colisao2.setObjetos(personagem4.getPersonagem(), personagem2.getPersonagem());
        colisao2.addTimerExecucao(20);

        // informa a colisão dos personagens
        ColisaoPersonagens colisao3 = new ColisaoPersonagens();
        colisao3.setObjetos(personagem4.getPersonagem(), personagem3.getPersonagem());
        colisao3.addTimerExecucao(20);

    }

    // roda ojogo
    public void rodar() {

        this.carregaPersonagens();
        this.constroeJanela();

    }

}
