package lesson4.exercise.fan;

public class FanManagement {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "Yellow");
        Fan fan2 = new Fan(2, false, 5, "Blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
