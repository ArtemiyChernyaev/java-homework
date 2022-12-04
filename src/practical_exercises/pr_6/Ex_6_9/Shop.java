package pr_6.Ex_6_9;

public class Shop implements Printable{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shop (String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing shop's sign - " + getName());
    }
}
