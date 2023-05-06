package case_study_module_2.controller;


import case_study_module_2.service.implement_service.ContactService;

import java.util.Scanner;

public class ContactController {
    Scanner sc = new Scanner(System.in);
    ContactService contactService = new ContactService();
    boolean flag = true;

    public void displayPromotion() {
        do {
            System.out.println("Select employee promotion: \n" +
                    "1. Display list customers use service \n" +
                    "2. Display list customers get voucher \n" +
                    "3. Return main menu");
            System.out.println("Please choose selection of promotion: ");
            String choicePromotion = sc.nextLine();
            switch (choicePromotion) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.err.println("Wrong choose, please choose again: ");
                    displayPromotion();
            }
        } while (flag);
    }
}
