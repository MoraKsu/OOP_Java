package Seminar07HomeWork.observer;

public interface Observer {

    void receiveOffer(String companyName, double salary, String jobTitle);
    boolean takeJob(String jobTitle);
    boolean isMatchingJobType(String jobType);
    boolean isAcceptableSalary(double salary);
}
