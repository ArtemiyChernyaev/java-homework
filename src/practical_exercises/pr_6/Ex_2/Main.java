package pr_6.Ex_2;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(-6, 6, 8, -1, 10, 5);
        System.out.println(rectangle);
        System.out.println(rectangle + "\nMoveUp");
        rectangle.moveUp();
        System.out.println(rectangle + "\nMoveLeft");
        rectangle.moveLeft();
        System.out.println(rectangle+ "\nMoveRight");
        rectangle.moveRight();
        System.out.println(rectangle + "\nMoveDown");
        rectangle.moveDown();
        System.out.println(rectangle);
    }
}
