package Seminar07HomeWork.observer;

public class Middle extends JobSeeker {
    private String jobTitle;

    public Middle(String name, String jobTitle) {
        super(name, generateRandomSalary());
        this.jobTitle = jobTitle;
    }

    @Override
    protected String getJobTitle() {
        return jobTitle;
    }

    @Override
    protected double getMaxSalary() {
        return 150000;
    }

    @Override
    public boolean takeJob(String jobTitle) {
        return true;
    }

    private static double generateRandomSalary() {
        return 80000 + Math.random() * 70000;
    }
}
