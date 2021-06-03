package Structural.Facade.Subsistem;

public class GameCoins {

    private int gameCoins = 60;
    
    public int getGameCoins() {
        return this.gameCoins;
    }

    public void decreaseGameCoins(int spentCoins) {
        this.gameCoins -= spentCoins; 
    }

    public void increaseGameCoins(int earnedCoins) {
        this.gameCoins += earnedCoins; 
    }

    public boolean haveEnoughGameCoins(int gameCoinsRequired) {

        if(gameCoinsRequired > getGameCoins()) {
            System.out.println("You don't have enough coins");
            System.out.println("Current coins: " + getGameCoins());

            return false;
        } else {
            decreaseGameCoins(gameCoinsRequired);
            System.out.println("Current coins: " + getGameCoins());

            return true;
        }
    }

    public void earnCoins(int coinsToEarn) {

        increaseGameCoins(coinsToEarn);

        System.out.println("Coins earned!!");
        System.out.println("Current coins: " + getGameCoins());
    }
}
