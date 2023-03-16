package lr3_task2_v4;

import java.util.ArrayList;

public class Client {
    private int id;
    private String Name;
    private CreditCard creditCard;
    private Account account;
    private ArrayList<Order> orders;
    public Client(int id, String name){
        this.id = id;
        this.Name = name;
        this.orders = new ArrayList<Order>();
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void makeOrderWithCreditCard(Order order){
        if(this.creditCard.makePayment(order.getCost())){
            orders.add(order);
        }
    }

    public void makePaymentWithCreditCard(int deposit, Account account){
        if(this.creditCard.makePayment(deposit)){
            account.takePayment(deposit);
        }
    }

    public void makeOrderWithAccount(Order order){
        if(this.account.makePayment(order.getCost())){
            orders.add(order);
        }
    }

    public void makePaymentWithAccount(int deposit, Account account){
        if(this.account.makePayment(deposit)){
            account.takePayment(deposit);
        }
    }

    public void blockCreditCard(){
        creditCard.block();
    }

    public void cancelBankAccount(){
        account.cancelBalance();
    }

    public Account getAccount() {
        return account;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
