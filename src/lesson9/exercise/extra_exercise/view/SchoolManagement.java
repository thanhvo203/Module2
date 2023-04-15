package lesson9.exercise.extra_exercise.view;

import lesson9.exercise.extra_exercise.controller.StudentController;
import lesson9.exercise.extra_exercise.controller.TeacherController;

import java.util.Scanner;

public class SchoolManagement {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Choose menu you wanna management:" +"\n"+
                "1. Student"+ "\n"+
                 "2. Teacher"+ "\n");
        int choose = sc.nextInt();
        if(choose == 1){
            StudentController studentController = new StudentController();
            studentController.displayStudentMenu();
        }else if(choose == 2){
            TeacherController teacherController= new TeacherController();
            teacherController.displayTeacherList();
        }
    }
}
