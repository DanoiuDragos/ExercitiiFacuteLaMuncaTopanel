package src.orientarePeObiecte;

//Point2D class
//Implement the Point2D class. It should contain:
//      two foat fields : x , y
//      non-arguments constructor which will set x , y fields to 0
//      two-arguments constructor: float x , float y
//      getter methods which will be responsible for returning x , y fields values
//      getXY method which will return x , y values as two-element array
//      setter methods which will be responsible for setting x , y fields values
//      setXY method which will be responsible for settting x and y
//      toString method which should return string in the following format: (x,y)

public class Point2D {
    //two foat fields : x , y
    protected float x,y;

    //non-arguments constructor which will set x , y fields to 0
    public Point2D() {
    }

    //two-arguments constructor: float x , float y
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //getter methods which will be responsible for returning x , y fields values
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }


    //setter methods which will be responsible for setting x , y fields values
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }


    //getXY method which will return x , y values as two-element array
    public float[] getXY() {
        return new float[]{x, y};
    }

    //setXY method which will be responsible for settting x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }


    //toString method which should return string in the following format: (x,y)
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
