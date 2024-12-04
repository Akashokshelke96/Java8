package StreamsDemo;

import java.util.Arrays;
import java.util.List;

public class FilteredMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> str = strings.stream()
                .filter(n -> !n.contains("a"))
                .map(n->n.toUpperCase())
                .toList();
        System.out.println(str);
    }
}
