package ru.netology.StringsAndArrays.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    private final StatsService service = new StatsService();

    private final long[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    void shouldCalculateSumSales() {
        assertEquals(180, service.sumSales(sales));
    }

    @Test
    void shouldCalculateAverageSales() {
        assertEquals(15, service.averageSales(sales));
    }

    @Test
    void shouldFindMaxSalesMonth() {
        assertEquals(8, service.maxSales(sales));
    }

    @Test
    void shouldFindMinSalesMonth() {
        assertEquals(9, service.minSales(sales));
    }

    @Test
    void shouldCountMonthsBelowAverage() {
        assertEquals(5, service.monthsBelowAverage(sales));
    }

    @Test
    void shouldCountMonthsAboveAverage() {
        assertEquals(5, service.monthsAboveAverage(sales));
    }
}

