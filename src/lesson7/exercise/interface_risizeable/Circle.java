package lesson7.exercise.interface_risizeable;

public class Circle implements IResizeable {
    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public void resize(double resize) {
       this.radius = this.radius * (1-resize/100);
        System.out.println(getArea());
    }
}
