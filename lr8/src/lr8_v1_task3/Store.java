package lr8_v1_task3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    private int stock = 0;
    private final int MAX_STOCK = 10;
    private final Lock lock = new ReentrantLock();
    private final Condition conditionCustomer = lock.newCondition();
    private final Condition conditionProducer = lock.newCondition();

    public void produce(int quantity) throws InterruptedException {
        lock.lock();
        try {
            while (stock + quantity >= MAX_STOCK){
                System.out.println("Не хватает места на складе для " + quantity + " товаров.");
                conditionProducer.await();
            }
            stock += quantity;
            System.out.println("Производитель поставил на склад " + quantity + " товаров. Всего на складе: " + stock);
            conditionCustomer.signalAll();
        }
        finally {
            lock.unlock();
        }
    }

    public void consume(int quantity) throws InterruptedException {
        lock.lock();
        try {
            while (stock - quantity < 0){
                System.out.println("Товара в магазине недостаточно. Ожидаем...");
                conditionCustomer.await();
            }
            stock -= quantity;
            System.out.println("Покупатель купил " + quantity + " товаров. Осталось на складе: " + stock);
            conditionProducer.signalAll();
        }
        finally {
            lock.unlock();
        }

    }
}
