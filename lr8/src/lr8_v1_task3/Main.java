package lr8_v1_task3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        new Thread(new Producer(store)).start();
        new Thread(new Customer(store)).start();
    }
}
