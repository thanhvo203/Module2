package bai_tap_mvc.model;

public class Spend {
    private int idSpend;
    private String nameSpend;
    private String date;
    private double money;
    private String comment;

    public Spend(int idSpend, String nameSpend, String date, double money, String comment) {
        this.idSpend = idSpend;
        this.nameSpend = nameSpend;
        this.date = date;
        this.money = money;
        this.comment = comment;
    }

    public int getIdSpend() {
        return idSpend;
    }

    public void setIdSpend(int idSpend) {
        this.idSpend = idSpend;
    }

    public String getNameSpend() {
        return nameSpend;
    }

    public void setNameSpend(String nameSpend) {
        this.nameSpend = nameSpend;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Spend{" +
                "idSpend=" + idSpend +
                ", nameSpend='" + nameSpend + '\'' +
                ", date='" + date + '\'' +
                ", money=" + money +
                ", comment='" + comment + '\'' +
                '}';
    }
}
