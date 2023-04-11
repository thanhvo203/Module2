package lesson6.exercise.triangle;

public class Triangle extends Shape{
    public double height;
    public String color;

    public Triangle(){

    }
    public Triangle(double height, String color) {
        this.height = height;
        this.color = color;
    }

    public Triangle(double size1, double size2, double size3, double height, String color) {
        super(size1, size2, size3);
        this.height = height;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return (super.getSize1() * height)/2;
    }
    public double getPerimeter(){
        return (super.getSize1() + super.getSize2() +  super.getSize3());
    }

    @Override
    public String toString() {
        return "Triangle{" + "Color: " + color + ", Area: " + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
