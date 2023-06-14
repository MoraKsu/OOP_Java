package Seminar06HomeWork;


import Seminar06HomeWork.srp2.ConsoleInputReader;
import Seminar06HomeWork.srp2.Order;
import Seminar06HomeWork.srp2.OrderWriter;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        ConsoleInputReader inputReader = new ConsoleInputReader();
        Order order = inputReader.readOrderFromConsole();

        OrderWriter orderWriter = new OrderWriter();
        orderWriter.saveToJson(order);
    }

}
