package lr6_v2_task1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class NumberStorage {
    private List<Double> values;
    public NumberStorage(){
        values = new ArrayList<Double>();
    }

    public void add(double number){
        values.add(number);
    }

    public double get(int index){
        return values.get(index);
    }

    public void remove(int index){
        values.remove(index);
    }

    public void remove(double number){
        values.remove(number);
    }

    public void setValues(List<Double> values) {
        this.values = values;
    }

    public List<Double> getValues() {
        return values;
    }

    public double findClosestNumber(double number){

        if (values.isEmpty()) {
            throw new NoSuchElementException("Список пуст");
        }

        if (values.contains(number)) {
            return number;
        }

        double closestNumber = values.get(0);

        for (Double value : values ){
            if (Math.abs(number - value) < (number - closestNumber)){
                closestNumber = value;
            }
        }
        return closestNumber;
    }
}
