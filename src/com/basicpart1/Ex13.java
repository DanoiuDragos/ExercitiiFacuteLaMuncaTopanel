package src.com.basicpart1;

//Scrieți un program Java pentru a imprima aria și perimetrul unui dreptunghi.
//Test Data:
//Width = 5.6 Height = 8.5

import java.util.Scanner;

//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Width is: ");
        double width = sc.nextDouble();
        System.out.print("Height is: ");
        double height = sc.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
}

