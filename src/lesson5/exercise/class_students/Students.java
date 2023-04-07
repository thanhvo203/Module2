package lesson5.exercise.class_students;

public class Students {
    private String name = "John";
    private String classes = "CO2";

    public Students() {

    }

    public Students(String name, String classes) {
        this.name = name;
        this.classes = classes;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return this.classes;
    }

}
