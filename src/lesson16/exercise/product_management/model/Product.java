package lesson16.exercise.product_management.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String manufacturer;
    private String comment;
    public Product(){

    }

    public Product(int id, String name, double price, String manufacturer, String comment) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
