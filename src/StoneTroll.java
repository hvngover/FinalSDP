import ObserverPattern.GameSystem;

public class StoneTroll extends Characters {

    public StoneTroll(GameSystem game, String username) {
        super(game, username);
    }

    @Override
    void display() {
        System.out.println("I am a Stone Troll");
    }

}