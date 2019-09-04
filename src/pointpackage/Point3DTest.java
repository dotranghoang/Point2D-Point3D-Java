package pointpackage;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(12.0 , 13.1 , 12.4);
        System.out.println(point3D);
        System.out.println(point3D.getXYZ());
        point3D.setX(11.4);
        System.out.println(point3D);
        point3D.setY(14.5);
        System.out.println(point3D);
        point3D.setZ(19.0);
        System.out.println(point3D);
        System.out.println(point3D.getXYZ());

    }
}
