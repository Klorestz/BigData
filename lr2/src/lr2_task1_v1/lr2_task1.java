package lr2_task1_v1;


import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class lr2_task1 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n строк, если ввод окончен, то введите 'q': ");
        String currentLine = in.nextLine();
        String minLine = currentLine, maxLine = currentLine;
        while (!(currentLine.equals("q"))){
            if (minLine.length() > currentLine.length()){
                minLine = currentLine;
            }
            if (minLine.length() < currentLine.length()){
                maxLine = currentLine;
            }
            currentLine = in.nextLine();
        }
        System.out.println("Самая короткая строка:" + minLine + ", длина строки: " + minLine.length());
        System.out.println("Самая длинная строка:" + maxLine + ", длина строки: " + maxLine.length());
        System.out.println();
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
