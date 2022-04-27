package src.basicpart1;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 % 24 = 5

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int primulNr = sc.nextInt();

        System.out.print("Input second number: ");
        int alDoileaNr = sc.nextInt();


        System.out.println(primulNr + " + " + alDoileaNr + " = " + (primulNr + alDoileaNr));
        System.out.println(primulNr + " - " + alDoileaNr + " = " + (primulNr - alDoileaNr));
        System.out.println(primulNr + " x " + alDoileaNr + " = " + (primulNr * alDoileaNr));
        System.out.println(primulNr + " / " + alDoileaNr + " = " + (primulNr / alDoileaNr));
        System.out.println(primulNr + " % " + alDoileaNr + " = " + (primulNr % alDoileaNr));
    }
}


// Metoda clasica
// public class Main {
// public static void main(String[] args) {
//  Scanner scanner = new Scanner(System.in);
//  System.out.println("Input the first number: ");
//  int n1 = scanner.nextInt();
//  System.out.println("Input the second number: ");
//  int n2 = scanner.nextInt();
//  int sum = n1 + n2;
//  int minus = n1 - n2;
//  int multiply = n1 * n2;
//  int subtract = n1 + n2;
//  int divide = n1 / n2;
//  int rnums = n1 % n2;
//  System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);

// System.out.println("Sum = " + sum);
//  System.out.printf("Sum = %d",sum);
//  System.out.printf("Minus = %d",minus);
//  System.out.printf("Multiply = %d",multiply);
// }