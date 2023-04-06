package lesson_4.exercise_1.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSLOW(){
        return SLOW;
    }
    public  int getMEDIUM(){
        return MEDIUM;
    }
    public int getFAST(){
        return FAST;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public boolean getOn(){
        return this.on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        if(getOn() == true){
            return "Fan is on " + " Speed: "+this.speed+ " Radius: "+this.radius +" Color:" + this.color;
        }else{
            return "Fan is off" +" Color: "+ this.color+ " Radius: "+this.radius +" Speed:" + this.speed;
        }
    }
}
