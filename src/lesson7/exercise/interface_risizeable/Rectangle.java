package lesson7.exercise.interface_risizeable;

public class Rectangle implements IResizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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
        return this.height * this.width;
    }


    @Override
    public void resize(double resize) {
        this.height = this.height * (resize / 100);
        this.width = this.width * (resize / 100);
        System.out.println(getArea());
    }
}