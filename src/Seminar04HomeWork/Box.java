package Seminar04HomeWork;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private final ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public String getFruitsCount() {
        int count = fruits.size();
        return count + " шт";
    }

    public String getWeight() {
        if (fruits.isEmpty()) {
            return "0.0 kg";
        }
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return String.format("%.1f kg", weight);
    }

    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void moveTo(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }
        if (fruits.isEmpty()) {
            return;
        }
        if (!otherBox.fruits.isEmpty() && !fruits.get(0).getClass().equals(otherBox.fruits.get(0).getClass())) {
            throw new IllegalArgumentException("Нельзя пересыпать фрукты разных типов!");
        }
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }
}
