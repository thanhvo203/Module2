package lesson9.exercise.extra_exercise.respository;

import lesson9.exercise.extra_exercise.model.Teacher;


import java.util.ArrayList;

import java.util.List;

public class TeacherRepository implements ITeacherRepository{
    private static ArrayList<Teacher> teacherList = new ArrayList<>();
    static {
        teacherList.add(new Teacher(1,"Tom","12/2/1990",true,"Chemistry"));
        teacherList.add(new Teacher(2,"Chris","20/5/1980",true,"Math"));
        teacherList.add(new Teacher(3,"Anna","17/3/1995",false,"History"));
    }
    @Override
    public List<Teacher> getTeacherList() {
        return teacherList;
    }
    @Override
    public void addNewTeacher(Teacher teacher) {
         teacherList.add(teacher);
    }

    @Override
    public boolean deleteTeacherById(int id) {
        for (int i = 0; i < teacherList.size(); i++) {
            if(teacherList.get(i).getId() == id){
                teacherList.remove(id);
                return true;
            }
        }
        return false;
    }
}
