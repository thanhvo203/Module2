package lesson9.exercise.extra_exercise.controller;

import lesson9.exercise.extra_exercise.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();
    public void displayStudentMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("---Student Management" + "\n"+
                    "1. Add New Student" +"\n"+
                    "2. Delete Student By Id" +"\n"+
                    "3. Display student list" +"\n"+
                    "0. Out list");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    studentService.addNewStudent();
                    break;
                case "2":
                    studentService.deleteStudent();
                    break;
                case "3":
                    studentService.displayStudent();
                    break;
                case "0":
                    flag = false;
                    System.out.println("Out list");
                    break;
                default:
                    System.out.println("You choose wasn't right");
            }
        }while (flag);
    }
}
