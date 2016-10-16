/**
 * Created by pberenstein on 10/8/2016.
 */
public class Circle {
    private double radius;
    private Point center;

    public Circle(Point o, double r){
        radius = r;
        center = o;
    }
    public Circle(double xValue, double yValue, double r){
        center = new Point(xValue,yValue);
        radius = r;
    }
    public Circle(){
        center = new Point(0,0);
        radius = 1;
    }
    public Circle(Circle c){
        center = c.getCenter();
        radius = c.getRadius();
    }

    public Point getCenter(){return center;}
    public void setCenter(Point p){
        center = p;
    }

    public void setX(double x1){
        center.setX(x1);
    }
    public double getX(){
        return center.getX();
    }

    public void setY(double y1){
        center.setY(y1);
    }
    public double getY(){
        return center.getY();
    }

    public void setRadius(double rad){
        radius = rad;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.round(Math.PI * Math.pow(radius, 2)*100.0)/100.0;
    }

    public String toString(){
        return "Center: (" + this.getX() + ", " + this.getY() + ")" +
                "\nRadius: "+this.getRadius();
    }

    public boolean equals(Circle c){
        if ((this.center == c.center) && (this.radius == c.radius)){
            return true;
        }
        return false;
    }

    public boolean doesOverlap(Circle otherCircle){
        double rsum = this.getRadius() + otherCircle.getRadius();

        double distance = Math.hypot((otherCircle.getY()-this.getY()),otherCircle.getX()-this.getX());

        if (rsum > distance){
            return true;
        }
        return false;
    }


}
