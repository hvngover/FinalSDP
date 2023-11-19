package DecoratorPattern;

import StrategyPattern.WeaponBehavior;

public class EffectSpeed extends EffectDecorator {

    public EffectSpeed(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(" +Speed");
    }

}