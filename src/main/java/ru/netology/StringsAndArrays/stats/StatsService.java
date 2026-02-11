package ru.netology.StringsAndArrays.stats;

public class StatsService {

    // 1. Сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // 2. Средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    // 3. Номер месяца с максимальными продажами (последний)
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // 4. Номер месяца с минимальными продажами (последний)
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // 5. Количество месяцев ниже среднего
    public int monthsBelowAverage(long[] sales) {
        int count = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // 6. Количество месяцев выше среднего
    public int monthsAboveAverage(long[] sales) {
        int count = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
