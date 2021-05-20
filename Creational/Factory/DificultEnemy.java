package Creational.Factory;

public class DificultEnemy extends Enemy {

    private int damage;

    public void damagePerSecond() {
        System.out.println("DPS: DificultEnemy");
        damage = 10;
        System.out.println("DPS: " + damage);
    }
    
}
