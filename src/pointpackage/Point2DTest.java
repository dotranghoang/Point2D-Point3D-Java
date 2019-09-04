package pointpackage;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(10.0 , 20.0);
        System.out.println(point2D);
        point2D.setX(2.5);
        System.out.println(point2D);
        point2D.setY(15.5);
        System.out.println(point2D);
        System.out.println(point2D.getXY());
    }
}
