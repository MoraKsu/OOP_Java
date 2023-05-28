package Seminar01HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SellVendingMachine {

    private VendingMachine vendingMachine;

    public SellVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    vendingMachine.showProductList();
                    break;
                case 2:
                    buyWater(scanner);
                    break;
                case 3:
                    buyChocolateBar(scanner);
                    break;
                case 4:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неверная операция. Пожалуйста, выберите правильный вариант.");
                    break;
            }
        } while (choice != 4);
    }

    private void displayMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1 - Показать весь список товаров");
        System.out.println("2 - Купить воду");
        System.out.println("3 - Купить шоколад");
        System.out.println("4 - Выход");
    }

    private void buyWater(Scanner scanner) {
        System.out.println("Введите объем воды:");
        double value = scanner.nextDouble();

        System.out.println("Введите минимальную цену:");
        double minPrice = scanner.nextDouble();

        List<BottleOfWater> matchingWater = new ArrayList<>();
        for (Product product : vendingMachine.getProducts()) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottle = (BottleOfWater) product;
                if (bottle.getValue() == value && bottle.getPrice() >= minPrice) {
                    matchingWater.add(bottle);
                }
            }
        }

        if (matchingWater.isEmpty()) {
            System.out.println("Не найдено подходящей бутылки с водой.");
        } else {
            System.out.println("Доступная вода:");
            for (int i = 0; i < matchingWater.size(); i++) {
                System.out.println((i + 1) + ". " + matchingWater.get(i).displayInfo());
            }

            System.out.println("Выберите номер воды для покупки:");
            int selectedNumber = scanner.nextInt();
            if (selectedNumber >= 1 && selectedNumber <= matchingWater.size()) {
                BottleOfWater selectedWater = matchingWater.get(selectedNumber - 1);
                System.out.println("Вы купили:");
                System.out.println(selectedWater.displayInfo());
            } else {
                System.out.println("Неверный номер воды.");
            }
        }
    }

    private void buyChocolateBar(Scanner scanner) {
        System.out.println("Введите минимальные калории:");
        double minCalories = scanner.nextDouble();

        System.out.println("Введите минимальную цену:");
        double minPrice = scanner.nextDouble();

        List<ChocolateBar> matchingBars = vendingMachine.getChocolateBarsByCriteria(minCalories, minPrice);

        if (matchingBars.isEmpty()) {
            System.out.println("Не найдено подходящего шоколадного батончика.");
        } else {
            System.out.println("Доступные шоколадные батончики:");
            for (int i = 0; i < matchingBars.size(); i++) {
                System.out.println((i + 1) + ". " + matchingBars.get(i).displayInfo());
            }

            System.out.println("Выберите номер шоколадного батончика для покупки:");
            int selectedNumber = scanner.nextInt();
            if (selectedNumber >= 1 && selectedNumber <= matchingBars.size()) {
                ChocolateBar selectedBar = matchingBars.get(selectedNumber - 1);
                System.out.println("Вы купили:");
                System.out.println(selectedBar.displayInfo());
            } else {
                System.out.println("Неверный номер шоколадного батончика.");
            }
        }
    }
}
