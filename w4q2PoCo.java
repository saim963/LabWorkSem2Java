import java.util.Scanner;
public class w4q2PoCo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digits (0-9) separated by spaces:");
        int digit1 = sc.nextInt();
        int digit2 = sc.nextInt();
        int digit3 = sc.nextInt();
        if (digit1 < 0 || digit1 > 9 || digit2 < 0 || digit2 > 9 || digit3 < 0 || digit3 > 9) {
            System.out.println("Please enter digits between 0 and 9.");
        } else {
            int[] digits = new int[] {digit1, digit2, digit3};
            comb(digits, 0);
        }
        sc.close();
    }
    public static void comb(int[] digits, int curr) {
        if (curr == digits.length - 1) {
            printArray(digits);
        } else {
            for (int i = curr; i < digits.length; i++) {
                int temp = digits[curr];
                digits[curr] = digits[i];
                digits[i] = temp;
                comb(digits, curr + 1);
                temp = digits[curr];
                digits[curr] = digits[i];
                digits[i] = temp;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j);
        }
        System.out.println();
    }
}
