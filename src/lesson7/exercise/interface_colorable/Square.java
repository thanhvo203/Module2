package lesson7.exercise.interface_colorable;

public class Square extends Shape implements IColorable {
    private double edge;
    public Square( double edge) {
        this.edge = edge;
    }

    public Square() {

    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return this.edge * this.edge;
    }
    public void howToColor(){
        System.out.println("Color all four side");
    }
}
