package lr8_v1_task3;

public class Producer implements Runnable {
    private Store store;
    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            int amount = (int) (Math.random() * 5) + 1;
            try {
                store.produce(amount);
                Thread.sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
