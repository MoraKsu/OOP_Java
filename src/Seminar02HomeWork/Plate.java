package Seminar02HomeWork;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        } else {
            System.out.println("Wrong amount of food to add.");
        }
    }
}
