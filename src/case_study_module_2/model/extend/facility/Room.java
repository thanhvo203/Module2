package case_study_module_2.model.extend.facility;

import case_study_module_2.model.absract.facility.AbstractFacility;

import java.util.Objects;


public class Room extends AbstractFacility {
    private String serviceFree;

    public Room(String serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType) {
        super(serviceCode, serviceName, usableArea, price, numberOfPeople, rentalType);
    }

    public Room(String serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType, String serviceFree) {
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
    public String saveFileRoom(){
        return saveFileFacility()+"," + serviceFree;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Room room = (Room) o;
//        return this.getServiceCode().equals(room.getServiceCode());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(serviceFree);
//    }
}
