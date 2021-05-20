package Creational.Factory;

public class EasyEnemiesFactory implements Factory {
    
    public Enemy createEnemy() {
        EasyEnemy normalEnemy = new EasyEnemy();

        return normalEnemy;
    }
}