import java.awt.*;
import java.util.Scanner;

public class w4q5Rec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter height of first rectangle: ");
        int h1 = s.nextInt();
        System.out.print("Enter width of first rectangle: ");
        int w1 = s.nextInt();
        System.out.print("Enter x-coordinate of the first rectangle:");
        int x1 = s.nextInt();
        System.out.print("Enter y-coordinate of the first rectangle: ");
        int y1 = s.nextInt();
        System.out.print("Enter height of second rectangle ");
        int h2 = s.nextInt();
        System.out.print("Enter width of second rectangle: ");
        int w2 = s.nextInt();
        System.out.print("Enter x-coordinate of second rectangle: ");
        int x2 = s.nextInt();
        System.out.print("Enter y-coordinate of second rectangle: ");
        int y2 = s.nextInt();
        Rectangle r1 = new Rectangle(x1,y1,w1,h1);
        System.out.println("First rectangle is: " + r1);
        Rectangle r2 = new Rectangle(x2,y2,w2,h2);
        System.out.println("Second rectangle is: " + r2);
        Rectangle r3 = r1.intersection(r2);
        System.out.print("Intersecting rectangle is: " + r3);
        s.close();
    }
}
