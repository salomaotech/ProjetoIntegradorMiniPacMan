package engine;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Som {

    private AudioClip audio;

    // roda um som
    public void Play(String arquivo, boolean loop) {

        URL url = getClass().getResource(arquivo);
        audio = Applet.newAudioClip(url);
        audio.play();

        if (loop == true) {

            audio.loop();

        }

    }

}
