package Seminar01HomeWork;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double value) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottle = (BottleOfWater) product;
                if (bottle.getValue() == value) {
                    return bottle;
                }
            }
        }
        return null;
    }

    public List<Product> getProductsByBrand(String brand) {
        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getBrand().equalsIgnoreCase(brand)) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

    public List<ChocolateBar> getChocolateBarsByCriteria(double minCalories, double maxPrice) {
        List<ChocolateBar> matchingBars = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof ChocolateBar) {
                ChocolateBar chocolateBar = (ChocolateBar) product;
                if (chocolateBar.getCalories() >= minCalories && chocolateBar.getPrice() <= maxPrice) {
                    matchingBars.add(chocolateBar);
                }
            }
        }
        return matchingBars;
    }

    public void showProductList() {
        System.out.println("Список товаров в автомате:");
        for (Product product : products) {
            System.out.println(product.displayInfo());
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
