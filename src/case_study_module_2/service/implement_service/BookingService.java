package case_study_module_2.service.implement_service;

import case_study_module_2.model.absract.facility.AbstractFacility;
import case_study_module_2.model.booking.Booking;
import case_study_module_2.model.extend.person.Customer;
import case_study_module_2.repository.implement_repository.BookingRepository;
import case_study_module_2.repository.implement_repository.CustomerRepository;
import case_study_module_2.repository.implement_repository.facility.FacilityRepository;
import case_study_module_2.service.extends_service_common.IBookingService;
import case_study_module_2.utils.validate.ValidateBooking;

import java.util.*;


public class BookingService implements IBookingService {
    Scanner sc = new Scanner(System.in);
    BookingRepository bookingRepository = new BookingRepository();
    CustomerRepository customerRepository = new CustomerRepository();
    FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void displayBookingList() {
        TreeSet<Booking> getRepo = bookingRepository.getBookingList();
        for (Booking booking : getRepo) {
            System.out.println(booking.writeFileBooking());
        }
    }

    @Override
    public void addNewBooking() {
        String idBooking;
        do {
            System.out.println("Input id Booking (BK-YYYY)with Y is number : ");
            idBooking = sc.nextLine();
            if (!ValidateBooking.checkIDBooking(idBooking)) {
                System.err.println("Please input again!! ");
            }
        } while (!ValidateBooking.checkIDBooking(idBooking));
        System.out.print("Input date Booking: ");
        String dateBooking = sc.nextLine();
        System.out.print("Input start date booking:  ");
        String startBooking = sc.nextLine();
        System.out.print("Input end date booking : ");
        String endBooking = sc.nextLine();
        List<Customer> customerList = customerRepository.showList();
        for (Customer c : customerRepository.showList()) {
            System.out.println(c.toString());
        }
        String customerCode;
        boolean flag = true;
        do {
            flag = true;
            System.out.println("Input customer code (KH-YYYY)with Y is number");
            customerCode = sc.nextLine();
            for (Customer customer : customerList) {
                if (customer.getId().equals(customerCode)) {
                    flag = false;
                    break;
                }
            }

            System.err.println("ERROR");
        } while (flag);
        for (AbstractFacility a : facilityRepository.showListFacitity().keySet()) {
            System.out.println(a.toString());
        }
        boolean flag1 = true;
        String codeService;
        do {
            Map<AbstractFacility, Integer> abstractFacilities = facilityRepository.showListFacitity();
            flag1 = true;
            System.out.println("Input service code(DV-YYYY) with Y is number");
            codeService = sc.nextLine();
            for (AbstractFacility facility : abstractFacilities.keySet()) {
                if (codeService.equals(facility.getServiceCode()) && abstractFacilities.get(facility) < 5) {
                    flag1 = false;
                    break;
                }
            }
            System.err.println("Not found the service code or this facility is maintaining");
        } while (flag1);
        Booking newBooking = new Booking(idBooking, dateBooking, startBooking, endBooking, customerCode, codeService);
        bookingRepository.addNewBooking(newBooking);
        System.out.println("Add Success!!!");
    }
}
