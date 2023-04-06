package lesson5.practise.students;

public class StudentsManagement {
    public static void main(String[] args) {
        Students.change();
        Students st1 = new Students(111, "A");
        Students st2 = new Students(222, "B");
        Students st3 = new Students(333, "C");

        st1.display();
        st2.display();
        st3.display();
    }
}
