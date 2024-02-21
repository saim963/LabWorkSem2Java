import java.util.Scanner;

public class w4q4spl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit number: ");
        int num = sc.nextInt();
        while (num > 0){
            int rem = num % 10;
            System.out.println("One of the digit of the number is: " + rem);
            num = num / 10;
        }
    }
}
