package StreamsDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class KthLargestElement {
    public static void main(String[] args) {
        int k = 6;
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);

        Optional<Integer> kth = numbers.stream().sorted(Comparator.reverseOrder()).skip(k-1).findFirst();
        System.out.println("Kth Largest: " + kth.get());
    }
}
