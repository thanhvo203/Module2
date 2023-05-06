package case_study_module_2.service.extends_service_common;

import case_study_module_2.model.booking.Booking;
import case_study_module_2.service.service_common.IService;

import java.util.List;


public interface IBookingService {
    void displayBookingList();
    void addNewBooking();
}
