import java.util.Scanner;

public class w4q1FibNo {
    public static void main(String[] args) {
        //print first m fib numbers using do-while
        //fib -> sum of last two digits , here we're starting fib sequence with 0
        System.out.print("Give a number(m) to print first m numbers of fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        fib(m);
        sc.close();
    }
    static void fib(int n){
        if (n <= 0) {
            System.out.println("Fibonacci series is not defined for non-positive numbers.");
        }
        int prev = 0;
        int curr = 1;
        int i = 1;
        do {
            System.out.print(prev + " ");
            int next = prev + curr;
            prev = curr;
            curr = next;
            i++;
        } while (i <= n);
    }
}
