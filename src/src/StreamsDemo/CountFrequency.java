package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequency {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        Map<String,Long> frequencyMap = items.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(frequencyMap);
    }
}
