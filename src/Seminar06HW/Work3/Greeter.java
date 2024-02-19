package Seminar06HW.Work3;

/*
В коде класса Greeter можно провести рефакторинг с учетом принципа открытости/закрытости (Open/Closed Principle).
Данный принцип гласит о том, что классы должны быть открыты для расширения, но закрыты для изменения. В настоящий
момент, при добавлении новых форм приветствия, необходимо изменять код класса Greeter, что нарушает принцип
открытости/закрытости.

Для устранения этого нарушения, можно использовать паттерн стратегия. Создадим интерфейс GreetingStrategy, который
будет представлять стратегию приветствия, и реализации этого интерфейса для каждой формы приветствия:
FormalGreetingStrategy, CasualGreetingStrategy, IntimateGreetingStrategy. Затем класс Greeter будет использовать
экземпляр стратегии для выполнения приветствия.
 */
public class Greeter {
    private GreetingStrategy greetingStrategy;

    public Greeter(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public String greet() {
        return greetingStrategy.greet();
    }

    public void setGreetingStrategy(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }
}
