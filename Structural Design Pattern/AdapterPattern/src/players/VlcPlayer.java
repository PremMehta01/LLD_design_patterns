package players;

import interfaces.AdvancedMediaPlayer;


// Actually playing vlc audio

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
