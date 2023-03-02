package lr2_task2_v2;

import java.util.Scanner;

public class lr2_task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");
        int n = in.nextInt();
        int[][] myMatrix = new int[n][n];
        int[][] rightMatrix = new int[n][n], leftMatrix = new int[n][n], upMatrix = new int[n][n], downMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                myMatrix[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        }

        System.out.println("Исходная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("На сколько сделать сдвиг вправо?");
        int k = in.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(j+k < n){
                    rightMatrix[i][j+k] = myMatrix[i][j];
                }
                else {
                    rightMatrix[i][(j+k)%n] = myMatrix[i][j];
                }
            }
        }
        System.out.println("Матрица со свдигом вправо:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rightMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("На сколько сделать сдвиг влево?");
        k = in.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(j-k >= 0){
                    leftMatrix[i][j-k] = myMatrix[i][j];
                }
                else {
                    leftMatrix[i][(j-k)+n] = myMatrix[i][j];
                }
            }
        }
        System.out.println("Матрица со свдигом влево:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(leftMatrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("На сколько сделать сдвиг вниз?");
        k = in.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i+k < n){
                    upMatrix[i+k][j] = myMatrix[i][j];
                }
                else {
                    upMatrix[(i+k)%n][j] = myMatrix[i][j];
                }
            }
        }
        System.out.println("Матрица со свдигом вниз:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(upMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("На сколько сделать сдвиг влево?");
        k = in.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i-k >= 0){
                    upMatrix[i-k][j] = myMatrix[i][j];
                }
                else {
                    upMatrix[(i-k)+n][j] = myMatrix[i][j];
                }
            }
        }
        System.out.println("Матрица со свдигом влево:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(upMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
