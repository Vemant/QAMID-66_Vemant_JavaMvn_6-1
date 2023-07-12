package ru.netology.javaqa.services;

public class RestService {
    public int calculateRest(int income, int expense, int threshold) {
        // i - счётчик месяцев
        int earnedMoney = 0;
        int restMonth = 0;
        for (int i = 1; i <= 12; i++) {
            if (earnedMoney >= threshold) {
                earnedMoney = (earnedMoney - expense) / 3;
                restMonth++;
            } else {
                earnedMoney = earnedMoney + income - expense;
            }
        }
        return restMonth;
    }
}
