package lesson6.practise.shapes;


public class TestShapes {
    public static void main(String[] args) {
        Shapes sp = new Shapes();
        System.out.println(sp);

        sp = new Shapes("Yellow", true);
        System.out.println(sp.toString());
        System.out.println(" ");

        Circle circle = new Circle(10,"Black",false);
        System.out.println(circle);
        System.out.println("Area of circle: "+  circle.getArea());
        System.out.println("Perimeter of circle: "+  circle.getPerimeter());
        System.out.println(" ");

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(10,15);
        Rectangle rectangle2 = new Rectangle(10,15,"Red",true);

        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println("Area of rectangle: "+ rectangle1.getArea());
        System.out.println("Perimeter of rectangle: "+ rectangle1.getPerimeter());
        System.out.println(" ");

        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8, "yellow", true, 2, 3);
        System.out.println(square);

    }
}
