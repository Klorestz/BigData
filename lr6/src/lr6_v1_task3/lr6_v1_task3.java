package lr6_v1_task3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class lr6_v1_task3 {
    public static void main(String[] args){

        Set<Integer> set = new LinkedHashSet<Integer>();
        Set<Integer> newSet = new LinkedHashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        int sum;
        while (set.size() > 1) {
            newSet.clear();
            while (set.size() > 1){
                Iterator<Integer> iterator = set.iterator();
                int first = iterator.next();
                iterator.remove();
                int second = iterator.next();
                sum = first + second;
                newSet.add(sum);
                System.out.println("Сумма " + first + " и " + second + " = " + sum);
            }
            set.clear();
            set.addAll(newSet);
            System.out.println(set);
        }
        System.out.println("Окончательный результат: " + set.iterator().next());
    }
}

