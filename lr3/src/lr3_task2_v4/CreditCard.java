package lr3_task2_v4;

public class CreditCard {
    private int numberOfCard;
    private Client client;
    private int creditLimit;
    private int balance;
    private boolean isBlocked;

    public CreditCard(int numberOfCard, Client client) {
        this.numberOfCard = numberOfCard;
        this.creditLimit = 1_000_000;
        this.balance = 0;
        this.isBlocked = false;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public Client getClient() {
        return client;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public boolean makePayment(int amount) {
        if (!isBlocked) {
            if (balance + amount <= creditLimit) {
                System.out.println("The operation was successfully carried out");
                balance += amount;
                return true;
            } else {
                System.out.println("Credit limit exceeded. Transaction declined.");
                return false;
            }
        } else {
            System.out.println("Credit card is blocked. Transaction declined.");
            return false;
        }
    }
    public void block() {
        isBlocked = true;
    }

    public void unblock() {
        isBlocked = false;
    }

    @Override
    public String toString() {
        return "Number of card: " + numberOfCard + ", balance: " + balance;
    }
}
