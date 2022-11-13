import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookTreeSet = new TreeSet<>();
        bookTreeSet.add(new Book("Anna Karenina 1", 500,"Tolstoy"));
        bookTreeSet.add(new Book("Sefiller", 600,"Victor Hugo"));
        bookTreeSet.add(new Book("Suç ve Ceza", 700,"Dosto"));
        bookTreeSet.add(new Book("Tanrı Öldü", 800,"Nietzsche"));
        for (Book book:bookTreeSet) {
            book.printBook();
        }
        System.out.println("---------------------------");
        TreeSet<Book> bookTreeSet1 = new TreeSet<>(Comparator.comparingInt(Book::getPageNumber).reversed());
        bookTreeSet1.add(new Book("Anna Karenina 1", 500,"Tolstoy"));
        bookTreeSet1.add(new Book("Sefiller", 600,"Victor Hugo"));
        bookTreeSet1.add(new Book("Suç ve Ceza", 700,"Dosto"));
        bookTreeSet1.add(new Book("Tanrı Öldü", 800,"Nietzsche"));
        for (Book book:bookTreeSet1) {
            book.printBook();
        }

    }
}