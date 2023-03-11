package lr3_task1_v1;

public class Vector {
    public  int[] array;
    public Vector(int size){
        this.array = new int[size];
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
    public static Vector multiplication(Vector V1, Vector V2){
        Vector resultV = null;
        if(V1.array.length == V2.array.length){
            resultV = new Vector(V1.array.length);
            for (int i = 0; i < V1.array.length; i++){
                resultV.array[i] = V1.array[i] * V2.array[i];
            }
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
}
