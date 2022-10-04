package Ex_2;

public class TestBall {
    public static void main(String[] args){
        Ball B1 = new Ball(1, 5);
        System.out.println(B1);
        System.out.println("--------------------");
        System.out.println(B1.getX());
        System.out.println(B1.getY());
        B1.setX(7);
        B1.setY(10);
        System.out.println("--------------------");
        System.out.println(B1.getX());
        System.out.println(B1.getY());
        B1.setXY(5, 5);
        System.out.println("--------------------");
        System.out.println(B1.getX());
        System.out.println(B1.getY());
        B1.move(5, 7);
        System.out.println("--------------------");
        System.out.println(B1.getX());
        System.out.println(B1.getY());
    }
}
