package lr2_task2_v1;

import java.io.IOException;
import java.util.*;

public class lr2_task2 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        List<String> myArray = new ArrayList<String>();
        System.out.println("Введите n строк, если ввод окончен, то введите 'q': ");
        String currentLine = in.nextLine();
        while (!(currentLine.equals("q"))){
            myArray.add(currentLine);
            currentLine = in.nextLine();
        }

        List<String> incArray = myArray, decArray = myArray;

        for (int i = 0; i < decArray.size(); i++){
            for (int j = 0; j < decArray.size()-i-1; j++){
                if(decArray.get(j+1).length() > decArray.get(j).length()){
                    Collections.swap(decArray, j+1, j);
                }
            }
        }
        System.out.println("Сортиврока по убыванию длины строк:");
        for (String x : decArray){
            System.out.println(x);
        }

        for (int i = 0; i < incArray.size(); i++){
            for (int j = 0; j < incArray.size()-i-1; j++){
                if(incArray.get(j+1).length() < incArray.get(j).length()){
                    Collections.swap(incArray, j+1, j);
                }
            }
        }
        System.out.println("Сортиврока по возрастанию длины строк:");
        for (String x : incArray){
            System.out.println(x);
        }

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
