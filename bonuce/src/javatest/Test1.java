package javatest;

import java.math.BigDecimal;

/**
 * Created by tenghuanhe on 2015/10/26.
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(2.0 - 1.1);
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));

        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        final long MICROS_PER_DAYL = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAYL = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAYL / MILLIS_PER_DAYL);

        System.out.println(12345 + 54321);
        System.out.println(12345 + 5432l);
    }
}
