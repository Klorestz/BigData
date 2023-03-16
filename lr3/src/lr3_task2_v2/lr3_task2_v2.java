package lr3_task2_v2;

public class lr3_task2_v2 {
    public static void main(String[] args) {
        CustomerArray customerArray = new CustomerArray();
        customerArray.addCustomer(new Customer(1, "Ivanov", "Ivan", "Ivanovich", "Moscow", 741243241, 12345671));
        customerArray.addCustomer(new Customer(2, "Petrov", "Petr", "Petrovich", "Moscow", 234_567_821, 234567890));
        customerArray.addCustomer(new Customer(3, "Sidorov", "Sidor", "Sidorovich", "Moscow", 545678903, 345678901));
        customerArray.addCustomer(new Customer(4, "Kuznetsov", "Igor", "Igorevich", "Moscow", 271423415, 789673434));
        System.out.println("Full list of Customer:");
        customerArray.ptintlAllCustomer();
        System.out.println();
        System.out.println("Customers  in alphabetical order:");
        customerArray.printCustomersInAlphabeticalOrder();
        System.out.println();
        System.out.println("Credit number card in current range");
        customerArray.printCreidtCardNumberInRange(200_000_00, 300_000_000);
    }
}
