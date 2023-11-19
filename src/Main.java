import AdapterPattern.Zephyr;
import AdapterPattern.Blaze;
import AdapterPattern.MagicAdapter;
import DecoratorPattern.EffectFire;
import DecoratorPattern.EffectSpeed;
import FactoryMethodPattern.Enemy;
import FactoryMethodPattern.EnemyFactory;
import ObserverPattern.GameSystem;
import SingletonPattern.ServerStatus;
import StrategyPattern.BattleAxe;
import StrategyPattern.Broadsword;
import StrategyPattern.Dagger;
import StrategyPattern.Longbow;

public class Main {
    public static void main(String[] args) {
        GameSystem game = new GameSystem();

        //STRATEGY PATTERN
        System.out.println("--------------STRATEGY--------------");
        Characters demon = new Demon(game, "Zhandooos", 100, 50, 120);
        demon.setWeaponBehavior(new Dagger());
        demon.receiveDamage(20); // Demon takes damage
        demon.heal(30); // Demon is healed
        demon.increaseMana(10); // Demon gains mana
        demon.gainExperience(50); // Demon gains experience points

        demon.setHealth(90);  // Modify health
        demon.setMana(60);    // Modify mana
        demon.setExperiencePoints(20);  // Modify experience points

        System.out.println("Demon's Updated Health: " + demon.getHealth());
        System.out.println("Demon's Updated Mana: " + demon.getMana());
        System.out.println("Demon's Updated Experience: " + demon.getExperiencePoints());



        Characters orc = new SavageOrc(game, "MEiiirzhan", 200, 70, 20);
        orc.setWeaponBehavior(new BattleAxe());
        orc.performFight();
        orc.receiveDamage(15); // Orc takes damage
        orc.heal(10); // Orc is healed
        orc.increaseMana(5); // Orc gains mana
        orc.gainExperience(30); // Orc gains experience points

        orc.setHealth(110); // Modify health
        orc.setMana(50);    // Modify mana
        orc.setExperiencePoints(10);  // Modify experience points

        System.out.println("Orc's Updated Health: " + orc.getHealth());
        System.out.println("Orc's Updated Mana: " + orc.getMana());
        System.out.println("Orc's Updated Experience: " + orc.getExperiencePoints());

        Characters elf = new ForestElf(game, "elfbar", 80, 120, 150);
        elf.setWeaponBehavior(new Broadsword());
        elf.performFight();
        elf.receiveDamage(10); // Elf takes damage
        elf.heal(20); // Elf is healed
        elf.increaseMana(15); // Elf gains mana
        elf.gainExperience(40); // Elf gains experience points

        elf.setHealth(85);  // Modify health
        elf.setMana(70);    // Modify mana
        elf.setExperiencePoints(30);  // Modify experience points

        System.out.println("Elf's Updated Health: " + elf.getHealth());
        System.out.println("Elf's Updated Mana: " + elf.getMana());
        System.out.println("Elf's Updated Experience: " + elf.getExperiencePoints());

        System.out.println("\n--------------OBSERVER--------------");
        //OBSERVER
        game.getNotificationCenter().addSubscriber(demon);
        game.getNotificationCenter().addSubscriber(orc);
        game.getNotificationCenter().addSubscriber(elf);
        game.newUpdate("+1 new boss");


        System.out.println("\n--------------ADAPTER--------------");
        //ADAPTER
        demon.setWeaponBehavior(new MagicAdapter(new Zephyr()));
        demon.performFight();


        System.out.println("\n--------------DECORATOR--------------");
        //ADAPTER
        demon.setWeaponBehavior(new EffectFire(new EffectSpeed(new Longbow())));
        demon.performFight();


        System.out.println("\n--------------SINGLETON--------------");
        //SINGLETON
        ServerStatus serverStatus = ServerStatus.getInstance();
        serverStatus.showStatus();


        System.out.println("\n--------------FACTORY--------------");
        //FACTORY
        EnemyFactory mobsFactory = new EnemyFactory();
        Enemy Serpent = mobsFactory.createEnemy("serpent");
        Enemy Arachnid = mobsFactory.createEnemy("arachnid");
        Serpent.attack();
        Arachnid.attack();
    }
}