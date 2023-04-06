package lesson5.exercise.class_students;

public class TestStudents {
    public static void main(String[] args) {
        Students students = new Students();
        Students students2 = new Students();
        Students students3 = new Students();


        students3.setClasses("CO423G1");
        System.out.println(students3.getClasses());
        students3.setName("Michael1");
        System.out.println(students3.getName());


    }
}
