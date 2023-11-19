import ObserverPattern.GameSystem;

public class Demon extends Characters {

    public Demon(GameSystem game, String username, int initialHealth, int initialMana, int initialExperience) {
        super(game, username, initialHealth, initialMana, initialExperience);
    }

    @Override
    void display() {
        System.out.println("I am Demon");
    }
}
