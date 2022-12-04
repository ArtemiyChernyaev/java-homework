package pr_6.Ex_3;

public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Planet1");
        Car car = new Car("Car1");
        Animal animal = new Animal("Animal1");

        System.out.println("Planet: " + planet.getName());
        System.out.println("Car: " + car.getName());
        System.out.println("Animal: " + animal.getName());
    }
}
