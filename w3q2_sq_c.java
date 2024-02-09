import java.util.Scanner;
public class w3q2_sq_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get sq and cube from 1 to that number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i+": "+ i*i +", "+ i*i*i);
        }
        sc.close();
    }
}
