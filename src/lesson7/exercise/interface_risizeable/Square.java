package lesson7.exercise.interface_risizeable;

public class Square implements IResizeable {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
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

    @Override
    public void resize(double resize) {
        this.edge = this.edge * (resize/100);
        System.out.println(getArea());
    }
}
