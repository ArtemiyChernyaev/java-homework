package pr_6.Ex_11;

public class ConvertDemo {
    public static void main(String[] args) {
        double temperature = 100;

        System.out.printf("temp = %.2f F\n", new FahrenheitConverter().getConverted(temperature));
        System.out.printf("temp = %.2f K\n", new KelvinConverter().getConverted(temperature));
    }
}
