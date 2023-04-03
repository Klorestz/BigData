package lr9_v1_task11;

import java.util.Arrays;
import java.util.Collection;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Ivan", 40),
                new Student("Petr", 60),
                new Student("Olga", 70)
        );
        OptionalDouble averageScore = students.stream().mapToInt(Student::getScore).average();

        System.out.println(averageScore.getAsDouble());


    }
}
