package case_study_module_2.model.contract;

public class Contract {
    private int codeContract;
    private int codeBooking;
    private double advanceMoney;
    private double totalMoney;

    public Contract(int codeContract, int codeBooking, double advanceMoney, double totalMoney) {
        this.codeContract = codeContract;
        this.codeBooking = codeBooking;
        this.advanceMoney = advanceMoney;
        this.totalMoney = totalMoney;
    }

    public int getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(int codeContract) {
        this.codeContract = codeContract;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
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
}
