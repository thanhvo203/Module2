package lesson9.exercise.extra_exercise.respository;

import lesson9.exercise.extra_exercise.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    private static ArrayList<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"Micheal","12/2/2000",true,"C0223G1",9.8));
        studentList.add(new Student(2,"John","15/3/2001",true,"C0223G1",10));
        studentList.add(new Student(3,"Hana","11/4/2002",false,"C0223G1",6));
    }

    @Override
    public List<Student> getStudentList() {
         return studentList;
    }

    @Override
    public void addNewStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean deleteStudentById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId() == id){
                studentList.remove(id);
                return  true;
            }
        }
        return false;
    }
}
