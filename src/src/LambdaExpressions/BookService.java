package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public static void main(String[] args) {
        List<Book> booksList = BookDAO.getBooksList();
        Collections.sort(booksList,(o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(booksList);
    }
}
class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}