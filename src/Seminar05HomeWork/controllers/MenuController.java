package Seminar05HomeWork.controllers;

import Seminar05HomeWork.views.BookingView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MenuController {
    private BookingView bookingView;
    private Scanner scanner;
    private SimpleDateFormat dateFormat;

    public MenuController(BookingView bookingView) {
        this.bookingView = bookingView;
        this.scanner = new Scanner(System.in);
        this.dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    }

    public void printMenu() {
        System.out.println("Меню:");
        System.out.println("1. Забронировать столик");
        System.out.println("2. Изменить бронь");
        System.out.println("3. Отменить бронь");
        System.out.println("0. Выход");
        System.out.print("Введите номер операции: ");
    }

    public void handleMenuChoice(int choice, Scanner scanner) {
        Date currentDate = new Date();
        int tableNo;
        String name;
        switch (choice) {
            case 1:
                System.out.print("Введите номер столика: ");
                tableNo = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введите имя клиента: ");
                name = scanner.nextLine();
                bookingView.reservationTable(currentDate, tableNo, name);
                break;
            case 2:
                System.out.print("Введите номер брони: ");
                int oldReservation = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введите новую дату бронирования (в формате ДД.ММ.ГГГГ): ");
                String newReservationDateStr = scanner.nextLine();
                try {
                    Date newReservationDate = dateFormat.parse(newReservationDateStr);
                    System.out.print("Введите новый номер столика: ");
                    int newTableNo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите новое имя клиента: ");
                    String newName = scanner.nextLine();
                    bookingView.changeReservationTable(oldReservation, newReservationDate, newTableNo, newName);
                } catch (ParseException e) {
                    System.out.println("Некорректный формат даты. Введите дату в формате ДД.ММ.ГГГГ");
                }
                break;
            case 3:
                System.out.print("Введите номер брони для отмены: ");
                int reservationId = scanner.nextInt();
                scanner.nextLine();
                bookingView.cancelReservationTable(reservationId);
                break;
            case 0:
                System.out.println("Выход");
                System.exit(0);
                break;
            default:
                System.out.println("Некорректный выбор");
        }
    }
}

