package case_study_module_2.controller;

import case_study_module_2.service.implement_service.BookingService;
import case_study_module_2.service.implement_service.ContactService;


import java.util.Scanner;

public class BookingController {
    Scanner sc = new Scanner(System.in);
    BookingService bookingService = new BookingService();
    ContactService contactService = new ContactService();
    boolean flag = true;

    public void displayBookingList() {
        do {
            System.out.println("Select employee booking: \n" +
                    "1. Add new booking \n" +
                    "2. Display list booking \n" +
                    "3. Creat new contracts \n" +
                    "4. Display list contracts" +
                    "5. Edit contracts \n" +
                    "6. Return main menu");
            System.out.println("Please choose selection of booking: ");
            String choiceBooking = sc.nextLine();
            switch (choiceBooking) {
                case "1":
                    bookingService.addNewBooking();
                    break;
                case "2":
                    bookingService.displayBookingList();
                    break;
                case "3":
                    contactService.addNew();
                    break;
                case "4":
                    contactService.displayList();
                    break;
                case "5":
                    contactService.edit();
                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    System.err.println("Wrong choose, please choose again: ");
                    displayBookingList();
            }
        } while (flag);
    }
}
