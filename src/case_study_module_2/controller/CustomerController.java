package case_study_module_2.controller;

import case_study_module_2.service.implement_service.CustomerService;


import java.util.Scanner;

public class CustomerController {
    Scanner sc = new Scanner(System.in);
    CustomerService customerService = new CustomerService();


    public void displayCustomerList() {
        System.out.println("Select employee customer: \n" +
                "1. Display list customer \n" +
                "2. Add new customer \n" +
                "3. Edit customer \n" +
                "4. Return main menu");
        int choiceCustomer;
        do {
            System.out.println("Please choose selection of customer: ");
            choiceCustomer = sc.nextInt();
            switch (choiceCustomer) {
                case 1:
                    customerService.displayList();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong choose , please choose again.");
                    displayCustomerList();
            }
        } while (choiceCustomer > 4 || choiceCustomer < 1);
    }
}