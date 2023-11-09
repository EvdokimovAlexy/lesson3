package ru.geekbrains.lesson8;

import ru.geekbrains.lesson8.Models.TableModel;
import ru.geekbrains.lesson8.Presenters.BookingPresenter;
import ru.geekbrains.lesson8.Presenters.Model;
import ru.geekbrains.lesson8.Presenters.View;
import ru.geekbrains.lesson8.Views.BookingView;

import java.util.Date;

public class program {

    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Иван Иванов");

        view.changeReservationTable(1001, new Date(), 5, "Иван Иванов");

    }

}