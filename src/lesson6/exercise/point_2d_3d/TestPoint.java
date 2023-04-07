package lesson6.exercise.point_2d_3d;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10, 20);
        Point3D point3D = new Point3D(20, 10, 15);

        System.out.println(point2D.toString());
        System.out.println(point3D.toString());

        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));

    }
}
