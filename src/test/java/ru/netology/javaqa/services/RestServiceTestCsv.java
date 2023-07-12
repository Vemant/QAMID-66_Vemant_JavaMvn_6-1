package ru.netology.javaqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTestCsv {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    void shouldCalculateMonthsOfRest(int income, int expense, int threshold, int expected) {
        RestService service = new RestService();

        int actual = service.calculateRest(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
}





