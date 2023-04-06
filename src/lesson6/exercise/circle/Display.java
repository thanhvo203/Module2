package lesson6.exercise.circle;

public class Display {
    public static void main(String[] args) {
        Circle circle =  new Circle(5 ,"Blue");

        Cylinder cylinder = new Cylinder(5 , 10 , "Green");

        System.out.println("Area of circle: "+circle.getArea());
        System.out.println("Volume of cylinder: "+cylinder.getVolume());
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
        System.out.println(cylinder.toString());
        System.out.println(cylinder.toString());
        System.out.println(cylinder.toString());
    }
}
