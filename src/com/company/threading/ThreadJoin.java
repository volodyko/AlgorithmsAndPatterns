package com.company.threading;

import java.math.BigDecimal;

/**
 * Created by volodyko on 20.06.16.
 */
public class ThreadJoin {

    private static final BigDecimal FOUR = BigDecimal.valueOf(4);

    private static final int roundingMode = BigDecimal.ROUND_HALF_EVEN;

    private static BigDecimal result;

    public static void main(String[] args) {
        Runnable r = () -> {
            result = computePi(50000);
        };
    }

    private static BigDecimal computePi(int i) {
        return null;
    }
}
