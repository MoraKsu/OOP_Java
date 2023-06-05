package Seminar03HomeWork;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        return Integer.compare(age1, age2);
    }
}
