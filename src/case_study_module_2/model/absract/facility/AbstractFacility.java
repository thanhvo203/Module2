package case_study_module_2.model.absract.facility;

public abstract class AbstractFacility {
    private int serviceCode;
    private String serviceName;
    private double usableArea;
    private double price;
    private int numberOfPeople;
    private String rentalType;

    public AbstractFacility(int serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.price = price;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "AbstractFacility : " +
                " , serviceCode=" + serviceCode +
                " , serviceName='" + serviceName + '\'' +
                " , usableArea=" + usableArea +
                " , price=" + price +
                " , numberOfPeople=" + numberOfPeople +
                " , rentalType='" + rentalType + '\'' +
                ']';
    }
}
