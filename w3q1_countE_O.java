
//count number of even or odd entries
import java.util.Scanner;

public class w3q1_countE_O {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter several  numbers, press 'q' to quit:");
        String x = sc.next();
        while(!x.equals("q")){
            int input = Integer.parseInt(x);
            if(input%2==0)  even++;
            else    odd++;
            x = sc.next();
        }
        System.out.println("Even inputs: "+even);
        System.out.print("Odd inputs: "+odd);
        sc.close();
    }
}