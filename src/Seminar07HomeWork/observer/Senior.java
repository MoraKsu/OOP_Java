package Seminar07HomeWork.observer;

public class Senior extends JobSeeker {
    private String jobTitle;

    public Senior(String name, String jobTitle) {
        super(name, generateRandomSalary());
        this.jobTitle = jobTitle;
    }

    @Override
    protected String getJobTitle() {
        return jobTitle;
    }

    @Override
    protected double getMaxSalary() {
        return 200000;
    }

    @Override
    public boolean takeJob(String jobTitle) {
        return true;
    }

    private static double generateRandomSalary() {
        return 150000 + Math.random() * 50000;
    }
}
