import ObserverPattern.GameSystem;
import ObserverPattern.Observer;
import StrategyPattern.WeaponBehavior;

abstract public class Characters implements Observer {
    private final GameSystem game;
    private String username;
    private int health;
    private int mana;
    private int experiencePoints;

    WeaponBehavior weaponBehavior;


    void performFight() {
        weaponBehavior.attack();
    }
    void display(){
    };

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public Characters(GameSystem game, String username, int initialHealth, int initialMana, int initialExperience) {
        this.game = game;
        this.username = username;
        this.health = initialHealth;
        this.mana = initialMana;
        this.experiencePoints = initialExperience;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    // Methods for modifying attributes
    public void receiveDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            System.out.println(username + " has been defeated!");
        }
    }

    public void heal(int amount) {
        health += amount;
        System.out.println(username + " has been healed for " + amount + " health points.");
    }

    public void increaseMana(int amount) {
        mana += amount;
        System.out.println(username + " has gained " + amount + " mana points.");
    }

    public void gainExperience(int amount) {
        experiencePoints += amount;
        System.out.println(username + " has gained " + amount + " experience points.");
    }

    public void update() {
        System.out.println(username + " - New update: " + game.getMessage());
    }

}
