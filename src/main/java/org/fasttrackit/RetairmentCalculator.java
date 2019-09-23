package org.fasttrackit;

import java.time.LocalDate;
import java.util.Scanner;

public class RetairmentCalculator {

    public static void main(String[] args) {
        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("At what age would you like to retire?");
        int retairementAge = scanner.nextInt();

        LocalDate currentDate = LocalDate.now();
        int remainingYears = retairementAge - age;

        System.out.println("You have" + remainingYears + "years left until retirement.");
        System.out.println("It's" + currentDate.getYear() + ", so you can retaire in" +
                (currentDate.getYear() + remainingYears));


    }
}
