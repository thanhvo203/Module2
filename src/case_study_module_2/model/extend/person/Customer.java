package case_study_module_2.model.extend.person;

import case_study_module_2.model.absract.person.AbstractPerson;


public class Customer extends AbstractPerson {
    private String typeOfCustomer;
    private String address;

    public Customer(String id, String fullName, String dateOfBirth, String gender, String identityNumber, String phoneNumber, String email) {
        super(id, fullName, dateOfBirth, gender, identityNumber, phoneNumber, email);
    }

    public Customer(String id, String fullName, String dateOfBirth, String gender, String identityNumber, String phoneNumber, String email, String typeOfCustomer, String address) {
        super(id, fullName, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  super.getId() + ","+ super.getFullName()+","+super.getDateOfBirth()+","+super.getGender()+","+
                super.getIdentityNumber()+","+super.getPhoneNumber()+","+super.getEmail()+
                "," +typeOfCustomer +
                ", "+ address;
    }
    public String writeToFileCustomer(){
        return saveFile() +","+typeOfCustomer + "," + address;
    }
}
