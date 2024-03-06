package Seminar07HW.controller;

import Seminar07HW.model.ComplexCalculator;
import Seminar07HW.model.ComplexNumber;
import Seminar07HW.view.ConsoleView;

public class CalculatorController {
    private ComplexCalculator calculator;
    private ConsoleView view;

    public CalculatorController(ComplexCalculator calculator, ConsoleView view) {
        this.calculator = calculator;
        this.view = view;
    }

    public void run() {
        int choice;
        do {
            choice = view.showMenu();
            switch (choice) {
                case 1:
                    ComplexNumber num1 = view.readComplexNumber("Введите первое комплексное число (в формате a b): ");
                    ComplexNumber num2 = view.readComplexNumber("Введите второе комплексное число (в формате a b): ");
                    ComplexNumber sum = calculator.add(num1, num2);
                    view.displayResult(sum);
                    break;
                case 2:
                    num1 = view.readComplexNumber("Введите первое комплексное число (в формате a b): ");
                    num2 = view.readComplexNumber("Введите второе комплексное число (в формате a b): ");
                    ComplexNumber product = calculator.multiply(num1, num2);
                    view.displayResult(product);
                    break;
                case 3:
                    num1 = view.readComplexNumber("Введите делимое комплексное число (в формате a b): ");
                    num2 = view.readComplexNumber("Введите делитель комплексное число (в формате a b): ");
                    ComplexNumber quotient = calculator.divide(num1, num2);
                    view.displayResult(quotient);
                    break;
                case 4:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        } while (choice != 4);
    }
}
