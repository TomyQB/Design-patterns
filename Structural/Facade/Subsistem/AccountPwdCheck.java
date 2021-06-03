package Structural.Facade.Subsistem;

public class AccountPwdCheck {
        
    private String accountPwd = "123123";

    public String getAccountPwd() {
        return this.accountPwd;
    }

    public boolean correctPwd(String accountPwdToCheck) {
        if(accountPwdToCheck.equals(getAccountPwd())){
            return true;
        } else {
            return false;
        }
    }
}
