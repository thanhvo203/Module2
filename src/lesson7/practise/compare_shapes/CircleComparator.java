package lesson7.practise.compare_shapes;

import lesson6.practise.shapes.Circle;

public class CircleComparator implements Comparable<Circle> {
    public int compareTo(Circle c1, Circle c2) {
        if(c1.getRadius() > c2.getRadius()){
            return 1;
        }else if(c1.getRadius() < c2.getRadius()){
            return -1;
        }else{
            return 0;
        }
    }
    @Override
    public int compareTo(Circle o){
        return 0;
    }
}
