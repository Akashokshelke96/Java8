package StreamsDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
        Optional<Integer> num = numbers.stream().
                distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("Second highest number is: " + num.get());
    }
}
