package org.fasttrackit;

import java.security.PublicKey;

public class CozaLozaWoza {


    }

    public static void main(String[] args) {
        for (int i = 1; i <= 110; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("CozaLoza");
            } else if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.print("Loza");
            } else if (i % 7 == 0) {
                System.out.print("Woza");
            } else {
                System.out.println(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }
    public static void main (String[] args) {
        printCozaLozaWoza(35, 150);
    }
    public void printCozaLozaWoza(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("CozaLoza");
            } else if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.print("Loza");
            } else if (i % 7 == 0) {
                System.out.print("Woza");
            } else {
                System.out.println(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }
}
