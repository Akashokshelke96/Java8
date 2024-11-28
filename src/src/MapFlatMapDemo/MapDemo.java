package MapFlatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {


        List<Customers> customers = getCustomerList();
        System.out.println("Implementation of map");
        // Here we are using map to map Customers data:  one to many;
        List<List<String>> phoneNumbers = customers.stream().map(c -> c.getPhoneNumber()).collect(Collectors.toList());
        phoneNumbers.stream().forEach(n -> System.out.println(n));

        System.out.println("=======================================");
        System.out.println("Implementation of Flatmap");
        //now to implement flatmap, FOR NESTED LISTS WE USE FLATMAP
        List<String> flatMapPhoneNumbers = customers.stream().flatMap(c -> c.getPhoneNumber().stream()).collect(Collectors.toList());
        flatMapPhoneNumbers.stream().forEach(n -> System.out.print(n + " "));
    }

    public static List<Customers> getCustomerList(){
        List<Customers> customers = new ArrayList<>();
        customers.add(new Customers("Akash", 1, "Shelke", Arrays.asList("923462342", "23423425", "23423422")));
        customers.add(new Customers("Neha", 2, "Patil", Arrays.asList("982374651", "938476123")));
        customers.add(new Customers("Rahul", 3, "Deshmukh", Arrays.asList("987654321", "876543210")));
        customers.add(new Customers("Priya", 4, "Sharma", Arrays.asList("998877665", "776655443", "665544332")));
        customers.add(new Customers("Anjali", 5, "Jadhav", Arrays.asList("987123456", "765432198")));
        customers.add(new Customers("Rohan", 6, "Kumar", Arrays.asList("912345678", "812345678", "712345678")));

        return customers;
    }
}
