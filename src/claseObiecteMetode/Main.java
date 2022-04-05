package src.claseObiecteMetode;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Black", "gasoline", 1500);
        car1.start();
        System.out.println("Culoarea masinii mele este: " + car1.getColor());
        System.out.println(car1.getEngineCapacity());
        car1.setColor("Red");
        System.out.println("Culoarea masinii mele este: " + car1.getColor());
        Car car2 = new Car();
        System.out.println(car2);
    }
}
