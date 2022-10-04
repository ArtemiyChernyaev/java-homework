package Ex_3;

public class Tester {
    public static void main(String[] args) {
        Point p0 = new Point(1, 2);
        Point p1 = new Point(5, 2);
        Point p2 = new Point(1, 8);

        Circle [] circles = new Circle[3];
        circles[0] = new Circle(p0, 0);
        circles[1] = new Circle(p1, 1);
        circles[2] = new Circle(p2, 2);

        int circlesLen = circles.length;

        System.out.println(p1);

        for(int i = 0; i < circlesLen; i++){
            System.out.println(circles[i]);
        }
    }
}
