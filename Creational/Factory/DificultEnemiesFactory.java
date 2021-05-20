package Creational.Factory;

public class DificultEnemiesFactory implements Factory {
    
    public Enemy createEnemy() {
        DificultEnemy dificultEnemy = new DificultEnemy();

        return dificultEnemy;
    }
    
}
