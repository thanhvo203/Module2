package case_study_module_2.model.extend.facility;


import case_study_module_2.model.absract.facility.AbstractFacility;

public class Villa extends AbstractFacility {
    private String standardRoom;
    private double poolArea;
    private int numberOfFloors;

    public Villa(int serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType) {
        super(serviceCode, serviceName, usableArea, price, numberOfPeople, rentalType);
    }

    public Villa(int serviceCode, String serviceName, double usableArea, double price, int numberOfPeople, String rentalType, String standardRoom, double poolArea, int numberOfFloors) {
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
        return "Villa [" +super.toString() +
                " , standardRoom='" + standardRoom + '\'' +
                " , poolArea=" + poolArea +
                " , numberOfFloors=" + numberOfFloors +
                ']';
    }
}
