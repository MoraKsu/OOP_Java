package Seminar07HW;

import Seminar07HW.controller.CalculatorController;
import Seminar07HW.model.ComplexCalculator;
import Seminar07HW.model.ComplexCalculatorImpl;
import Seminar07HW.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculatorImpl();
        ConsoleView view = new ConsoleView();
        CalculatorController controller = new CalculatorController(calculator, view);
        controller.run();
    }
}
