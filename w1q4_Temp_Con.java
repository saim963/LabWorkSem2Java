//fahrenheit to celcius using formula -> C = F – 32 / 1.8
import java.util.Scanner;
public class week1q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature in Fahrenheit:  ");
        float tempF = sc.nextFloat();
        float tempC = (tempF - 32 )/ 1.8f;
        System.out.println(tempF+" \u00B0F = "+tempC+" \u00B0C");
    }
}
