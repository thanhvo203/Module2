package case_study_module_2.model.extend.facility;


import case_study_module_2.model.absract.facility.AbstractFacility;

import java.util.Objects;

public class Villa extends AbstractFacility {
    private String standardRoom;
    private double poolArea;
    private int numberOfFloors;

    public Villa(String serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType) {
        super(serviceCode, serviceName, usableArea, price, numberOfPeople, rentalType);
    }

    public Villa(String serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType, String standardRoom, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, price, numberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " , standardRoom='" + standardRoom +
                " , poolArea=" + poolArea +
                " , numberOfFloors=" + numberOfFloors;
    }
    public String saveFileVilla(){
        return saveFileFacility()+","+standardRoom +","+poolArea+
                ","+numberOfFloors;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Villa villa = (Villa) o;
//        return this.getServiceCode().equals(villa.getServiceCode());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(standardRoom, poolArea, numberOfFloors);
//    }
}
