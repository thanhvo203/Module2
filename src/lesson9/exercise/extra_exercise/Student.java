package lesson9.exercise.extra_exercise;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person{
    private int classOfStudent;
    private double score;

    public Student(int id, String name, int date, String gender, int classOfStudent, double score) {
        super(id, name, date, gender);
        this.classOfStudent = classOfStudent;
        this.score = score;
    }

    public int getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(int classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void add(Scanner sc){
        System.out.println("NHập");

    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                ", classOfStudent=" + classOfStudent +
                ", score=" + score +
                '}';
    }
}
