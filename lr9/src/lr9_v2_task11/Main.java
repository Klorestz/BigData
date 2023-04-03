package lr9_v2_task11;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<People> peoples = Arrays.asList(
                new People("Ivan", 16, Gender.MAN),
                new People("Petr", 23, Gender.MAN),
                new People("Maria", 42, Gender.WOMAN)
        );

        int maxAgeMan = peoples.stream().filter(x -> x.getGender() == Gender.MAN).mapToInt(People::getAge).max().getAsInt();

        peoples.stream().filter(x -> x.getAge() == maxAgeMan).forEach(x ->
                System.out.println("Самый старший мужчина: " + x.getName() + ", возраст: " + x.getAge()));

    }
}
