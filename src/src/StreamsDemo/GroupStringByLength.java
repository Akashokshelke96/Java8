package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "elephant", "dog", "tiger");

        Map<Integer,List<String>> map = strings.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(map);
    }
}
