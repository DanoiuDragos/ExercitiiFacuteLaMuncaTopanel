package src.com.basicpart1;

import java.util.Scanner;

//Write a Java program that takes two numbers as input and display the product of two numbers.
//Input first number: 25
//Input second number: 5
public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int primulNr = sc.nextInt();

        System.out.print("Input second number: ");
        int alDoileaNr = sc.nextInt();

        int produs = primulNr * alDoileaNr;
        System.out.println("Produsul celor 2 numere este: %d" + produs);
    }
}

/* Varianta 2 !!

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }

}

Varianta 3 /// FARA afisare de la tastatura !
public class Ex5 {
  static int x = 25;
    static int y = 5;
    }

    public static void main(String[] args) {
        System.out.println(x * y);
    }
}
*/
