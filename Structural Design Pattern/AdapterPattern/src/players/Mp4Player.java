package players;

import interfaces.AdvancedMediaPlayer;

// Actually playing mp4 audio

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4: : " + fileName);

    }
}
