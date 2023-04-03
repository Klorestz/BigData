package lr9_v1_task12;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> strings = Arrays.asList(
                "dfadsfsdf",
                "zxvxcvxc",
                "treteg",
                "kygukuty54"
        );

        strings.stream().limit(2).forEach(x -> System.out.println(x));
    }
}
