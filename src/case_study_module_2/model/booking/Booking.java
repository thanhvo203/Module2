package case_study_module_2.model.booking;

public class Booking implements Comparable<Booking> {
    private String codeBooking;
    private String dateBooking;
    private String startDate;
    private String endDate;
    private String codeCustomer;
    private String serviceCode;

    public Booking(String codeBooking, String dateBooking, String startDate, String endDate, String codeCustomer, String serviceCode) {
        this.codeBooking = codeBooking;
        this.dateBooking = dateBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.codeCustomer = codeCustomer;
        this.serviceCode = serviceCode;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
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

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
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
    public String writeFileBooking(){
        return codeBooking+","+dateBooking+","+startDate+","+endDate+","+codeCustomer+","+serviceCode;
    }

    @Override
    public int compareTo(Booking o) {
        if(this.startDate.equals(o.startDate)){
            return this.endDate.compareTo(o.endDate);
        }
        return this.startDate.compareTo(o.startDate);
    }
}
