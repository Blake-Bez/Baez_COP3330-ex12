 /*
  *  UCF COP3330 Fall 2021 Assignment 12 Solution
  *  Copyright 2021 Blake Baez
  */
 package org.example;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class App 
{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the principal: ");
            double principal = scan.nextDouble();
            System.out.print("Enter the rate of interest: ");
            double interest = scan.nextDouble();
            System.out.print("Enter the number of years: ");
            int years = scan.nextInt();

            double investment = principal * (1 + (interest/100) * years);

            double total = Math.round(investment * 100.0) / 100.0;


            System.out.println("After " + years + " years at " + interest + "%, the investment will be worth " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(total)+".");

        }
    }