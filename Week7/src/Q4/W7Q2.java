package Q4;
import java.util.Scanner;
public class W7Q2 {
    public static double DivideByZero(double a, double b){
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!! Re-run the program!!");
        }
        return a / b;
    }
    public static void main(String[] args) throws IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Dividing the two numbers will result in " + DivideByZero(a, b));
    }
}