package lesson7.exercise.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(20);
        shape[1] = new Rectangle(15,2);
        shape[2] = new Square(10);
        for (Shape shape1: shape) {
            if (shape1 instanceof IColorable) {
                ((Square) shape1).howToColor();
            }else{
                System.out.println(shape1.toString());
            }
        }
    }
}
