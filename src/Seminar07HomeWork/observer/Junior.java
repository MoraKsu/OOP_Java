package Seminar07HomeWork.observer;

public class Junior extends JobSeeker {
    private String jobTitle;

    public Junior(String name, String jobTitle) {
        super(name, generateRandomSalary());
        this.jobTitle = jobTitle;
    }

    @Override
    protected String getJobTitle() {
        return jobTitle;
    }

    @Override
    protected double getMaxSalary() {
        return 80000;
    }

    @Override
    public boolean takeJob(String jobTitle) {
        return true;
    }

    private static double generateRandomSalary() {
        return 50000 + Math.random() * 30000;
    }
}
