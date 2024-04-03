package Week8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Q2 {

    public static class InvalidDateFormatException extends RuntimeException {
        public InvalidDateFormatException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date String (dd-MM-yyyy): ");
        String dateString = sc.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            formatter.parse(dateString);
            System.out.println("Date parsed successfully!");
        } catch (ParseException e) {
            throw new InvalidDateFormatException("Error parsing date: " + e.getMessage());
        } finally {
            System.out.println("DateFormat object closed successfully.");
        }
    }
}
