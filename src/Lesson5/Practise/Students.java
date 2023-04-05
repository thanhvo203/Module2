package lesson5.practise;

public class Students {
    private int rollono;
    private String name;
    private static String college = "BBDITT";

    Students(int r, String n){
        rollono = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollono + " "+ name + " " + college);
    }

    public static void main(String[] args) {
        Students.change();
        Students st1 = new Students(111,"A");
        Students st2 = new Students(222,"B");
        Students st3 = new Students(333,"C");

        st1.display();
        st2.display();
        st3.display();
    }


}
