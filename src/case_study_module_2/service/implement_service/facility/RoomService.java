package case_study_module_2.service.implement_service.facility;

import case_study_module_2.model.extend.facility.Room;
import case_study_module_2.model.extend.facility.Villa;
import case_study_module_2.repository.implement_repository.facility.RoomRepository;
import case_study_module_2.service.extends_service_common.facility.IRoomService;
import case_study_module_2.utils.validate.facility.ValidateHouse;
import case_study_module_2.utils.validate.facility.ValidateRoom;
import case_study_module_2.utils.validate.facility.ValidateVilla;

import java.util.List;
import java.util.Scanner;

public class RoomService implements IRoomService {
    Scanner sc = new Scanner(System.in);
    private RoomRepository roomRepository = new RoomRepository();

    @Override
    public void showListRoom() {
        List<Room> listRoom = roomRepository.showListRoom();
        for (Room room : listRoom) {
            System.out.println(room.toString());
        }
    }

    @Override
    public void addNewRoom() {
        String serviceCode;
        System.out.println("Input service code (SVRO-YYYY) with Y is number.");
        do {
            System.out.println("Enter service code: ");
            serviceCode = sc.nextLine();
            if (!ValidateRoom.checkServiceCode(serviceCode)) {
                System.err.println("ERROR: Please input again: ");
            }
        } while (!ValidateRoom.checkServiceCode(serviceCode));
        String serviceName;
        System.out.println("Input service name(Capitalization first word.)");
        do {
            System.out.println("Enter service name:");
            serviceName = sc.nextLine();
            if (!ValidateRoom.checkServiceName(serviceName)) {
                System.err.println("ERROR: Please input again");
            }
        } while (!ValidateRoom.checkServiceName(serviceName));
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
            amountPeople = Integer.parseInt(sc.nextLine());
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
        String serviceFree = null;
        System.out.println("-- List Free Option-- \n" +
                "1. Breakfast \n" +
                "2. Lunch \n" +
                "3. Dinner");
        String choice1 = sc.nextLine();
        switch (choice1) {
            case "1":
                serviceFree = "Breakfast";
                break;
            case "2":
                serviceFree = "Lunch";
                break;
            case "3":
                serviceFree = "Dinner";
                break;
            default:
                System.err.println("Sorry. We just have 3 option service free at list." +
                        "We can not response you option. Please choose again. THANK YOU!!");
        }
        Room newRoom = new Room(serviceCode, serviceName, usableArea, price, amountPeople, rentalType, serviceFree);
        roomRepository.addNewRoom(newRoom);
        System.out.println("Add Success!!!!");
    }
}
