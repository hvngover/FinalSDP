import ObserverPattern.GameSystem;

public class ForestElf extends Characters {

    public ForestElf(GameSystem game, String username) {
        super(game, username);
    }

    @Override
    void display() {
        System.out.println("I am a forest elf");
    }

}