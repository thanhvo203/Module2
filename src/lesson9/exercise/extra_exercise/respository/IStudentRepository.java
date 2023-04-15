package lesson9.exercise.extra_exercise.respository;

import lesson9.exercise.extra_exercise.model.Student;


import java.util.List;

public interface IStudentRepository {
   List<Student> getStudentList();
   public void addNewStudent(Student student);
   public boolean deleteStudentById(int id);

}
