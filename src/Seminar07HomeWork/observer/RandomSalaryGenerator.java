package Seminar07HomeWork.observer;

public class RandomSalaryGenerator implements SalaryGenerator {
    private static final double MIN_SALARY = 50000;
    private static final double MAX_SALARY = 200000;

    @Override
    public double generateRandomSalary() {
        return MIN_SALARY + Math.random() * (MAX_SALARY - MIN_SALARY);
    }
}
