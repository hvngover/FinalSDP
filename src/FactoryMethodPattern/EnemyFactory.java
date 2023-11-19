package FactoryMethodPattern;

public class EnemyFactory {

    public Enemy createEnemy(String enemyType){
        if(enemyType.equalsIgnoreCase("serpent")){
            return new Serpent();
        } else if (enemyType.equalsIgnoreCase("arachnid")) {
            return new Arachnid();
        }
        return null;
    }

}