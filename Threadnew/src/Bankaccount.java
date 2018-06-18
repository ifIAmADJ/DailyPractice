public class Bankaccount {

    private int balance=100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int cost)
    {
        balance-=cost;
    }
}

