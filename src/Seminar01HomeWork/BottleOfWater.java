package Seminar01HomeWork;

public class BottleOfWater extends Product {
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public BottleOfWater(String brand, double price, double value) {
        super(brand, price);
        this.value = value;
    }

    @Override
    public String displayInfo() {
        return String.format("[Brand]%s - %f - [value: %f]", brand, price, value);
    }
}
