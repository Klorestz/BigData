package lr1_task5_v1;

import java.util.Scanner;

public class lr1_task5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first_number = in.nextInt();
        System.out.println("Введите второе число: ");
        int second_number = in.nextInt();
        System.out.println("Сумма: " + (first_number+second_number) +" Произведение: " + (first_number*second_number));
    }
}
