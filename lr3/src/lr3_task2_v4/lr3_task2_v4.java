package lr3_task2_v4;

import lr3_task1_v4.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class lr3_task2_v4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<Account>();
        ArrayList<CreditCard> creditCards = new ArrayList<CreditCard>();
        ArrayList<Client> clients = new ArrayList<Client>();
        ArrayList<Order> orders = new ArrayList<Order>();

        Administrator administrator = new Administrator("Admin Adminov");

        clients.add(new Client(1, "Ivan Ivanov"));
        clients.add(new Client(2, "Sidr Sidorov"));
        clients.add(new Client(3,"Petr Petrov"));

        orders.add(new Order(100000, "Computer"));
        orders.add(new Order(5000, "Sweater"));
        orders.add(new Order(3000,"Jeans"));

        while (true) {
            System.out.println("Select role:\n1.User\n2.Administrator");
            int selected = in.nextInt();
            switch (selected) {
                case 1:
                    System.out.println("Choose yourself:");
                    for (Client client : clients){
                        System.out.println(client.toString());
                    }
                    //int SelectedClient = in.nextInt();
                    Client client = clients.get(in.nextInt()-1);
                    System.out.println("Select task:\n1.Create credit card\n2.Create bank account\n3.Top up your account" +
                            "\n4.Make a purchase\n5.Blocked credit card\n6.Cancel the account\n7.Transfer between accounts.\n8.Balance of account/credit card");
                    int SelectedClientTask = in.nextInt();
                    switch (SelectedClientTask){
                        case 1:
                            CreditCard newCreditCard = new CreditCard((int)(Math.random()*1000000000), client);
                            creditCards.add(newCreditCard);
                            client.setCreditCard(newCreditCard);
                            System.out.println("The credit card was successfully created");
                            System.out.println(client.getCreditCard().toString());
                            break;
                        case 2:
                            Account newAccount = new Account((int)(Math.random()*1000000000), client);
                            accounts.add(newAccount);
                            client.setAccount(newAccount);
                            System.out.println("The bank account was successfully created");
                            System.out.println(client.getAccount().toString());
                            break;
                        case 3:
                            System.out.println("Enter a deposit to top up");
                            client.getAccount().takePayment(in.nextInt());
                            System.out.println(client.getAccount().toString());
                            break;
                        case 4:
                            System.out.println("Select a purchase:");
                            for (Order order : orders){
                                System.out.println(order.toString());
                            }
                            Order order = orders.get(in.nextInt()-1);
                            System.out.println("Choose a payment method:\n1.Bank Account\n2.Credit card");
                            switch (in.nextInt()){
                                case 1:
                                    client.makeOrderWithAccount(order);
                                    break;
                                case 2:
                                    client.makeOrderWithCreditCard(order);
                                    break;
                            }
                            break;
                        case 5:
                            System.out.println("Credit card was clsoed");
                            client.blockCreditCard();
                            break;
                        case 6:
                            System.out.println("Bank account was canceled");
                            client.cancelBankAccount();
                            break;
                        case 7:
                            System.out.println("Select other account:");
                            for (Account account : accounts){
                                System.out.println(account.toString());
                            }
                            Account account = accounts.get(in.nextInt()-1);
                            System.out.println("Enter the transfer amount:");
                            int amount = in.nextInt();
                            System.out.println("Choose a payment method:\n1.Bank Account\n2.Credit card");
                            switch (in.nextInt()){
                                case 1:
                                    client.makePaymentWithAccount(amount,account);
                                    break;
                                case 2:
                                    client.makePaymentWithCreditCard(amount,account);
                                    break;
                            }
                            break;
                        case 8:
                            System.out.println("Balance of Account: " + client.getAccount().getBalance());
                            System.out.println("Balance of Credit Card: " + client.getCreditCard().getBalance());
                    }
                    break;
                case 2:
                    System.out.println("Select a credit card for block:");
                    for (CreditCard creditCard: creditCards){
                        System.out.println(creditCard.toString());
                    }
                    CreditCard creditCardForBlock = creditCards.get(in.nextInt()-1);
                    administrator.blockedCreditCard(creditCardForBlock);
                    break;
            }
        }

    }
}
