package ConsumerSupplierPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{

//    @Override
//    public boolean test(Integer integer) {
//        return integer % 2 == 0;
//    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(14));

        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,76);
        arr.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println("Print : " + i));

    }
}
