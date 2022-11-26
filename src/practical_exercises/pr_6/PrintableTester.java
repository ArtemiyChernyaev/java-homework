public class PrintableTester {
    public static void main(String[] args){
        Printable[] p = {
                new Book("Book1", "Author1", "genre1"),
                new Book("Book2", "Author2", "genre2"),
                new Shop("Book3", 15),
                new Shop("Book4", 3)
        };
        for (int i =0; i< p.length;i++){
            p[i].print();
        }
    }
}

class Book implements Printable{
    String name, author, genre;

    public Book(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public void print() {
        System.out.println("\""+ name+ "\"" + "| автор: " + author + "| жанр: " + genre);
    }
}

//Почему журнал назывется Shop?
class Shop implements Printable{
    String name;
    int number;

    public Shop(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void print() {
        System.out.println("\""+ name+ "\"" + " №" + number);
    }
}
