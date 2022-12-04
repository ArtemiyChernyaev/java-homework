package pr_6.Ex_6_9;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] array = {
                new Shop("Shop1"),
                new Book("Author1", "Book1"),
                new Magazine("Magazine1")
        };
        for (Printable elem : array) {
            elem.print();
        }
    }
}
