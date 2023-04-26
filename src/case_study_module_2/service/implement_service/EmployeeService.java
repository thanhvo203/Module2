package case_study_module_2.service.implement_service;

import case_study_module_2.model.extend.person.Employee;
import case_study_module_2.repository.implement_repository.EmployeeRepository;
import case_study_module_2.service.extends_service_common.IEmployeeService;
import case_study_module_2.utils.validate.ValidateEmployee;


import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayList() {
        List<Employee> employeeList = employeeRepository.showList();
        for (Employee employee: employeeList) {
            System.out.println(employee.writeToFile());
        }
    }

    @Override
    public void addNew() {
        String employeeID;
        do{
            System.out.println("Nhập id");
            employeeID = sc.nextLine();
        }while (!ValidateEmployee.checkID(employeeID));
        System.out.println("Enter Full Name: ");
        String employeeName = sc.nextLine();
        System.out.println("Enter day of birth: ");
        String employeeDate = sc.nextLine();
        System.out.println("Enter gender: ");
        String employeeGender = sc.nextLine();
        System.out.println("Enter identityNumber: ");
        String employeeIdentityNumber = sc.nextLine();
        System.out.println("Enter PhoneNumber");
        String employeePhoneNumber = sc.nextLine();
        System.out.println("Enter email: ");
        String employeeEmail = sc.nextLine();
        System.out.println("Enter degree");
        String employeeDegree = sc.nextLine();
        System.out.println("Enter position: ");
        String employeePosition = sc.nextLine();
        System.out.println("Enter salary: ");
        double employeeSalary = sc.nextDouble();
        Employee newEmployee = new Employee(employeeID,employeeName,employeeDate,employeeGender,employeeIdentityNumber,employeePhoneNumber,employeeEmail,employeeDegree,employeePosition,employeeSalary);
        employeeRepository.addNew(newEmployee);
        System.out.println("Add success!!!");
    }

    @Override
    public void edit() {
        System.out.println("Enter id you wanna edit : ");
        String id = sc.nextLine();
        int check = employeeRepository.checkId(id);
        List<Employee> employeeList = employeeRepository.showList();
        if(check >= 0){
                   System.out.println("Enter ID: ");
                   String employeeID = sc.nextLine();
                   employeeList.get(check).setId(employeeID);
                   System.out.println("Enter Full Name: ");
                   String employeeName = sc.nextLine();
                   employeeList.get(check).setFullName(employeeName);
                   System.out.println("Enter day of birth: ");
                   String employeeDate = sc.nextLine();
                   employeeList.get(check).setDateOfBirth(employeeDate);
                   System.out.println("Enter gender: ");
                   String employeeGender = sc.nextLine();
                   employeeList.get(check).setGender(employeeGender);
                   System.out.println("Enter identityNumber: ");
                   String employeeIdentityNumber = sc.nextLine();
                   employeeList.get(check).setIdentityNumber(employeeIdentityNumber);
                   System.out.println("Enter PhoneNumber");
                   String employeePhoneNumber = sc.nextLine();
                   employeeList.get(check).setPhoneNumber(employeePhoneNumber);
                   System.out.println("Enter email: ");
                   String employeeEmail = sc.nextLine();
                   employeeList.get(check).setEmail(employeeEmail);
                   System.out.println("Enter degree");
                   String employeeDegree = sc.nextLine();
                   employeeList.get(check).setDegree(employeeDegree);
                   System.out.println("Enter position: ");
                   String employeePosition = sc.nextLine();
                   employeeList.get(check).setPositionEmployee(employeePosition);
                   System.out.println("Enter salary: ");
                   double employeeSalary = sc.nextDouble();
                   employeeList.get(check).setSalary(employeeSalary);
                   employeeRepository.edit();
            }else{
            System.out.println("Not found id!!!");
        }
        }
    }

