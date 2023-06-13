package Seminar05HomeWork;


import Seminar05HomeWork.controllers.MenuController;
import Seminar05HomeWork.models.TableModel;
import Seminar05HomeWork.presenters.BookingPresenter;
import Seminar05HomeWork.presenters.Model;
import Seminar05HomeWork.views.BookingView;

import java.util.Scanner;


public class Program {

    /**
     * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     *
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        MenuController menuController = new MenuController(bookingView);
        bookingView.setMenuController(menuController);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            menuController.printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            menuController.handleMenuChoice(choice, scanner);
        }
    }
}
