package Seminar03HomeWork;

import static Seminar03HomeWork.Program.random;

public class Worker extends Employee {

    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, calculateSalary());
    }

    @Override
    public int getAge() {
        return random.nextInt(20, 60);
    }
}
