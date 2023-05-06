package case_study_module_2.model.contract;

public class Contract {
    private String codeContract;
    private String codeBooking;
    private double advanceMoney;
    private double totalMoney;

    public Contract(String codeContract, String codeBooking, double advanceMoney, double totalMoney) {
        this.codeContract = codeContract;
        this.codeBooking = codeBooking;
        this.advanceMoney = advanceMoney;
        this.totalMoney = totalMoney;
    }

    public String getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(String codeContract) {
        this.codeContract = codeContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getAdvanceMoney() {
        return advanceMoney;
    }

    public void setAdvanceMoney(double advanceMoney) {
        this.advanceMoney = advanceMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Contract[" +
                " , codeContract=" + codeContract +
                " , codeBooking=" + codeBooking +
                " , advanceMoney=" + advanceMoney +
                " , totalMoney=" + totalMoney +
                "]";
    }
    public String writeFileContract(){
        return codeContract + ","+codeBooking+","+advanceMoney+","+totalMoney;
    }
}
