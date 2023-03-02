package lr1_task12_v2;

import java.util.Scanner;

public class lr1_task12 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел Фибоначчи, которое нужно вывести: ");
        int n = in.nextInt();
        int[] myArray = new int[n];
        if (n > 1){
            myArray[0] = myArray[1] = 1;
            for (int i = 2; i < n; i++){
                myArray[i] = myArray[i-1] + myArray[i-2];
            }
            System.out.println("Результат: ");
            for (int i = 0; i < n; i++){
                System.out.print(myArray[i] + " ");
            }
        }
        else{
            if (n == 1) {
                myArray[0] = 1;
                System.out.println("Результат: " + myArray[0]);
            }
            else {
                System.out.println("Указанно некорректное число");
            }
        }
    }
}
