import players.AudioPlayer;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        // AudioPlayer is capable of playing all audioType mp3, mp4 and vlc.
        // Though originally AudioPlayer can only play mp3, but with help of MediaAdapter
        // AudioPlayer can play all the audioType
        audioPlayer.play("mp3", "<any mp3 song>");
        audioPlayer.play("mp4", "<any mp4 song>");
        audioPlayer.play("vlc", "<any vlc song>");
    }
}