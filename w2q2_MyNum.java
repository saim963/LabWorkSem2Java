import java.util.Scanner;
public class w2q2_MyNum {

    static int ceil(double value){
        if(value<0) return (int) (value);
        return (int)value+1;
    }
    static int floor(double value){
        if(value<0) return (int) (value-1);
        return (int)value;
    }
    static int round(double value){
        return floor(value + 0.5d);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number to perform operations: ");
        double num = sc.nextDouble();
        while(true) {
            System.out.println("Choose operation to perform (R,F,C):");
            char ch = sc.next().charAt(0);
            if (ch == 'x' || ch == 'X') break;
            switch (ch) {
                case 'r':
                case 'R':
                    System.out.println("Round value: "+round(num));
                    break;
                case 'c':
                case 'C':
                    System.out.println("Ceil value: "+ceil(num));
                    break;
                case 'f':
                case 'F':
                    System.out.println("Floor value: "+floor(num));
                    break;
                default:
                    System.out.println("Invalid Function call!! Try to use R,C,F or X");
            }
        }
        sc.close();
    }
}