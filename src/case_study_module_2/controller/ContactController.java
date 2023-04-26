package case_study_module_2.controller;



import case_study_module_2.service.implement_service.ContactService;

import java.util.Scanner;

public class ContactController {
    Scanner sc = new Scanner(System.in);
    ContactService contactService = new ContactService();
    public void displayPromotion() {
        System.out.println("Select employee promotion: \n" +
                "1. Display list customers use service \n" +
                "2. Display list customers get voucher \n" +
                "3. Return main menu");
        int choicePromotion;
        do {
            System.out.println("Please choose selection of promotion: ");
            choicePromotion = sc.nextInt();
            switch (choicePromotion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.err.println("Wrong choose, please choose again: ");
                    displayPromotion();
            }
        } while (choicePromotion > 3 || choicePromotion < 1);
    }
}
