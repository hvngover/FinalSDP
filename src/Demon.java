import ObserverPattern.GameSystem;

public class Demon extends Characters{

    public Demon(GameSystem game, String username) {
        super(game, username);
    }


    @Override
    void display() {
        System.out.println("I am Demon");
    }
}
