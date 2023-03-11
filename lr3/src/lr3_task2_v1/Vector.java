package lr3_task2_v1;

import java.util.Arrays;

public class Vector {
    public  float[] array;
    public Vector(float[] array)
    {
        this.array = array;
    }
    public Vector(int size){
        this.array = new float[size];
        for (int i = 0; i < size; i++){
            this.array[i] = (int) (Math.random()*100);
        }
    }
    public static Vector sum(Vector V1, Vector V2){
        Vector resultV = null;
        if(V1.array.length == V2.array.length){
            resultV = new Vector(V1.array.length);
            for (int i = 0; i < V1.array.length; i++){
                resultV.array[i] = V1.array[i] + V2.array[i];
            }
        }
        return resultV;
    }
    public static Vector sub(Vector V1, Vector V2){
        Vector resultV = null;
        if(V1.array.length == V2.array.length){
            resultV = new Vector(V1.array.length);
            for (int i = 0; i < V1.array.length; i++){
                resultV.array[i] = V1.array[i] - V2.array[i];
            }
        }
        return resultV;
    }
    public static Vector multiplication(Vector V1, float con){
        Vector resultV = new Vector(V1.array.length);
        for (int i = 0; i < V1.array.length; i++){
            resultV.array[i] = V1.array[i] * con;
        }
        return resultV;
    }
    public static Vector inc(Vector V1){
        Vector resultV = new Vector(V1.array.length);
        for (int i = 0; i < V1.array.length; i++){
            resultV.array[i] = V1.array[i] + 1;
        }
        return resultV;
    }
    public static Vector dec(Vector V1){
        Vector resultV = new Vector(V1.array.length);
        for (int i = 0; i < V1.array.length; i++){
            resultV.array[i] = V1.array[i] - 1;
        }
        return resultV;
    }
    public static int scalar(Vector V1, Vector V2){
        int scalar = 0;
        for(int i = 0; i < V1.array.length; i++){
            scalar += V1.array[i] * V2.array[i];
        }
        return scalar;
    }
    public static double length(Vector V1){
        int length = 0;
        for (int i = 0; i < V1.array.length; i++){
            length += Math.pow(V1.array[i],2);
        }
        return Math.sqrt(length);
    }
    public static double angle(Vector V1, Vector V2){
        double angle = scalar(V1,V2)/(length(V1) * length(V2));
        return Math.toDegrees(Math.acos(angle));
    }
    public static void CollinearAndOrto(Vector V1, Vector V2){
        float k = 0;
        for (int i = 0; i < V1.array.length; i++){
            if ((V1.array[i] != 0) && (V2.array[i] != 0)){
                k = V2.array[i]/V1.array[i];
            }
        }
        if (Arrays.equals(V2.array,Vector.multiplication(V1,k).array)){
            System.out.println("Данные векторы коллинеарны");
        }
        else {
            System.out.println("Данные векторы не коллинеарны");
        }
        if (Vector.scalar(V1,V2) == 0){
            System.out.println("Векторы ортогональны");
        }
        else {
            System.out.println("Векторы не ортогональны");
        }
    }
}
