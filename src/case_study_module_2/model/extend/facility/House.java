package case_study_module_2.model.extend.facility;

import case_study_module_2.model.absract.facility.AbstractFacility;


public class House extends AbstractFacility {
    private String standardRoom;
    private int numberOfFloors;

    public House(String serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType) {
        super(serviceCode, serviceName, usableArea, price, numberOfPeople, rentalType);
    }

    public House(String serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType, String standardRoom, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, price, numberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House [" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ']';
    }
    public String saveFileHouse(){
        return "House: "+saveFileFacility()+", StandardRoom: "+standardRoom+",NumberOfFloors: "+ numberOfFloors;
    }
}
