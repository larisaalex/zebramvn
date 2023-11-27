package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void ShouldFindaSum() {
        StatsService servise = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 180;
        long actualDay = servise.SumSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test

    public void ShouldFindaAerage() {
        StatsService servise = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 15;
        long actualDay = servise.averSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test

    public void newShouldFindBetweenEnds() {

        StatsService servise = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 8;
        long actualDay = servise.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test
    public void shouldFindBetweenEnds() {
        StatsService servise = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 9;
        long actualDay = servise.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test

    public void ShouldFindaminAerage() {
        StatsService servise = new StatsService();


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        long actualDay = servise.minAverSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test

    public void ShouldFindamaxAerage() {
        StatsService servise = new StatsService();


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        long actualDay = servise.maxAverSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);

    }
}

