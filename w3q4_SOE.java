//sum of all even number till n
import java.util.Scanner;
public class w3q4_SOE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a number: ");
        int n = sc.nextInt();
        int sumEven = 0;
        for(int i=0; i<=n; i+=2){
            sumEven += i;
            System.out.println(sumEven+" ");
        }
        System.out.print("Sum of all evens: "+sumEven);
        sc.close();
    }
}
