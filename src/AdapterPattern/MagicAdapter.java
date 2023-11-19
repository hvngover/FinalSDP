package AdapterPattern;
import StrategyPattern.WeaponBehavior;

public class MagicAdapter implements WeaponBehavior {
    ElementalMagic elementalMagic;

    public MagicAdapter(ElementalMagic elementalMagic){
        this.elementalMagic = elementalMagic;
    }

    @Override
    public void attack(){
        elementalMagic.elementalAttack();
    }
}