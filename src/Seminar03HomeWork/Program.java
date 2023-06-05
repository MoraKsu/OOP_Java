package Seminar03HomeWork;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int type = random.nextInt(2); // Случайно выбираем тип сотрудника (0 - Worker, 1 - Freelancer)

        if (type == 0) {
            int salary = random.nextInt(20000, 80000);
            return new Worker(names[random.nextInt(4)], surnames[random.nextInt(surnames.length)], salary);
        } else {
            int hoursWorked = random.nextInt(50, 200);
            int hourlyRate = random.nextInt(500, 2000);
            return new Freelancer(names[random.nextInt(4)], surnames[random.nextInt(surnames.length)], hoursWorked, hourlyRate);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);

        System.out.println("Сортировка по имени и зарплате:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new SalaryComparator());

        System.out.println("\nСортировка по уровню зарплаты:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println("\nСортировка по возрасту:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
