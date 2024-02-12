import java.util.Scanner;

public class w3q5_Floyd {
    static void numeric(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
    static void diagonal(int n){
        int bi = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(bi+" ");
                bi = -(bi-1);
            }
            System.out.println();
        }
    }
    static void binary(int n){
        for(int i=1; i<=n; i++){
            int bi = i % 2; // Determine if it's an even or odd line
            for (int j = 1; j <= i; j++) {
                System.out.print(bi + " ");
                bi = 1 - bi; // Toggle between 0 and 1
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // numeric(n);
        binary(n);
        // diagonal(n);
        sc.close();
    }
}
