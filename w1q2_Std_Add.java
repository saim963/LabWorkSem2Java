//print the corresponding address of the student
import java.util.Scanner;
class Student{
    private String name;
    private int rollNo;
    private String address;

    public Student(String name, int rollNo, String address) {
		this.name = name;
        this.rollNo = rollNo;
        this.address = address;
	}

    public void display(){
        System.out.println("Name of the student: "+name);
        System.out.println("Rollno. of "+name+" is "+rollNo);
        System.out.println("Address of "+name+" is "+address);
    }
}
public class w1q2_Std_Add{
    public static void main(String[] args) {
        System.out.println("Enter student name, roll.no and address:");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int r = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        Student s1 = new Student(n,r,a);
        s1.display();
    }
}