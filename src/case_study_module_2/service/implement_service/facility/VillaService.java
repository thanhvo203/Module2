package case_study_module_2.service.implement_service.facility;

import case_study_module_2.model.extend.facility.Villa;
import case_study_module_2.repository.implement_repository.facility.VillaRepository;
import case_study_module_2.service.extends_service_common.facility.IVillaService;
import case_study_module_2.utils.validate.facility.ValidateHouse;
import case_study_module_2.utils.validate.facility.ValidateVilla;

import java.util.List;
import java.util.Scanner;

public class VillaService implements IVillaService {
    Scanner sc = new Scanner(System.in);
    private VillaRepository villaRepository = new VillaRepository();


    @Override
    public void displayVilla() {
        List<Villa> villaList = villaRepository.showListVilla();
        for (Villa villa : villaList) {
            System.out.println(villa.toString());
        }
    }

    @Override
    public void addNewVilla() {
        String serviceCode;
        System.out.println("Input service code (SVVL-YYYY) with Y is number.");
        do {
            System.out.println("Enter service code: ");
            serviceCode = sc.nextLine();
            if (!ValidateVilla.checkServiceCode(serviceCode)) {
                System.err.println("ERROR: Please input again: ");
            }
        } while (!ValidateVilla.checkServiceCode(serviceCode));
        String serviceName;
        System.out.println("Input service name(Capitalization first word.)");
        do {
            System.out.println("Enter service name:");
            serviceName = sc.nextLine();
            if (!ValidateVilla.checkServiceName(serviceName)) {
                System.err.println("ERROR: Please input again");
            }
        } while (!ValidateVilla.checkServiceName(serviceName));
        double usableArea;
        do {
            System.out.println("Input usable are ( > 30): ");
            usableArea = sc.nextDouble();
            if (usableArea < 30) {
                System.err.println("ERROR: Please input again!.");
            }
        } while (usableArea < 30);
        double price;
        do {
            System.out.println("Input price ( > 0 ):");
            price = sc.nextDouble();
            if (price < 30) {
                System.err.println("ERROR: Please input again.");
            }
        } while (price < 30);
        int amountPeople;
        do {
            System.out.println("Input amount people(0 < amount < 20) : ");
            amountPeople = sc.nextInt();
            if (amountPeople > 20 || amountPeople < 0) {
                System.err.println("ERROR: Please input again!");
            }
        } while (amountPeople > 20 || amountPeople < 0);
        sc.nextLine();
        String rentalType = null;
        System.out.println("---Rental Type--- \n" +
                "1. Hour \n" +
                "2. Day \n" +
                "3. Month \n" +
                "4. Year ");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                rentalType = "Hour";
                break;
            case "2":
                rentalType = "Day";
                break;
            case "3":
                rentalType = "Month";
                break;
            case "4":
                rentalType = "Year";
                break;
            default:
                System.err.println("ERROR: WRONG INPUT");
        }
        String standardVilla = null;

        System.out.println("---Standard Villa--- \n" +
                "1. Luxury \n" +
                "2. Natural \n" +
                "3. Modern ");
        String choice1 = sc.nextLine();
        switch (choice1) {
            case "1":
                standardVilla = "Luxury";
                break;
            case "2":
                standardVilla = "Natural";
                break;
            case "3":
                standardVilla = "Modern";
                break;
            default:
                System.err.println("ERROR: WRONG INPUT");
        }
        double poolArea;
        do {
            System.out.println("Enter poolArea ( > 30): ");
            poolArea = sc.nextDouble();
            if (poolArea < 30) {
                System.err.println("ERROR: please input again");
            }
        } while (poolArea < 30);
        int floors;
        do {
            System.out.println("Enter floors( > 0):");
            floors = sc.nextInt();
            if (floors < 0) {
                System.err.println("ERROR: please input again.");
            }
        } while (floors < 0);
        Villa newVilla = new Villa(serviceCode, serviceName, usableArea, price, amountPeople, rentalType,
                standardVilla, poolArea, floors);
        villaRepository.addNewVilla(newVilla);
        System.out.println("Add Success!!!!");
    }
}