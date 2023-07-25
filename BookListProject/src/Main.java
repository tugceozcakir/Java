import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 150, "Author1", "01-01-2020"));
        books.add(new Book("Book2", 200, "Author2", "01-01-2018"));
        books.add(new Book("Book3", 80, "Author3", "01-01-2015"));
        books.add(new Book("Book4", 250, "Author4", "01-01-2017"));
        books.add(new Book("Book5", 120, "Author5", "01-01-2019"));
        books.add(new Book("Book6", 180, "Author6", "01-01-2021"));
        books.add(new Book("Book7", 300, "Author7", "01-01-2016"));
        books.add(new Book("Book8", 90, "Author8", "01-01-2014"));
        books.add(new Book("Book9", 220, "Author9", "01-01-2013"));
        books.add(new Book("Book10", 100, "Author10", "01-01-2022"));

        Map<String, String> map = new TreeMap<>();
        books.forEach(book ->map.put(book.getName(),book.getAuthorName()));
        map.forEach((name, author) -> System.out.println("Book Name : " + name + ", Author : " + author));

        List<Book> books100 = books.stream().filter(book -> book.getPageCount() > 100).collect(Collectors.toList());
        System.out.println("\nBooks with more than 100 pages:");
        books100.forEach(book -> System.out.println("Book Name: " + book.getName() + ", Page Count: " + book.getPageCount()));
    }
}