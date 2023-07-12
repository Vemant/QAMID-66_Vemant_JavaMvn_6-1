package ru.netology.javaqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
    @Test
    void shouldCalculateMonthsOfRestPoor() {
        RestService service = new RestService();

        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculateRest(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsOfRestRich() {
        RestService service = new RestService();

        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculateRest(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
}


