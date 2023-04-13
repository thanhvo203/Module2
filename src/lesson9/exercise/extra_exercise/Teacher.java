package lesson9.exercise.extra_exercise;

import java.util.Date;

public class Teacher extends Person {
    private String specialize;

    public Teacher(int id, String name, int date, String gender, String specialize) {
        super(id, name, date, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "specialize='" + specialize + '\'' +
                '}';
    }
}
