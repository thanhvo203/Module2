package case_study_module_2.controller;


import case_study_module_2.service.implement_service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    Scanner sc = new Scanner(System.in);
    EmployeeService employeeService = new EmployeeService();
    public void displayEmployeeList() {
        boolean flag = true;
        do {
            System.out.println("Select employee management: \n" +
                    "1. Display list employees \n" +
                    "2. Add new employee \n" +
                    "3. Edit employee \n" +
                    "4. Return main menu");
            System.out.println("Enter number to choose option: ");
            String choiceEmployee = sc.nextLine();
            switch (choiceEmployee) {
                case "1":
                    employeeService.displayList();
                    break;
                case "2":
                    employeeService.addNew();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.err.println("Wrong input , please choose again:");
                    displayEmployeeList();
            }
        } while (flag);
    }

}
