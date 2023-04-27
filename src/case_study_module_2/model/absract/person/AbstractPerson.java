package case_study_module_2.model.absract.person;

public abstract class AbstractPerson {
    private String id;
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String identityNumber;
    private String phoneNumber;
    private String email;

    public AbstractPerson(String id, String fullName, String dateOfBirth, String gender, String identityNumber, String phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityNumber = identityNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   public String saveFile(){
        return "ID: "+id + ", FullName:  " + fullName + ",Day of birth:  "+ dateOfBirth + ",Gender: "+ gender +",IdentityNumber: "+identityNumber+",Phone Number: "+phoneNumber+",Email: "+
                email+",";
   }
}
