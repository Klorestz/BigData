package lr6_v2_task2;

public class lr6_v2_task2 {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car1 = new Car("ABC123");
        Car car2 = new Car("DEF456");
        parkingLot.park(car1);
        parkingLot.unpark(0);
        parkingLot.park(car2);
    }
}
