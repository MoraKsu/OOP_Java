package Seminar07HomeWork.observer;

public abstract class JobSeeker implements Observer {
    protected String name;
    protected double minSalary;

    public JobSeeker(String name, double minSalary) {
        this.name = name;
        this.minSalary = minSalary;
    }

    @Override
    public boolean isMatchingJobType(String jobType) {
        return getJobTitle().equals(jobType);
    }

    @Override
    public boolean isAcceptableSalary(double salary) {
        return salary >= minSalary;
    }

    @Override
    public void receiveOffer(String companyName, double salary, String jobTitle) {
        System.out.println(getJobTitle() + " " + name + " получил предложение от " + companyName + ":");
        System.out.println("Вакансия: " + jobTitle);
        System.out.println("Зарплата: ₽" + salary);

        if (salary >= minSalary && salary <= getMaxSalary()) {
            System.out.println(getJobTitle() + " " + name + " принимает предложение о работе!");
            minSalary = salary;
        } else {
            System.out.println(getJobTitle() + " " + name + " отказывается от предложения работы.");
        }
        System.out.println();
    }

    protected abstract String getJobTitle();

    protected abstract double getMaxSalary();
}
