package src.com.basicpart1;

import java.util.Scanner;

//Write a Java program that takes a number as input and prints its multiplication table upto 10
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(n + " x " + (i+1) + " = " + (n * (i+1)));
        }
    }
}

//VARIANTA 2
///public class Main {
//
// public static void main(String[] args) {
//  Scanner in = new Scanner(System.in);
//  System.out.println("Input the Number: ");
//  int n = in .nextInt();

//  for (int i = 1; i <= 10; i++) {
//   System.out.println(n + "*" + i + " = " + (n * i));
//  }
// }
//}