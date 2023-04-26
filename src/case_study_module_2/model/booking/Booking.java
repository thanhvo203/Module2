package case_study_module_2.model.booking;

public class Booking {
    private int codeBooking;
    private String dateBooking;
    private String startDate;
    private String endDate;
    private int codeCustomer;
    private int serviceCode;

    public Booking(int codeBooking, String dateBooking, String startDate, String endDate, int codeCustomer, int serviceCode) {
        this.codeBooking = codeBooking;
        this.dateBooking = dateBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.codeCustomer = codeCustomer;
        this.serviceCode = serviceCode;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(int codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Booking [" +
                " , codeBooking=" + codeBooking +
                " , dateBooking='" + dateBooking + '\'' +
                " , startDate='" + startDate + '\'' +
                " , endDate='" + endDate + '\'' +
                " , codeCustomer=" + codeCustomer +
                " , serviceCode=" + serviceCode +
                ']';
    }
}
