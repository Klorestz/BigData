package lr1_task6_v1;

import java.util.Calendar;
import java.util.Date;

public class lr1_task6 {
    public static void main(String[] args)
    {
        String lastname = "Карасёв";
        System.out.println("Фамилия студента: " + lastname);
        Calendar startWork = Calendar.getInstance();
        startWork.set(Calendar.YEAR, 2023);
        startWork.set(Calendar.MONTH, Calendar.FEBRUARY);
        startWork.set(Calendar.DAY_OF_MONTH, 17);
        startWork.set(Calendar.HOUR_OF_DAY, 15);
        startWork.set(Calendar.MINUTE, 39);
        System.out.println("Время выдачи задания: " + startWork.getTime());
        Date currentTime = new Date();
        System.out.println("Время сдачи задания: " + currentTime);
    }
}
