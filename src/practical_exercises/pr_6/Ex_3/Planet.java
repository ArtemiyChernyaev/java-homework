package pr_6.Ex_3;

class Planet implements Nameable{
    private final String name;

    public Planet(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
