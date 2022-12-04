package pr_6.Ex_11;

public class FahrenheitConverter implements Convertable {

    @Override
    public double getConverted(double temperature) {
        return 1.8 * temperature + 32;
    }
}
