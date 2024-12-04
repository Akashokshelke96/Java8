package StreamsDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "elephant", "dog");

        String longest = strings.stream().max(Comparator.comparingInt(String::length))
               .orElse(null);

        System.out.println("Longest String is" + longest);
    }
}
