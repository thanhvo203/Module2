package case_study_module_2.controller;

import case_study_module_2.service.implement_service.FacilityService;


import java.util.Scanner;

public class FacilityController {
    Scanner sc = new Scanner(System.in);
    FacilityService facilityService = new FacilityService();


    public void displayFacilityList() {
        System.out.println("Select employee facility: \n" +
                "1. Display list facility \n" +
                "2. Add new facility \n" +
                "3. Edit facility \n" +
                "4. Return main menu");
        int choiceFacility;
        do {
            System.out.println("Please choose selection of facility: ");
            choiceFacility = sc.nextInt();
            switch (choiceFacility) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Wrong choose, please choose again: ");
                    displayFacilityList();
            }
        } while (choiceFacility > 4 || choiceFacility < 1);
    }
}
