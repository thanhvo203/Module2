package lesson8.practise.separating_method;

public class Cylinder {
    public static double getVolume(int height , int radius){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2*baseArea;
        return volume;

    }
    public static double getPerimeter(double radius){
        return 2*radius *Math.PI;
    }
    public static double getBaseArea(double radius){
        return radius*radius * Math.PI;
    }

}
