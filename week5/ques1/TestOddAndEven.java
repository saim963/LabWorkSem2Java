package week5.ques1;

import java.util.Scanner;

public class TestOddAndEven {
    public static void main(String[] args) {
        OddAndEven obj1 = new OddAndEven();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter several  numbers, press 'q' to quit:");
        String x = sc.next();
        while (!x.equals("q") && !x.equals("Q")) {
            try {
                int input = Integer.parseInt(x);
                obj1.addNumber(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + x + " is neither a number nor a exit command");
            }
            x = sc.next();
        }
        System.out.println(obj1.conToStr());
        sc.close();
    }
}
