package lesson_5.practise_1.students;

public class Students {
    private int rollono;
    private String name;
    private static String college = "BBDITT";

    public Students(int r, String n){
        rollono = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollono + " "+ name + " " + college);
    }

}
