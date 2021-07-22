package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int leftSeconds = seconds - hours * 3600 - minutes * 60;

        System.out.println(hours + ":" + minutes + ":" + leftSeconds);




    }
}
