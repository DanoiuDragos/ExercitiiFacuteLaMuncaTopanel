package src.basicpart1;


//Write a Java program to print the area and perimeter of a circle
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586
public class Ex11 {
    public static void main(String[] args) {
        double radius = 7.5;
        double perimetru = (2 * Math.PI * radius);
        double aria = (Math.PI * Math.pow(radius, 2));

        System.out.println("Perimetrul este: " + perimetru);
        System.out.println("Aria este: " + aria);

    }
}
