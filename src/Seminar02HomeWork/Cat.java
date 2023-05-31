package Seminar02HomeWork;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.setFood(plate.getFood() - appetite);
            isFull = true;
        }
    }
}
