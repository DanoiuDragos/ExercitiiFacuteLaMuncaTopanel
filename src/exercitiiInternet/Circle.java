package src.exercitiiInternet;


// * Clasa Circle modelează un cerc cu o rază și o culoare.
public class Circle {

    //// variabilă de instanță privată, nu este accesibilă din afara acestei clase
    private double radius;
    private String color;


    //Constructori (supraîncărcați)
    //Construiește o instanță Circle cu valoarea implicită pentru rază și culoare
    // Default constructor

    public Circle() {
        radius = 1.0;
        color = "Red";
    }

    //Construiește o instanță Circle cu raza dată și culoarea implicită
    public Circle(double r) {  // 2nd constructor
        radius = r;
        color = "red";
    }

    // Returneaza raza
    public double getRadius() {
        return radius;
    }

    //Returnează zona acestei instanțe Circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
