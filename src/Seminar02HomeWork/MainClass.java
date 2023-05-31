package Seminar02HomeWork;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Murzik", 10),
                new Cat("Tom", 15),
                new Cat("Gulpy", 12),
                new Cat("Forest", 20),
                new Cat("Timmy", 18),
                new Cat("Snow White", 14),
                new Cat("Malone", 10),
                new Cat("Gav", 8),
        };

        Plate plate = new Plate(100);
        plate.info();

        System.out.print("Input the amount of food to add to the plate: ");
        int foodToAdd = scanner.nextInt();
        plate.addFood(foodToAdd);

        for (Cat cat : cats) {
            int appetite = cat.getAppetite();
            System.out.println(cat.getName() + " has an appetite of " + appetite);

            if (appetite <= plate.getFood()) {
                cat.eat(plate);
                System.out.println(cat.getName() + " is well-fed.");
            } else {
                System.out.println(cat.getName() + " is hungry and cannot eat.");
            }
        }

        plate.info();
    }
}
