package case_study_module_2.repository.extends_repository_common;

import case_study_module_2.model.booking.Booking;
import case_study_module_2.repository.repository_common.IRepository;

import java.util.List;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;


public interface IBookingRepository<E> {
    TreeSet<E> getBookingList();
    void addNewBooking(Booking booking);
}
