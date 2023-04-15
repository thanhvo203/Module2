package lesson9.exercise.extra_exercise.service;

import lesson9.exercise.extra_exercise.model.Teacher;
import lesson9.exercise.extra_exercise.respository.TeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService{
    Scanner sc = new Scanner(System.in);
    private TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void displayTeacherList() {
        List<Teacher> teacherList = teacherRepository.getTeacherList();
        for(Teacher teacher : teacherList){
            System.out.println(teacher);
        }
    }
    @Override
    public void addNewTeacher() {
        System.out.println("Enter id of teacher: ");
        int idTeacher = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of teacher:");
        String teacherName = sc.nextLine();
        System.out.println("Enter day of birth:");
        String dayOfBirthTeacher = sc.nextLine();
        System.out.println("Enter gender 1.Male 2.Female");
        boolean gender = false;
        String chooseGender = sc.nextLine();
        if(chooseGender == "1"){
            gender = true;
        }else{
            gender = false;
        }
        System.out.println("Enter specialize: ");
        String specializeTeacher = sc.nextLine();
        Teacher newTeacher = new Teacher(idTeacher,teacherName,dayOfBirthTeacher,gender,specializeTeacher);
        teacherRepository.addNewTeacher(newTeacher);
        System.out.println("Add success: " + newTeacher.getName());

    }

    @Override
    public void deleteTeacher() {
        this.displayTeacherList();
        System.out.println("Enter id teacher you wanna delete:");
        int idDeleteTeacher = sc.nextInt();
        boolean isDelete = teacherRepository.deleteTeacherById(idDeleteTeacher);
        if(isDelete){
            System.out.println("Found id teacher you wanna delete.");
        }else{
            System.out.println("Not found id");
        }
    }
}
