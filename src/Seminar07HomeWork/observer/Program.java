package Seminar07HomeWork.observer;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgencySubject jobAgency = new JobAgencySubject();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        jobAgency.registerObserver(new Senior("Ivanov", "Python-разработчик"));
        jobAgency.registerObserver(new Middle("Petrov", "Frontend-разработчик"));
        jobAgency.registerObserver(new Junior("Sidorov", "Java-разработчик"));
        jobAgency.registerObserver(new Junior("Smith", "QA-инженер"));
        jobAgency.registerObserver(new Middle("Johnson", "Web-дизайнер"));
        jobAgency.registerObserver(new Senior("Williams", "Backend-разработчик"));

        for (int i = 0; i < 5; i++) {
            Company company = getRandomCompany(geekBrains, google, yandex);
            JobType jobType = getRandomJobType(company);
            double salary = company.generateRandomSalary();
            company.needEmployee(jobType, salary);
        }
    }

    private static Company getRandomCompany(Company... companies) {
        int index = (int) (Math.random() * companies.length);
        return companies[index];
    }

    private static JobType getRandomJobType(Company company) {
        JobType[] jobTypes = JobType.values();
        int index = (int) (Math.random() * jobTypes.length);
        return jobTypes[index];
    }
}
