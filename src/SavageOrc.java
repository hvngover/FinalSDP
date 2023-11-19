import ObserverPattern.GameSystem;

public class SavageOrc extends Characters {

    public SavageOrc(GameSystem game, String username, int initialHealth, int initialMana, int initialExperience) {
        super(game, username, initialHealth, initialMana, initialExperience);
    }

    @Override
    void display() {
        System.out.println("I am a Savage Orc");
    }
}