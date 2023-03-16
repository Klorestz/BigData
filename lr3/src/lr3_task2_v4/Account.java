package lr3_task2_v4;

public class Account {
    private int numberOfAccount, balance;
    private Client client;
    public Account(int numberOfAccount, Client client){
        this.numberOfAccount= numberOfAccount;
        this.balance = 0;
        this.client = client;
    }

    public boolean makePayment(int deposit){
        if(deposit < balance){
            balance -= deposit;
            System.out.println("The operation was successfully carried out");
            return true;
        }else {
            System.out.println("Not enough money.");
            return false;
        }
    }

    public void takePayment(int deposit){
        balance += deposit;
    }

    public void cancelBalance(){
        balance = 0;
    }
    public int getNumberOfAccount() {
        return numberOfAccount;
    }

    public Client getClient() {
        return client;
    }



    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberOfAccount=" + numberOfAccount +
                ", balance=" + balance +
                '}';
    }
}
