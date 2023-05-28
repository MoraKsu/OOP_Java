package Seminar01HomeWork;

public class ChocolateBar extends Product{

    private double calories;
    private double gram;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getGram() {
        return gram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public ChocolateBar(String brand, double price, double calories, double gram) {
        super(brand, price);
        this.calories = calories;
        this.gram = gram;
    }

    @Override
    public String displayInfo() {
        return String.format("[Brand]%s - %f - [calories: %f] - [gm: %f]", brand, price, calories, gram);
    }
}
