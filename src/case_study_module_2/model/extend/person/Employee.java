package case_study_module_2.model.extend.person;

import case_study_module_2.model.absract.person.AbstractPerson;


public class Employee extends AbstractPerson {
    private String degree;
    private String positionEmployee;
    private double salary;

    public Employee(String id, String fullName, String dateOfBirth, String gender, String identityNumber, String phoneNumber, String email) {
        super(id, fullName, dateOfBirth, gender, identityNumber, phoneNumber, email);
    }

    public Employee(String id, String fullName, String dateOfBirth, String gender, String identityNumber, String phoneNumber, String email, String degree, String positionEmployee, double salary) {
        super(id, fullName, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.degree = degree;
        this.positionEmployee = positionEmployee;
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String writeToFile(){
        return saveFile()+ degree + "," + positionEmployee + ", " + salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "degree='" + degree + '\'' +
                ", positionEmployee='" + positionEmployee + '\'' +
                ", salary=" + salary +
                '}';
    }
}
