package Seminar05HomeWork.views;


import Seminar05HomeWork.controllers.MenuController;
import Seminar05HomeWork.models.Table;
import Seminar05HomeWork.presenters.View;
import Seminar05HomeWork.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;


public class BookingView implements View {

    private ViewObserver observer;
    private MenuController menuController;

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }

    @Override
    public void printReservationTableError(String errorMessage) {
        System.out.printf("Невозможно забронировать столик. \n%s\n", errorMessage);
    }

    @Override
    public void printChangeReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно ИЗМЕНЕН. Номер вашей НОВОЙ брони: #%d\n", reservationNo);
    }

    @Override
    public void printChangeReservationTableError(String errorMessage) {
        System.out.printf("Невозможно забронировать столик. \n%s\n", errorMessage);
    }

    @Override
    public void printCancelReservationTableResult(int reservationId) {
        System.out.printf("Бронирование с номером #%d успешно отменено.\n", reservationId);
    }

    @Override
    public void printCancelReservationTableError(String errorMessage) {
        System.out.printf("Ошибка при отмене бронирования: %s\n", errorMessage);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * TODO: реализовать функционал изменения бронирования столика самостоятельно в рамках домашнего задания
     * Действие клиента (пользователь нажал на кнопку изменения бронирования столика)
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

    public void cancelReservationTable(int reservationId) {
        observer.onCancelReservationTable(reservationId);
    }
}
