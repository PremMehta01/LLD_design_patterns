package adapter;

import interfaces.AdvancedMediaPlayer;
import interfaces.MediaPlayer;
import players.Mp4Player;
import players.VlcPlayer;


// Adapter class
// DOUBT: not sure if implementing MediaPlayer is needed or not
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
       if(audioType.equals("mp4")) {
           advancedMediaPlayer = new Mp4Player();
       } else if(audioType.equals("vlc")) {
           advancedMediaPlayer = new VlcPlayer();
       }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equals("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }

        if(audioType.equals("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }
    }

}
