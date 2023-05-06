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
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        String employeeID;
        do {
            System.out.println("Enter id(NV-YYYY) with Y is number: ");
            employeeID = sc.nextLine();
            if(!ValidateEmployee.checkID(employeeID)){
                System.err.println("WRONG INPUT!!!");
            }
        } while (!ValidateEmployee.checkID(employeeID));
        String employeeName;
        do {
            System.out.println("Enter Full Name(With Capitalization first word): ");
            employeeName = sc.nextLine();
            if(!ValidateEmployee.checkName(employeeName)){
                System.err.println("WRONG INPUT");
            }
        } while (!ValidateEmployee.checkName(employeeName));
        String employeeDate;
        do {
            System.out.println("Enter day of birth(with age above 18): ");
            employeeDate = sc.nextLine();
            if(!ValidateEmployee.checkAge(employeeDate)){
                System.err.println("WRONG INPUT");
            }
        } while (!ValidateEmployee.checkAge(employeeDate));
        System.out.print("Enter gender: ");
        String employeeGender = sc.nextLine();
        String employeeIdentityNumber;
        do {
            System.out.println("Enter identityNumber(input 9 number): ");
            employeeIdentityNumber = sc.nextLine();
            if(!ValidateEmployee.checkIdentityNumber(employeeIdentityNumber)){
                System.err.println("WRONG INPUT");
            }
        } while (!ValidateEmployee.checkIdentityNumber(employeeIdentityNumber));
        String employeePhoneNumber;
        do {
            System.out.println("Enter PhoneNumber(Start number 0 and enough 10 number): ");
            employeePhoneNumber = sc.nextLine();
            if(!ValidateEmployee.checkPhoneNumber(employeePhoneNumber)){
                System.err.println("WRONG INPUT");
            }
        } while (!ValidateEmployee.checkPhoneNumber(employeePhoneNumber));
        System.out.print("Enter email: ");
        String employeeEmail = sc.nextLine();
        String employeeDegree = null;
        System.out.println("Select degree: \n" +
                "1.Primary education. \n" +
                "2.Medium education. \n" +
                "3.High education \n" +
                "4.University \n" +
                "5.Master's degree \n" +
                "6.Doctor of philosophy");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                employeeDegree = "Primary education";
                break;
            case "2":
                employeeDegree = "Medium education";
                break;
            case "3":
                employeeDegree = "High education";
                break;
            case "4":
                employeeDegree = "University";
                break;
            case "5":
                employeeDegree = "Master's degree";
                break;
            case "6":
                employeeDegree = "Doctor of philosophy";
                break;
            default:
                System.err.println("Please input number from 1 to 6");
        }
        String employeePosition = null;
        System.out.println("Select position: \n" +
                "1.Intern \n" +
                "2. Employee \n" +
                "3. Manager \n" +
                "4. Supervision \n" +
                "5. Deputy Director \n" +
                "6. Director");
        String choice1 = sc.nextLine();
        switch (choice1){
            case "1":
                employeePosition = "Intern";
                break;
            case "2":
                employeePosition = " Employee";
                break;
            case "3":
                employeePosition = "Manager";
                break;
            case "4":
                employeePosition = "Supervision";
                break;
            case "5":
                employeePosition = "Deputy Director";
                break;
            case "6":
                employeePosition = "Director";
                break;
            default:
                System.err.println("Please input 1 to 6:");
        }
        double employeeSalary;
        do {
            System.out.println("Enter salary( >  0): ");
            employeeSalary = sc.nextDouble();
        } while (employeeSalary < 0);
        Employee newEmployee = new Employee(employeeID, employeeName, employeeDate, employeeGender, employeeIdentityNumber,
                employeePhoneNumber, employeeEmail, employeeDegree, employeePosition, employeeSalary);
        employeeRepository.addNew(newEmployee);
        System.out.println("Add success!!!");
    }

    @Override
    public void edit() {
        System.out.println("Enter id you wanna edit : ");
        String id = sc.nextLine();
        int check = employeeRepository.checkId(id);
        List<Employee> employeeList = employeeRepository.showList();
        boolean flag = true;
        if (check >= 0) {
            do {
                System.out.println("--List Edit Option-- \n" +
                        "1.Name \n" +
                        "2. Day of Birth \n" +
                        "3. Gender \n" +
                        "4. Identity Number \n" +
                        "5. Phone number \n" +
                        "6. Email \n" +
                        "7. Degree \n" +
                        "8. Position \n" +
                        "9. Salary \n" +
                        "0. Out");
                String choice = sc.nextLine();
                switch (choice){
                    case "1":
                        String employeeName;
                        do {
                            System.out.println("Enter Full Name(With Capitalization first word): ");
                            employeeName = sc.nextLine();
                            if(!ValidateEmployee.checkName(employeeName)){
                                System.err.println("WRONG INPUT");
                            }
                        } while (!ValidateEmployee.checkName(employeeName));
                        employeeList.get(check).setFullName(employeeName);
                        break;
                    case "2":
                        String employeeDate;
                        do {
                            System.out.println("Enter day of birth(with age above 18): ");
                            employeeDate = sc.nextLine();
                            if(!ValidateEmployee.checkAge(employeeDate)){
                                System.err.println("WRONG INPUT");
                            }
                        } while (!ValidateEmployee.checkAge(employeeDate));
                        employeeList.get(check).setDateOfBirth(employeeDate);
                        break;
                    case "3":
                        System.out.print("Enter gender: ");
                        String employeeGender = sc.nextLine();
                        employeeList.get(check).setGender(employeeGender);
                        break;
                    case "4":
                        String employeeIdentityNumber;
                        do {
                            System.out.println("Enter identityNumber(Input enough 9 number or 12 number): ");
                            employeeIdentityNumber = sc.nextLine();
                            if(!ValidateEmployee.checkIdentityNumber(employeeIdentityNumber)){
                                System.err.println("WRONG INPUT");
                            }
                        } while (!ValidateEmployee.checkIdentityNumber(employeeIdentityNumber));
                        employeeList.get(check).setIdentityNumber(employeeIdentityNumber);
                        break;
                    case "5":
                        String employeePhoneNumber;
                        do {
                            System.out.println("Enter PhoneNumber");
                            employeePhoneNumber = sc.nextLine();
                            if(!ValidateEmployee.checkPhoneNumber(employeePhoneNumber)){
                                System.err.println("WRONG INPUT");
                            }
                        } while (!ValidateEmployee.checkIdentityNumber(employeePhoneNumber));
                        employeeList.get(check).setPhoneNumber(employeePhoneNumber);
                        break;
                    case "6":
                        System.out.print("Enter email: ");
                        String employeeEmail = sc.nextLine();
                        employeeList.get(check).setEmail(employeeEmail);
                        break;
                    case "7":
                        String employeeDegree = null;
                        System.out.println("Select degree: \n" +
                                "1.Primary education. \n" +
                                "2.Medium education. \n" +
                                "3.High education \n" +
                                "4.University \n" +
                                "5.Master's degree \n" +
                                "6.Doctor of philosophy");
                        String choice1 = sc.nextLine();
                        switch (choice1) {
                            case "1":
                                employeeDegree = "Primary education";
                                break;
                            case "2":
                                employeeDegree = "Medium education";
                                break;
                            case "3":
                                employeeDegree = "High education";
                                break;
                            case "4":
                                employeeDegree = "University";
                                break;
                            case "5":
                                employeeDegree = "Master's degree";
                                break;
                            case "6":
                                employeeDegree = "Doctor of philosophy";
                                break;
                            default:
                                System.err.println("Please input number from 1 to 6");
                        }
                        employeeList.get(check).setDegree(employeeDegree);
                        break;
                    case "8":
                        String employeePosition = null;
                        System.out.println("Select position: \n" +
                                "1.Intern \n" +
                                "2. Employee \n" +
                                "3. Manager \n" +
                                "4. Supervision \n" +
                                "5. Deputy Director \n" +
                                "6. Director");
                        String choice2 = sc.nextLine();
                        switch (choice2){
                            case "1":
                                employeePosition = "Intern";
                                break;
                            case "2":
                                employeePosition = " Employee";
                                break;
                            case "3":
                                employeePosition = "Manager";
                                break;
                            case "4":
                                employeePosition = "Supervision";
                                break;
                            case "5":
                                employeePosition = "Deputy Director";
                                break;
                            case "6":
                                employeePosition = "Director";
                                break;
                            default:
                                System.err.println("Please input 1 to 6:");
                        }
                        employeeList.get(check).setPositionEmployee(employeePosition);
                        break;
                    case "9":
                        double employeeSalary;
                        do {
                            System.out.println("Enter salary( > 0): ");
                            employeeSalary = sc.nextDouble();
                        } while (employeeSalary <= 0);
                        employeeList.get(check).setSalary(employeeSalary);
                        break;
                    case "0":
                        flag = false;
                        break;
                    default:
                        System.err.println("WRONG INPUT");
                }
            }while (flag);
            employeeRepository.edit();
        } else {
            System.out.println("Not found id!!!");
        }
    }
}

