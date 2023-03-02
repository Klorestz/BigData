package lr2_task1_v2;
import java.util.Scanner;

public class lr2_task1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");
        int n = in.nextInt();
        int[][] myMatrix = new int[n][n], myMatrix2 = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                myMatrix[i][j] = (int)(Math.random()*2*(n+1)-(n+1));
            }
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                myMatrix2[i][j]=myMatrix[i][j];
            }
        }

        System.out.println();
        System.out.println("Введите номер столбца для сортировки:");
        int k = in.nextInt()-1;
        for (int i = 0; i < n-1; i++){
            if(myMatrix[i+1][k] < myMatrix[i][k]){
                for (int j = 0; j < n; j++){
                    int swap = myMatrix[i+1][j];
                    myMatrix[i+1][j] = myMatrix[i][j];
                    myMatrix[i][j] = swap;
                }
            }
        }

        System.out.println("Результат работы пограммы:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Введите номер строки для сортировки:");
        k = in.nextInt()-1;
        for (int i = 0; i < n-1; i++){
            if(myMatrix2[k][i+1] < myMatrix2[k][i]){
                for (int j = 0; j < n; j++){
                    int swap = myMatrix2[j][i+1];
                    myMatrix2[j][i+1] = myMatrix2[j][i];
                    myMatrix2[j][i] = swap;
                }
            }
        }

        System.out.println("Результат работы пограммы:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(myMatrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
