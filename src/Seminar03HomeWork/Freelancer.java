package Seminar03HomeWork;

import static Seminar03HomeWork.Program.random;

public class Freelancer extends Employee {

    private int hoursWorked;
    private int hourlyRate;

    public Freelancer(String name, String surname, int hoursWorked, int hourlyRate) {
        super(name, surname, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Заработная плата за отработанные часы: %.2f (руб.)",
                surname, name, calculateSalary());
    }

    @Override
    public int getAge() {
        return random.nextInt(20, 60);
    }
}
