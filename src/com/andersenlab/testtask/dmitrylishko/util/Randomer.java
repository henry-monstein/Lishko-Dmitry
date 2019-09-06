package com.andersenlab.testtask.dmitrylishko.util;

import java.util.Random;

public class Randomer {
    public static final int DEFAULT_BOUND = 200;

    public int[] randomIntArray(int amount) {
        return randomIntArray(amount, DEFAULT_BOUND);
    }

    public int[] randomIntArray(int amount, int bound) {
        Random random = new Random();
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }
        return array;
    }


}
