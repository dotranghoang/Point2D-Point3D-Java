package pointpackage;

import java.util.Arrays;

public class Point2D {
    private double x = 0.0, y = 0.0;
    private double arrXY[] = new double[2];

    public Point2D() {
    }

    public Point2D(double x , double y) {
        this.x = x ;
        this.y = y ;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x ;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x , double y) {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
       arrXY[0] = x;
       arrXY[1] = y;
       return "Array {x,y} = " + Arrays.toString(arrXY);
    }

    @Override
    public String toString() {
        return "Point 2d with x = " + getX() + " y = "+getY();
    }
}
