package Seminar01HomeWork;

public class Product {
    protected String brand;
    protected double price;

    public double getPrice(){
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public Product(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public String displayInfo(){
        return String.format("%s - %f", brand, price);
    }
}
