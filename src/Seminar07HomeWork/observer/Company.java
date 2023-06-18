package Seminar07HomeWork.observer;

public class Company {

    private String companyName;
    private JobAgencySubject jobAgency;
    private SalaryGenerator salaryGenerator;

    public Company(String companyName, JobAgencySubject jobAgency) {
        this.companyName = companyName;
        this.jobAgency = jobAgency;
        this.salaryGenerator = new RandomSalaryGenerator();
    }

    public void needEmployee(JobType jobType, double maxSalary) {
        Vacancy vacancy = new Vacancy(jobType, maxSalary);
        jobAgency.sendVacancy(companyName, vacancy);
    }

    public double generateRandomSalary() {
        return salaryGenerator.generateRandomSalary();
    }
}
