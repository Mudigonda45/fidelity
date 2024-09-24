public class Account {
    int accno;
    String name;
    int balance;
    public void deposit(int x){
        balance+=x;
    }
    public void withdraw(int x){
        if(balance-x<0)
        {
            System.out.println("Expected cash not available");
        }
        else {
            balance-=x;
        }
    }
    public int balanceAmount()
    {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accno=" + accno +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
