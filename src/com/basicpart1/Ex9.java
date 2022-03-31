package src.com.basicpart1;

//Write a Java program to compute the specified expressions and print the output.
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//Expected Output
//2.138888888888889
public class Ex9 {
    public static void main(String[] args) {
        Double a = 25.5;
        Double b = 3.5;
        Double c = 40.5;
        Double d = 4.5;

        System.out.println((a * b - b * b) / (c - d));
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }

}
