package lr9_v2_task12;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<People> peoples = Arrays.asList(
                new People("Ivane", 16, Gender.MAN),
                new People("Petr", 23, Gender.MAN),
                new People("Maria", 42, Gender.WOMAN)
        );

        int minAge = peoples.stream().filter(x -> x.getName().contains("e")).mapToInt(People::getAge).min().getAsInt();

        peoples.stream().filter(x -> (x.getName().contains("e") && x.getAge() == minAge)).forEach(x -> System.out.println(
                "Имя человка с минимальны возрастом и буквой \'e\' в имени: " + x.getName() + ", возраст: " + x.getAge()
        ));
    }
}
