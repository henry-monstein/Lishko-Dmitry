package com.andersenlab.testtask.dmitrylishko.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Read {
    public String[] readFromFile(String fileName) {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

            list = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list.toArray(new String[list.size()]);
    }

    public int readIntFromConsole(){
        int n;
        while (true){
            try {
                n=new Scanner(System.in).nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("InputMismatchException: Input integer.");
            }
        }
        return n;
    }

    public String readFromConsole(){
        return new Scanner(System.in).next();
    }
}
