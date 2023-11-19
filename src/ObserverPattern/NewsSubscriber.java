package ObserverPattern;

public class NewsSubscriber implements Observer {

    private final GameSystem gameSystem;

    public NewsSubscriber(GameSystem gameSystem){
        this.gameSystem = gameSystem;
    }

    public void update() {
        System.out.println("New update: "+ gameSystem.getMessage());
    }
}