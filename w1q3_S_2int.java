//sum of 2 integers
import java.util.Scanner;
public class w1q3_S_2int {
    public static void main(String[] args){
        System.out.print("Enter two numbers to get their sum: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print(n1+"+"+n2+"= "+(n1+n2));
        sc.close();
    }
}
