package lr6_v2_task2;

public class Car {
    private String carNumber;
    private int spotNumber;
    public Car(String carNumber){
        this.carNumber = carNumber;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumner) {
        this.spotNumber = spotNumner;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
