package Seminar07HomeWork.observer;

public enum JobType {
    FRONTEND_DEVELOPER("Frontend-разработчик"),
    BACKEND_DEVELOPER("Backend-разработчик"),
    QA_ENGINEER("QA-инженер"),
    WEB_DESIGNER("Web-дизайнер"),
    JAVA_DEVELOPER("Java-разработчик"),
    PYTHON_DEVELOPER("Python-разработчик");

    private String vacancy;

    JobType(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getVacancy() {
        return vacancy;
    }
}
