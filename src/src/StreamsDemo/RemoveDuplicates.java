package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);

        List<Integer> distinct =  numbers.stream().collect(Collectors.toMap(n->n, n->1,(a,b)->a))
                .keySet()
                .stream()
                .collect(Collectors.toList());

        System.out.println("Distinct elements are : " + distinct);
    }
}
