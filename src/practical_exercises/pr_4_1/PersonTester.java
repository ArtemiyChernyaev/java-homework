public class PersonTester {
    public static void main(String [] args){
        Person per1 = new Person();
        Person per2 = new Person("Artem", 19);

        per2.move();
        per1.move();
    }
}

class Person{
    private String fullName;
    private int age;

    Person(){}
    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " walking");
    }
    public void talk(){
        System.out.println(fullName + " talking");
    }
}
