package Seminar01HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Product water1 = new BottleOfWater("BonAqua", 62.99, 1);
        Product water2 = new BottleOfWater("Волжанка", 37.90, 1.5);
        BottleOfWater water3 = new BottleOfWater("Borjomi", 89.90, 0.75);
        Product water4 = new BottleOfWater("Святой источник", 29.99, 1);
        Product bar1 = new ChocolateBar("Snickers", 54.99, 499, 80);
        Product bar2 = new ChocolateBar("Picnic", 44.89, 461, 76);
        ChocolateBar bar3 = new ChocolateBar("Mars", 54.99, 455, 81);
        ChocolateBar bar4 = new ChocolateBar("MilkyWay", 39.99, 453, 52);



        List<Product> products = new ArrayList<>();
        products.add(water1);
        products.add(water2);
        products.add(water4);
        products.add(water3);
        products.add(bar1);
        products.add(bar2);
        products.add(bar3);
        products.add(bar4);


        VendingMachine vendingMachine = new VendingMachine(products);
        SellVendingMachine sellVendingMachine = new SellVendingMachine(vendingMachine);
        sellVendingMachine.start();
    }
}

