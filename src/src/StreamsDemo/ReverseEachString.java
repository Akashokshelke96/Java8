package StreamsDemo;

import java.util.Arrays;
import java.util.List;

public class ReverseEachString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "dog", "tiger");

        List<String> reversed = strings.stream().map(n -> new StringBuilder(n).reverse().toString()).toList();
        System.out.println(reversed);
    }
}
