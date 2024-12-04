package StreamsDemo;

import java.util.Arrays;
import java.util.List;

public class FlattenList {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6)
        );
        List<Integer> str = listOfLists.stream().flatMap(n -> n.stream()).toList();
        System.out.println(str);
    }
}
