// import java.lang.Math;
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

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number to perform operations: ");
        double num = sc.nextDouble();
        System.out.println(Math.round(num));
        // System.out.println(ceil(num));
        // System.out.println(floor(num));
        sc.close();
    }
}
