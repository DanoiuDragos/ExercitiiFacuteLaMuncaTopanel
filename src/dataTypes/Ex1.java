package src.dataTypes;

//Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//Scrieți un program Java pentru a converti temperatura din Fahrenheit în grade Celsius.
//Test Data
//Input a degree in Fahrenheit: 212

import java.util.Scanner;

//Expected Output:
//212.0 degree Fahrenheit is equal to 100.0 in Celsius
//Convertiți 68 grade Fahrenheit în grade Celsius:
//T (° C) = (68 ° F - 32) × 5/9 = 20 ° C
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double grade = (fahrenheit - 32) *5 / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + grade + " in Celsius");
    }
}
