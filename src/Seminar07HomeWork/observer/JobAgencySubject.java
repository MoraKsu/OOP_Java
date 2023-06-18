package Seminar07HomeWork.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgencySubject implements Publisher<Observer> {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String companyName, double salary, String jobTitle) {
        for (Observer observer : observers) {
            if (observer.isMatchingJobType(jobTitle)) {
                observer.receiveOffer(companyName, salary, jobTitle);
                if (observer.isAcceptableSalary(salary) && observer.takeJob(jobTitle)) {
                    removeObserver(observer);
                    break;
                }
            }
        }
    }

    public void sendVacancy(String companyName, Vacancy vacancy) {
        String companyVacancy = vacancy.getVacancyName().getVacancy();
        System.out.println("Вакансия " + companyVacancy);
        notifyObservers(companyName, vacancy.getMaxSalary(), companyVacancy);
    }
}
