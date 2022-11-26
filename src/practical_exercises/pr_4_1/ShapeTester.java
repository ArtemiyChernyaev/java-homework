public class ShapeTester {
    public static void main(String[] args){
        Shape sh = new Shape("square", 10, 10);
        System.out.println(sh);

        Circle cir = new Circle(10);
        System.out.println(cir);

        Square squ = new Square(1);
        System.out.println(squ);

        Rectangle rec = new Rectangle(1, 2);
        System.out.println(rec);
    }
}

class Shape{
    String type;
    double perimeter;
    double area;
    public Shape(String type, double perimeter, double area){
        this.type = type;
        this.perimeter = perimeter;
        this.area = area;
    }

    String getType(){
        return type;
    }
    double getArea(){
        return area;
    }
    double getPerimeter(){
        return perimeter;
    }

    public String toString(){
        return type + ": "+"perimeter = "+perimeter+" area = " + area;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        super("circle", Math.PI*radius*2, Math.PI*Math.pow(radius, 2));
        this.radius = radius;
    }
    String getType(){
        return "circle";
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
    double getPerimeter(){
        return Math.PI*radius*2;
    }

    public String toString(){
        return "circle: " + "radius = " + radius + "; perimeter = " + perimeter + "; area = " + area;
    }

}

class Square extends Shape{
    private double a;
    public Square(double a){
        super("square", 2*(a+a), a*a);
        this.a = a;
    }
    String getType(){
        return "square";
    }
    double getArea(){
        return a*a;
    }
    double getPerimeter(){
        return 2*(a+a);
    }

    public String toString(){
        return "square: "+ "a = " + a + "; perimeter = " + perimeter + "; area = " + area;
    }
}

class Rectangle extends Shape{
    private double a;
    private double b;
    public Rectangle(double a, double b){
        super("rectangle", 2*(a+b), a*b);
        this.a = a;
        this.b = b;
    }
    String getType(){
        return "rectangle";
    }
    double getArea(){
        return a*b;
    }
    double getPerimeter(){
        return 2*(a+b);
    }

    public String toString(){
        return "rectangle: "+ "a = "+ a + ", b = "+ b + "; perimeter = " + perimeter + "; area = " + area;
    }
}
