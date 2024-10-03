public class Main {
    public static void main(String[] args) {

        Subject sandeepMaheshwariChannel = new YoutubeChannel();

        Observer user1 = new Subscriber("user1");
        Observer user2 = new Subscriber("user2");

        sandeepMaheshwariChannel.registerObserver(user1);
        sandeepMaheshwariChannel.registerObserver(user2);

        sandeepMaheshwariChannel.notifyObservers("Video 1");

        sandeepMaheshwariChannel.removeObserver(user1);

        sandeepMaheshwariChannel.notifyObservers("Video 2");

    }
}