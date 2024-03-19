//java program for finding the sum, difference, product, quotient, minimum and maximum of any two integers
import java.util.Scanner;
public class w2q1_Math_Opr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to perform such operations {+, -, *, /, m(min), M(Max)}:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter the operation you want to perform: +, -, *, /, m(min), M(Max): ");
        while(true){
            char opr = sc.next().charAt(0);
            if(opr=='X'||opr=='x')  break;
            switch (opr) {
                case '+':
                    System.out.println("sum: "+(x + y));
                    break;
                case '-':
                    System.out.println("difference: "+(x - y));
                    break;
                case '*':
                    System.out.println("product: "+(x * y));
                    break;
                case '/':
                    if(y!=0) System.out.println("quotient: "+(x / y));
                    else System.out.println("Denominator cannot be 0");
                    break;
                case 'm':
                    if (x < y) {
                        System.out.println("minimum: "+x);
                    } else
                        System.out.println("minimum: "+y);
                    break;
                case 'M':
                    if (x > y) {
                        System.out.println("Maximum: "+x);
                    } else
                        System.out.println("Maximum: "+y);
                    break;
                default:
                    System.out.println("Invalid input!!");
                    break;
            }
        }
    }
}
