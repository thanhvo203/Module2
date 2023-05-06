package case_study_module_2.controller;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);
    private EmployeeController employeeController = new EmployeeController();
    private CustomerController customerController = new CustomerController();
    private BookingController bookingController = new BookingController();
    private FacilityController facilityController = new FacilityController();
    private ContactController contactController = new ContactController();

    public void displayMenu() {
        boolean flag = true;
        do {
            System.out.println("----Select functions---- \n" +
                    "1.Employee Management \n" +
                    "2.Customer Management \n" +
                    "3.Facility Management \n" +
                    "4.Booking Management \n" +
                    "5.Promotion Management \n" +
                    "6.Exit");
            System.out.println("Please choose option: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    employeeController.displayEmployeeList();
                    break;
                case "2":
                    customerController.displayCustomerList();
                    break;
                case "3":
                    facilityController.displayFacilityList();
                    break;
                case "4":
                    bookingController.displayBookingList();
                    break;
                case "5":
                    contactController.displayPromotion();
                    break;
                case "6":
                    System.out.println("Out list!!!!!!");
                    flag = false;
                    break;
                default:
                    System.err.println("Please input number from 1 to 6!!!");
                    displayMenu();
            }
        } while (flag);
    }
}