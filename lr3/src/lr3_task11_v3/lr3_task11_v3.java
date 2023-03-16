package lr3_task11_v3;

import java.lang.reflect.Type;
import java.time.LocalTime;

public class lr3_task11_v3 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        Minute minute = new Minute(localTime.getMinute());
        Hour hour = new Hour(localTime.getHour());
        Day day = new Day(hour, minute);
        day.currentTime();
        day.calculateDayTime();
    }
}
