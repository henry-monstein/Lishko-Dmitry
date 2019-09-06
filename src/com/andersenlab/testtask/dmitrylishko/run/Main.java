package com.andersenlab.testtask.dmitrylishko.run;

import com.andersenlab.testtask.dmitrylishko.view.Printer;
import com.andersenlab.testtask.dmitrylishko.view.Read;

public class Main {
    public static void main(String[] args) {
        Printer pr=new Printer();
        Read rd=new Read();
        Menu mn=new Menu();
        pr.printLogo();
        mn.taskChoice();
    }
}
