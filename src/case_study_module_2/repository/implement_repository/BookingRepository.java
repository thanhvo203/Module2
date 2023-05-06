package case_study_module_2.repository.implement_repository;

import case_study_module_2.model.booking.Booking;
import case_study_module_2.repository.extends_repository_common.IBookingRepository;
import case_study_module_2.utils.read_and_write.ReadAndWriteBooking;

import java.util.*;

public class BookingRepository implements IBookingRepository, Comparator<Booking> {
     private static final String PATH_BOOKING ="D:\\Codegym\\module2\\src\\case_study_module_2\\data\\booking_data.csv";
     private TreeSet<Booking> bookingList = ReadAndWriteBooking.readFileBooking(PATH_BOOKING);
     private static TreeSet<Booking> sortBooking = new TreeSet<>();
     static {
         sortBooking.add(new Booking("BK-1001","14/02/2023","15/02/2023","18/02/2023","KH-1000","SVVL-1000"));
         sortBooking.add(new Booking("BK-1002","10/02/2023","12/02/2023","15/02/2023","KH-1001","SVVL-1000"));
         sortBooking.add(new Booking("BK-1003","01/03/2023","04/03/2023","07/03/2023","KH-1002","SVVL-1000"));
         sortBooking.add(new Booking("BK-1004","14/01/2023","18/01/2023","22/01/2023","KH-1003","SVVL-1000"));

     }
    @Override
    public TreeSet<Booking> getBookingList() {
        for (Booking booking: bookingList) {
            bookingList.addAll(Collections.singleton(booking));
        }
        return bookingList;
    }
    @Override
    public void addNewBooking(Booking booking) {
//         sortBooking = ReadAndWriteBooking.readFileBooking(PATH_BOOKING);
         sortBooking.add(booking);
         ReadAndWriteBooking.writeFileBooking(PATH_BOOKING,sortBooking);
    }

    @Override
    public int compare(Booking o1, Booking o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingRepository that = (BookingRepository) o;
        return this.getBookingList().equals(this.getBookingList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingList);
    }
}
