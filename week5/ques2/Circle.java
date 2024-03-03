package week5.ques2;

public class Circle {
    int x ;
    int y ;
    double radius;
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    double area(){
        return Math.PI*this.radius*this.radius;
    }
    double peri(){
        return 2*Math.PI*this.radius;
    }
    public boolean isPointInside(double h, double k) {
        double distance = Math.sqrt(Math.pow((x - h), 2) + Math.pow((y - k), 2));
        return distance <= radius;
    }
}
