package lesson7.exercise.interface_risizeable;

import java.util.Arrays;
import java.lang.Math;


public class Test {
    public static void main(String[] args) {
        IResizeable[] resizeable = new IResizeable[3];
        System.out.println("Before increase size:");
        for (IResizeable resizeable1 : resizeable) {
            System.out.println(Arrays.toString(new IResizeable[]{resizeable1}));
        }
        resizeable[0] = new Circle(4);
        resizeable[1] = new Rectangle(9,2);
        resizeable[2] = new Square(3);
        System.out.println("After increase size:");
        for (IResizeable resizeable1 : resizeable) {
            if (resizeable1 instanceof Circle) {
                ((Circle) resizeable1).resize(Math.floor(Math.random() * 100));
            } else if (resizeable1 instanceof Rectangle) {
                ((Rectangle) resizeable1).resize(Math.floor(Math.random() * 100));
            } else if (resizeable1 instanceof Square) {
                ((Square) resizeable1).resize(Math.floor(Math.random() * 100));
            }
        }
    }
}

