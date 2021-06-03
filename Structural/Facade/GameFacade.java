package Structural.Facade;

import Structural.Facade.Subsistem.AccountEmailCheck;
import Structural.Facade.Subsistem.AccountPwdCheck;
import Structural.Facade.Subsistem.Game;
import Structural.Facade.Subsistem.GameCoins;

public class GameFacade {
    
    private String accEmail;
    private String accPwd;

    AccountEmailCheck accEmailChecker;
    AccountPwdCheck accPwdChecker;
    GameCoins gameCoins;

    Game game;

    public GameFacade(String newAccEmail, String newAccPwd) {
        this.accEmail = newAccEmail;
        this.accPwd = newAccPwd;

        accEmailChecker = new AccountEmailCheck();
        accPwdChecker = new AccountPwdCheck();
        gameCoins = new GameCoins();

        game = new Game();
    }

    public String getAccountEmail() {
        return this.accEmail;
    }

    public String getAccountPwd() {
        return this.accPwd;
    }

    public void useCoins(int coinsToGet) {
        if(accEmailChecker.correctEmail(getAccountEmail()) && accPwdChecker.correctPwd(getAccountPwd()) && gameCoins.haveEnoughGameCoins(coinsToGet)) {
            System.out.println("Complete");
        } else {
            System.out.println("Failed");
        }
    }

    public void earnedCoins(int coinsToEarn) {
        if(accEmailChecker.correctEmail(getAccountEmail()) && accPwdChecker.correctPwd(getAccountPwd())) {
            gameCoins.earnCoins(coinsToEarn);
            System.out.println("Complete");
        } else {
            System.out.println("Failed");
        }
    }
}
