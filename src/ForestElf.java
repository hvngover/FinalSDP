import ObserverPattern.GameSystem;

public class ForestElf extends Characters {

    public ForestElf(GameSystem game, String username, int initialHealth, int initialMana, int initialExperience) {
        super(game, username, initialHealth, initialMana, initialExperience);
    }

    @Override
    void display() {
        System.out.println("I am a Forest Elf");
    }
}