package lr6_v2_task1;

import java.lang.reflect.Array;

public class lr6_v2_task1 {
    public static void main(String[] args) {
        NumberStorage numberStorage = new NumberStorage();

        numberStorage.add(10.0);
        numberStorage.add(20.0);
        numberStorage.add(30.0);
        numberStorage.add(40.0);
        numberStorage.add(50.0);
        numberStorage.add(60.0);

        System.out.println(numberStorage.getValues());
        System.out.println("Ближайшее число к 33:");
        System.out.println(numberStorage.findClosestNumber(33.0));
    }
}
