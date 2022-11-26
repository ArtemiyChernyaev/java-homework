package pr_7.BookMag;

import static pr_7.BookMag.Book.printBooks;
import static pr_7.BookMag.Magazine.printMagazines;

public class DemoTest {
    public static void main(String[] args) {
        Printable[] printables = {
                new Magazine("Magazine1"),
                new Magazine("Magazine2"),
                new Book("Petr", "Book35"),
                new Magazine("Magazine6")};

        printMagazines(printables);
        System.out.println();
        printBooks(printables);
    }
}
