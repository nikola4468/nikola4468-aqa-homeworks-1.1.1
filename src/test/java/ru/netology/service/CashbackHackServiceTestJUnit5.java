package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestJUnit5 {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldRemain() {
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected,actual);
    }

    @Test
    void shouldRemain999() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void shouldRemain1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void shouldRemain1001() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected,actual);
    }
}