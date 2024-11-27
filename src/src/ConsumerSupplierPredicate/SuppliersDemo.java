package ConsumerSupplierPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuppliersDemo {
//    @Override
//    public String get() {
//        return "Akash";
//    }

    public static void main(String[] args) {
        Supplier<String> sup = () ->  "Akash";
        System.out.println(sup.get());

        List<String> str = Arrays.asList("a","b","c","d","e");
        System.out.println(str.stream().findAny().orElseGet(sup));
    }
}
