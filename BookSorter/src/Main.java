import model.Book;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();

        books.add(new Book("Genç Werther'in Acıları",366,"Johann Wolfgang","1999"));
        books.add(new Book("Hayvan Çiftliği",270,"George Orwel","1999"));
        books.add(new Book("Altıncı Koğuş",166,"Anton Cehov","1999"));
        books.add(new Book("Martin Eden", 700, "Jack London","1999"));
        books.add(new Book("Insancıklar",770,"Dostoyevski","1999"));


        System.out.println("-----------------Ordered list of books by title---------------------");

        for (Book b: books){
            System.out.println(b);
        }

        Set<Book> sortedByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return  o1.getPageCount() - o2.getPageCount();
            }
        });

        sortedByPageCount.addAll(books);

        System.out.println("--------------Sorted list by page number of books---------------------");

        for (Book b: sortedByPageCount){
            System.out.println(b);
        }


    }
}