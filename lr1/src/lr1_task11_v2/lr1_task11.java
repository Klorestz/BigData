package lr1_task11_v2;

import java.util.Scanner;

public class lr1_task11 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = in.nextInt();
        int[] myArray = new int[n];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < n; i++){
            myArray[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.println();
            int length = String.valueOf(myArray[i]).length();
            if (length % 2 == 1){
                System.out.println("Число " + myArray[i] + " не может быть счастливым");
                continue;
            }
            int firstSum = 0, secondSum = 0, currentNumber = myArray[i];
            for (int j = 0; j < length/2; j++){
                firstSum += currentNumber % 10;
                currentNumber = currentNumber/10;
            }
            for (int j = 0; j < length/2; j++){
                secondSum += currentNumber % 10;
                currentNumber = currentNumber/10;
            }
            System.out.println("Сумма первой половины числа: " + secondSum + ", сумма второй половины числа: " + firstSum);
            if (firstSum == secondSum){
                System.out.println("Число " + myArray[i] + " является счастливым");
            }
            else{
                System.out.println("Число " + myArray[i] + " не является счастливым");
            }
        }
    }
}
