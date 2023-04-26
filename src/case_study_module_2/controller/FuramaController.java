package case_study_module_2.controller;

import controller.BookingController;

import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    private EmployeeController employeeController = new EmployeeController();
    private CustomerController customerController = new CustomerController();
    private BookingController bookingController = new BookingController();
    private FacilityController facilityController = new FacilityController();
    private ContactController contactController = new ContactController();

    public void displayMenu() {
        do {
            System.out.println("----Select functions---- \n" +
                    "1.Employee Management \n" +
                    "2.Customer Management \n" +
                    "3.Facility Management \n" +
                    "4.Booking Management \n" +
                    "5.Promotion Management \n" +
                    "6.Exit");
            int choice;
            try {
                System.out.println("Please choose option: ");
                choice = sc.nextInt();
            } catch (NumberFormatException e) {
                do {
                    System.out.println("You choose wrong, please choose again");
                    choice = sc.nextInt();
                } while (choice > 6 || choice < 1);
            }
            switch (choice) {
                case 1:
                    employeeController.displayEmployeeList();
                    break;
                case 2:
                    customerController.displayCustomerList();
                    break;
                case 3:
                    facilityController.displayFacilityList();
                    break;
                case 4:
                    bookingController.displayBookingList();
                    break;
                case 5:
                    contactController.displayPromotion();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
