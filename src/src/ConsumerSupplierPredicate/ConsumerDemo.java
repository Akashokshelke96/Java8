package ConsumerSupplierPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{

    public static void main(String[] args) {
        Consumer<Integer> consumer =  i ->  System.out.println("Print Int: " + i);
        consumer.accept(3);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        list.stream().forEach(consumer);
        list.stream().forEach(consumer);
    }


//Since consumer is a functional interface we can use lambda instead
//    @Override
//    public void accept(Integer integer) {
//        System.out.println("Print Int: " + integer );
//    }
}
