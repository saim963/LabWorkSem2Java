import java.util.Scanner;

public class Main {
    static boolean isvalid(int n) {
        return n >= 0 && n <= 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three digits from [0-9]");
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }

        if (isvalid(num[0]) && isvalid(num[1]) && isvalid(num[2])) {
            System.out.println("Possible Combinations");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (i != j && j != k && k != i) {
                            System.out.println(num[i] + "" + num[j] + "" + num[k]);
                        }
                    }
                }
            }
        } else {
            System.out.println("INVALID! enter three digits from [0-9]");
        }
    }

}