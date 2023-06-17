package ru.netology.javaqa.Cycles.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthsOfVacationsTest {

    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"
    })
    public void shouldCalculateMonthsOfVacations(int income, int expenses, int threshold, int expected) {
        MonthsOfVacations service = new MonthsOfVacations();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}