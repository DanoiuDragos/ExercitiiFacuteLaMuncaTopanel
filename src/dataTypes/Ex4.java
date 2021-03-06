package src.dataTypes;

import java.util.Scanner;

//Write a Java program to convert minutes into a number of years and days.
//Scrieți un program Java pentru a converti minutele într-un număr de ani și zile.
public class Ex4 {
    public static void main(String[] args) {

        double minutesInYear = 60 * 24 * 365;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double min = sc.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
