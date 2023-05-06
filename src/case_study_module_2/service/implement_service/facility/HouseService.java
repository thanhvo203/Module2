package case_study_module_2.service.implement_service.facility;

import case_study_module_2.model.extend.facility.House;
import case_study_module_2.repository.implement_repository.facility.HouseRepository;
import case_study_module_2.service.extends_service_common.facility.IHouseService;
import case_study_module_2.utils.validate.facility.ValidateHouse;
import case_study_module_2.utils.validate.facility.ValidateVilla;

import java.util.List;
import java.util.Scanner;

public class HouseService implements IHouseService {
    Scanner sc = new Scanner(System.in);
    private HouseRepository houseRepository = new HouseRepository();

    @Override
    public void displayHouse() {
        List<House> houseList = houseRepository.showListHouse();
        for (House house : houseList) {
            System.out.println(house.toString());
        }
    }

    @Override
    public void addNewHouse() {
        String serviceCodeHouse;
        do {
            System.out.print("Enter service code house(SVHO-YYYY) with Y is number : ");
            serviceCodeHouse = sc.nextLine();
            if (!ValidateHouse.checkServiceCode(serviceCodeHouse)) {
                System.err.println("WRONG INPUT");
            }
        } while (!ValidateHouse.checkServiceCode(serviceCodeHouse));
        String serviceName;
        do {
            System.out.print("Enter service name house(Capitalization first word.): ");
            serviceName = sc.nextLine();
            if (!ValidateHouse.checkServiceName(serviceName)) {
                System.err.println("WRONG INPUT");
            }
        } while (!ValidateHouse.checkServiceName(serviceName));
        double usableArea;
        do {
            System.out.print("Enter usable area( >30) : ");
            usableArea = sc.nextDouble();
            if (usableArea < 30) {
                System.err.println("WRONG INPUT");
            }
        } while (usableArea < 30);
        double price;
        do {
            System.out.print("Enter price house ( > 0): ");
            price = sc.nextDouble();
            if (price < 30) {
                System.err.println("WRONG INPUT");
            }
        } while (price < 0);
        int amountPeople;
        do {
            System.out.print("Enter number of people(0 < amount <20): ");
            amountPeople = Integer.parseInt(sc.nextLine());
            if (amountPeople > 20 || amountPeople < 0) {
                System.err.println("WRONG INPUT");
            }
        } while (amountPeople < 0 || amountPeople > 20);
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
        String standardHouse = null;

        System.out.println("---Standard House--- \n" +
                "1. Normal \n" +
                "2. Vip \n" +
                "3. President ");
        String choice1 = sc.nextLine();
        switch (choice1) {
            case "1":
                standardHouse = "Normal";
                break;
            case "2":
                standardHouse = "Vip";
                break;
            case "3":
                standardHouse = "President";
                break;
            default:
                System.err.println("ERROR: WRONG INPUT");
        }
        int floorsHouse;
        do {
            System.out.print("Enter number of floors house: ");
            floorsHouse = sc.nextInt();
        } while (floorsHouse <= 0);
        House newHouse = new House(serviceCodeHouse, serviceName, usableArea, price, amountPeople, rentalType, standardHouse, floorsHouse);
        houseRepository.addNewHouse(newHouse);
        System.out.println("Add Success!!");
    }
}
