package ru.netology.javaqa.Cycles.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthsOfVacations {

    @ParameterizedTest
    @CsvSource({
            "3, 10_000, 3_000, 20_000"
    })
    public void shouldCalculateWithoutVacations(int expected, int income, int expenses, int threshold) {
        MonthsOfVacations service = new MonthsOfVacations();

        int actual = service.calcMonthsOfVacations(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}