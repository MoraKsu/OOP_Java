package Seminar07HomeWork.observer;

public interface Publisher<T> {

    void registerObserver(T observer);
    void removeObserver(T observer);
    void notifyObservers(String companyName, double salary, String jobTitle);
}
