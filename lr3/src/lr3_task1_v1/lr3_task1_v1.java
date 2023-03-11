package lr3_task1_v1;

import java.util.Scanner;
import java.util.Arrays;

public class lr3_task1_v1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во векторов:");
        int size_array = in.nextInt();
        Vector[] myArray = new Vector[size_array];
        System.out.println("Укажите размер вектора:");
        int size_vector = in.nextInt();
        for (int i = 0; i < size_array; i++){
            myArray[i] = new Vector(size_vector);
            System.out.println(Arrays.toString(myArray[i].array));
        }
        for (int i = 0; i < size_array; i++){
            for (int j = i+1; j < size_array; j++){
                System.out.println();
                System.out.println("Вычисления для векторов: " + Arrays.toString(myArray[i].array) + " " + Arrays.toString(myArray[j].array));
                System.out.println("Скалярное произведение: " + Vector.scalar(myArray[i],myArray[j]));
                System.out.println("Длина первого вектора: " + Vector.length(myArray[i]));
                System.out.println("Длина второго вектора: " + Vector.length(myArray[j]));
                System.out.println("Угол между векторами(в градусах): " + Vector.angle(myArray[i],myArray[j]));
            }
        }
    }
}