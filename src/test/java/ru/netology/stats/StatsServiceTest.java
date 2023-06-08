package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldFindSummary() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.getSumSales(sales);

        Assertions.assertEquals(expectedSum,actualSum);
    }

    @Test
    public void shouldFindMiddle() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMid = 15;
        long actualMid = service.getMidSales(sales);

        Assertions.assertEquals(expectedMid, actualMid);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMax = 8;
        long actualMax = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMax,actualMax);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMin = 9;
        long actualMin = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void shouldFindUnderMid(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedUnder = 5;
        long actualUnder = service.salesUnderMid(sales);

        Assertions.assertEquals(expectedUnder, actualUnder);
    }

    @Test
    public void shouldFindAfterMid(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAfter = 5;
        long actualAfter = service.salesAfterMid(sales);

        Assertions.assertEquals(expectedAfter, actualAfter);
    }



}
