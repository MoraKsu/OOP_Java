package Seminar07HW.view;

import Seminar07HW.model.ComplexNumber;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");
        System.out.println("4. Выход");

        return scanner.nextInt();
    }

    public ComplexNumber readComplexNumber(String prompt) {
        System.out.print(prompt);
        double real = scanner.nextDouble();
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public void displayResult(ComplexNumber result) {
        System.out.println("Результат: " + result);
    }
}
