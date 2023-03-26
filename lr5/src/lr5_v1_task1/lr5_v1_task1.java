package lr5_v1_task1;

import java.util.Arrays;
import java.util.Scanner;

public class lr5_v1_task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Введите кол-во векторов: ");
        String input = in.nextLine();

        try {
            int size_array = Integer.parseInt(input);
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка: введенное значение не является целым числом");
        }

        Vector[] myArray = new Vector[Integer.parseInt(input)];

        for (int i = 0; i < myArray.length; i++){

            System.out.println("Укажите размер " + (i+1) + " вектора:");
            String input_size = in.nextLine();

            try {
                int size_vector = Integer.parseInt(input_size);
            }
            catch (NumberFormatException e){
                System.out.println("Ошибка: введенное значение не является целым числом");
            }

            myArray[i] = new Vector(Integer.parseInt(input_size));

            for (int j = 0; j < myArray[i].getSize(); j++){

                System.out.println("Введите число для вектора:");
                String input_number = in.nextLine();

                try {
                    double number = Double.parseDouble(input_number);
                }
                catch (NumberFormatException e){
                    System.out.println("Ошибка: введенное значение не является числом типа double");
                }

                myArray[i].set(j, Double.parseDouble(input_number));
            }

            System.out.println(Arrays.toString(myArray[i].getValues()));
        }

        for (int i = 0; i < myArray.length; i++){
            for (int j = i+1; j < myArray.length; j++){
                System.out.println();
                System.out.println("Вычисления для векторов: " + Arrays.toString(myArray[i].getValues()) + " " + Arrays.toString(myArray[j].getValues()));
                System.out.println("Скалярное произведение: " + myArray[i].scalar(myArray[j]));
                System.out.println("Длина первого вектора: " + myArray[i].length());
                System.out.println("Длина второго вектора: " + myArray[j].length());
                System.out.println("Угол между векторами(в градусах): " + myArray[i].angle(myArray[j]));
            }
        }

    }
}
