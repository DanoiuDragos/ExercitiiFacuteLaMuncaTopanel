package src.exercitiiInternet;

public class TestCircle {
    public static void main(String[] args) {

        //Declarați o instanță a clasei Circle numită c1.
        //Construiți instanța c1 invocând constructorul „implicit”
        //care își setează raza și culoarea la valoarea lor implicită.

        Circle c1 = new Circle();

        // Invoke public methods on instance c1, via dot operator.
        // Invocă metode publice pe instanța c1, prin operatorul punct.
        System.out.println("Cercul are raza: " + c1.getRadius() + " si area este: " + c1.getArea());

        // Declarați o instanță de cerc de clasă numită c2.
        // Construiți instanța c2 invocând al doilea constructor
        // cu raza dată și culoarea implicită.

        Circle c2 = new Circle(5.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
    }
}
