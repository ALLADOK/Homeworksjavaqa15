package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class AviaSoulsTest {

    @Test

    public void sortFewTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Москва", "Санкт-Петербург", 2000, 20, 21);
        Ticket t2 = new Ticket("Москва", "Санкт-Петербург", 3000, 10, 12);
        Ticket t3 = new Ticket("Москва", "Санкт-Петербург", 1000, 6, 8);
        Ticket t4 = new Ticket("Мурманск", "Владивосток", 5000, 8, 20);
        Ticket t5 = new Ticket("Санкт-Петербург", "Адлер", 2000, 20, 21);
        Ticket t6 = new Ticket("Москва", "Минск", 3000, 20, 22);
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);


        Ticket[] actual = manager.search("Москва", "Санкт-Петербург");
        Ticket[] expected = {t3, t1, t2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void sortFewTickets1() {
        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Москва", "Санкт-Петербург", 2000, 20, 21);
        Ticket t2 = new Ticket("Москва", "Санкт-Петербург", 3000, 10, 12);
        Ticket t3 = new Ticket("Москва", "Санкт-Петербург", 1000, 6, 8);
        Ticket t4 = new Ticket("Мурманск", "Владивосток", 5000, 8, 20);
        Ticket t5 = new Ticket("Санкт-Петербург", "Адлер", 2000, 20, 21);
        Ticket t6 = new Ticket("Москва", "Минск", 3000, 20, 22);
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);


        Ticket[] actual = manager.search("Мурманск", "Владивосток");
        Ticket[] expected = {t4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void sortFewTickets2() {
        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Москва", "Санкт-Петербург", 2000, 20, 21);
        Ticket t2 = new Ticket("Москва", "Санкт-Петербург", 3000, 10, 12);
        Ticket t3 = new Ticket("Москва", "Санкт-Петербург", 1000, 6, 8);
        Ticket t4 = new Ticket("Мурманск", "Владивосток", 5000, 8, 20);
        Ticket t5 = new Ticket("Санкт-Петербург", "Адлер", 2000, 20, 21);
        Ticket t6 = new Ticket("Москва", "Минск", 3000, 20, 22);
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);


        Ticket[] actual = manager.search("Москва", "Екатеринбург");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void sortFewTickets3() {
        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Москва", "Санкт-Петербург", 2000, 20, 22);
        Ticket t2 = new Ticket("Москва", "Санкт-Петербург", 3000, 10, 11);
        Ticket t3 = new Ticket("Москва", "Санкт-Петербург", 1000, 6, 9);
        Ticket t4 = new Ticket("Мурманск", "Владивосток", 5000, 8, 20);
        Ticket t5 = new Ticket("Санкт-Петербург", "Адлер", 2000, 20, 21);
        Ticket t6 = new Ticket("Москва", "Минск", 3000, 20, 22);
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Москва", "Санкт-Петербург", comparator);
        Ticket[] expected = {t2, t1, t3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void sortFewTickets4() {
        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Москва", "Санкт-Петербург", 2000, 20, 22);
        Ticket t2 = new Ticket("Москва", "Санкт-Петербург", 3000, 10, 11);
        Ticket t3 = new Ticket("Москва", "Санкт-Петербург", 1000, 6, 9);
        Ticket t4 = new Ticket("Мурманск", "Владивосток", 5000, 8, 20);
        Ticket t5 = new Ticket("Санкт-Петербург", "Адлер", 2000, 20, 21);
        Ticket t6 = new Ticket("Москва", "Минск", 3000, 20, 22);
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Москва", "Минск", comparator);
        Ticket[] expected = {t6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void sortFewTickets5() {
        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Москва", "Санкт-Петербург", 2000, 20, 22);
        Ticket t2 = new Ticket("Москва", "Санкт-Петербург", 3000, 10, 11);
        Ticket t3 = new Ticket("Москва", "Санкт-Петербург", 1000, 6, 9);
        Ticket t4 = new Ticket("Мурманск", "Владивосток", 5000, 8, 20);
        Ticket t5 = new Ticket("Санкт-Петербург", "Адлер", 2000, 20, 21);
        Ticket t6 = new Ticket("Москва", "Минск", 3000, 20, 22);
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Москва", "Екатеринбург", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

}


