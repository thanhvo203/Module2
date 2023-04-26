package case_study_module_2.model.extend.facility;

import case_study_module_2.model.absract.facility.AbstractFacility;


public class Room extends AbstractFacility {
    private String serviceFree;

    public Room(int serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType) {
        super(serviceCode, serviceName, usableArea, price, numberOfPeople, rentalType);
    }

    public Room(int serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType, String serviceFree) {
        super(serviceCode, serviceName, usableArea, price, numberOfPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room [" + super.toString() +
                "serviceFree='" + serviceFree + '\'' +
                ']';
    }
}
