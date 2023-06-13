package Seminar05HomeWork.presenters;


import Seminar05HomeWork.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model tableModel;
    private final View bookingView;
    public BookingPresenter(Model tableModel, View bookingView){
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.showTables(loadTables());
    }

    public void printReservationTableResult(int reservationId){
        bookingView.printReservationTableResult(reservationId);
    }

    public void printReservationTableError(String errorMessage){
        bookingView.printReservationTableError(errorMessage);
    }

    public void printChangeReservationTableResult(int reservationId) {
        bookingView.printChangeReservationTableResult(reservationId);
    }

    public void printChangeReservationTableError(String errorMessage){
        bookingView.printReservationTableError(errorMessage);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.reservationTable(orderDate, tableNo, name);
            printReservationTableResult(reservationId);
        }
        catch (RuntimeException e){
            printReservationTableError(e.getMessage());
        }

    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.changeReservationTable(oldReservation, orderDate, tableNo,name);
            printChangeReservationTableResult(reservationId);
        }
        catch (RuntimeException e){
            printChangeReservationTableError(e.getMessage());
        }

    }

    @Override
    public void onCancelReservationTable(int reservationId) {
        try {
            tableModel.cancelReservationTable(reservationId);
            bookingView.printCancelReservationTableResult(reservationId);
        } catch (RuntimeException e) {
            bookingView.printCancelReservationTableError(e.getMessage());
        }
    }
}
