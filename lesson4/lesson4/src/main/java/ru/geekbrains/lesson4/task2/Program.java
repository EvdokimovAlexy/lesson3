package ru.geekbrains.lesson4.task2;

import java.util.Collection;
import java.util.Date;

public class Program {

/**
 * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
 * <p>
 * 1.  Предусловия.
 * 2.  Постусловия.
 * 3.  Инвариант.
 * 4.  Определить абстрактные и конкретные классы.
 * 5.  Определить интерфейсы.
 * 6.  Реализовать наследование.
 * 7.  Выявить компоненты.
 * 8.  Разработать Диаграмму компонент использую нотацию UML 2.0. Общая без деталей.
 */
public class Program {
    public static void main(String[] args) {
        Core core = new Core();
        MobileApp app = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());

        if (app.buyTicket("11000000221")) {
            System.out.println("Клиент успешно купил билет");
            app.searchTicket(new Date());
            Collection<Ticket> tickets = app.getTickets();
            if (busStation.checkTicket(tickets.stream().findFirst().get().getQrcode())) {
                System.out.println("Клиент успешно прошёл в автобус");
            }
        }
    }
}
