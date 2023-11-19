package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class NotificationCenter {
    List<Observer> subscribers = new ArrayList<>();

    public void addSubscriber(Observer observer) {
        if(!subscribers.contains(observer)){
            subscribers.add(observer);
        }
    }

    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : subscribers){
            observer.update();
        }
    }
}