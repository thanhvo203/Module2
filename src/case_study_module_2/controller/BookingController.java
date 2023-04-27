package case_study_module_2.controller;

import case_study_module_2.service.implement_service.BookingService;


import java.util.Scanner;

public class BookingController {
    Scanner sc = new Scanner(System.in);
    BookingService bookingService = new BookingService();

    public void displayBookingList() {
        System.out.println("Select employee booking: \n" +
                "1. Add new booking \n" +
                "2. Display list booking \n" +
                "3. Creat new contracts \n" +
                "4. Display list contracts" +
                "5. Edit contracts \n" +
                "6. Return main menu");
        int choiceBooking;
        do {
            System.out.println("Please choose selection of booking: ");
            choiceBooking = sc.nextInt();
            switch (choiceBooking) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:

                    break;
                default:
                    System.err.println("Wrong choose, please choose again: ");
                    displayBookingList();
            }
        } while (choiceBooking > 6 || choiceBooking < 1);
    }
}
