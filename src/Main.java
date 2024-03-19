
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Set1:
        TreeSet<Book> set = new TreeSet<>();

        set.add(new Book(1, "Beyaz Kalp", "Javier Marias", 250, 2016));
        set.add(new Book(2, "Siddhartha", "Herman Hesse", 150, 2002));
        set.add(new Book(3, "Walden Gölü", "Henry David Thoreau", 380, 2017));
        set.add(new Book(4, "Dorian Gray'in Portresi", "Oscar Wilde", 275, 2002));
        set.add(new Book(5, "Cehenneme Övgü", "Gündüz Vassaf", 275, 2000));

        //Printing the sorting according to book titles to the screen
        for (Book book : set) {
            System.out.println(book.getID() + "--" + book.getBookName() + "-- " +
                    book.getAuthorName() + "--" + book.getPageNumber() + "--" + book.getPublishDate());
        }

        System.out.println("#####################################");


        //Set2:
        TreeSet<Book> set2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        set2.add(new Book(1, "Beyaz Kalp", "Javier Marias", 250, 2016));
        set2.add(new Book(2, "Siddhartha", "Herman Hesse", 150, 2002));
        set2.add(new Book(3, "Walden Gölü", "Henry David Thoreau", 380, 2017));
        set2.add(new Book(4, "Dorian Gray'in Portresi", "Oscar Wilde", 270, 2002));
        set2.add(new Book(5, "Cehenneme Övgü", "Gündüz Vassaf", 275, 2000));

        // Printing the order of the book according to the number of pages on the screen
        for (Book book : set2) {
            System.out.println(book.getID() + "--" + book.getBookName() + "-- " +
                    book.getAuthorName() + "--" + book.getPageNumber() + "--" + book.getPublishDate());
        }
    }
}

