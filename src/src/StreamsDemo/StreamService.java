package StreamsDemo;

import LambdaExpressions.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamService {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Great History",120));
        books.add(new Book(3,"Apple Town",150));
        books.add(new Book(4,"Broke People",180));
        books.add(new Book(9,"China History",123));

        //Three ways to sort the above object:
        books.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).forEach(t-> System.out.println(t));

        books.stream().sorted(Comparator.comparing(book -> book.getPages())).forEach(t-> System.out.println("Sorted by pages "+t));

        Collections.sort(books,(o1, o2) ->  o2.getPages() - o1.getPages());
        System.out.println(books.toString());
    }
}
