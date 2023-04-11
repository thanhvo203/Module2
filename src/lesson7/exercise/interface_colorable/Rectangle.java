package lesson7.exercise.interface_colorable;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double height , double width){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +"Area of Rectangle: "+ getArea()+
                '}';
    }
}
