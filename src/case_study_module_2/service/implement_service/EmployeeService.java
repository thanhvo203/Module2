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
        for (Employee employee : employeeList) {
            System.out.println(employee.writeToFile());
        }
    }

    @Override
    public void addNew() {
        String employeeID;
        do {
            System.out.println("Enter id: ");
            employeeID = sc.nextLine();
        } while (!ValidateEmployee.checkID(employeeID));
       String employeeName;
       do {
           System.out.println("Enter Full Name: ");
            employeeName = sc.nextLine();
       }while (!ValidateEmployee.checkName(employeeName));
       String employeeDate;
       do {
           System.out.println("Enter day of birth: ");
           employeeDate = sc.nextLine();
       }while (!ValidateEmployee.checkAge(employeeDate));
        System.out.println("Enter gender: ");
        String employeeGender = sc.nextLine();
        String employeeIdentityNumber;
        do {
            System.out.println("Enter identityNumber: ");
            employeeIdentityNumber = sc.nextLine();
        }while (!ValidateEmployee.checkIdentityNumber(employeeIdentityNumber));
        String employeePhoneNumber;
        do {
             System.out.println("Enter PhoneNumber");
             employeePhoneNumber = sc.nextLine();
        }while (!ValidateEmployee.checkPhoneNumber(employeePhoneNumber));
        System.out.println("Enter email: ");
        String employeeEmail = sc.nextLine();
        System.out.println("Enter degree");
        String employeeDegree = sc.nextLine();
        System.out.println("Enter position: ");
        String employeePosition = sc.nextLine();
        double employeeSalary;
        do {
            System.out.println("Enter salary: ");
            employeeSalary = sc.nextDouble();
        }while (employeeSalary <= 0);
        Employee newEmployee = new Employee(employeeID, employeeName, employeeDate, employeeGender, employeeIdentityNumber, employeePhoneNumber, employeeEmail, employeeDegree, employeePosition, employeeSalary);
        employeeRepository.addNew(newEmployee);
        System.out.println("Add success!!!");
    }

    @Override
    public void edit() {
        System.out.println("Enter id you wanna edit : ");
        String id = sc.nextLine();
        int check = employeeRepository.checkId(id);
        List<Employee> employeeList = employeeRepository.showList();
        if (check >= 0) {
            String employeeID;
            do {
                System.out.println("Enter id: ");
                employeeID = sc.nextLine();
            } while (!ValidateEmployee.checkID(employeeID));
            employeeList.get(check).setId(employeeID);
            String employeeName;
            do {
                System.out.println("Enter Full Name: ");
                employeeName = sc.nextLine();
            }while (!ValidateEmployee.checkName(employeeName));
            employeeList.get(check).setFullName(employeeName);
            String employeeDate;
            do {
                System.out.println("Enter day of birth: ");
                employeeDate = sc.nextLine();
            }while (!ValidateEmployee.checkAge(employeeDate));
            employeeList.get(check).setDateOfBirth(employeeDate);
            System.out.println("Enter gender: ");
            String employeeGender = sc.nextLine();
            employeeList.get(check).setGender(employeeGender);
            String employeeIdentityNumber;
            do {
                System.out.println("Enter identityNumber: ");
                employeeIdentityNumber = sc.nextLine();
            }while (!ValidateEmployee.checkIdentityNumber(employeeIdentityNumber));
            employeeList.get(check).setIdentityNumber(employeeIdentityNumber);
            String employeePhoneNumber;
            do {
                System.out.println("Enter PhoneNumber");
                employeePhoneNumber = sc.nextLine();
            }while (!ValidateEmployee.checkIdentityNumber(employeePhoneNumber));
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
            double employeeSalary;
            do {
                System.out.println("Enter salary: ");
                employeeSalary = sc.nextDouble();
            }while (employeeSalary <= 0);
            employeeList.get(check).setSalary(employeeSalary);
            employeeRepository.edit();
        } else {
            System.out.println("Not found id!!!");
        }
    }
}

