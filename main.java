import Creational.Factory.DificultEnemiesFactory;
import Creational.Factory.EasyEnemiesFactory;
import Creational.Factory.Enemy;
import Creational.Prototype.Movie;
import Creational.Prototype.prototypeFactory;

public class main {

    public static void main(String args[]) {
        singletonTest();
        builderTest();
        prototypeTest();
        factoryTest();
    }

    private static void singletonTest() {
        System.out.println("--------------------------------------SINGLETON--------------------------------------");
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);

        
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println(anotherInstance);
    }

    private static void builderTest() {
        System.out.println("--------------------------------------BUILDER--------------------------------------");
        LunchOrder.Builder builder = new LunchOrder.Builder();
        
        builder.bread("Integral").condiments("Lechuga").meat("Pechuga");
        builder.bread("Blanco");

        LunchOrder lunch = builder.build();

        System.out.println(lunch.getBread());
        System.out.println(lunch.getCondiments());
        System.out.println(lunch.getMeat());
    }

    private static void prototypeTest() {
        System.out.println("--------------------------------------PROTOTYPE--------------------------------------");
        prototypeFactory registry = new prototypeFactory();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Clonación");

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getRuntime());
        System.out.println(movie.getUrl());
    }

    private static void factoryTest() {
        System.out.println("--------------------------------------FACTORY--------------------------------------");
        DificultEnemiesFactory dificultEnemiesFactory = new DificultEnemiesFactory();
        Enemy dificultEnemy = dificultEnemiesFactory.createEnemy();
        dificultEnemy.damagePerSecond();
        
        EasyEnemiesFactory easytEnemiesFactory = new EasyEnemiesFactory();
        Enemy easyEnemy = easytEnemiesFactory.createEnemy();
        easyEnemy.damagePerSecond();
    }
    
}
