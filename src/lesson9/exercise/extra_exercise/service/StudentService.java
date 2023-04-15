package lesson9.exercise.extra_exercise.service;

import lesson9.exercise.extra_exercise.model.Student;
import lesson9.exercise.extra_exercise.respository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService{
    Scanner sc = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public void displayStudent() {
       List<Student> studentList = studentRepository.getStudentList();
       for(Student s : studentList){
           System.out.println(s);
       }
    }

    @Override
    public void addNewStudent() {
        System.out.println("Enter id of student: ");
        int studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of student:");
        String nameStudent = sc.nextLine();
        System.out.println("Enter day of birth of student:");
        String dayOfBirthStudent = sc.nextLine();
        System.out.println("Enter the gender 1.Male 2.Female.");
        boolean gender = false;
        String chooseGender= sc.nextLine();
        if(chooseGender == "1"){
            gender = true;
        }else{
            gender = false;
        }
        System.out.println("Enter class of student:");
        String classOfStudent = sc.nextLine();
        System.out.println("Enter score:");
        double scoreOfStudent = sc.nextDouble();
        Student newStudent = new Student(studentId,nameStudent,dayOfBirthStudent,gender,classOfStudent,scoreOfStudent);
        studentRepository.addNewStudent(newStudent);
        System.out.println("Add success : " + newStudent.getName());
    }
    @Override
    public void deleteStudent() {
        this.displayStudent();
        System.out.println("Enter id you need to delete student.");
        int deleteStudentID = sc.nextInt();
        boolean isDelete = studentRepository.deleteStudentById(deleteStudentID);
        if(isDelete){
            System.out.println("Found id of student.");
        }else{
            System.out.println("Not found id");
        }
    }
}
