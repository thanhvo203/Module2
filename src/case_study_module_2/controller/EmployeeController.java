package case_study_module_2.controller;



import case_study_module_2.service.implement_service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    Scanner sc = new Scanner(System.in);
    EmployeeService employeeService = new EmployeeService();
    public void displayEmployeeList(){
        System.out.println("Select employee management: \n" +
                "1. Display list employees \n" +
                "2. Add new employee \n" +
                "3. Edit employee \n" +
                "4. Return main menu");
        int choiceEmployee;
        do {
            System.out.println("Enter number to choose option: ");
            choiceEmployee = sc.nextInt();
            switch (choiceEmployee) {
                case 1:
                    employeeService.displayList();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    break;
                default:
                    System.err.println("Wrong input , please choose again:");
                    displayEmployeeList();
            }
        } while (choiceEmployee > 4 || choiceEmployee < 1);
    }

}
