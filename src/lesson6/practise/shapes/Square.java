package lesson6.practise.shapes;

public class Square extends Rectangle{
    private double side = 1.0;
    public Square() {
    }

    public Square(double side) {
         this.side = side;
    }

    public Square(double side, String color, boolean filled , double width, double length) {
        super(width, length, color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}
