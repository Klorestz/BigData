package lr3_task11_v3;

import java.util.Objects;

public class Day {
    Hour hour;
    Minute minute;
    public Day(Hour hour, Minute minute){
        this.hour = hour;
        this.minute = minute;
    }
    public Hour getHour() {
        return hour;
    }

    public void setHour(Hour hour) {
        this.hour = hour;
    }

    public Minute getMinute() {
        return minute;
    }

    public void setMinute(Minute minute) {
        this.minute = minute;
    }
    public void currentTime(){
        System.out.println("Current time: " + hour.toString() + ":" + minute.toString());
    }
    public void calculateDayTime(){
        int hour = this.hour.getHour();
        if (hour >= 4 && hour < 12) {
            System.out.println("It's morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("It's afternoon!");
        } else if (hour >= 18 && hour < 22) {
            System.out.println("It's evening!");
        } else {
            System.out.println("It's night!");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Day day = (Day) obj;
        return Objects.equals(hour, day.hour) && Objects.equals(minute, day.minute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute);
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }
}
