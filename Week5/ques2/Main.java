package Week5.ques2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        int x_center, y_center;

        System.out.print("Enter center X Coordinate for the circle: ");
        x_center = sc.nextInt();
        System.out.print("Enter Y Coordinate for the circle: ");
        y_center = sc.nextInt();

        while (true) {
            System.out.print("Enter radius for the circle: ");
            radius = sc.nextDouble();
            Circle cir = new Circle( x_center, y_center,radius);
            if (radius < 0) {
                System.out.println("Radius is negative.");
                break;
            }
            else{
                System.out.println("---------------------------------------------");
                System.out.println("Area: " + cir.area());
                System.out.println("Perimeter: " + cir.peri());
                if (cir.isPointInside(x_center, y_center)){
                    System.out.println("Points lie inside the circle");
                }
                else{
                    System.out.println("Points lie outside the circle");
                }
            }
        }
        sc.close();
    }
}
