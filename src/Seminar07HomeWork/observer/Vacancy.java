package Seminar07HomeWork.observer;

public class Vacancy {
    private JobType jobName;

    private double maxSalary;

    public JobType getVacancyName() {
        return jobName;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public Vacancy(JobType jobName, double maxSalary) {
        this.jobName = jobName;
        this.maxSalary = maxSalary;
    }
}
