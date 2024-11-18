package players;

import adapter.MediaAdapter;
import interfaces.MediaPlayer;


// Originally can play only mp3, but with help of MediaAdapter
// can play all audioType mp3, mp4, and vlc

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // if mp3, play directly as AudioPlayer is capable of playing mp3 on its own
        if(audioType.equals("mp3")) {
            System.out.println("Playing mp3 : " + fileName);
        }
        // else take help of adapter to play mp4 or vlc
        else if(audioType.equals("mp4") || audioType.equals("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
    }
}
