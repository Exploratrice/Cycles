package ru.netology.javaqa.Cycles.services;

public class MonthsOfVacations {

    public int calculate(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int threshold = 0; // накопления
        for (int month = 0; month < 12; month++) {
            if (threshold >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = income - expenses;
            } else {
                threshold = ((threshold - expenses) / 3);
            }
        }
        return count;
    }
}