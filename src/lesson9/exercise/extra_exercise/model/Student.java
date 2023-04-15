package lesson9.exercise.extra_exercise.model;

import java.util.Scanner;

public class Student extends Person {
    private String classOfStudent;
    private double score;

    public Student(int id, String name, String date, boolean gender, String classOfStudent, double score) {
        super(id, name, date, gender);
        this.classOfStudent = classOfStudent;
        this.score = score;
    }

    public String getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                ", classOfStudent=" + classOfStudent +
                ", score=" + score +
                '}';
    }
}
