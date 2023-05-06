package case_study_module_2.controller;

import case_study_module_2.service.implement_service.facility.FacilityService;
import case_study_module_2.service.implement_service.facility.HouseService;
import case_study_module_2.service.implement_service.facility.RoomService;
import case_study_module_2.service.implement_service.facility.VillaService;


import java.util.Scanner;

public class FacilityController {
    Scanner sc = new Scanner(System.in);
    private FacilityService facilityService = new FacilityService();
    private VillaService villaService = new VillaService();
    private HouseService houseService = new HouseService();
    private RoomService roomService = new RoomService();

    public void displayFacilityList() {
        boolean flag = true;
        do {
            System.out.println("Select employee facility: \n" +
                    "1. Display list facility \n" +
                    "2. Add new facility \n" +
                    "3. Display list facility maintenance \n" +
                    "4. Return main menu");
            System.out.println("Please choose selection of facility: ");
            String choiceFacility = sc.nextLine();
            switch (choiceFacility) {
                case "1":
                    facilityService.displayFacilityMenu();
                    break;
                case "2":
                    boolean flag1 = true;
                    do {
                        System.out.println("Select add type of service: \n" +
                                "1. Add New Villa \n" +
                                "2. Add New House \n" +
                                "3. Add New Roon \n" +
                                "4. Back To Menu");
                        String choiceAddNew = sc.nextLine();
                        switch (choiceAddNew) {
                            case "1":
                                villaService.addNewVilla();
                                break;
                            case "2":
                                houseService.addNewHouse();
                                break;
                            case "3":
                                roomService.addNewRoom();
                                break;
                            case "4":
                                displayFacilityList();
                                break;
                            default:
                                System.err.println("Please choose number from 1 to 4:");
                        }
                    } while (flag1);
                case "3":
                    facilityService.displaymaintainFacility();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.err.println("Wrong choose, please choose again: ");
                    displayFacilityList();
            }

        } while (flag);
    }
}
