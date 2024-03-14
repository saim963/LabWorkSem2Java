//Fahrenheit to Celsius using formula -> C = F – 32 / 1.8
import java.util.Scanner;
public class w1q4_Temp_Con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        float tempF = sc.nextFloat();
        float tempC = (tempF - 32 )/ 1.8f;
        System.out.println("Fahrenheit: \t    Celsius:");
        System.out.println(tempF+" \u00B0F\t\t    "+tempC+" \u00B0C");
        sc.close();
    }
}
