package lr3_task11_v3;

public class Hour {
    private int hour;

    public Hour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return String.format("%d", hour);
    }
}
