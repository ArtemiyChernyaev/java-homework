import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Shapes extends Canvas {
    Random random = new Random();

    public void paint(Graphics g) {
        Color[] C = {Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW, Color.PINK};
        for (int i=0;i<20;i++){
            int shape = random.nextInt(2);
            setForeground(C[random.nextInt(5)]);
            if (shape == 0){
                int a = 10 + random.nextInt(40);
                g.fillRect(random.nextInt(1920), random.nextInt(1080), a, a);
            }
            if (shape == 1){
                int r = 10 + random.nextInt(40);
                g.fillOval(random.nextInt(1920), random.nextInt(1080), r, r);
            }
        }
    }
    public static void main(String[] args) {
        Shapes m = new Shapes();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(1920,1080);
        f.setVisible(true);
    }
}

abstract class Shape{
    String color;
    int PosX, PosY;
}

class Circle extends Shape{
    int radius;
    public Circle(int radius, String color, int posX, int posY) {
        this.radius = radius;
        this.color = color;
        this.PosX = posX;
        this.PosY = posY;
    }
}
