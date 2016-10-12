/**
 * Created by pberenstein on 9/24/2016.
 */
public class MyCircle {
    private double radius;
    private double x;
    private double y;

    public void setRadius(double rad){
        radius = rad;
    }

    public void setX(double x1){
        x = x1;
    }

    public void setY(double y1){
        y = y1;
    }

    public double getRadius(){
        return radius;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getArea(){
        return Math.round(Math.PI * Math.pow(radius, 2)*100.0)/100.0;
    }

    public boolean doesOverlap(MyCircle otherCircle){
        double rsum = this.getRadius() + otherCircle.getRadius();
        double xdist = Math.pow(otherCircle.getX()-this.getX(),2);
        double ydist = Math.pow(otherCircle.getY()-this.getY(),2);
        double distance = Math.sqrt(xdist + ydist);

        if (rsum > distance){
            return true;
        }
        return false;
    }
}
