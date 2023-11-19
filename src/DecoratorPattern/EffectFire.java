package DecoratorPattern;
import StrategyPattern.WeaponBehavior;

public class EffectFire extends EffectDecorator {

    public EffectFire(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(" +Fire");
    }
}