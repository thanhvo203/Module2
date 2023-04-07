package lesson5.exercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);

        System.out.println("Area of circle: ");
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());

        System.out.println("Radius of circle: ");
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());

    }
}
