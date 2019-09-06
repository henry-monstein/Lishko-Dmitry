package com.andersenlab.testtask.dmitrylishko.model.logic;

import com.andersenlab.testtask.dmitrylishko.util.Parser;
import com.andersenlab.testtask.dmitrylishko.util.Randomer;
import com.andersenlab.testtask.dmitrylishko.view.Printer;
import com.andersenlab.testtask.dmitrylishko.view.Read;

import java.util.Arrays;

public class Task {
    public static final String FILE_NAME="resources/output.txt";
    public static final String NAME = "Вячеслав";
    private Printer pr;
    private Read rd;


    public Task() {
        this.pr = new Printer();
        this.rd = new Read();
    }

    public void task1() {
        pr.printToConsole(rd.readIntFromConsole() > 7 ? "Привет" : "");
    }

    public void task2() {
        pr.printToConsole(rd.readFromConsole().equals(NAME) ? "Привет, " + NAME : "Нет такого имени");
    }

    public void task3() {
        pr.printToConsole("Enter:\n" +
                "1 - console input\n" +
                "2 - file input\n" +
                "3 - random array input");
        switch (rd.readIntFromConsole()) {
            case 1: {
                pr.printToConsole("Enter the size of the array and after the sequence of elements: ");
                int[] array = new int[rd.readIntFromConsole()];
                for (int i = 0; i < array.length; i++) {
                    array[i] = rd.readIntFromConsole();
                }
                pr.printToConsole(task3Output(array));
                break;
            }
            case 2: {
                pr.printToConsole("Read from \"resources/input.txt\"");
                int[] array = new Parser().parseLineToInt();
                pr.printToConsole(Arrays.toString(array));
                pr.printToFile(FILE_NAME, task3Output(array));
                break;
            }
            case 3: {
                pr.printToConsole("Enter the size of the array: ");
                int[] array = new Randomer().randomIntArray(rd.readIntFromConsole());
                pr.printToConsole(Arrays.toString(array));
                pr.printToConsole(task3Output(array));
                break;
            }
            default: {
                break;
            }
        }
    }

    private String task3Output(int[] array) {
        StringBuilder output = new StringBuilder("These numbers are a multiple of 3: ");
        for (int number : array) {
            output.append(number % 3 == 0 ? number + ", " : "");
        }
        return output.toString();
    }
}
