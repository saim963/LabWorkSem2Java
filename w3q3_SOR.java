import java.util.Scanner;
public class w3q3_SOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get reciprocal from 1 to n: ");
        int n = sc.nextInt();
        double sum=0;
        for(int i=1; i<=n; i++){
            sum += (1.0/i);
        }
        System.out.println(sum);
        sc.close();
    }
}
