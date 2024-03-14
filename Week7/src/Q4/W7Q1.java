package Q4;
import java.util.Scanner;
public class W7Q1 {
    public static double DivideByZero(double a, double b){
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        try{
            System.out.println("Dividing the two numbers will result in " + DivideByZero(a, b));
        }
        catch (ArithmeticException e){
            System.out.println("Message: " + e.getMessage());
        }
    }
}
