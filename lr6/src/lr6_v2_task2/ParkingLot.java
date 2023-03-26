package lr6_v2_task2;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int capacity;
    private List<Car> cars;
    private List<Integer> freeSpaces;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.cars = new ArrayList<>();
        this.freeSpaces = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            freeSpaces.add(i);
        }
    }

    public int park(Car car) {
        if (freeSpaces.isEmpty()) {
            throw new IllegalStateException("No available parking spaces.");
        }
        int space = freeSpaces.get(0);
        freeSpaces.remove(0);
        car.setSpotNumber(space);
        cars.add(car);
        return space;
    }

    public void unpark(int space) {
        Car car = null;
        for (Car c : cars) {
            if (c.getSpotNumber() == space) {
                car = c;
                break;
            }
        }
        if (car == null) {
            throw new IllegalArgumentException("No car found in space " + space);
        }
        freeSpaces.add(space);
        cars.remove(car);
        car.setSpotNumber(-1);
    }

}
