package ru.savrey.lesson06;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;

public class Main {
    public static void main(String[] args) {
        // Задание 1. DescriptiveStatistics
        DescriptiveStatistics ds = new DescriptiveStatistics();

        ds.addValue(25);
        ds.addValue(5);
        ds.addValue(2.68);
        ds.addValue(89.3);
        ds.addValue(14);
        ds.addValue(22.4);

        double minValue = ds.getMin();
        double maxValue = ds.getMax();
        double summa = ds.getSum();
        double mean = ds.getMean();

        System.out.printf("min = %.2f, max = %.2f, sum = %.2f, mean = %.2f",
                minValue, maxValue, summa, mean);
        System.out.println();
        // ArithmeticUtils
        long fact = ArithmeticUtils.factorial(10);
        int lcm = ArithmeticUtils.lcm(8, 16);
        int gcd = ArithmeticUtils.gcd(52, 44);
        boolean isPower = ArithmeticUtils.isPowerOfTwo(13);

        System.out.printf("10! = %d, lcm(8, 16) = %d, gcd(52, 44) = %d, isPower(13) is %b",
                fact, lcm, gcd, isPower);
    }
}


