//all math classes
import java.util.*;
public class w2q3_Math_func {
    public static void main(String[] args) {
        System.out.print("Enter a number to perform math operations: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("Round : "+Math.round(x));
        System.out.println("Trigonometric tangent : "+Math.tan(x));
        System.out.println("Hyperbolic tangent : "+Math.tanh(x));
        System.out.println("Cube root: "+Math.cbrt(x));
        sc.close();
    }
}