package CollectionFramework;

public class Account {
    private int accountnumber;
    private String accountHolderName;
    private float accountBalance;

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountnumber=" + accountnumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public Account(int accountnumber, String accountHolderName, int accountBalance) {
        this.accountBalance=accountBalance;
        this.accountHolderName=accountHolderName;
        this.accountnumber=accountnumber;

    }
}
