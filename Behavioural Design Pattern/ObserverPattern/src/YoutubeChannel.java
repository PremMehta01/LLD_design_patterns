import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer observer : observers) {
            observer.notified(videoTitle);
        }
    }

}
