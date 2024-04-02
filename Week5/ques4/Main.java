package Week5.ques4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sales value: ");
        double sl = in.nextDouble();
        Commission cm1 = new Commission(sl);
        System.out.println("Commission is: " + cm1.commission());
        in.close();
    }
}
