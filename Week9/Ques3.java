package Week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        List<Integer> convertedIntegers = new ArrayList<>();

        System.out.println("Start Entering values (type 'q' to quit): ");

        while(true) {
            System.out.print(">> ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            } 
            inputs.add(input);
        }

        int successCount = 0;
        for (String input : inputs) {
            try {
                int num = Integer.parseInt(input);
                convertedIntegers.add(num);
                successCount++;
            } catch (NumberFormatException e) {
                System.out.println("Error converting '" + input + "' to integer. It is not a valid integer representation.");
            }
        }

        if (successCount > 0) {
            System.out.println("Successfully converted integers: " + convertedIntegers);
            System.out.println("Total count of successfully converted integers: " + successCount);
        } else {
            System.out.println("No valid integers were entered.");
        }
    }
}
