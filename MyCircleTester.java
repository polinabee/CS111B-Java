/**
 * Created by pberenstein on 9/24/2016.
 */
public class MyCircleTester {
    public static void main(String[] args) {
        MyCircle a = new MyCircle();
        MyCircle b = new MyCircle();
        MyCircle c = new MyCircle();

        a.setX(2.0);
        a.setY(3.0);
        a.setRadius(4.0);

        b.setX(3.0);
        b.setY(4.0);
        b.setRadius(5.0);

        c.setX(3.0);
        c.setY(10.0);
        c.setRadius(3.0);

        System.out.println("Coordinates A are "+a.getX()+", "+a.getY());
        System.out.println("Radius A is "+a.getRadius());
        System.out.println("Area A is "+a.getArea()+"\n");

        System.out.println("Coordinates B are "+b.getX()+", "+b.getY());
        System.out.println("Radius B is "+b.getRadius());
        System.out.println("Area B is "+b.getArea()+"\n");

        System.out.println("Coordinates C are "+c.getX()+", "+c.getY());
        System.out.println("Radius C is "+c.getRadius());
        System.out.println("Area C is "+c.getArea()+"\n");

        if (a.doesOverlap(b)){
            System.out.println("A overlaps with B");
        }
        else{
            System.out.println("A does not overlap with B");
        }
        if (a.doesOverlap(c)){
            System.out.println("A overlaps with C");
        }
        else{
            System.out.println("A does not overlap with C");
        }
        if (b.doesOverlap(c)){
            System.out.println("B overlaps with C");
        }
        else{
            System.out.println("B does not overlap with C");
        }
    }
}
