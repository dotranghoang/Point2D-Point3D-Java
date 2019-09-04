package pointpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends Point2D {
    private double z = 0.0;
    private double arrayXYZ[] = new double[3];

    public Point3D(){
    }

    public Point3D(double x , double y , double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x , double y , double z) {
        super.setXY(x, y);
        this.z = z;
    }

    public String getXYZ() {
        arrayXYZ[0] = getX();
        arrayXYZ[1] = getY();
        arrayXYZ[2] = getZ();
        return "Array {x,y,z} = " + Arrays.toString(arrayXYZ);
    }

    @Override
    public String toString() {
        return "Point3D with z = "+ getZ() + " is subclass of "+ super.toString();
    }
}
