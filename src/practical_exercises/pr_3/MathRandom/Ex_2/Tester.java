package Ex_2;
import java.util.Random;

public class Tester {
    public static void showCircleArr(Circle circles[]){
        for(int i = 0; i < circles.length; i++){
            System.out.println(circles[i]);
        }
    }

    public static Circle findMinCircle(Circle circles[]){
        Circle minCircle = circles[0];
        for(int i = 1; i < circles.length; i++){
            if(circles[i].getRadius() < minCircle.getRadius()){
                minCircle = circles[i];
            }
        }
        return minCircle;
    }

    public static Circle findMaxCircle(Circle circles[]){
        Circle maxCircle = circles[0];
        for(int i = 1; i < circles.length; i++){
            if(circles[i].getRadius() > maxCircle.getRadius()){
                maxCircle = circles[i];
            }
        }
        return maxCircle;
    }

    public static Circle[] sortCircles(Circle circles[]){
        for (int i =0; i <  circles.length - 1; i++){
            for (int k = i; k < circles.length - 1; k++){
                if(circles[k].getRadius() > circles[k + 1].getRadius()){
                    Circle temp = circles[k];
                    circles[k] = circles[k+1];
                    circles[k+1] = temp;
                }
            }
        }
        return circles;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int maxRadius = 100;
        int maxCoord = 100;

        Point p0 = new Point(rand.nextInt(maxCoord), rand.nextInt(maxCoord));
        Point p1 = new Point(rand.nextInt(maxCoord), rand.nextInt(maxCoord));
        Point p2 = new Point(rand.nextInt(maxCoord), rand.nextInt(maxCoord));

        Circle [] circles = new Circle[3];
        circles[0] = new Circle(p0, rand.nextInt(maxRadius));
        circles[1] = new Circle(p1, rand.nextInt(maxRadius));
        circles[2] = new Circle(p2, rand.nextInt(maxRadius));
        int circlesLen = circles.length;

        Circle minCircle = findMinCircle(circles);
        Circle maxCircle = findMaxCircle(circles);
        System.out.println("Min radius: " + minCircle.getRadius());
        System.out.println("Max radius: " + maxCircle.getRadius());
        System.out.println("Sorted circles:");
        showCircleArr(sortCircles(circles));
    }
}
