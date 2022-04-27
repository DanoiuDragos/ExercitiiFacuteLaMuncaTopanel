package src.basicpart1;


//Scrieți un program Java care ia trei numere ca intrare pentru a calcula
// și tipări media numerelor.
public class Ex12 {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 2;

        double mediaAritmetica = (a + b + c) / 3;
        System.out.println("Media numerelor este: " + mediaAritmetica);
    }
}


/* VARIANTA 2 !!
    public static void main(String[] args) {
        double num = 0;
        double x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number(n) you want to calculate the average: ");
        int n = sc.nextInt();
        while (x <= n) {
            System.out.println("Input number " + "("+ (int) x +")" + ":");
            num += sc.nextInt();
            x += 1;
        }
        double avgn = (num / n);

        System.out.println("Average:" + avgn);
    }
}
 */