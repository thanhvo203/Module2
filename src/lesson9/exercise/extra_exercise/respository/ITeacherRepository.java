package lesson9.exercise.extra_exercise.respository;

import lesson9.exercise.extra_exercise.model.Teacher;


import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getTeacherList();
    public void addNewTeacher(Teacher teacher);
    public boolean deleteTeacherById(int id);

}
