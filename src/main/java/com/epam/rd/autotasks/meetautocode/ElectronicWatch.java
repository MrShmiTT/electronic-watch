package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;
import java.lang.String;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int leftSeconds = seconds - hours * 3600 - minutes * 60;

        String h = hours + "";
        String m = minutes + "";
        String ls = leftSeconds + "";

//        String str = String.format("%tI:%tM:%tS", hours, minutes, leftSeconds);

//        System.out.printf("%d:%0d:%0d", hours, minutes, leftSeconds);
        System.out.println(("0" + h).substring(h.length()) + ":" + ("00" + m).substring(m.length()) + ":" + ("00" + ls).substring(ls.length()));
    }
}
