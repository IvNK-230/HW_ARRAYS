package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindSumSalesOfYear() {
        StatsService service = new StatsService();

        int expected = 180;
        int actualSum = service.salesForYear(sales);

        Assertions.assertEquals(expected, actualSum);

    }

    @Test
    public void shouldFindAverageSalesOfYear() {
        StatsService service = new StatsService();

        int expected = 15;
        int actualAverage = service.AverageSales(sales);

        Assertions.assertEquals(expected, actualAverage);

    }

    @Test
    public void shouldFindMaxSalesOfMonth() {
        StatsService service = new StatsService();

        int expected = 8;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expected, actualMax);
    }

    @Test
    public void shouldFindMinSalesOfMonth() {
        StatsService service = new StatsService();

        int expected = 9;
        int actualMin = service.minSales(sales);

        Assertions.assertEquals(expected, actualMin);
    }

    @Test
    public void shouldFindUnderAverageSalesOfYear() {
        StatsService service = new StatsService();

        int expected = 5;
        int actualUnderAverage = service.UnderAverage(sales);

        Assertions.assertEquals(expected, actualUnderAverage);
    }

    @Test
    public void shouldFindOverAverageSalesOfYear() {
        StatsService service = new StatsService();

        int expected = 5;
        int actualOverAverage = service.UnderAverage(sales);

        Assertions.assertEquals(expected, actualOverAverage);
    }
}
