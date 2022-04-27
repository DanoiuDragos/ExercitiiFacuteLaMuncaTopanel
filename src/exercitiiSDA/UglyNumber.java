package src.exercitiiSDA;

import java.util.Scanner;


// Verificati daca un numar introdus de la tastatura este 'ugly number'.
// Ugly number = este compus doar prin inmultirea cu 2 3 sau 5;
// ex 10 = 2*5 sau 15 = 3*5 sau 30 = 2*3*5 sau 50=2*5*5
//hit: utiliati instructiunea while
public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the no = ");
        int n = sc.nextInt();

        if (n <=0) {
            System.out.println("Insert a correct number");
        }

        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.print("Is not an ugly number");
                return;
            }
        }
        System.out.print("Is an ugly number");
    }

}
