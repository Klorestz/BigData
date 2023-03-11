package lr3_task2_v1;


import java.util.Arrays;
import java.util.Scanner;

public class lr3_task2_v1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во векторов:");
        int size_array = in.nextInt();
        Vector[] myArray = new Vector[size_array];
        System.out.println("Укажите размер вектора:");
        int size_vector = in.nextInt();
        for (int i = 0; i < size_array; i++) {
            myArray[i] = new Vector(size_vector);
            System.out.println(Arrays.toString(myArray[i].array));
        }
        for (int i = 0; i < size_array; i++) {
            for (int j = i + 1; j < size_array; j++) {
                System.out.println();
                System.out.println("Вычисления для векторов: " + Arrays.toString(myArray[i].array) + " " + Arrays.toString(myArray[j].array));
                Vector.CollinearAndOrto(myArray[i], myArray[j]);
            }
        }
        //Коллинеарные векторы
        //float[] array_1 = {0, 3};
        //float[] array_2 = {0, 6};
        //Ортогональные векторы
        //float[] array_3 = {1, 2};
        //float[] array_4 = {2, -1};
        //Vector V1 = new Vector(array_3);
        //Vector V2 = new Vector(array_4);
        //Vector.CollinearAndOrto(V1,V2);
    }
}
