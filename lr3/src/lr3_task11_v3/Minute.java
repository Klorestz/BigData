package lr3_task11_v3;

public class Minute {
    private int minute;

    public Minute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%d", minute);
    }
}
