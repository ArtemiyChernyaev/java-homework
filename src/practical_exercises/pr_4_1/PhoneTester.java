public class PhoneTester {
    public static void main(String[] args){
        Phone iPhone = new Phone("81111111111", "Apple iphone 5", 350.5);
        Phone Samsung = new Phone("82222222222", "SX5");
        Phone Nokia = new Phone();

        iPhone.receiveCall("Ararat", "83333333333");
        Nokia.sendMessage("84444444444", "85555555555", "86666666666");

        System.out.println(Samsung.getNumber());
    }
}


class Phone{
    private String number;
    private String model;
    private double weight;

    Phone(String number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(){
        System.out.println("Я телефон");
    }
    public String getNumber() {
        return number;
    }
    public void receiveCall(String name){
        System.out.printf("Звонит %s \n", name);
    }

    public void sendMessage(String...numbers){
        for(String num: numbers){
            System.out.println("Number: " + num);
        }
    }
    public void receiveCall(String name, String num){
        System.out.printf("Звонит %s %s \n", name, num);
    }
}
