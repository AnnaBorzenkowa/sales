package ru.netology.stats;

public class StatsService {
    public long getSumSales(long[] sales){
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long getMidSales(long[] sales){
        long sumSales = getSumSales(sales);
        long midSales = sumSales / 12;

        return midSales;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
    public int getMinMonth(long[] sales){
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long salesUnderMid (long[] sales){
        long countMonths = 0;
        for (long sale : sales) {
            if (sale < getMidSales(sales)) {
                countMonths ++;
            }

        }
        return countMonths;
    }

    public long salesAfterMid (long[] sales){
        long countMonths = 0;
        for (long sale : sales) {
            if (sale > getMidSales(sales)) {
                countMonths ++;
            }

        }
        return countMonths;
    }



}


