import java.util.Scanner;

public class w4q3SuPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Sum of given four numbers: "+sum(a,b,c,d));
        System.out.print("Product of given four numbers: "+product(a,b,c,d));
        sc.close();
    }
    static long sum(int a, int b, int c, int d){
        return (long)a+b+c+d;
    }
    static long product(int a, int b, int c, int d){
        return (long) a *b*c*d;
    }
}
