package pr_6.Ex_3;

public class Car implements Nameable{
    private final String name;
    public Car(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
