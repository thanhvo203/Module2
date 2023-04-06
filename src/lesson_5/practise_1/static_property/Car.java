package lesson_5.practise_1.static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine){
        this.engine = engine;
        this.name = name;
        numberOfCars++;

    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getEngine(){
        return this.engine;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}

