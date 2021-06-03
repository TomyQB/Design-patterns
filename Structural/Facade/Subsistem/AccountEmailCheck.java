package Structural.Facade.Subsistem;

public class AccountEmailCheck {
    
    private String accountEmail = "facadeGame@gmail.com";

    public String getAccountEmail() {
        return this.accountEmail;
    }

    public boolean correctEmail(String accountEmailToCheck) {
        if(accountEmailToCheck.equals(getAccountEmail())){
            return true;
        } else {
            return false;
        }
    }
}
