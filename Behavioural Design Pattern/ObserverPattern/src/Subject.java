public interface Subject {

    // public void subscribe(Observer observer);
    public void registerObserver(Observer observer);


    // public void unSubscribe(Observer observer);
    public void removeObserver(Observer observer);


    public void notifyObservers(String videoTitle);

}
