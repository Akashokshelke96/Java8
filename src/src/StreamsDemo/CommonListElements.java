package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonListElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        List<Integer> common = list1.stream().filter(n -> list2.contains(n)).toList();
        System.out.println(common);
    }
}
