package Creational.Factory;

public class EasyEnemy extends Enemy {

    private int damage;

    public void damagePerSecond() {
        System.out.println("DPS: EasyEnemy");
        damage = 5;
        System.out.println("DPS: " + damage);
    }
    
}
