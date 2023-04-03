package lr8_v1_task3;

public class Customer implements Runnable {
    private Store store;
    public Customer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            int amount = (int) (Math.random() * 5) + 1;
            try {
                store.consume(amount);
                Thread.sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
