package lesson9.exercise.extra_exercise.controller;

import lesson9.exercise.extra_exercise.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private TeacherService teacherService = new TeacherService();
    public void displayTeacherList(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----Teacher Management:" +
                    "1. Add new Teacher." +
                    "2. Delete teacher." +
                    "3. Display teacher." +
                    "0. Out list");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    teacherService.addNewTeacher();
                case "2":
                    teacherService.deleteTeacher();
                case "3":
                    teacherService.displayTeacherList();
                case "0":
                    flag = false;
                    System.out.println("Out list");
                default:
                    System.out.println("You choose wasn't right");
            }
        }while (flag);
    }
}
