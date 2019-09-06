package com.andersenlab.testtask.dmitrylishko.util;

import com.andersenlab.testtask.dmitrylishko.view.Read;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Parser {
    private static final String FILE_NAME = "resources/input.txt";
    private static final String INTEGER_PATTERN = "^\\d+$";

    public int[] parseLineToInt() {
        String[] lines = new Read().readFromFile(FILE_NAME);
        ArrayList<Integer> array = new ArrayList<>();
        for (String line : lines) {
            String[] spitLine = line.split(", ");
            for (String s : spitLine) {
                if (isInt(s)) {
                    array.add(Integer.parseInt(s));
                }
            }
        }
        return toIntArr(array.toArray(new Integer[array.size()]));
    }

    private boolean isInt(String s) {
        return Pattern.matches(INTEGER_PATTERN, s);
    }

    private int[] toIntArr(Integer[] arr){
        int [] array=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            array[i]=arr[i];
        }
        return array;
    }
}
