package lesson6.exercise.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    public void setHeight(double height){
        this.height =height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return Math.PI * Math.pow(getRadius(),2) * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder : " +
                "height= " + height + "Color : " + getColor() + "Radius : " + getRadius();
    }
}
