package lesson6.exercise.point_moveablepoint;

import java.util.Arrays;
import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(10,20);
        MoveablePoint moveablePoint = new MoveablePoint(10,20,30,25);

        System.out.println("Test Point: ");
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point.toString());

        System.out.println("Test MoveablePoint: ");
        System.out.println(Arrays.toString(moveablePoint.getSpeed()));
        System.out.println(moveablePoint.toString());

        System.out.println("Speed: ");
        System.out.println(moveablePoint.move());
    }
}
