package DecoratorPattern;
import StrategyPattern.WeaponBehavior;

public abstract class EffectDecorator implements WeaponBehavior {
    // Reference
    WeaponBehavior weaponBehavior;

    // Constructor shows which weapon we are enhancing
    public EffectDecorator(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    @Override
    public void attack() {
        weaponBehavior.attack();
    }
}