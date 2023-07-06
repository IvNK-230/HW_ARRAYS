package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int salesForYear(int[] sales) {
        int sum = 0;                               // сумма продаж за год
        for (int value : sales) {
            sum += value;                          // складываем все продажи за год
        }
        return sum;
    }

    public int AverageSales(int[] sales) {
        int sum = 0;                                // сумма продаж за год
        int average = 0;                            // среднее значение продаж за год
        for (int value : sales) {
            sum += value;                           // складываем все продажи за год
        }
        average = sum / sales.length;               // находим среднее за год
        return average;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;                            // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {       // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i;                        // запомним его как максимальный
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;                            // номер месяца с минимальной продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {       // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i;                        // запомним его как минимальный
            }
        }
        return minMonth + 1;
    }

    public int UnderAverage(int[] sales) {
        int month = 0;                               // месяцев, в которых продажи были ниже среднего
        int sum = Arrays.stream(sales).sum();        // сумма продаж за год
        int average = sum / 12;
        for (int i = 0; i < sales.length; i++) {
            if (average > sales[i]) {                // сравниваем каждый месяц с средним
                month++;                             // запомним его как минимальный
            }
        }
        return month;
    }

    public int OverAverage(int[] sales) {
        int sum = OverAverage(sales);
        int average = sum / sales.length;            // среднее значение продаж за год
        int month = 0;                               // месяцев, в которых продажи были ниже среднего
        for (int i = 0; i < sales.length; i++) {
            if (average < sales[i]) {                // сравниваем каждый месяц с средним
                month++;                             // запомним его как минимальный
            }
        }
        return month;
    }

}
