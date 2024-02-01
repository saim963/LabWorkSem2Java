import java.util.Scanner;
import java.lang.Math;
public class w2q2_MyNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter  a number to perform operations: ");
        double num = sc.nextDouble();
        System.out.println(Math.round(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.floor(num));
    }
}
