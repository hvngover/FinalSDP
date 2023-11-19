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
import StrategyPattern.Longbow;

public class Main {
    public static void main(String[] args) {
        GameSystem game = new GameSystem();

        //STRATEGY PATTERN
        System.out.println("--------------STRATEGY--------------");
        Characters demon = new Demon(game, "Zhandooos", 100, 50, 0);
        demon.receiveDamage(20); // Demon takes damage
        demon.heal(30); // Demon is healed
        demon.increaseMana(10); // Demon gains mana
        demon.gainExperience(50); // Demon gains experience points

        Characters orc = new SavageOrc(game, "MEiiirzhan");
        orc.setWeaponBehavior(new BattleAxe());
        orc.performFight();

        Characters troll = new StoneTroll(game, "bigggsword");
        troll.performFight();

        Characters elf = new ForestElf(game, "elfbar");
        elf.performFight();

        System.out.println("\n--------------OBSERVER--------------");
        //OBSERVER
        game.getNotificationCenter().addSubscriber(demon);
        game.getNotificationCenter().addSubscriber(orc);
        game.newUpdate("2 new bosses");


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