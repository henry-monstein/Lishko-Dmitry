package com.andersenlab.testtask.dmitrylishko.run;

import com.andersenlab.testtask.dmitrylishko.model.logic.Task;
import com.andersenlab.testtask.dmitrylishko.view.Printer;
import com.andersenlab.testtask.dmitrylishko.view.Read;

public class Menu {
    private Printer pr;
    private Read rd;

    public Menu() {
        this.pr = new Printer();
        this.rd = new Read();
    }

    public String taskChoice() {
        int choice=-1;
        while (choice!=0) {
            pr.printToConsole("Choose a task:\n" +
                    "1 - if the entered number is greater than 7, then print \"Привет\"\n" +
                    "2 - if the entered name matches \"Вячеслав\", then print \"Привет, Вячеслав\", if not, print \"Нет такого имени\"\n" +
                    "3 - display array elements multiple of 3\n" +
                    "0 - exit");
            choice = rd.readIntFromConsole();
            switch (choice) {
                case 1: {
                    pr.printToConsole("Enter number: ");
                    new Task().task1();
                    break;
                }
                case 2: {
                    pr.printToConsole("Enter name: ");
                    new Task().task2();
                    break;
                }
                case 3: {
                    new Task().task3();
                    break;
                }
                default: {
                    break;
                }
            }
        }
        return "\nEnd of program.";
    }
}
