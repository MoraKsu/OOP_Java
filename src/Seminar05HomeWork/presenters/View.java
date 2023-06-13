package Seminar05HomeWork.presenters;

import Seminar05HomeWork.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {


    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    void printReservationTableResult(int reservationNo);

    void printReservationTableError(String errorMessage);

    void printChangeReservationTableResult(int reservationNo);

    void printChangeReservationTableError(String errorMessage);

    void printCancelReservationTableResult(int reservationId);

    void printCancelReservationTableError(String errorMessage);
}
