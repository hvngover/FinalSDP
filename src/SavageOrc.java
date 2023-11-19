import ObserverPattern.GameSystem;

public class SavageOrc extends Characters {

    public SavageOrc(GameSystem game, String username) {
        super(game, username);
    }

    @Override
    void display() {
        System.out.println("I am a Savage Orc");
    }

}