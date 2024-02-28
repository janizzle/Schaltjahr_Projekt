package org.example;

import javax.swing.*;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Gib ein Jahr ein: "));

        
        
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(STR."\{year} ist kein Schaltjahr, weil: \{year} ist ein Jahrhundert");
            return;
        }

        if (year % 4 == 0) {
            System.out.println(STR."\{year} ist ein Schaltjahr");
            return;
        }

        System.out.println(STR."\{year} ist kein Schaltjahr, weil: Nicht durch 4 Teilbar");
    }
}