
//java program for finding the sum, difference, product, quotient,minimum and maximum of any two integers
import java.util.Scanner;
public class w2q1_Math_Opr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to perform the operations: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Enter the operation you want to perform: +, -, *, /, m(min), M(Max): ");
        char opr = sc.next().charAt(0);
        switch (opr) {
            case '+':
                System.out.print("sum: "+(x + y));
                break;
            case '-':
                System.out.print("difference: "+(x - y));
                break;
            case '*':
                System.out.print("product: "+(x * y));
                break;
            case '/':
                System.out.print("qoutient: "+(x / y));
                break;
            case 'm':
                if (x < y) {
                    System.out.print("minimum: "+x);
                } else
                    System.out.print("minimum: "+y);
                break;
            case 'M':
                if (x > y) {
                    System.out.print("Maximum: "+x);
                } else
                    System.out.print("Maximum: "+y);
                break;

            default:
                System.out.print("Invalid input!!");
                break;
        }
        sc.close();
    }
}
