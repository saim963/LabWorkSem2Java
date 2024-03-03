import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
//        Character[] chr = new Character[3];
//        for(int i=0; i<3; i++){
//            char c = sc.next().charAt(0);
//            chr[i] = c;
//        }
//        System.out.println(Arrays.toString(chr));
    }
    static void swap(int first, int second){
        int temp = first;
        first = second;
        second = temp;
    }
}
