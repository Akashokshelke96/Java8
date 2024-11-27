package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public static List<Book> getBooksList(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Great History",120));
        books.add(new Book(1,"Apple Town",120));
        books.add(new Book(1,"Broke People",120));
        books.add(new Book(1,"China History",120));
        return books;
    }
}
