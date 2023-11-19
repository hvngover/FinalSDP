package ObserverPattern;

public class GameSystem {

    private String message;
    private final NotificationCenter notificationCenter;

    public GameSystem(){
        notificationCenter = new NotificationCenter();
    }

    public NotificationCenter getNotificationCenter() {
        return notificationCenter;
    }

    public String getMessage() {
        return message;
    }

    public void newUpdate(String message) {
        this.message = message;
        getNotificationCenter().notifyObservers();
    }
}