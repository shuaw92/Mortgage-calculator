package com.basic;


import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Mortgage Calculator\nPlease enter values\nPrinciple (1K or above): ");
        Scanner input= new Scanner(System.in);
        double p = input.nextDouble();
        while(true) {
            if(p<1000){
            System.out.println("Please enter a number 1000 or above");
            p = input.nextDouble();
            continue;
            }
            break;
        }
        System.out.print("Annual Interest Rate: ");
        double r = input.nextDouble();
        while(true){
          if(r<1 || r>30) {
            System.out.println("Please enter a number between 1 and 30");
            r = input.nextDouble();
            continue;}
          break;
        }

            double mr = (r / 100) / 12;
            System.out.print("Period (years): ");
            int n = input.nextInt();
        while (true) {
            if (n < 1 || n > 30) {
                System.out.println("Please enter a number between 1 and 30");
                n = input.nextInt();
                continue;
            }
            break;
        }


        n= n*12;
        double rate = Math.pow(1+mr, n);

        //mortgage now

        Double m = (mr*rate)/(rate-1);
        Double mortgage = p*m;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage is "+mortgageFormatted);

    }
}