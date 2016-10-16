/**
 * Created by pberenstein on 10/8/2016.
 */
public class MyCircleTester {
    public static void main(String[] args) {

        //2 argument constructor:
        Point a = new Point(2.0,3.0);
        Circle ac = new Circle(a,4.0);

        //3 argument constructor:
        Circle b = new Circle(2.0,4.0,5.0);
        b.setX(3.0);

        //2 argument constructor, alternate:
        Circle c = new Circle(new Point(2.0, 10.0), 3.0);

        //no argument constructor:
        Circle d = new Circle();

        //copy constructor:
        Circle e = new Circle(d);

        //toString methods
        System.out.println(ac.toString());
        System.out.println("Area A is "+ac.getArea()+"\n");

        System.out.println(b.toString());
        System.out.println("Area B is "+b.getArea()+"\n");

        System.out.println(c.toString());
        System.out.println("Area C is "+c.getArea()+"\n");

        System.out.println(d.toString());
        System.out.println("Area D is "+d.getArea()+"\n");

        System.out.println(e.toString());
        System.out.println("Area E is "+e.getArea()+"\n");

        //doesOverlap methods on first 3 circles
        if (ac.doesOverlap(b)){
            System.out.println("A overlaps with B");
        }
        else{
            System.out.println("A does not overlap with B");
        }
        if (ac.doesOverlap(c)){
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

        //equals methods
        if (b.equals(d)){
            System.out.println("B equals C");
        }
        else{
            System.out.println("B does not equal C");
        }
        if (c.equals(d)){
            System.out.println("C equals D");
        }
        else{
            System.out.println("C does not equal D");
        }
        if (e.equals(d)){
            System.out.println("E equals D");
        }
        else{
            System.out.println("E does not equal D");
        }
    }
}
