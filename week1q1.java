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
public class week1q1{
    public static void main(String[] args) {
        Student s1 = new Student("Saim", 117, "Aligarh");
        s1.display();
    }
}