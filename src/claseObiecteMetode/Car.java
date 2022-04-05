package src.claseObiecteMetode;

public class Car {
   private String color;
   private String fuelType;
   private int engineCapacity;

//Constructor fara parametrii
    public Car() {
    }
//Constructor cu parametrii
    public Car(String color, String fuelType, int engineCapacity) {
        this.color = color;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void start(){
        System.out.println("Car started!");
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}