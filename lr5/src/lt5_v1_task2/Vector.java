package lt5_v1_task2;

import java.util.Arrays;

public class Vector {

    private double[] values;
    private int size;
    public Vector(int size){
        if (size <= 1){
            throw new IllegalArgumentException("Неверный размер вектора: " + size);
        }
        this.size = size;
        this.values = new double[size];
    }

    public void add(int value){
        values[size] = value;
        size++;
    }

    public double get(int index) {
        checkIndex(index);
        return values[index];
    }

    public void set(int index, double value) {
        checkIndex(index);
        values[index] = value;
    }


    public Vector sum(Vector V1){
        checkDimensions(V1);
        Vector resultV = new Vector(V1.values.length);
        for (int i = 0; i < V1.values.length; i++){
            resultV.values[i] = V1.values[i] + this.values[i];
        }
        return resultV;
    }

    public Vector sub(Vector V1){
        checkDimensions(V1);
        Vector resultV = new Vector(V1.values.length);
        for (int i = 0; i < V1.values.length; i++){
            resultV.values[i] = V1.values[i] - this.values[i];
        }
        return resultV;
    }

    public Vector multy(Vector V1){
        checkDimensions(V1);
        Vector resultV = new Vector(V1.values.length);
        for (int i = 0; i < V1.values.length; i++){
            resultV.values[i] = V1.values[i] * this.values[i];
        }
        return resultV;
    }


    public Vector inc(){
        for (int i = 0; i < getValues().length; i++){
            values[i]++;
        }
        return this;
    }
    public Vector dec(){
        for (int i = 0; i < getValues().length; i++){
            values[i]--;
        }
        return this;
    }

    public double length(){
        int length = 0;
        for (int i = 0; i < getSize(); i++){
            length += Math.pow(values[i],2);
        }
        return Math.sqrt(length);
    }

    public double scalar(Vector V1){
        checkDimensions(V1);
        double scalar = 0;
        for(int i = 0; i < getSize(); i++){
            scalar += V1.values[i] * values[i];
        }
        return scalar;
    }

    public double angle(Vector V1){
        checkDimensions(V1);
        double angle = scalar(V1)/(V1.length() * length());
        return Math.toDegrees(Math.acos(angle));
    }

    public Vector multiplication(double con){
        for (int i = 0; i < getSize(); i++){
            values[i] = values[i] * con;
        }
        return this;
    }

    public void CollinearAndOrto(Vector V1){
        checkDimensions(V1);
        double k = 0;
        for (int i = 0; i < getSize(); i++){
            if ((V1.values[i] != 0) && (this.values[i] != 0)){
                k = this.values[i]/V1.values[i];
            }
        }
        if (Arrays.equals(this.values,V1.multiplication(k).values)){
            System.out.println("Данные векторы коллинеарны");
        }
        else {
            System.out.println("Данные векторы не коллинеарны");
        }
        if (this.scalar(V1) == 0){
            System.out.println("Векторы ортогональны");
        }
        else {
            System.out.println("Векторы не ортогональны");
        }
    }

    public int getSize() {
        return size;
    }

    public double[] getValues() {
        return values;
    }

    public void checkIndex(int index){
        if(index < 0 || index >= getSize()){
            throw new IndexOutOfBoundsException("Неверный индекс: " + index);
        }
    }

    public void checkDimensions(Vector other){
        if (values.length != other.values.length){
            throw new IllegalArgumentException("Размеры векторов не равны. Размер первого: " + this.getSize() + ", размер второго: " + other.getSize());
        }
    }
}
