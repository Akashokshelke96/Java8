package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public static List<Book> getBooksList(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Great History",120));
        books.add(new Book(3,"Apple Town",150));
        books.add(new Book(4,"Broke People",180));
        books.add(new Book(9,"China History",123));
        return books;
    }
}
