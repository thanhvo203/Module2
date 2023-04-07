package lesson6.exercise.point_2d_3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.z,super.getX(),super.getY()};
    }

    @Override
    public String toString() {
        return "Point3D{" + "x= "+ this.getX() + ", y= "+this.getY()+
                ", z=" + z +
                '}';
    }
}
